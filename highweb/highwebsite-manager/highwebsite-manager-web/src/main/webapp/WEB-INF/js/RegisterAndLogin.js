window.onload=function(){
  //------------------------------------------------------------加载背景图片--------------------------------------------------------------    
    $("#row2").css("background-image","url(../images/register2.png)");
//------------------------------------------------------------注册登录选项卡-----------------------------------------------------------------
	$("#tabbutton1").on("click",function(){
		$("#tabbutton1 a").css("color","rgb(255, 136, 0)");
		$(this).css("background","white");
		$(this).css("border-bottom","2px solid rgb(255, 136, 0)");
		$(this).css("border-top","1px solid white");
		$(this).css("border-left","1px solid white");
		$(this).css("border-right","1px solid white");
		//----------------------------------------------
		$("#tabbutton2 a").css("color","#000");
		$("#tabbutton2").css("border-bottom","1px solid white");
		$("#tabbutton2").css("border-top","1px solid white");
		$("#tabbutton2").css("border-left","1px solid white");
		$("#tabbutton2").css("border-right","1px solid white");
	});
	$("#tabbutton2").on("click",function(){
		$("#tabbutton1 a").css("color","rgb(255, 136, 0)");
		$(this).css("background","white");
		$(this).css("border-bottom","2px solid rgb(255, 136, 0)");
		$(this).css("border-top","1px solid white");
		$(this).css("border-left","1px solid white");
		$(this).css("border-right","1px solid white");
		//----------------------------------------------
		$("#tabbutton1 a").css("color","#000");
		$("#tabbutton1").css("border-bottom","1px solid white");
		$("#tabbutton1").css("border-top","1px solid white");
		$("#tabbutton1").css("border-left","1px solid white");
		$("#tabbutton1").css("border-right","1px solid white");
	});
	
//------------------------------------------------------------------------------------------------------------------------------
	$("#tabbutton1 a").hover(function(){
		$(this).css("background","white");
		$(this).css("border-top","1px solid white");
		$(this).css("border-left","1px solid white");
		$(this).css("border-right","1px solid white");
	},function(){
		$(this).css("background","white");
		$(this).css("border-top","1px solid white");
		$(this).css("border-left","1px solid white");
		$(this).css("border-right","1px solid white");
	});
	$("#tabbutton2 a").hover(function(){
		$(this).css("background","white");
		$(this).css("border-top","1px solid white");
		$(this).css("border-left","1px solid white");
		$(this).css("border-right","1px solid white");
	},function(){
		$(this).css("background","white");
		$(this).css("border-top","1px solid white");
		$(this).css("border-left","1px solid white");
		$(this).css("border-right","1px solid white");
	});
//-------------------------去除表单输入框发光效果---------------------------------
$("input").on("focus",function(){
		$(this).css("border","1px solid white").css("outline","none");
		
});
//--------------------------------------------------------------------------------
$(".register").on("click",function(){
	$(".div1 p").text("立即注册");
});
$(".login").on("click",function(){
	$(".div1 p").text("立即登录");
});

var username=$("#username").val();
var password=$("#password").val();

$("#button1").on("click",function(){
	//alert("ddd");
	//var formParam = $("#form").serialize();//序列化表格内容为字符串  
	$.post("register",{phone:$("#username").val(),registPasswd:$("#password").val(),identifyCode:$("#vidider").val()},function(data){		
		if(data=="false"){
			var append11 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
	        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
	        "用户名已存在\n" +
	        "</div>";
			$("#errorNotice").empty().append(append11);
		}
		else if(data=="success"){
			var append11 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
	        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
	        "注册成功\n" +
	        "</div>";
			$("#username").empty();
			$("password").empty();
			$("#errorNotice").empty().append(append11);
		}
		else if(data=="prompt"){
			var append11 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
	        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
	        "验证码错误\n" +
	        "</div>";
			$("#username").empty();
			$("password").empty();
			$("#errorNotice").empty().append(append11);
		}
		});
});

$("#button2").on("click",function(){
	$.post("login",{phone:$("#username1").val(),regist_passwd:$("#password1").val()},function(data){		
		if(data=="false"){
			var append11 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
	        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
	        "用户名或密码错误\n" +
	        "</div>";
			$("#errorNotice1").empty().append(append11);
		}
		if(data=="replace"){
			var append11 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
	        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
	        "请不要重复登录\n" +
	        "</div>";
			$("#errorNotice1").empty().append(append11);
		}
		if(data=="success"){
			window.location.replace("http://localhost:8080/index");		
		}
	});
});





}


