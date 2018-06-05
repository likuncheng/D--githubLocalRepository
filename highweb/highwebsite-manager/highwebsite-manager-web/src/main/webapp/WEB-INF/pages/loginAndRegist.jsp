<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>注册登录主页</title>

	<script src="../js/jquery-1.11.1.min.js"></script>

	<script src="../js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	
	<link rel="stylesheet" href="../css/RegisterAndLogin.css">
	<script src="../js/html5shiv.js"></script>
	<script src="../js/respond.min.js"></script>
	<!--bootstrap validate js-->
	<script type="text/javascript" src="../js/bootstrapValidator.min.js"></script>
	<!--bootstrap validate css-->
	<link rel="stylesheet" type="text/css" href="../css/bootstrapValidator.min.css">

	<script src="../js/RegisterAndLogin.js"></script>
	<script type="text/javascript">

		$(function(){
			//格式验证
			$("body").on("click","#checkbox1",function(){
				if($(this)[0].checked){
					$("#button1").removeClass("disabled");
				} else {
					$("#button1").addClass("disabled");
				}
			}).on("focusout","#username",function(){
				var username = $(this).val();
				username = $.trim(username);
				var regex = /^1[34578]\d{9}$/;
				var append1 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
        "手机号码不能为空\n" +
        "</div>";
		        var append2 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
		        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
		        "请输入正确的手机号码格式\n" +
		        "</div>";
				if (username=="") {
					$("#errorNotice").empty().append(append1);
				} else {
					if (!regex.test(username)) {
						$("#errorNotice").empty().append(append2);
					}
				}
				
			}).on("focus","#username",function(){
				$("#errorNotice").empty();
			}).on("focusout","#password",function(){
				var password = $(this).val();
				password = $.trim(password);
				var regex = /^[a-zA-Z]{1}([a-zA-Z0-9]|[._]){5,19}$/;
				var append1 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
        "密码不能为空\n" +
        "</div>";
		        var append2 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
		        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
		        "密码长度至少为6位，并且要以字母开头\n" +
		        "</div>";
				if (password=="") {
					$("#errorNotice").empty().append(append1);
				} else {
					if (!regex.test(password)) {
						$("#errorNotice").empty().append(append2);
					}
				}
				
			}).on("focus","#password",function(){
				$("#errorNotice").empty();
			}).on("click","#yzbotton",function(){
						
				var num=5;
	
				var timer = setInterval(function(){
					$("#yzbotton").addClass("disabled");
					$("#yzbotton").text("重新发送("+num+")");
					num--;
					if(num==-2){
						clearInterval(timer);
						$("#yzbotton").text("发送验证码");	
						$("#yzbotton").removeClass("disabled");
					}
				},1000);
				//alert($("#yzbotton").text());
				//使用get请求方式请求服务器后台，把传回的手机验证码赋值给回调函数的data
				$.post("identifyController",{phone:$("#username").val()},function(data){		
					//alert(data);
					});
	
			}).on("focusout","#username1",function(){
				var username = $(this).val();
				username = $.trim(username);
				var regex = /^1[34578]\d{9}$/;
				var append1 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
        "手机号码不能为空\n" +
        "</div>";
		        var append2 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
		        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
		        "请输入正确的手机号码格式\n" +
		        "</div>";
				if (username=="") {
					$("#errorNotice1").empty().append(append1);
				} else {
					if (!regex.test(username)) {
						$("#errorNotice1").empty().append(append2);
					}
				}
				
			}).on("focus","#username1",function(){
				$("#errorNotice1").empty();
			}).on("focusout","#password1",function(){
				var password = $(this).val();
				password = $.trim(password);
				var append1 = "<div class=\"alert alert-danger alert-dismissible\" role=\"alert\" style=\"padding:0px;margin-bottom:5px;\" align=\"center\">\n" +
        " <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n" +
        "密码不能为空\n" +
        "</div>";
				if (password=="") {
					$("#errorNotice1").empty().append(append1);
				}
				
			}).on("focus","#password1",function(){
				$("#errorNotice1").empty();
			});
			
		});
	</script>
	
	
	
</head>
<body>
<!-- 一开始就采用栅格布局 -->
<div class="container">
	<div class="row">
		<div class="col-md-2 col-xs-2 col-md-offset-2 col-xs-offset-2">
			<img src="../images/register1.png">
		</div>
	</div>
	<div class="row" id="row2" style="background-image: url(../images/register2.png)">
		<div class="col-md-5 col-xs-5 col-md-offset-2 col-xs-offset-2" id="col21" >			
				<p>
				<!-- 滚动广告 -->
				<div id="slidershow" class="carousel slide" data-ride="carousel" data-wrap="true" data-interval="1000">
				        <ol class="carousel-indicators">
				            <li class="active" data-target="#slidershow" data-slide-to="0"></li>
				            <li  data-target="#slidershow" data-slide-to="1"></li>
				            <li  data-target="#slidershow" data-slide-to="2"></li>
				            <li  data-target="#slidershow" data-slide-to="3"></li>
				            <li  data-target="#slidershow" data-slide-to="4"></li>
				            <li  data-target="#slidershow" data-slide-to="5"></li>
				        </ol>
				        <div class="carousel-inner">
					        <div class="item active">
								<a href="##"><img src="../images/chrome-logo.jpg" alt="" style="width:100%;height:360px;"></a>
							<div class="carousel-caption">
									轮播广告一
								</div>
					        </div>
					        <div class="item">
					            <a href="##"><img src="../images/firefox-logo.jpg" alt="" style="width:100%;height:360px;"></a>
								<div class="carousel-caption">
									轮播广告二
								</div>
							</div>
					        <div class="item">
					            <a href="##"><img src="../images/safari-logo.jpg" alt="" style="width:100%;height:360px;"></a>
								<div class="carousel-caption">
									轮播广告三
								</div>
							</div>
							<div class="item">
					            <a href="##"><img src="../images/chrome-logo.jpg" alt="" style="width:100%;height:360px;"></a>
								<div class="carousel-caption">
									轮播广告四
								</div>
							</div>
							<div class="item">
					            <a href="##"><img src="../images/firefox-logo.jpg" alt="" style="width:100%;height:360px;"></a>
								<div class="carousel-caption">
									轮播广告五
								</div>
							</div>
							<div class="item">
					            <a href="##"><img src="../images/safari-logo.jpg" alt="" style="width:100%;height:360px;"></a>
								<div class="carousel-caption">
									轮播广告六
								</div>
							</div>
				    	</div>
				    <a class="left carousel-control" href="#slidershow" role="button" data-slide="prev" >
				        <span class="glyphicon glyphicon-chevron-left"></span>
				    </a>
				    <a class="right carousel-control" href="#slidershow" role="button" data-slide="next">
				        <span class="glyphicon glyphicon-chevron-right"></span>
				    </a>
				</div>
				
				
			</p>			
		</div>
		<div class="col-md-3 col-xs-3" id="col22">			
				<div class="row">
					<div class="col-md-9 col-xs-9 col-md-offset-1" id="col221">
						<!-- 注册登录模块 -->
						<!-- <div class="div1">
							<img src="images/register3.png">
							<p>立即注册</p>
						</div> -->
						<div class="div2">
						<!-- 注册登录选项卡 -->

							<ul id="myTab" class="nav nav-tabs" role="tablist">
								<li class="active" id="tabbutton1"><a href="#register" role="tab" data-toggle="tab" class="register">注册</a></li>
								<li id="tabbutton2"><a href="#login" role="tab" data-toggle="tab" class="login">登录</a></li>
							</ul>
							<!-- 选项卡面板 -->
							<div id="myTabContent" class="tab-content" style="margin-top: 20px;">
								<div class="tab-pane fade in active" id="register">
									<!--错误消息提示-->
									<div id="errorNotice">
										
									</div>
									<!-- 注册表单 -->
									<form role="form" id="form" method="post" action="http://localhost:8080/lore">
										<div class="form-group">
											<input type="text" class="form-control" id="username" name="phone" placeholder="请输入您的常用手机号"/>
										</div>
										<div class="form-group">
											<input type="password" class="form-control" id="password" name="registPasswd" placeholder="请输入密码"/>
										</div>
										<div class="form-group" style="padding:0px;">
											<input type="text" class="form-control" id="vidider" name="identifyCode" placeholder="请输入手机验证码"/>
												&nbsp;<a id="yzbotton" href="javascript:void(0);"><p>获取验证码</p></a>
										</div>
										<button type="button" class="btn btn-default disabled" id="button1">立即成为会员</button>
										<div class="checkbox" style="margin-top:8px;">
											<label><input type="checkbox" id="checkbox1" checked="checked"/>接受<a id="aa" href="#">高新区人才用户协议</a></label>
											<!-- <div class="div3">
												<p id="div3p">使用以下账号直接登录</p>
													<div id="image">
														<a href="#"><img src="images/weixin.png"></a>
														<a href="#"><img src="images/qq.png"></a>
														<a href="#"><img src="images/weibo.png"></a>
													</div>
											</div> -->
										</div>
									</form>									
								</div> 
								<div class="tab-pane fade" id="login">
									<!--错误消息提示-->
									<div id="errorNotice1">
										
									</div>
									<!-- 登录表单 -->
									<form role="form" action="" method="post" id="form2">
										<div class="form-group">
											<input type="text" class="form-control" id="username1" name="phone" placeholder="请输入您的常用手机号">
										</div>
										<div class="form-group">
											<input type="password" class="form-control" id="password1" name="regist_passwd" placeholder="请输入密码">
										</div>										
										<button type="button" class="btn btn-default" id="button2">立即登录</button>
										<div style="height:80px;"></div>
										<div class="div3">
												<!-- <div class="div3">
												<p id="div3p">使用以下账号直接登录</p>
													<div id="image">
														<a href="#"><img src="images/weixin.png"></a>
														<a href="#"><img src="images/qq.png"></a>
														<a href="#"><img src="images/weibo.png"></a>
													</div>
												</div> -->
											</div>										
									</form>
								</div>
							</div>
						</div>					
					</div>
				</div>			
		</div>
	</div>
	<div class="row" id="row3">
		<div class="row" id="row31">
			<div class="col-md-3 col-xs-3">
				<img src="../images/last1.png">
				<p class="ppp"><a href="#">精准匹配</a></p>
				<p><a href="#">企业找对人</a></p>
				<p><a href="#">人才找对位</a></p>
			</div>
			<div class="col-md-3 col-xs-3">
				<img src="../images/last2.png">
				<p class="ppp"><a href="#">隐私保护</a></p>
				<p><a href="#">企业用的放心</a></p>
				<p><a href="#">求职用的安心</a></p>
			</div>
			<div class="col-md-3 col-xs-3">
				<img src="../images/last3.png">
				<p class="ppp"><a href="#">精品活动</a></p>
				<p><a href="#">线下精品招聘会</a></p>
				<p><a href="#">各种系列总对胃</a></p>
			</div>
			<div class="col-md-3 col-xs-3">
				<img src="../images/last4.png">
				<p class="ppp"><a href="#">人人猎头</a></p>
				<p><a href="#">人人都能是猎头</a></p>
				<p><a href="#">诱人奖励等你来</a></p>
			</div>
		</div>
	</div>
	<div class="row" id="row4">
		<div class="col-md-12 col-xs-12"><img src="../images/last.png"></div>
	</div>
</div>



 

</body>
</html>
