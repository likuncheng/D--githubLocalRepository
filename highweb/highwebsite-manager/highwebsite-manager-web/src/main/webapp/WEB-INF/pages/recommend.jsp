<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">


  <head>
   <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>职位推荐</title>
	<link href="http://www.imooc.com/data/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/2.css">
	<script src="../js/html5shiv.js"></script>
	<script src="../js/respond.min.js"></script>
	<script type="../text/javascript">	</script>
	<style type="text/css">
			a{
				color: black;
			}
			.shadow{
				box-shadow: 0 0 50px #888888;;
			}
		</style>
		<script type="text/javascript">
			$(function(){
				$(".hotJob").on("mouseover",function(){
					$(this).addClass("shadow")
				}).on("mouseout",function(){
					$(this).removeClass("shadow")
				})
				$(".hotEnterprise").on("mouseover",function(){
					$(this).addClass("shadow")
				}).on("mouseout",function(){
					$(this).removeClass("shadow")
				})
			})
		</script>
	<![endif]-->
  </head>
  
  <body>
  <!--header-->
		<div class="container" style="margin-top: 5px;">
			<div class="row" align="center">
				<img src="img/电脑.jpg" style="height: 40px;" />
			</div>
		</div>
		<!--navigator-->
		<div class="container" style="margin-top: 5px;padding-bottom: 0px;">
			<div class="row">
				<nav class="navbar navbar-default" style="background-color: darkgray;margin-bottom: 0px;">
				  <div class="container-fluid">
				    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				      <ul class="nav navbar-nav" >
				        <li class="active"><a href="#" style="border:2px solid orange;color: orange;">企业版 <span class="sr-only">(current)</span></a></li>
				        <li><a href="#" style="color: white;">首页</a></li>
				        <li><a href="#" style="color: white;">公司推荐</a></li>
				        <li><a href="#" style="color: white;">人人猎头</a></li>
				        <li><a href="#" style="color: white;">校园招聘</a></li>
				        <li><a href="#" style="color: white;">活动专区</a></li>
				      </ul>
				      <ul class="nav navbar-nav navbar-right">
				        <li><a href="#" style="color: white;">系统消息</a></li>
				        <li><a href="#" style="color: white;">我的简历</a></li>
				        <li><a href="#" style="color: white;">投递记录</a></li>
				        <li class="dropdown">
				          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: orange;">用户名 <span class="caret"></span></a>
				          <ul class="dropdown-menu">
				            <li><a href="#">Action</a></li>
				            <li><a href="#">Another action</a></li>
				            <li><a href="#">Something else here</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="#">Separated link</a></li>
				          </ul>
				        </li>
				      </ul>
				    </div>
				  </div>
				</nav>
			</div>
		</div>
		<!--background-->
		<div class="container" style="position: relative;">
			<div class="row">
				<div class="col-md-12" style="height: 340px;background: url(img/电脑.jpg);"></div>
			</div>
			<!--主体内容，放到一个div里面，方便后面定位-->
			<div class="row" style="width: 81%;position: absolute;left: 11%;top: 100px;">
				<div class="col-md-12">
					<!--search-->
					<div class="row">
						<div class="col-md-5 col-md-offset-3" style="padding: 0px;">
							<input class="form-control input-lg" type="text" placeholder="请输入职位名称或公司名称" style="width: 100%;"/>
						</div>
						<div class="col-md-1" style="padding: 0px;">
							<button class="btn btn-default btn-lg" type="submit" style="color: white;background-color: orange;width: 100%;">搜索</button>
						</div>
						<div class="com-md-3"></div>
					</div>
					<div class="row">
						<div class="col-md-5 col-md-offset-3" style="font-weight: bold;">
							热门搜索：&nbsp;&nbsp;<a href="#">JAVA研发工程师</a>&nbsp;&nbsp;<a href="#">大数据研发工程师</a>
						</div>
					</div>
					<!--advertised-->
					<div class="row" style="margin-top: 100px;">
						<div class="col-md-12" style="height: 240px;background: url(img/汽车.jpg);box-shadow: 0 0 50px #888888;"></div>
					</div>
					<!--hotJob-head-->
					<div class="row" align="center" style="margin-top: 30px;">
						<div class="col-md-5" style="border-bottom: 2px solid gray;margin-top: 15px;"></div>
						<div class="col-md-2" style="font-weight: bold;font-size: 20px;">热门职位推荐<br/>
							<span class="glyphicon glyphicon-triangle-bottom" aria-hidden="true" style="color: orange;"></span>
						</div>
						<div class="col-md-5" style="border-bottom: 2px solid gray;margin-top: 15px;"></div>
					</div>
					<!--hotJob-->
					<div class="row">
						<!--seperate1-->
						<div class="col-md-6 hotJob" style="border: 0.5px solid rgba(192,192,192,0.2);margin-top: 10px;position: relative;">
							<div class="row">
								<div class="col-md-6">
									<div class="media" style="margin-top: 10px;">
									  <div class="media-body">
									    <h4 class="media-heading"><a href="#">产品经理</a><font color="orange" size="2px">(匹配度100%)</font></h4>
									    <font style="font-size: 12px;color: gray;">2017/8/30</font><br/>
										<font style="font-size: 12px;font-weight: bold;">经验3-5年/本科</font><br/>
										<font style="font-size: 12px;color: orange;">产品开发&nbsp;&nbsp;用户研究&nbsp;&nbsp;用户体验</font><br/>
									  </div>
									</div>
								</div>
								<div class="col-md-6" style="text-align: center;color: orange;"><h4>8-10k</h4></div>
							</div>
							<div class="row" style="border: 1px dashed gray; width: 90%;position: absolute;left: 6%;margin-top: 10px;"></div>
							<div class="row" style="margin-top: 30px;">
								<div class="col-md-8">
									<div class="media" style="margin-bottom: 10px;">
									  <div class="media-left">
									    <a href="#">
									      <img class="media-object" src="img/汽车.jpg" alt="..." style="height: 64px;width: 64px;">
									    </a>
									  </div>
									  <div class="media-body">
									    <h5 class="media-heading" style="font-weight: bold;">成都高新区人力资源协会</h5>
									    <font style="font-size: 12px;color: gray;">政府单位/专业服务、人力资源/成都</font><br />
									  	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>&nbsp;
									  	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									  </div>
									</div>
								</div>
								<div class="col-md-4" style="text-align: left;color: orange;"><h6 style="margin-top: 0px;">活跃度90%</h6></div>
							</div>
						</div>
						
					</div>
					<!--hotEnterprise-head-->
					<div class="row" align="center" style="margin-top: 30px;">
						<div class="col-md-5" style="border-bottom: 2px solid gray;margin-top: 15px;"> </div>
						<div class="col-md-2" style="font-weight: bold;font-size: 20px;">公司推荐<br/>
							<span class="glyphicon glyphicon-triangle-bottom" aria-hidden="true" style="color: orange;"></span>
						</div>
						<div class="col-md-5" style="border-bottom: 2px solid gray;margin-top: 15px;"> </div>
					</div>
					<!--hotEnterprise-->
					<div class="row">
						<div class="col-md-3 hotEnterprise" align="center" style="border: 0.5px solid rgba(192,192,192,0.2);margin-top: 10px;">
							<div class="row" style="margin-top: 5px;">
								<div class="col-md-12">
									<img src="img/电脑.jpg" style="height: 60px;width: 60px;" />
									<p style="margin-top: 5px;margin-bottom: 0px;">
										<font style="font-weight: bold;">成都高新人力资源协会</font><br/>
										<font color="darkgray" size="1px">政府单位/专业服务、人力资源/成都</font><br />
										<span class="glyphicon glyphicon glyphicon-pawn" aria-hidden="true"></span>&nbsp;
										<span class="glyphicon glyphicon glyphicon-level-up" aria-hidden="true"></span>
									</p>
								</div>
							</div>
							<div class="row" style="border: 1px dashed gray; width: 98%;margin-top: 10px;"></div>
							<div class="row" style="margin-top: 10px;">
								<div class="col-md-4" align="center">
									<p><font size="1px" color="orange">7</font><br/><font size="1px">在招职位</font></p>
								</div>
								<div class="col-md-4" align="center">
									<p><font size="1px" color="orange">99%</font><br/><font size="1px">活跃度</font></p>
								</div>
								<div class="col-md-4">
									<p><a href="#"><font size="1px" color="orange">12</font></a><br/><font size="1px">面试评价</font></p>
								</div>
							</div>
						</div>
					</div>
					<!--hotCompany-head-->
					<div class="row" align="center" style="margin-top: 30px;">
						<div class="col-md-5" style="border-bottom: 2px solid gray;margin-top: 15px;"> </div>
						<div class="col-md-2" style="font-weight: bold;font-size: 20px;">公司推荐<br/>
							<span class="glyphicon glyphicon-triangle-bottom" aria-hidden="true" style="color: orange;"></span>
						</div>
						<div class="col-md-5" style="border-bottom: 2px solid gray;margin-top: 15px;"> </div>
					</div>
					<!--hotCompany-->
					<div class="row">
						<div class="col-md-4" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">玩转秋招，拿下心仪offer的必备技能</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">步履不停，尽情尽兴</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">千峰教育|校园集结号</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">梦想不毕业.校园专场</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">手把手教你写出满分简历</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">直播行业特别火，快上车</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">这次我们要相遇在电波里</p>
						</div>
						<div class="col-md-4" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">那些你可能错过的"小"公司</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">说说BAT那些事</p>
						</div>
						<div class="col-md-2" style="position: relative;margin-top: 10px;">
							<a href="#"><img src="img/汽车.jpg" style="height:128px;width: 100%;" /></a>
							<p style="color: white;position: absolute;top: 100px;left: 20px;">寻找未来架构师</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--footer-->
		<div class="container" style="margin-top: 30px;"></div>
		<!--copyright-->
  
  
  
  
  
	<script src="../js/jquery-1.11.1.min.js"></script>
	<script src="../http://www.imooc.com/data/jquery-ui-1.9.2.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/2.js"></script>
  </body>
</html>
