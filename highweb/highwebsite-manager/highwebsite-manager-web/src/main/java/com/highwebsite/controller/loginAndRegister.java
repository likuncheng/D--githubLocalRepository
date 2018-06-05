package com.highwebsite.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.highwebsite.pojo.DoaTUser;
import com.highwebsite.pojo.DoaTUser1;
import com.highwebsite.pojo.LoginedUser;
import com.highwebsite.pojo.registerUser;
import com.highwebsite.service.loginAndRegisterService;
import com.highwebsite.webUtils.webUtils;

@Controller
public class loginAndRegister {

	String randomNum=null;
	String sessionName=null;
	//目前登录的用户数量
	static int count=0;
	@Autowired
	private loginAndRegisterService loginandRegisterService;
	//-------------------注册程序-----------------------
	@RequestMapping("/register")
	@ResponseBody
	public String register(registerUser user){
		System.out.println("registerUser:"+user);
		registerUser  registeruser  = loginandRegisterService.selectByphone(user);
		//String s_randomNum = 
		if(registeruser==null){
			//程序走到这里的话说明数据库里没有这个手机号，即这个手机号还没有被注册
			//现在可以开始正式注册
			DoaTUser doaTUser = new DoaTUser();
			doaTUser.setPhone(user.getPhone());
			doaTUser.setRegistPasswd(user.getRegistPasswd());
			//在注册之前要对输入的验证码进行校验，正确后再注册
			String c_randomNum = user.getIdentifyCode();
			String s_randomNum = randomNum;			
			System.out.println("c_randomNum: "+c_randomNum+"---------"+"s_randomNum: "+s_randomNum);
			if(c_randomNum.equals(s_randomNum)&&s_randomNum!=null){
				loginandRegisterService.insertUser(doaTUser);
				return "success";
			}
			else{
				return "prompt";
			}
		}
		else{
			return "false";
		}
	}
	
	//-------------------登录程序-----------------------	
	@RequestMapping("/login")
	@ResponseBody
	public String login(DoaTUser1 user1,HttpServletRequest request){
		//String regist_passwd = user1.getRegist_passwd();
		DoaTUser1 doaTUser1 = loginandRegisterService.selectUser1(user1);
		if(doaTUser1!=null){
			System.out.println("doaTUser1.getPhone(): "+doaTUser1.getPhone());
			//进入这里说明输入的用户名和密码是正确的，可以进行登录
			//为了防止重复登录，首先查看LoginedUser表里是否有这个登录用户，还有，应该查看sessionName的session是否为空，不为空的话也不能登录
			
			LoginedUser loginedUser = loginandRegisterService.selectByPhone(doaTUser1.getPhone());
			
			HttpSession session = request.getSession(false);			
			if(session!=null){
				Enumeration enumeration =session.getAttributeNames();
				while(enumeration.hasMoreElements()){
					String sessionKey=enumeration.nextElement().toString();//获取session中的键值
					if(sessionKey.equals("sessionName")){
						return "replace";
					}
				}
				//执行到这里，说明没有找到sessionName,用户没有登录，但不知道LoginedUser表是否已经删除了对应的字段，所以这里要再检测删除一次
//				if(loginedUser!=null){
//					loginandRegisterService.deleteByPhone(doaTUser1.getPhone());
//				}
			}
						
			if(loginedUser!=null){
				//说明这个用户已经登录了，不能再进行登录，可以直接访问其他页面
				System.out.println("这个用户已经登录了，不能再进行登录");
				return "replace";
			}
			
			else{
				//说明这个用户没登录，这里进行登录，把用户信息保存在LoginedUser表里
				System.out.println("开始进行登录");
				LoginedUser loginedUser1 = new LoginedUser(user1.getPhone(),user1.getRegist_passwd());
				loginandRegisterService.insertOne(loginedUser1);
				
				//把登录的用户对象保存在session里面
				sessionName = doaTUser1.getPhone();
				request.getSession().setAttribute("sessionName", sessionName);
				request.getSession().setAttribute(sessionName, doaTUser1);
				
				return "success";
			}
	
		}
		else{
			//等于空说明用户名或者密码错误，登录失败
			return "false";
		}
	}
	//-----------------------退出登录程序----------------------------
	@RequestMapping("/Outlogin")
	public String Outlogin(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		String sessionName1 = null;
		//System.out.println("退出登录程序时的sessionName："+sessionName);
		if(session!=null){	
			sessionName1 = (String) session.getAttribute("sessionName");
			//System.out.println("session里的sessionName："+sessionName1);
			session.removeAttribute(sessionName1);
			session.removeAttribute("sessionName");
		}
		LoginedUser loginedUser = loginandRegisterService.selectByPhone(sessionName1);
		if(loginedUser!=null){
			//System.out.println("退出登录程序的sessionName： "+loginedUser.getPhone());
			loginandRegisterService.deleteByPhone(loginedUser.getPhone());
		}
			
		return "loginAndRegist";
	}
	
	//-------------------------------------------------------------------------------------
	//检测当当对应的sessionName的session不存在时，对应的数据表的记录是否也删除了
	//这里没有做出来，主要是因为各种浏览器的兼容问题，不好判断用户是否突然关闭了浏览器
	
	
	
	//-------------------阿里云短信服务主程序-----------------------	
	@RequestMapping("/identifyController")
	@ResponseBody
	public String identifyController(String phone,HttpServletRequest request){
		if(phone!=null){			
			try{
				//发短信
		        if(phone!=null){
		        	randomNum = webUtils.sendSms(phone);
		        }
		        Thread.sleep(3000L);		      
			}catch(Exception e){
				e.printStackTrace();
			}
			//--------------------------------------------
			return randomNum;
		}
		else{
			return "false";
		}
	}
	//------------test------------------------------
	
	
}
