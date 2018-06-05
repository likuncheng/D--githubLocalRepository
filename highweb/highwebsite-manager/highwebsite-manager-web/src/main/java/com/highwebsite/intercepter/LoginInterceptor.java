package com.highwebsite.intercepter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.highwebsite.pojo.DoaTUser1;

public class LoginInterceptor implements HandlerInterceptor{

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String url = request.getRequestURI();
		if(url.indexOf("/loginAndRegist")>=0){
			return true;
		}
		if(url.indexOf("/register")>=0){
			return true;
		}
		if(url.indexOf("/login")>=0){
			return true;
		}
		if(url.indexOf("/identifyController")>=0){
			return true;
		}
		if(url.indexOf("/css/")>=0){
			return true;
		}
		if(url.indexOf("/js/")>=0){
			return true;
		}
		if(url.indexOf("/images/")>=0){
			return true;
		}
		if(url.indexOf("/fonts/")>=0){
			return true;
		}
		if(url.indexOf("/img/")>=0){
			return true;
		}
		
		//判断session
		HttpSession session = request.getSession();
		String sessionName = (String) session.getAttribute("sessionName");
		if(sessionName!=null){
			DoaTUser1 doaTUser1 = (DoaTUser1) session.getAttribute(sessionName);
			if(doaTUser1!=null){
				return true;
			}
			
		}

		request.getRequestDispatcher("/loginAndRegist").forward(request, response);
		return false;
	}
	

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
	}

}
