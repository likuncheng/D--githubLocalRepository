<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>网站首页</title>
	<link href="http://www.imooc.com/data/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/2.css">
	<script src="../js/html5shiv.js"></script>
	<script src="../js/respond.min.js"></script>
	<script type="text/javascript">	</script>
	<![endif]-->
</head>
<body>
<!-- 开始就使用栅格布局 -->
<div class="container">
	<div class="row" id="row1">
		<div class="col-md-12">
				<a><img src="../images/21.png"></a>
		</div>
	</div>
	<div class="row" id="row2">
		<div class="col-md-6 col-md-offset-1">
			<!-- 导航条1 -->
			<nav class="navbar navbar-primary" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand btn btn-warning" href="#">企业版</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="http://localhost:8080/index">首页</a></li>
						<li><a href="#">公司推荐</a></li>
						<li><a href="#">政策解读</a></li>
						<li><a href="#">校园招聘</a></li>
						<li><a href="#">活动专区</a></li>
					</ul>
				</div>
			</div>	
			</nav>
			
		</div>
		<div class="col-md-4 col-md-offset-1">
			<!-- 导航条2 -->
			<nav class="navbar navbar-primary" role="navigation">
			<div class="container">					
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="#">系统消息</a></li>
						<li><a href="javascript:void(0)" id="resume">我的简历</a></li>
						<li><a href="#">投递记录</a></li>
						<li class="dropdown">
				          <a href="##" data-toggle="dropdown" class="dropdown-toggle">用户名<span class="caret"></span></a>
				          <ul class="dropdown-menu">
				        	<li><a href="##">我的订阅</a></li>
				        	<li><a href="##">职位邀请</a></li>
				        	<li><a href="##">账号设置</a></li>
				        	<li class="outlogin"><a href="javascript:void(0)">退出</a></li>
				          </ul>
				        </li>
					</ul>
				</div>
			</div>	
			</nav>
			
		</div>
	</div>
	<div class="row" id="row3">
		<div class="col-md-10 col-md-offset-1">
			 <div class="input-group">
                 <input id="research" type="text" class="form-control" placeholder="请输入职位名称或公司名称"/>
                 <span class="input-group-addon"><a href="javascript:void(0)">搜    索</a></span>
          	 </div>
		</div>
	</div>
	<div class="row" id="row4">
		<div class="col-md-5 col-md-offset-3">
			<p>相关搜索：<span><a href="#">java实习</a>  <a href="#">产品运营实习</a></span></p>
		</div>
	</div>
	<div class="row" id="row5">
		<!-- 做一个相对于row5的一个浮动div -->
		<div class="caidanleft">
			<div class="row11">
				<p class="p1number">技术</p>
				<p>java</p>
				<p>web前端</p>
				<p>Python</p>
				<span style="" class="glyphicon glyphicon-chevron-right"></span>
				<!-- 向右浮动的弹出菜单 -->
				<div class="tanchukuang">
					<div><a href="#"></a></div><div><a href="#"></a></div><div><a href="#">产品实习生</a></div><div><a href="#"></a></div><div><a href="#">测试实习生</a></div>
				</div>
			</div>
			<div class="row11">
				<p class="p1number">产品</p>
				<p>产品经理</p>
				<p>产品助理</p>
				<p>产品实习生</p>						
				<span style="" class="glyphicon glyphicon-chevron-right"></span>
				<div class="tanchukuang">
					<div><a href="#">产品经理</a></div><div><a href="#">产品助理</a></div><div><a href="#">产品实习生</a></div><div><a href="#">游戏策划</a></div><div><a href="#">网页产品</a></div>
				</div>
			</div>
			<div class="row11">
				<p class="p1number">设计</p>
				<p>产品经理</p>
				<p>产品助理</p>
				<p>产品实习生</p>						
				<span style="" class="glyphicon glyphicon-chevron-right"></span>
				<div class="tanchukuang">
					<div><a href="#">产品经理</a></div><div><a href="#">产品助理</a></div><div><a href="#">产品实习生</a></div><div><a href="#">游戏策划</a></div><div><a href="#">网页产品</a></div>
				</div>
			</div>
			<div class="row11">
				<p class="p1number">运营</p>
				<p>运营专员</p>
				<p>运营实习生</p>
				<p>新媒体运营</p>						
				<span style="" class="glyphicon glyphicon-chevron-right"></span>
				<div class="tanchukuang">
					<div><a href="#">产品经理</a></div><div><a href="#">产品助理</a></div><div><a href="#">产品实习生</a></div><div><a href="#">游戏策划</a></div><div><a href="#">网页产品</a></div>
				</div>
			</div>
			<div class="row11">
				<p class="p1number">销售</p>
				<p>市场</p>
				<p>商务</p>
				<p>销售</p>						
				<span style="" class="glyphicon glyphicon-chevron-right"></span>
				<div class="tanchukuang">
					<div><a href="#">产品经理</a></div><div><a href="#">产品助理</a></div><div><a href="#">产品实习生</a></div><div><a href="#">游戏策划</a></div><div><a href="#">网页产品</a></div>
				</div>
			</div>
			<div class="row11">
				<p class="p1number">职能</p>
				<p>管培生</p>
				<p>人事</p>
				<p>行政</p>						
				<span style="" class="glyphicon glyphicon-chevron-right"></span>
				<div class="tanchukuang">
					<div><a href="#">产品经理</a></div><div><a href="#">产品助理</a></div><div><a href="#">产品实习生</a></div><div><a href="#">游戏策划</a></div><div><a href="#">网页产品</a></div>
				</div>
			</div>
		</div>
		<div class="caidanright">
			
			<div class="container">
				<div class="row" id="row521">
					<div class="col-md-1"></div>
					<div class="col-md-11">
						<a href="#"><img  src=""></a>
					</div>
				</div>
				<div class="row" id="row522">
					<div class="col-md-1"></div>
					<div class="col-md-2"><a href="#"><img  src=""></a></div>
					<div class="col-md-2"><a href="#"><img  src=""></a></div>
					<div class="col-md-2"><a href="#"><img  src=""></a></div>
					<div class="col-md-2"><a href="#"><img  src=""></a></div>
					<div class="col-md-2"><a href="#"><img  src=""></a></div>
				</div>
			</div>
			
		</div>
	</div> 
	<div class="row" id="row6">
		<div class="col-md-12">
			<!-- 选项卡 -->
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			    <li class="active"><a href="#gaoxin" role="tab" data-toggle="tab">高新</a></li>
			    <li><a href="#jinrongcheng" role="tab" data-toggle="tab">金融城</a></li>
			    <li><a href="#fuhuayuan" role="tab" data-toggle="tab">孵化园</a></li>
			    <li><a href="#jinchengguangchang" role="tab" data-toggle="tab">锦城广场</a></li>
			    <li><a href="#shijicheng" role="tab" data-toggle="tab">世纪城</a></li>
			    <li><a href="#tianfusanjie" role="tab" data-toggle="tab">天府三街</a></li>
			    <li><a href="#tianfuwujie" role="tab" data-toggle="tab">天府五街</a></li>
			    <li><a href="#huafudadao" role="tab" data-toggle="tab">华府大道</a></li>
			    <li><a href="#qita" role="tab" data-toggle="tab">其他</a></li>
			</ul>
			<!-- 选项卡面板 -->
			<div id="myTabContent" class="tab-content">
			    <div class="tab-pane fade in active" id="gaoxin">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    					 <!-- <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/61.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/62.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/63.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/64.png"></a></div> 
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/65.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/66.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/67.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/68.png"></a></div>
			    					 <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/69.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/610.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/611.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/612.png"></a></div> 
			    					 <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/613.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/614.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/615.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/616.png"></a></div> -->
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="gaoxincomenvir">
			    					 <!-- <div class="col-md-3"><a href="#"><img src="../images/622.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/623.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/624.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/625.png"></a></div> --> 
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="jinrongcheng">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    					 <!-- <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/61.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/62.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/63.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/64.png"></a></div> 
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/65.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/66.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/67.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/68.png"></a></div>
			    					 <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/69.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/610.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/611.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/612.png"></a></div> 
			    					 <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/613.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/614.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/615.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/616.png"></a></div> -->
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="jinrongchengcomenvir">
			    					 <!-- <div class="col-md-3"><a href="#"><img src="../images/622.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/623.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/624.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/625.png"></a></div> --> 
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="fuhuayuan">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    					 <!-- <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/61.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/62.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/63.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/64.png"></a></div> 
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/65.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/66.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/67.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/68.png"></a></div>
			    					 <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/69.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/610.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/611.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/612.png"></a></div> 
			    					 <div class="col-md-3"><a href="#"><img class="img-circle" src="../images/613.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/614.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/615.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img class="img-circle" src="../images/616.png"></a></div> -->
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="fuhuayuancomenvir">
			    					 <!-- <div class="col-md-3"><a href="#"><img src="../images/622.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/623.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/624.png"></a></div>
			    					<div class="col-md-3"><a href="#"><img src="../images/625.png"></a></div> --> 
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="jinchengguangchang">			    	
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="jinchengguangchangcomenvir">
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="shijicheng">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="shijichengcomenvir">			    					
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="tianfusanjie">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="tianfusanjiecomenvir">
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="tianfuwujie">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="tianfuwujiecomenvir">
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="huafudadao">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="huafudadaocomenvir">
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			    <div class="tab-pane fade" id="qita">
			    	<div class="container">
			    		<div class="row">
			    			<div class="col-md-4">
			    			<!-- 后端用for循环插入数据的时候对下面这个模块进行迭代就行 -->
			    				<div class="row">
			    				</div>
			    			</div>
			    			<div class="col-md-8">
			    				<div class="row">
			    					<div class="pp">tap4fun</div>
			    					<div>
			    						<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/617.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">移动互联网游戏</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/618.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">不需要融资</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/619.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">150-500人</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/620.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading">软件园A区</h5>										    	
										  	</div>
										</div>
										<div class="media">
										    <a class="pull-left" href="#">
										        <img class="media-object" src="../images/621.png">
										  	</a>
										  	<div class="media-body">
										    	<h5 class="media-heading"><span id="span1">2</span>个校招职位</h5>										    	
										  	</div>
										</div>
			    					</div>
			    					<div class="pp2">全球著名的顶尖手游公司</div>
			    				</div>
			    				<div class="row" id="qitacomenvir">
			    				</div>
			    			</div>
			    		</div>
			    	</div>
			    </div>
			</div>
		</div>
	</div>
	<div class="row" id="row7">
		<div class="col-md-12">
			<!-- 选项卡 -->
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			    <li class="active"><a href="#bulletin" role="tab" data-toggle="tab">技术</a></li>
			    <li><a href="#rule" role="tab" data-toggle="tab">产品</a></li>
			    <li><a href="#forum" role="tab" data-toggle="tab">运营</a></li>
			    <li><a href="#security" role="tab" data-toggle="tab">设计</a></li>
			    <li><a href="#welfare" role="tab" data-toggle="tab">市场</a></li>
			    <li><a href="#welfare1" role="tab" data-toggle="tab">销售</a></li>
			    <li><a href="#welfare2" role="tab" data-toggle="tab">职能</a></li>
			</ul>
			<!-- 选项卡面板 -->
			<div id="myTabContent" class="tab-content">
			    <div class="tab-pane fade in active" id="bulletin">
			    	<div class="row">
			    		
			    	</div>			    	
			    </div>
			    <div class="tab-pane fade" id="rule">
			    	<div class="row">
			    		
			    	</div>	
			    </div>
			    <div class="tab-pane fade" id="forum">
			    	<div class="row">
			    		
			    	</div>	
			    </div>
			    <div class="tab-pane fade" id="security">
			    	<div class="row">
			    		
			    	</div>	
			    </div>
			    <div class="tab-pane fade" id="welfare">
			    	<div class="row">
			    		
			    	</div>	
			    </div>
			    <div class="tab-pane fade" id="welfare1">
			    	<div class="row">
			    		
			    	</div>	
			    </div>
			    <div class="tab-pane fade" id="welfare2">
			    	<div class="row">
			    		
			    	</div>	
			    </div>
			</div>
		</div>
	</div>
	<div class="row" id="row8">
		<div>
			<div id="huodong"><a>活动广场</a></div>
			<div id="hrr"></div>
		</div>
	</div>
	<div class="row" id="row9">
		<!-- <div class="row" id="row91"> -->
			<!-- <div class="col-md-2">
				<a href="#"><img src="../images/638.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/639.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/640.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/641.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/642.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/643.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/644.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/645.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/646.png"></a>
				<p class="pwz">文字文字文字</p>
			</div>
			<div class="col-md-2">
				<a href="#"><img src="../images/647.png"></a>
				<p class="pwz">文字文字文字</p>
			</div> -->
		<!-- </div> -->
	</div>
</div>
<script src="../js/jquery-1.11.1.min.js"></script>
<script src="../http://www.imooc.com/data/jquery-ui-1.9.2.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/2.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
	
//---------------------------------------------------左侧菜单-----------------------------------------------------------------			
		$.ajax({
			type:"GET",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findAllJobsMethod",
			data:null,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				$(".caidanleft .row11").each(function(index,element){
					var category = $(this).children(":eq(0)").html();
					var datacontent = "job_category="+category;
					var $thiselement = $(this);
					var $thisfloatelement = $(this).find(".tanchukuang div");
					$.ajax({
						type:"POST",
						url:"findJobsByCategoryMethod",
						data:datacontent,
						dataType:"json",//指定服务器返回的数据类型
						success:function(data1){
							var obj1 = data1;
							//alert(obj1.length)
							//alert($thiselement.children(":eq(1)").html())
							for(var i=0;i<3&&i<obj1.length;i++){
								$thiselement.children(":eq("+(i+1)+")").html(obj1[i].job);
							}
							for(var i=0;i<5&&i<obj1.length;i++){
								$thisfloatelement.children(":eq("+i+")").html(obj1[i].job);
							}
						},
						error:function(){
							alert("出错了");
						}
						
					});
					
					
					
				});
			},
			error:function(data){
				alert("出错了");
			}		
		});

//---------------------------------------------------右侧的图片-----------------------------------------------------------------			
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findAllT_ADsMethod",
			data:null,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				$("#row521 img").attr("src","../images/"+obj[0].poster_address);
				$("#row522 img").each(function(index,element){
					$(this).attr("src","../images/"+obj[index+1].poster_address);				
				});
			},
			error:function(data){
				alert("出错了");
			}		
		});
//------------------------------------------高新、金融城、孵化园、世纪城-------------------------------------------------------------		
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findT_Com_InfoByLocationMethod",
			data:"region=gaoxin",
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				$(".pp").text(obj[0].company_name).attr("style","font-size:17px;font-weight:bold;padding:5px;cursor: pointer;");
				$(".col-md-8 .row .media-heading:eq(0)").text(obj[0].industry_categroy);
				$(".col-md-8 .row .media-heading:eq(1)").html(obj[0].company_profile);
				$(".col-md-8 .row .media-heading:eq(2)").html(obj[0].company_scale);
				$(".col-md-8 .row .media-heading:eq(3)").html(obj[0].null1);
				$("#span1").html(obj[0].job_count); 
				$(".pp2").html(obj[0].company_type);
				var s = obj[0].null2;
				var array = s.split(",");
				$("#gaoxincomenvir").empty();
				$("#gaoxincomenvir").html("");
				for(var j=0;j<array.length;j++){				
					var comenvirpic = $("<div class='col-md-3'><img  src='../images/"+array[j]+"'></div>");
					$("#gaoxincomenvir").append(comenvirpic);
				}
				$("#gaoxin .col-md-4 .row").empty();
				 for(var i=0;i<=obj.length;i++){					
						if(i<16){
							var content = $("<div class='col-md-3'><img class='img-circle' src='../images/"+obj[i].logo+"'></div>");
							content.css("cursor","pointer");										
						$("#gaoxin .col-md-4 .row").append(content);					
						content.on("click",function(){
										$.ajax({
											type:"POST",
											//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
											url:"findT_Com_InfoByLogoMethod",
											data:"logo="+$(this).children().attr("src").substring(10),											
											dataType:"json",//指定服务器返回的数据类型
											success:function(data){
											var obj = data;
											//alert(obj.logo+":"+obj.md5_2);
											// alert(obj.logo+":"+obj.md5_2);
											$(".pp").text(obj.company_name);
											$(".col-md-8 .row .media-heading:eq(0)").text(obj.industry_categroy);	
											$(".col-md-8 .row .media-heading:eq(1)").html(obj.company_profile);
											$(".col-md-8 .row .media-heading:eq(2)").html(obj.company_scale);
											$(".col-md-8 .row .media-heading:eq(3)").html(obj.null1);
											$("#span1").html(obj.job_count); 
											$(".pp2").html(obj.company_type);	
											var s = obj.null2;
											var array = s.split(",");
											$("#gaoxincomenvir").html("");
											$("#gaoxincomenvir").empty();
											for(var j=0;j<array.length;j++){				
												var comenvirpic = $("<div class='col-md-3'><img  src='../images/"+array[j]+"'></div>");												
												$("#gaoxincomenvir").append(comenvirpic);
											} 
											},
											error:function(data){
												alert("出错了");
											}		
										}); 
							
							
							
						});
						}										
				 } 
				 
				 	  
			},
			error:function(data){
				alert("出错了");
			}		
		});
//---------------------------------------------------技术、产品、运营、设计、市场、销售、职能的初始化，默认显示技术面板----------------------------------------------------		
	$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findIndexJobCompanyMethod",
			data:"job_category=技术",
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var parent = $("#myTabContent #bulletin .row");
				parent.empty();
				for(var i=0;i<obj.length;i++){
					if(i<12){						
						var content = "<div class='col-md-3' style='cursor:pointer'>";
						content+="<div id='col-md-3-1'>";
						content+="<div id='col-md-3-21'>";
						content+="<a href='javascript:void(0)'><h4 class='job'>"+obj[i].job+"</h4></a>";
						content+="<p>"+obj[i].education_required+"</p></div>";
						content+="<div class='media' id='col-md-3-22'>";
						content+="<a class='pull-left' href='javascript:void(0)'>";
						content+="<img class='media-object' src='../images/"+obj[i].logo+"'></a>";
						content+="<div class='media-body'>";
						content+="<a href='javascript:void(0)'><h4 class='media-heading'>"+obj[i].company_name+"</h4></a>";
						content+="<div>"+obj[i].industry_categroy+"/"+obj[i].city+"</div></div></div></div></div>";																		
						parent.append(content);						
					}					
				}
				parent.find(".col-md-3").on('click',function(){
					var job = $(this).find(".job").text();
					var company_name = $(this).find(".media-heading").text();	
					var url = encodeURI("http://localhost:8080/jobDetails?job="+job+"&company_name="+company_name);				
					window.open(url,'_self');
				});
			},
			error:function(data){
				alert("出错了");
			}		
		});	
//-------------------------------------------------------------活动------------------------------------------------------------------------------
		$.ajax({
			type:"GET",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findAllActiveMethod",
			data:null,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var length = obj.length;
				if(length>0){
					var parent = $("<div class='row' id='row91'></div>");
					parent.empty();
					for(var i=0;i<10;i++){
						var content = "<div class='col-md-2'>";
						content+="<a href='#'><img src='../images/"+obj[i].null1+"'></a>";
						content+="<p class='pwz'>"+obj[i].content+"</p></div>";
						parent.append(content);
					}
					$("#row9").append(parent);
				
				
				}			
			},
			error:function(data){
				alert("出错了");
			}		
		});
		 
//----------------------------------------------------------跳转到我的简历页面------------------------------------------------------------------------------
	$("#resume").on("click",function(){
		$.ajax({
			type:"GET",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findUserMethod",
			data:"a=aa",
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				if(obj!=false){
					var url = encodeURI("http://localhost:8080/resume?phone="+obj);				
					window.open(url,'_self');
				}
				if(obj==false){
					alert("您没有登录，无法访问我的简历");
				}							
			},
			error:function(data){
				alert("出错了");
			}		
		});	
	});		
//----------------------------------------------------------------------------------------------------------------------------------------
	
	});
	</script>

</body>
</html>
