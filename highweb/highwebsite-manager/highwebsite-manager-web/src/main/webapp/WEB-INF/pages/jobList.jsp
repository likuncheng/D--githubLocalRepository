<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>工作列表及其选择</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<script src="../js/jquery-1.11.1.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		<style type="text/css">
			a{
				color: black;
			}
		</style>
	</head>
	<body>
		<!--header-->
		<div class="container" style="margin-top: 5px;">
			<div class="row" align="center">
				<img src="../img/computer.jpg" style="height: 40px;" />
			</div>
		</div>
		<!--navigator-->
		<div class="container-fluid" style="margin-top: 5px;">
			<div class="row">
				<nav class="navbar navbar-default" style="background-color: darkgray;">
				  <div class="container-fluid">
				    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				      <ul class="nav navbar-nav" >
				        <li class="active"><a href="#" style="border:2px solid orange;color: orange;">企业版 <span class="sr-only">(current)</span></a></li>
				        <li><a href="http://localhost:8080/index" style="color: white;">首页</a></li>
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
				             <li><a href="#">我的订阅</a></li>
				            <li><a href="#">职位邀请</a></li>
				            <li><a href="#">账号设置</a></li>
				            <li class="outlogin"><a href="javascript:void(0)">退出</a></li>
				          </ul>
				        </li>
				      </ul>
				    </div>
				  </div>
				</nav>
			</div>
		</div>
		<!--search-->
		<div class="container" style="margin-top: 20px;padding-left：0px;padding-right: 0px;">
			<div class="row" >
				<div class="col-md-5 col-md-offset-3" style="padding: 0px;">
					<input id="research" class="form-control input-lg" type="text" placeholder="请输入职位名称或公司名称" style="border: 1px solid orange;"/>
				</div>
				<div class="col-md-4" style="padding: 0px;">
					<button class="btn btn-default btn-lg" type="submit" style="color: white;background-color: orange;">搜索</button>
				</div>
			</div>
		</div>
		<!--condition-->
		<div class="container" style="margin-top: 30px;border-top: 2px solid orange;border-bottom: 2px solid orange;">
			<div class="row" style="margin: 10px 0 10px 0;">
				<div class="col-md-2" style="text-align: right;padding-top: 10px;font-weight: bold;">
					写字楼区域：
				</div>
				<div class="col-md-10" >
					<ul class="nav nav-tabs" role="tablist">
					    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">大源国际</a></li>
					    <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">太平洋金融大厦</a></li>
					    <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">希顿国际</a></li>
					    <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab">希望大厦</a></li>
					    <li role="presentation"><a href="#softA" aria-controls="settings" role="tab" data-toggle="tab">软件园A区</a></li>
					    <li role="presentation"><a href="#softB" aria-controls="settings" role="tab" data-toggle="tab">软件园B区</a></li>
					    <li role="presentation"><a href="#xcsquare" aria-controls="settings" role="tab" data-toggle="tab">新城国际广场</a></li>
					    <li role="presentation"><a href="#zdgt" aria-controls="settings" role="tab" data-toggle="tab">智地哥谭</a></li>
					    <li><a href="#" style="color: orange;">更多>></a></li>
					 </ul>
					  <!-- Tab panes -->
					<div class="tab-content" style="margin-top: 20px;">
				    	<div role="tabpanel" class="tab-pane active" id="home">
				    		<div class="row">
				    			<div class="col-md-11">
				    				<a href="javascript:void(0)" >腾讯</a>&nbsp;&nbsp;<a href="javascript:void(0)" >京东</a>
				    				&nbsp;&nbsp;<a href="javascript:void(0)" >京东</a>&nbsp;&nbsp;<a href="javascript:void(0)" >工商银行</a>
				    				&nbsp;&nbsp;<a href="javascript:void(0)" >滴滴</a>&nbsp;&nbsp;<a href="javascript:void(0)" >百度</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >中国移动</a>&nbsp;&nbsp;<a href="javascript:void(0)" >网易</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >完美世界</a>&nbsp;&nbsp;<a href="javascript:void(0)" >中国银行</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >中置集团</a>&nbsp;&nbsp;<a href="javascript:void(0)" >万科物业</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >广汽集团</a>&nbsp;&nbsp;<a href="javascript:void(0)" >百度</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >阿里巴巴</a>&nbsp;&nbsp;<a href="javascript:void(0)" >腾讯</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >京东</a>&nbsp;&nbsp;<a href="javascript:void(0)" >京东</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >工商银行</a>&nbsp;&nbsp;<a href="javascript:void(0)" >滴滴</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >中国移动</a>&nbsp;&nbsp;<a href="javascript:void(0)" >网易</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >完美世界</a>&nbsp;&nbsp;<a href="javascript:void(0)" >中国银行</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >中置集团</a>&nbsp;&nbsp;<a href="javascript:void(0)" >万科物业</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" >广汽集团</a>
						    		&nbsp;&nbsp;<a href="javascript:void(0)" style="color: orange;">查看全部企业>></a>
				    			</div>
				    		</div>
				    	</div>
					    <div role="tabpanel" class="tab-pane" id="profile">
					    	<a href="#">淘宝</a>
					    </div>
					    <div role="tabpanel" class="tab-pane" id="messages">...</div>
					    <div role="tabpanel" class="tab-pane" id="settings">...</div>
					    <div role="tabpanel" class="tab-pane" id="softA">...</div>
					    <div role="tabpanel" class="tab-pane" id="softB">...</div>
					    <div role="tabpanel" class="tab-pane" id="xcsquare">...</div>
					    <div role="tabpanel" class="tab-pane" id="zdgt">...</div>
					</div>
				</div>
			</div>
		</div>
		<!--condition2-->
		<div class="container" style="border-bottom: 2px solid orange;">
			<div class="row" style="margin: 10px 0 10px 0;">
				<div class="col-md-2" style="text-align: right;padding-top: 10px;font-weight: bold;color: orange;">
					地铁：
				</div>
				<div class="col-md-10" style="padding-top: 10px;" id="subway">
					1号线<br /><br />
					<a href="javascript:void(0)">高新</a>&nbsp;&nbsp;<a href="javascript:void(0)" >孵化园</a>&nbsp;&nbsp;<a href="javascript:void(0)" >金融城</a>
					&nbsp;&nbsp;<a href="javascript:void(0)" >锦城广场</a>&nbsp;&nbsp;<a href="javascript:void(0)" >世纪城</a>&nbsp;&nbsp;<a href="javascript:void(0)" >天府三街</a>
					&nbsp;&nbsp;<a href="javascript:void(0)" >天府五街</a>&nbsp;&nbsp;<a href="javascript:void(0)" >华府大道</a>&nbsp;&nbsp;<a href="javascript:void(0)" >其他</a>
				</div>
			</div>
		</div>
		<!--condition3-->
		<div class="container" style="border-bottom: 2px solid orange;">
			<div class="row" style="margin: 10px 0 10px 0;">
				<div class="col-md-2" style="text-align: right;padding-top: 10px;font-weight: bold;color: orange;">
					行业领域：
				</div>
				<div class="col-md-10" style="padding-top: 10px;" id="industry_categroy">
					<a href="javascript:void(0)">计算机/互联网/游戏/电子</a>&nbsp;&nbsp;<a href="javascript:void(0)" >会计/金融/银行/保险</a>&nbsp;&nbsp;<a href="#javascript:void(0)" >贸易/消费/制造/营运</a>
					&nbsp;&nbsp;<a href="javascript:void(0)" >制药/医疗</a>&nbsp;&nbsp;<a href="javascript:void(0)" >广告/媒体</a>&nbsp;&nbsp;<a href="javascript:void(0)" >房地产/建筑/物业</a>
					&nbsp;&nbsp;<a href="javascript:void(0)" >专业服务/教育/培训</a>&nbsp;&nbsp;<a href="javascript:void(0)" >服务业</a>&nbsp;&nbsp;<a href="javascript:void(0)" >物流/运输</a>
					&nbsp;&nbsp;<a href="javascript:void(0)" >能源/原材料</a>&nbsp;&nbsp;<a href="javascript:void(0)" >政府/非盈利机构/其他</a>
				</div>
			</div>
		</div>
		<!--condition4-->
		<div class="container">
			<div class="row" style="margin: 10px 0 10px 0;">
				<div class="col-md-2" style="text-align: right;padding-top: 15px;font-weight: bold;color: orange;">
					其他：
				</div>
				<div class="col-md-10" style="padding-top: 10px;">
					<div class="row">
						<div class="col-md-2" align="center">
							<div class="dropdown">
							  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
						    	薪资
							    <span class="caret"></span>
							  </button>
							  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" id="salary">
							    <li><a href="javascript:void(0)">50以下</a></li>
							    <li><a href="javascript:void(0)">50-100</a></li>
							    <li><a href="javascript:void(0)">100-200</a></li>
							    <li><a href="javascript:void(0)">200-500</a></li>
							    <li><a href="javascript:void(0)">500-2000</a></li>
							    <li><a href="javascript:void(0)">2000-10000</a></li>
							    <li><a href="javascript:void(0)">10000以上</a></li>
							  </ul>
							</div>
						</div>
						<div class="col-md-2" align="center">
							<div class="dropdown">
							  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
						    	工作年限
							    <span class="caret"></span>
							  </button>
							  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" id="experience_required">
							    <li><a href="javascript:void(0)">0</a></li>
							    <li><a href="javascript:void(0)">1年</a></li>
							    <li><a href="javascript:void(0)">3年</a></li>							    						    
							    <li><a href="javascript:void(0)">5年</a></li>							    
							    <li><a href="javascript:void(0)">10年</a></li>							    
							    <li><a href="javascript:void(0)">10年以上</a></li>
							  </ul>
							</div>
						</div>
						<div class="col-md-2" align="center">
							<div class="dropdown">
							  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
						    	企业性质
							    <span class="caret"></span>
							  </button>
							  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" id="company_type">
							    <li><a href="javascript:void(0)">外资及合资企业</a></li>
							    <li><a href="javascript:void(0)">内资企业</a></li>
							    <li><a href="javascript:void(0)">国有企业</a></li>
							    <li><a href="javascript:void(0)">事业单位</a></li>
							    <li><a href="javascript:void(0)">其他企事业单位</a></li>
							  </ul>
							</div>
						</div>
						<div class="col-md-2" align="center">
							<div class="dropdown">
							  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
						    	学历要求
							    <span class="caret"></span>
							  </button>
							  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" id="education_required">
							    <li><a href="javascript:void(0)">无</a></li>
							    <li><a href="javascript:void(0)">初高中</a></li>
							    <li><a href="javascript:void(0)">中专</a></li>
							    <li><a href="javascript:void(0)">大专</a></li>
							    <li><a href="javascript:void(0)">本科</a></li>
							    <li><a href="javascript:void(0)">硕士</a></li>
							    <li><a href="javascript:void(0)">博士</a></li>
							    <li><a href="javascript:void(0)">博士以上</a></li>
							  </ul>
							</div>
						</div>
						<div class="col-md-2" align="center">
							<div class="dropdown">
							  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
						    	发布日期
							    <span class="caret"></span>
							  </button>
							  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" id="release-time">
							    <li><a href="javascript:void(0)">1天内</a></li>
							    <li><a href="javascript:void(0)">1周内</a></li>
							    <li><a href="javascript:void(0)">1月内</a></li>
							    <li><a href="javascript:void(0)">1年内</a></li>
							  </ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--body-->
		<div class="container" style="margin-top: 30px;margin-bottom: 30px;">
			<div class="row">
				<div class="col-md-8" id="productmanagermodel">
					<!--产品经理模块-->
					<div class="row" style="border: 1px solid darkgray;padding-left：0px;padding-right: 0px;margin-top: 10px;">
						<div class="col-md-6" style="padding: 0px;">
							<div class="list-group" style="margin-bottom: 0px;">
							  <a href="#" class="list-group-item" style="border: none;">
							    <h4 class="list-group-item-heading">产品经理<font color="orange">(匹配度100%)</font></h4>
							    <p class="list-group-item-text"><font color="orange">8-10k</font>本科|3-5年工作经验</p>
							    <p class="list-group-item-text"><font color="orange" size="2px">产品开发&nbsp;&nbsp;用户研究&nbsp;&nbsp;用户体验&nbsp;&nbsp;视觉设计</font></p>
							  	<p class="list-group-item-text"><font size="2px">发布日期：2017/8/30</font></p>
							  </a>
							</div>
						</div>
						<div class="col-md-6" style="padding: 0px;">
							<div class="pull" style="margin-top: 10px;">
								<div class="pull-left">
									<a href="#">
										<img class="pull-object" src="../img/电脑.jpg" alt="..." style="height: 80px;">
									</a>
								</div>
								<div class="pull-body">
									<h5 class="media-heading" style="font-weight: bold;">成都高新区人力资源协会</h5>
									<p>政府单位/专业服务、人力资源/成都<br><font color="orange">活跃度90%</font><br><span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="row" style="border: 1px solid darkgray;padding-left：0px;padding-right: 0px;margin-top: 10px;">
						<div class="col-md-6" style="padding: 0px;">
							<div class="list-group" style="margin-bottom: 0px;">
								<a href="#" class="list-group-item" style="border: none;">
									<h4 class="list-group-item-heading">产品经理<font color="orange">(匹配度100%)</font></h4>
									<p class="list-group-item-text"><font color="orange">8-10k</font>本科|3-5年工作经验</p>
									<p class="list-group-item-text"><font color="orange" size="2px">产品开发&nbsp;&nbsp;用户研究&nbsp;&nbsp;用户体验&nbsp;&nbsp;视觉设计</font></p>
									<p class="list-group-item-text"><font size="2px">发布日期：2017/8/30</font></p>
								</a>
							</div>
						</div>
						<div class="col-md-6" style="padding: 0px;">
							<div class="pull" style="margin-top: 10px;">
								<div class="pull-left">
									<a href="#">
										<img class="pull-object" src="../img/电脑.jpg" alt="..." style="height: 80px;">
									</a>
								</div>
								<div class="pull-body">
									<h5 class="media-heading" style="font-weight: bold;">成都高新区人力资源协会</h5>
									<p>政府单位/专业服务、人力资源/成都<br><font color="orange">活跃度90%</font><br><span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="row" style="border: 1px solid darkgray;padding-left：0px;padding-right: 0px;margin-top: 10px;">
						<div class="col-md-6" style="padding: 0px;">
							<div class="list-group" style="margin-bottom: 0px;">
								<a href="#" class="list-group-item" style="border: none;">
									<h4 class="list-group-item-heading">产品经理<font color="orange">(匹配度100%)</font></h4>
									<p class="list-group-item-text"><font color="orange">8-10k</font>本科|3-5年工作经验</p>
									<p class="list-group-item-text"><font color="orange" size="2px">产品开发&nbsp;&nbsp;用户研究&nbsp;&nbsp;用户体验&nbsp;&nbsp;视觉设计</font></p>
									<p class="list-group-item-text"><font size="2px">发布日期：2017/8/30</font></p>
								</a>
							</div>
						</div>
						<div class="col-md-6" style="padding: 0px;">
							<div class="pull" style="margin-top: 10px;">
								<div class="pull-left">
									<a href="#">
										<img class="pull-object" src="../img/电脑.jpg" alt="..." style="height: 80px;">
									</a>
								</div>
								<div class="pull-body">
									<h5 class="media-heading" style="font-weight: bold;">成都高新区人力资源协会</h5>
									<p>政府单位/专业服务、人力资源/成都<br><font color="orange">活跃度90%</font><br><span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span></p>
								</div>
							</div>
						</div>
					</div>
					<div class="row" style="border: 1px solid darkgray;padding-left：0px;padding-right: 0px;margin-top: 10px;">
						<div class="col-md-6" style="padding: 0px;">
							<div class="list-group" style="margin-bottom: 0px;">
								<a href="#" class="list-group-item" style="border: none;">
									<h4 class="list-group-item-heading">产品经理<font color="orange">(匹配度100%)</font></h4>
									<p class="list-group-item-text"><font color="orange">8-10k</font>本科|3-5年工作经验</p>
									<p class="list-group-item-text"><font color="orange" size="2px">产品开发&nbsp;&nbsp;用户研究&nbsp;&nbsp;用户体验&nbsp;&nbsp;视觉设计</font></p>
									<p class="list-group-item-text"><font size="2px">发布日期：2017/8/30</font></p>
								</a>
							</div>
						</div>
						<div class="col-md-6" style="padding: 0px;">
							<div class="pull" style="margin-top: 10px;">
								<div class="pull-left">
									<a href="#">
										<img class="pull-object" src="../img/电脑.jpg" alt="..." style="height: 80px;">
									</a>
								</div>
								<div class="pull-body">
									<h5 class="media-heading" style="font-weight: bold;">成都高新区人力资源协会</h5>
									<p>政府单位/专业服务、人力资源/成都<br><font color="orange">活跃度90%</font><br><span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span></p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-md-offset-1">
					<div class="row" style="border: 1px solid orange;height: 80px;margin-top: 10px;text-align: center;padding-top: 30px;font-size: 20px;color: orange;">
						各公司LOGO及其LOGO名
					</div>
					<div class="row" style="border: 1px solid orange;height: 80px;margin-top: 10px;text-align: center;padding-top: 30px;font-size: 20px;color: orange;">
						各公司LOGO及其LOGO名
					</div>
					<div class="row" style="border: 1px solid orange;height: 80px;margin-top: 10px;text-align: center;padding-top: 30px;font-size: 20px;color: orange;">
						各公司LOGO及其LOGO名
					</div>
					<div class="row" style="border: 1px solid orange;height: 80px;margin-top: 10px;text-align: center;padding-top: 30px;font-size: 20px;color: orange;">
						各公司LOGO及其LOGO名
					</div>
					<div class="row" style="border: 1px solid orange;height: 80px;margin-top: 10px;text-align: center;padding-top: 30px;font-size: 20px;color: orange;">
						各公司LOGO及其LOGO名
					</div>
				</div>
			</div>
		</div>
		<!--footer-->
		<!--copyright-->
		
<script type="text/javascript">
//-----------------------------------------------------根据首页搜索得到的所有职位和对应的公司信息-------------------------------------------------------------------------
	var parent = null;
	function display(data){
		var obj = data;
		parent = $("#productmanagermodel");
		parent.empty();
		for(var i=0;i<obj.length;i++){				
				var content = '<div class="row" style="border: 1px solid darkgray;padding-left：0px;padding-right: 0px;margin-top: 10px;cursor:pointer;">';
				content+='<div class="col-md-6" style="padding: 0px;">';
				content+='<div class="list-group" style="margin-bottom: 0px;">';
				content+='<a href="javascript:void(0)" class="list-group-item" style="border: none;">';
				content+='<h4 class="list-group-item-heading">'+obj[i].job+'<font color="orange">(匹配度'+obj[i].null1+'%)</font></h4>';
				content+='<p class="list-group-item-text"><font color="orange">'+obj[i].salary+'</font>'+obj[i].education_required+'|'+obj[i].experience_required+'</p>';
				content+='<p class="list-group-item-text"><font color="orange" size="2px">'+obj[i].job_required+'</font></p>';
				content+='<p class="list-group-item-text"><font size="2px">发布日期：'+obj[i].release_time.substring(0,4)+'/'+obj[i].release_time.substring(5,7)+'/'+obj[i].release_time.substring(8,10)+'</font></p>';
				content+='</a></div></div><div class="col-md-6" style="padding: 0px;"><div class="pull" style="margin-top: 10px;"><div class="pull-left"><a href="javascript:void(0)">';
				content+='<img class="pull-object" src="../images/'+obj[i].logo+'" alt="..." style="height: 80px;">';
				content+='</a></div><div class="pull-body"><h5 class="media-heading" style="font-weight: bold;">'+obj[i].company_name1+'</h5>';
				content+='<p>'+obj[i].company_type+'/'+obj[i].industry_categroy+'/'+obj[i].city+'<br><font color="orange">活跃度'+obj[i].activity_degree+'%</font><br><span class="glyphicon glyphicon-search" aria-hidden="true"></span>';
				content+='<span class="glyphicon glyphicon-search" aria-hidden="true"></span></p>';
				content+='</div></div></div></div>';
				parent.append(content); 								
		}		
		parent.find(".row").each(function(index,element){
			$(this).on("click",function(){
				var job = obj[index].job;
				var company_name = obj[index].company_name1;
				var url = encodeURI("http://localhost:8080/jobDetails?job="+job+"&company_name="+company_name);				
				window.open(url,'_self');
			});
		});
	}
	function display1(data){
		var obj = data;
				var parent = $("#productmanagermodel");
				parent.empty();
				for(var i=0;i<obj.length;i++){				
						var content = '<div class="row" style="border: 1px solid darkgray;padding-left：0px;padding-right: 0px;margin-top: 10px;">';
						content+='<div class="col-md-6" style="padding: 0px;">';
						content+='<div class="list-group" style="margin-bottom: 0px;">';
						content+='<a href="#" class="list-group-item" style="border: none;">';
						content+='<h4 class="list-group-item-heading">'+obj[i].job+'<font color="orange">(匹配度'+obj[i].null1+'%)</font></h4>';
						content+='<p class="list-group-item-text"><font color="orange">'+obj[i].salary+'</font>'+obj[i].education_required+'|'+obj[i].experience_required+'</p>';
						content+='<p class="list-group-item-text"><font color="orange" size="2px">'+obj[i].job_required+'</font></p>';
						content+='<p class="list-group-item-text"><font size="2px">发布日期：'+obj[i].release_time.substring(0,4)+'/'+obj[i].release_time.substring(5,7)+'/'+obj[i].release_time.substring(8,10)+'</font></p>';
						content+='</a></div></div><div class="col-md-6" style="padding: 0px;"><div class="pull" style="margin-top: 10px;"><div class="pull-left"><a href="javascript:void(0)">';
						content+='<img class="pull-object" src="../images/'+obj[i].logo+'" alt="..." style="height: 80px;">';
						content+='</a></div><div class="pull-body"><h5 class="media-heading" style="font-weight: bold;">'+obj[i].company_name+'</h5>';
						content+='<p>'+obj[i].company_type+'/'+obj[i].industry_categroy+'/'+obj[i].city+'<br><font color="orange">活跃度'+obj[i].activity_degree+'%</font><br><span class="glyphicon glyphicon-search" aria-hidden="true"></span>';
						content+='<span class="glyphicon glyphicon-search" aria-hidden="true"></span></p>';
						content+='</div></div></div></div>';
						parent.append(content);	 				
				}
			parent.find(".row").each(function(index,element){
			$(this).on("click",function(){
				var job = obj[index].job;
				var company_name = obj[index].company_name;
				var url = encodeURI("http://localhost:8080/jobDetails?job="+job+"&company_name="+company_name);				
				window.open(url,'_self');
			});
		});
	}
	$(document).ready(function(){
		 $.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findJobsByNameMethod",
			data:window.location.search.substring(1),
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				display(data);			
			},
			error:function(data){
				alert("出错了");
			}		
		});  		
	//-----------------------------------------------------------退出登录-------------------------------------------------------------------------------------	
		$(".outlogin").on("click",function(){
			$.ajax({
				type:"POST",
				//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
				url:"Outlogin",
				data:null,
				dataType:"text",//指定服务器返回的数据类型
				success:function(data){				
					window.location.replace("http://localhost:8080/loginAndRegist");
				},
				error:function(data){
					alert("出错了");
				}		
			});
		});		
//-----------------------------------------------------写字楼区域------------------------------------------------------------------			
//--------------------写字楼区域01:页面加载时的大源国际展示---------
	function OfficeBuilding(title,id){
		$.ajax({
		type:"POST",
		//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findcompany_nameByStreet_jobMethod",
		data:"street="+title,
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){				
			var obj = data;
			var parent = $("#"+id+"");
			parent.empty();
			var content = '<div class="row"><div class="col-md-11">';
			for(var i=0;i<obj.length;i++){
				if(i<1){
					content += '<a href="javascript:void(0)" >'+obj[i]+'</a>&nbsp;&nbsp;';
				}				
			}
			parent.append(content);
			var selectAllCompany = '<a href="javascript:void(0)" style="color: orange;">查看全部企业>></a>';
			parent.append(selectAllCompany);
			parent.append('</div></div>');
			parent.find("a:last").on("click",function(){
				$.ajax({
					type:"POST",
					//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
					url:"findcompany_nameByStreet_jobMethod",
					data:"street="+title,
					dataType:"json",//指定服务器返回的数据类型
					success:function(data){				
						var obj = data;
						var parent = $("#"+id+"");
						parent.empty();
						var content = '<div class="row"><div class="col-md-11">';
						for(var i=0;i<obj.length;i++){							
								content += '<a href="javascript:void(0)" >'+obj[i]+'</a>&nbsp;&nbsp;';											
						}
						parent.append(content);
						var selectAllCompany = '<a href="javascript:void(0)" style="color: orange;">查看全部企业>></a>';
						parent.append(selectAllCompany);
						parent.append('</div></div>');
						
						parent.find("a:not(:last)").each(function(index,element){
							$(this).on("click",function(){
								//alert($(this).text());
								var company_name = $(this).text();
								var url = encodeURI("http://localhost:8080/companyDetails?company_name="+company_name);				
								window.open(url,'_self');
							});
						});																				
					},
					error:function(data){
						alert("出错了");
					}		
				});
				
			});
			parent.find("a:not(:last)").each(function(index,element){
				$(this).on("click",function(){
					var company_name = $(this).text();
					var url = encodeURI("http://localhost:8080/companyDetails?company_name="+company_name);				
					window.open(url,'_self');
				});
			});	
		},
		error:function(data){
			alert("出错了");
		}		
	});
	}
	OfficeBuilding("大源国际","home");
	
//----------------------------写字楼区域02:写字楼区域所有点击事件的展示----------
$("li[role='presentation']").each(function(index,element){
	$(this).on("click",function(){
		var title = $(this).text();
		
		var id = $(this).find("a:first").attr("href").substring(1);
		OfficeBuilding(title,id);
	});
});
//--------------------------------------------------------搜索--------------------------------------------------------------------------------
$("button:first").on("click",function(){	
		research();		
	});
	$("#research").keydown(function(e){
		if(e.keyCode==13){
			research();			
		}
	});
	function research(){
		var content = $("#research").val();		
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findJobsByNameMethod",
			data:"job="+content,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				if(obj[0].job!=null&&obj[0].job.trim()!=''&&content!=null&&content.trim()!=''){
					window.open("http://localhost:8080/jobList?job="+content,'_self');
				}
				
			},
			error:function(data){
				alert("出错了");
			}		
		});
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findCompanysByNameMethod",
			data:"company_name="+content,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				if(obj[0].company_name!=null&&obj[0].company_name.trim()!=''&&content!=null&&content.trim()!=''){
					window.open("http://localhost:8080/companyList?company_name="+content,'_self');
				}
				
			},
			error:function(data){
				alert("出错了");
			}		
		});
	}
//------------------------------------根据地铁，行业领域，薪资，工作年限，企业性质，学历要求，发布日期进行条件查询-------------------------------------------------------------------
var region = null;
var IndustryField = [];
var salarysmall = null;
var salarybig = null;
var experience_requiredsmall = null;
var experience_requiredbig = null;
var company_type = null;
var education_required = null;
var release_timesmall = null;
var release_timebig = null;
//---------------------地铁点击事件---------------------------------
$("#subway").find("a").each(function(index,element){
	$(this).on("click",function(){
		var regionzh = $(this).text();
		if(regionzh=='高新'){
			region="gaoxin";
		}
		if(regionzh=='孵化园'){
			region="fuhuayuan";
		}
		if(regionzh=='金融城'){
			region="jinrongcheng";
		}
		if(regionzh=='锦城广场'){
			region="jinchengguangchang";
		}
		if(regionzh=='世纪城'){
			region="shijicheng";
		}
		if(regionzh=='天府三街'){
			region="tianfusanjie";
		}
		if(regionzh=='天府五街'){
			region="tianfuwujie";
		}
		if(regionzh=='华府大道'){
			region="huafudadao";
		}
		if(regionzh=='其他'){
			region="qita";
		}
		var allConditionForJobs= {};
		allConditionForJobs.region = region;
		allConditionForJobs.categroys=IndustryField; 
		allConditionForJobs.salarysmall=salarysmall;
		allConditionForJobs.salarybig=salarybig;
		allConditionForJobs.experience_requiredsmall=experience_requiredsmall;
		allConditionForJobs.experience_requiredbig=experience_requiredbig;
		allConditionForJobs.company_type=company_type;
		allConditionForJobs.education_required=education_required;
		allConditionForJobs.release_timesmall=release_timesmall;
		allConditionForJobs.release_timebig=release_timebig;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findJobsByAllConditionMethod",
		data:JSON.stringify(allConditionForJobs),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				display1(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});		
	});
});
//------------------------行业领域点击事件----------------------------
$("#industry_categroy").find("a").each(function(index,element){
	$(this).on("click",function(){
		var categroys = [];
		categroys = $(this).text().split("/");
		for(var i=0;i<categroys.length;i++){
			IndustryField[i]=categroys[i];
		}
		var allConditionForJobs= {};
		allConditionForJobs.region = region;
		allConditionForJobs.categroys=IndustryField; 
		allConditionForJobs.salarysmall=salarysmall;
		allConditionForJobs.salarybig=salarybig;
		allConditionForJobs.experience_requiredsmall=experience_requiredsmall;
		allConditionForJobs.experience_requiredbig=experience_requiredbig;
		allConditionForJobs.company_type=company_type;
		allConditionForJobs.education_required=education_required;
		allConditionForJobs.release_timesmall=release_timesmall;
		allConditionForJobs.release_timebig=release_timebig;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findJobsByAllConditionMethod",
		data:JSON.stringify(allConditionForJobs),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				display1(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});		
	});
});
//------------------------薪资点击事件----------------------------
$("#salary").find("li").each(function(index,element){
	$(this).on("click",function(){
		var content = $(this).text();
		if(content=='50以下'){
			salarysmall=0;
			salarybig=50;
		}
		if(content=='50-100'){
			salarysmall=50;
			salarybig=100;
		}
		if(content=='100-200'){
			salarysmall=100;
			salarybig=200;
		}		
		if(content=='200-500'){
			salarysmall=200;
			salarybig=500;
		}
		if(content=='500-2000'){
			salarysmall=500;
			salarybig=2000;
		}
		if(content=='2000-10000'){
			salarysmall=2000;
			salarybig=10000;
		}
		if(content=='10000以上'){
			salarysmall=10000;
			salarybig=100000000;
		}
		var allConditionForJobs= {};
		allConditionForJobs.region = region;
		allConditionForJobs.categroys=IndustryField; 
		allConditionForJobs.salarysmall=salarysmall;
		allConditionForJobs.salarybig=salarybig;
		allConditionForJobs.experience_requiredsmall=experience_requiredsmall;
		allConditionForJobs.experience_requiredbig=experience_requiredbig;
		allConditionForJobs.company_type=company_type;
		allConditionForJobs.education_required=education_required;
		allConditionForJobs.release_timesmall=release_timesmall;
		allConditionForJobs.release_timebig=release_timebig;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findJobsByAllConditionMethod",
		data:JSON.stringify(allConditionForJobs),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				display1(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});	
		
	});
});
//------------------------工作年限点击事件----------------------------
$("#experience_required").find("li").each(function(index,element){
	$(this).on("click",function(){
		var content = $(this).text();		
		experience_requiredsmall=content;
		var allConditionForJobs= {};
		allConditionForJobs.region = region;
		allConditionForJobs.categroys=IndustryField; 
		allConditionForJobs.salarysmall=salarysmall;
		allConditionForJobs.salarybig=salarybig;
		allConditionForJobs.experience_requiredsmall=experience_requiredsmall;
		allConditionForJobs.experience_requiredbig=experience_requiredbig;
		allConditionForJobs.company_type=company_type;
		allConditionForJobs.education_required=education_required;
		allConditionForJobs.release_timesmall=release_timesmall;
		allConditionForJobs.release_timebig=release_timebig;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findJobsByAllConditionMethod",
		data:JSON.stringify(allConditionForJobs),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				display1(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});
	});
});
//------------------------企业性质点击事件----------------------------
$("#company_type").find("li").each(function(index,element){
	$(this).on("click",function(){
		var content = $(this).text();		
		company_type=content;
		var allConditionForJobs= {};
		allConditionForJobs.region = region;
		allConditionForJobs.categroys=IndustryField; 
		allConditionForJobs.salarysmall=salarysmall;
		allConditionForJobs.salarybig=salarybig;
		allConditionForJobs.experience_requiredsmall=experience_requiredsmall;
		allConditionForJobs.experience_requiredbig=experience_requiredbig;
		allConditionForJobs.company_type=company_type;
		allConditionForJobs.education_required=education_required;
		allConditionForJobs.release_timesmall=release_timesmall;
		allConditionForJobs.release_timebig=release_timebig;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findJobsByAllConditionMethod",
		data:JSON.stringify(allConditionForJobs),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				display1(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});
	});
});
//------------------------学历要求点击事件----------------------------
$("#education_required").find("li").each(function(index,element){
	$(this).on("click",function(){
		var content = $(this).text();		
		education_required=content;
		var allConditionForJobs= {};
		allConditionForJobs.region = region;
		allConditionForJobs.categroys=IndustryField; 
		allConditionForJobs.salarysmall=salarysmall;
		allConditionForJobs.salarybig=salarybig;
		allConditionForJobs.experience_requiredsmall=experience_requiredsmall;
		allConditionForJobs.experience_requiredbig=experience_requiredbig;
		allConditionForJobs.company_type=company_type;
		allConditionForJobs.education_required=education_required;
		allConditionForJobs.release_timesmall=release_timesmall;
		allConditionForJobs.release_timebig=release_timebig;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findJobsByAllConditionMethod",
		data:JSON.stringify(allConditionForJobs),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				display1(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});
	});
});
//-------------------------------发布日期点击事件------------------------------------------
function addDate(days){ 
var d=new Date(); 
d.setDate(d.getDate()+days); 
var month=d.getMonth()+1; 
var day = d.getDate(); 
if(month<10){ 
month = "0"+month; 
} 
if(day<10){ 
day = "0"+day; 
} 
var val = d.getFullYear()+"-"+month+"-"+day; 
return val; 
}
//alert(addDate(-30));
$("#release-time").find("li").each(function(index,element){
	$(this).on("click",function(){
		var content = $(this).text();
		if(content=='1天内'){
			release_timebig = addDate(0);
			release_timesmall = addDate(-1);
		}
		if(content=='1周内'){
			release_timebig = addDate(0);
			release_timesmall = addDate(-7);
		}
		if(content=='1月内'){
			release_timebig = addDate(0);
			release_timesmall = addDate(-30);
		}
		if(content=='1年内'){
			release_timebig = addDate(0);
			release_timesmall = addDate(-365);
		}
		var allConditionForJobs= {};
		allConditionForJobs.region = region;
		allConditionForJobs.categroys=IndustryField; 
		allConditionForJobs.salarysmall=salarysmall;
		allConditionForJobs.salarybig=salarybig;
		allConditionForJobs.experience_requiredsmall=experience_requiredsmall;
		allConditionForJobs.experience_requiredbig=experience_requiredbig;
		allConditionForJobs.company_type=company_type;
		allConditionForJobs.education_required=education_required;
		allConditionForJobs.release_timesmall=release_timesmall;
		allConditionForJobs.release_timebig=release_timebig;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findJobsByAllConditionMethod",
		data:JSON.stringify(allConditionForJobs),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				display1(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});
	});
});
//----------------------------------------------------根据职位做页面跳转-----------------------------------------------------------------------------------			
	//var jobParent = $("#productmanagermodel");
	
		
		
			
			
			
			
			
	});
</script>
		
	</body>
</html>
