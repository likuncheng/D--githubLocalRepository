<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>公司详情页面</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/3.css">
	<script src="../js/html5shiv.js"></script>
	<script src="../js/respond.min.js"></script>
	<script type="text/javascript">	</script>
	<!-- 引用 百度地图API -->
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=b1LafrGdC6GzRmW4E7VK1S21dc8nWxm8"></script>
	<![endif]-->
	<script src="../js/jquery-1.11.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/3.js"></script>
</head>
<body>
<!-- 开始使用栅格布局 -->
<div class="container">
	<div class="row" id="row1">
		<div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
			<a href=""><img alt="图片一" src="../images/31.png"></a>
		</div>
	</div>
	<div class="row" id="row2" style="background-image:url(images/lijuan4.jpg)">
		<div class="row" id="row21">
			<div class="col-md-6 col-md-offset-1 col-lg-6 col-lg-offset-1 col-sm-6 col-sm-offset-1 col-xs-6 col-xs-offset-1">
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
							<li class="active"><a href="#">系统消息</a></li>
							<li><a href="#">我的简历</a></li>
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
		<div id="right-col">不同的公司相似的职位</div>
		<div id="middle-add" >
			<div class="row" id="row-1">
					<div class="col-md-4 col-md-offset-4 col-lg-4 col-lg-offset-4 col-sm-4 col-sm-offset-4 col-xs-4 col-xs-offset-4">
						<img class="img-circle" alt="" src="../images/32.png">
						<a href="#" id="row-1-a1"><p id="p-1">成都高新区人力资源协会</p></a>
						<p>活跃度<span>90%</span>&nbsp;&nbsp;&nbsp;&nbsp;<span>300</span>人关注</p>
						<div><a href="#"><img src="../images/33.png"></a></div>
						<a href="#"><img src="../images/34.png"></a><a href="#"><img src="../images/35.png"></a>
					</div>
				</div>
		</div>
		<div id="middle">
			<div class="container" id="container2">				
				<div class="row" id="row-2">
					<div class="col-md-12 col-lg-12 col-xs-12 col-sm-12">
						<div id="company">
							<h3>公司介绍</h3>
							<p>成都高新技术产业开发区(Chengdu Hi-Tech Industrial Development Zone),简称成都高新区，由成都高新南区、成都高新西区、成都高新
							东区组成。成都高新区实行省市共建、以市为主的管理体制，由成都市接管，不属于国家法定行政区划。成都高新区(不含东区)属于成都市中心城区。[1-2]</p>
							<p>成都高新区托管总面积613平方公里。其中高新南区87平方公里，高新西区43平方公里，高新东区483平方公里；共划分为7个街道、12个乡镇，其中高新南区包括
							武侯区的4个街道和双流区的1个街道，高新西区包括郫都区的2个街道，高新东区包括简阳市的12个乡镇。被托管的19个乡、镇、街道的人大、政协、军事等非行政事务仍
							由原属地管辖。</p>
						</div>
					</div>
				</div>
				<div class="row" id="row-3">
					<div class="col-md-8 col-xs-8 col-sm-8 col-lg-8">
						<div class="row" id="row3-8-1">
							<img src="../images/36.png">
							<p style="display:inline-block;">招聘职位(<span>4</span>个)</p>
						</div>
						<div class="row" id="row3-8-2">
							
							<ul class="media-list">
							    
							</ul>
	
						</div>
						<div class="row" id="row3-8-3">
							<div id="div1">面试评价</div>
							<div id="div2"></div>
						</div>
						<div class="row" id="row3-8-4">
							<div id="totaleval" class="row">
								<div id="divtotal1">综合评分：</div>
								<ul class="rating" id="rating">
							        <li class="rating-item" title="很不好" style="background-image:url(img/rating.png);"></li>
							        <li class="rating-item" title="不好" style="background-image:url(img/rating.png);"></li>
							        <li class="rating-item" title="一般" style="background-image:url(img/rating.png)"></li>
							        <li class="rating-item" title="好" style="background-image:url(img/rating.png)"></li>
							        <li class="rating-item" title="很好" style="background-image:url(img/rating.png)"></li>
							    </ul>
							    <div class="score">3.7</div><div class="eva">(来自172份评价)</div>
							</div>
							<div class="row" id="totaleval2">
							
								<div id="totaleval2-1">
									<div class="totaleval2-1-1" style="display:inline-block;">描述相符</div>									
									<ul class="rating1 totaleval2-1-2" id="rating1">
										<li class="rating-item1" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>
									    <li class="rating-item1" title="不好" style="background-image:url(img/ratingsmall.png);"></li>
									    <li class="rating-item1" title="一般" style="background-image:url(img/ratingsmall.png)"></li>
									    <li class="rating-item1" title="好" style="background-image:url(img/ratingsmall.png)"></li>
									    <li class="rating-item1" title="很好" style="background-image:url(img/ratingsmall.png)"></li>
									</ul>									
									<div class="totaleval2-1-3">2.3</div>
								</div>
								
								<div id="totaleval2-2">
									<div class="totaleval2-2-1" style="display:inline-block;">面试官</div>									
									<ul class="rating2 totaleval2-2-2" id="rating2">
										<li class="rating-item2" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>
									    <li class="rating-item2" title="不好" style="background-image:url(img/ratingsmall.png);"></li>
									    <li class="rating-item2" title="一般" style="background-image:url(img/ratingsmall.png)"></li>
									    <li class="rating-item2" title="好" style="background-image:url(img/ratingsmall.png)"></li>
									    <li class="rating-item2" title="很好" style="background-image:url(img/ratingsmall.png)"></li>
									</ul>									
									<div class="totaleval2-2-3">3.6</div>
								</div>
								
								<div id="totaleval2-3">
									<div class="totaleval2-3-1" style="display:inline-block;">公司环境</div>									
									<ul class="rating3 totaleval2-3-2" id="rating3">
										<li class="rating-item3" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>
									    <li class="rating-item3" title="不好" style="background-image:url(img/ratingsmall.png);"></li>
									    <li class="rating-item3" title="一般" style="background-image:url(img/ratingsmall.png)"></li>
									    <li class="rating-item3" title="好" style="background-image:url(img/ratingsmall.png)"></li>
									    <li class="rating-item3" title="很好" style="background-image:url(img/ratingsmall.png)"></li>
									</ul>									
									<div class="totaleval2-3-3">2</div>
								</div>
								
								
							</div>
							
						</div>
						<div class="row" id="row3-8-5">
						
							<ul class="media-list">
							    <li class="media">
							        <a class="pull-left" href="#">
							            <img class="media-object img-circle" src="../images/315.png">
							        </a>
							        <div class="media-body">
							            <div class="media-heading">
							            	吴*虎&nbsp;&nbsp;&nbsp;综合评分：
							            	<!-- 综合评分的分数，用隐藏框传到js里面 -->							            	
							            	<input type="hidden" value="2.3" class="hiddeneva"/>
							            	<!-- 需要设置ul的id属性线性增长 -->
							            	<ul class="ratingall">
												<li class="rating-itemall" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>
											    <li class="rating-itemall" title="不好" style="background-image:url(img/ratingsmall.png);"></li>
											    <li class="rating-itemall" title="一般" style="background-image:url(img/ratingsmall.png)"></li>
											    <li class="rating-itemall" title="好" style="background-image:url(img/ratingsmall.png)"></li>
											    <li class="rating-itemall" title="很好" style="background-image:url(img/ratingsmall.png)"></li>
											</ul>
							            	&nbsp;&nbsp;&nbsp;面试职位：java开发工程师
							            	<p class="day" style="float:right;top:0px;right:0px;">2017-8-20</p>
							            	
							            </div>
							            <div><img src="../images/316.png">&nbsp;&nbsp;</div>
							            <div><span>[面试过程]</span>当天就面试了两轮，等到该HR面试的时候都已经中午，HR不在，当时说是后面电话联系，
							            	然后就没有然后了。。。。
							            </div>
							            <div><span>[其他评价]</span>公司环境还可以，交通也很方便</div>
							            <div class="last">有用(2)</div>
							        </div>
							    </li>
							    <li class="media">
							        <a class="pull-left" href="#">
							            <img class="media-object img-circle" src="../images/315.png">
							        </a>
							        <div class="media-body">
							            <div class="media-heading">
							            	刘*恒&nbsp;&nbsp;&nbsp;综合评分：
							            	<!-- 综合评分的分数，用隐藏框传到js里面 -->
							            	<input type="hidden" value="3.4" class="hiddeneva"/>
							            	<ul class="ratingall">
												<li class="rating-itemall" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>
											    <li class="rating-itemall" title="不好" style="background-image:url(img/ratingsmall.png);"></li>
											    <li class="rating-itemall" title="一般" style="background-image:url(img/ratingsmall.png)"></li>
											    <li class="rating-itemall" title="好" style="background-image:url(img/ratingsmall.png)"></li>
											    <li class="rating-itemall" title="很好" style="background-image:url(img/ratingsmall.png)"></li>
											</ul>
							            	&nbsp;&nbsp;&nbsp;面试职位：系统策划<span>(已下线)</span>
							            	<p class="day" style="float:right;top:0px;right:0px;">2017-8-02</p>
							            	
							            </div>
							            <div><img src="../images/316.png">&nbsp;&nbsp;<img src="../images/317.png"></div>
							            <div><span>[面试过程]</span>公司的程序实力，感觉还不错，还是蛮想一起合作的，看面试结果了
							            </div>							           
							            <div class="last">有用(0)</div>
							        </div>
							    </li>
							    <li class="media">
							        <a class="pull-left" href="#">
							            <img class="media-object img-circle" src="../images/315.png">
							        </a>
							        <div class="media-body">
							            <div class="media-heading">
							            	杨*&nbsp;&nbsp;&nbsp;综合评分：
							            	<!-- 综合评分的分数，用隐藏框传到js里面 -->
							            	<input type="hidden" value="2.6" class="hiddeneva"/>
							            	<ul class="ratingall">
													<li class="rating-itemall" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>
												    <li class="rating-itemall" title="不好" style="background-image:url(img/ratingsmall.png);"></li>
												    <li class="rating-itemall" title="一般" style="background-image:url(img/ratingsmall.png)"></li>
												    <li class="rating-itemall" title="好" style="background-image:url(img/ratingsmall.png)"></li>
												    <li class="rating-itemall" title="很好" style="background-image:url(img/ratingsmall.png)"></li>
												</ul>
								            	&nbsp;&nbsp;&nbsp;面试职位：java开发工程师<span></span>
								            	<p class="day" style="float:right;top:0px;right:0px;">2017-07-11</p>
								            	
								            </div>
								            <div><img src="../images/316.png">&nbsp;&nbsp;<img src="../images/317.png">&nbsp;&nbsp;<img src="images/318.png"></div>
								            <div><span>[面试过程]</span>笔试题没做好，一半都不会，链表反转......面试问的问题都是项目上的，框架有些理解不够深，没有offer，当增加经验了吧。
								            </div>
								            <div><span>[其他评价]</span>hr很温柔，面试官很不错，不懂的会耐心讲解。公司环境挺舒服的，希望可以进入公司学习工作</div>
								            <div class="last">有用(2)</div>
								        </div>
								    </li>
								    
								</ul>
							
						</div>
						<div class="row" id="row3-8-6">
							<a href="javascript:void(0)"><img src="../images/311.png"></a>
						</div>
						<div class="row" id="row3-8-7">
							<!-- 分页导航 -->
							<ul class="pagination pagination-sm">
							  <li><a href="javascript:void(0)">首页</a></li>
							  <li class="connect"><a href="javascript:void(0)">上一页</a></li>
							  <li class="active"><a href="javascript:void(0)">1</a></li>
							  <li><a href="javascript:void(0)">2</a></li>
							  <li><a href="javascript:void(0)">3</a></li>
							  <li><a href="javascript:void(0)">4</a></li>
							  <li><a href="javascript:void(0)">5</a></li>
							  <li class="connect"><a href="javascript:void(0)">下一页</a></li>
							  <li><a href="javascript:void(0)">尾页</a></li>
							</ul>
						</div>
					</div>
					<div class="col-md-4 col-xs-4 col-sm-4 col-lg-4">
						<div class="row" id="row3-4-1">
							<div id="row3-4-1-div">
								<img src="../images/38.png"><p>公司基本情况</p>
							</div>
							<div class="row3-4-1-div2"><img src="../images/617.png"><p class="introduce">移动互联网,教育</p></div>
							<div class="row3-4-1-div2"><img src="../images/618.png"><p class="introduce">非盈利性机构</p></div>
							<div class="row3-4-1-div2"><img src="../images/619.png"><p class="introduce">15-50人</p></div>
							<div class="row3-4-1-div2"><img src="../images/620.png"><p class="introduce">成都市高新区大源国际A3栋22楼</p></div>
						</div>
						<div class="row" id="row3-4-2">
							<!--百度地图容器-->
    						<div style="width:290px;height:245px;border:#ccc solid 1px;font-size:12px" id="map"></div>
						</div>
						<div class="row" id="row3-4-3">
							<div id="row3-4-3-1">
								<div><img src="../images/39.png"><p style="display:inline-block;font-size:20px">职位标签</p></div>
								<div class="welfaref">
									<div class="welfare">股权分红</div>
									<div class="welfare">五险一金</div>
									<div class="welfare">扁平管理</div>
									<div class="welfare">带薪年假</div>
									<div class="welfare">绩效奖金</div>
									<div class="welfare">定期体检</div>
									<div class="welfare">管理规范</div>
								</div>

							</div>
						</div>
						<div class="row" id="row3-4-4">
							<div class="div1">相似职位</div>
							<div class="div2"></div>
							<!-- 媒体列表 -->
							<ul class="media-list">
							    <li class="media">
							        <a class="pull-left" href="#">
							            <img class="media-object" src="../images/310.png">
							        </a>
							        <div class="media-body">
							            <a href="#"><div class="media-heading">产品经理助理</div></a>
							            <div class="salary">5-6K</div>
							            <div>高新人力协会(高新.大源国际)</div>
							        </div>
							    </li>
							    <li class="media">
							        <a class="pull-left" href="#">
							            <img class="media-object" src="../images/310.png">
							        </a>
							        <div class="media-body">
							            <a href="#"><h4 class="media-heading">产品经理助理</h4></a>
							            <div class="salary">5-6K</div>
							            <div>高新人力协会(高新.大源国际)</div>
							        </div>
							    </li>
							    <li class="media">
							        <a class="pull-left" href="#">
							            <img class="media-object" src="../images/310.png">
							        </a>
							        <div class="media-body">
							            <a href="#"><h4 class="media-heading">产品经理助理</h4></a>
							            <div class="salary">5-6K</div>
							            <div>高新人力协会(高新.大源国际)</div>
							        </div>
							    </li>
							    <li class="media">
							        <a class="pull-left" href="#">
							            <img class="media-object" src="../images/310.png">
							        </a>
							        <div class="media-body">
							            <a href="#"><h4 class="media-heading">产品经理助理</h4></a>
							            <div class="salary">5-6K</div>
							            <div>高新人力协会(高新.大源国际)</div>
							        </div>
							    </li>
							</ul>
						</div>						
					</div>
				</div>
			</div>	
		</div>
	</div>
</div>

</body>
</html>