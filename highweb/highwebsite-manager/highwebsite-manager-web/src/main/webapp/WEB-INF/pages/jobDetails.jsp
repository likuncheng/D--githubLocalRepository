<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>职位详情页面</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/4.css">
	<script src="../js/html5shiv.js"></script>
	<script src="../js/respond.min.js"></script>
	<script type="text/javascript">	</script>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=b1LafrGdC6GzRmW4E7VK1S21dc8nWxm8"></script>
	<![endif]-->
</head>
<body>
	<!-- 开始使用栅格布局 -->
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
	<div class="row" id="row3">
			<div class="col-md-1 col-lg-1 col-xs-1 col-sm-1"></div>
			<div class="col-md-7 col-lg-7 col-xs-7 col-sm-7">
				<div class="container" id="container2">				
					<div class="row" id="row3-7-1">
						<!-- 媒体对象 -->
						<div class="media">
						    <a class="pull-right" href="#">
						        <img class="media-object" src="../images/41.png">
						        <div class="head">已收到简历：<span>11</span>份</div>
						  	</a>
						  	<div class="media-body">
						    	<h3 class="media-heading">产品经理<small>&nbsp;&nbsp;&nbsp;简历匹配度100%</small></h3>
						    	<div class="mb" id="mbfirst">8-10k</div><div class="mb">本科</div><div class="mb">3-5年工作经验</div>
						    	<div class="mb1">产品开发&nbsp;&nbsp;&nbsp;用户研究&nbsp;&nbsp;&nbsp;用户体验&nbsp;&nbsp;&nbsp;视觉设计</div>
						    	<div>发布日期：2017/8/30</div>
						    	<div class="mb2"></div>
						  	</div>
						</div>
					</div>
					<div class="row" id="row3-7-2">
						<div class="r372head"><img src="../images/43.png">职位描述</div>
						<ul>
							<li class="r372b">工作职责：</li>
							<li>1、协调广告平台产品调研、需求分析、设计规划和项目周期管理</li>
							<li>2、独立完成平台原型设计并输出需求文档</li>
							<li>3、负责跟进产品功能实现并用运营数据验证转化效果</li>
							<li>4、定义AdServer商业逻辑规划及广告优化策略</li>
							<li>5、协助流量接入的问题排查及eCPM数据优化</li>
							<li>6、规划系统解决方案及产品功能演示</li>
							<li class="r372b">任职要求：</li>
							<li>1、本科以上学历</li>
							<li>2、3年以上广告产品或技术解决方案经验，移动端广告变现成功案例</li>
							<li>3、对于DSP/SSP上下游系统有深入理解</li>
							<li>4、熟悉SDK/S2S对接的流量形态，了解流量反作弊机制</li>
							<li>5、第三方数据平台(AppsFlyer,Adjust等)对接经验更加</li>
							<li>6、视频广告/游戏行业经验更佳</li>
						</ul>
					</div>
					<div class="row" id="row3-7-3">
						<p>职位诱惑:</p>
						<p class="p2">年底双薪&nbsp;&nbsp;带薪年假&nbsp;&nbsp;六险一金&nbsp;&nbsp;季度奖金&nbsp;&nbsp;股票期权&nbsp;&nbsp;职业规划&nbsp;&nbsp;学习平台</p>
					</div>
					<div class="row" id="row3-7-4">
						<p class="r374p">协会温馨提示：</p>
						<p>如在投递及面试过程中遇到招聘方的任何收费行为(如培训费、体检费、资料费、置装费、押金等)，则存在欺诈风险，请您务必提高警惕。</p>
					</div>
					<div class="row" id="row3-7-5">
						<div class="r375d1"><img src="../images/44.png">可能感兴趣的职位:</div>
						<!-- 媒体对象列表(有嵌套) -->
						<ul class="media-list">
						    <li class="media">
						    <!-- 加急这个标签根据业务需要进行if条件判断是否需要加在这儿 -->
						    	<div class="jiaji"><img src="../images/412.png"></div>
						    <!-- 做中间的一条横线 -->
						    <div class="hengxian"></div>
						    <!-- 做一个相对于父元素的浮动,里面放了一个媒体对象 -->
						        <div class="mediaheading">					        	
						        	<div class="media">
						        	
									    <a class="pull-left" href="#">
									        <img class="media-object" src="../images/45.png">
									  	</a>
									  	<div class="media-body" >
									    	<a href="#"><h5 class="media-heading">成都高新区人力资源协会</h5></a>
									    	<div class="government">政府单位/专业服务、人力资源/成都</div>
									    	<div class="huoyuedu">活跃度<span>90%</span></div>
									    	<div><img src="../images/47.png">&nbsp;<img src="../images/48.png"></div>
									  	</div>
									</div>
						        </div>
						        <div class="media-body">
						            <a href="#"><h3 class="media-heading1">产品经理<small>&nbsp;&nbsp;&nbsp;[匹配度100%]</small></h3></a>
							    	<div class="mbs"><span>8-10k</span></div><div class="mbs">本科</div><div class="mbs">3-5年工作经验</div>
							    	<div class="mbs1">产品开发&nbsp;&nbsp;&nbsp;用户研究&nbsp;&nbsp;&nbsp;用户体验&nbsp;&nbsp;&nbsp;视觉设计</div>
							    	<div>发布日期：2017/8/30</div>
						        </div>
						    </li>
						    <li class="media">
						    	<div class="jiaji"><img src="../images/412.png"></div>
						    <!-- 做中间的一条横线 -->
						    <div class="hengxian"></div>
						    <!-- 做一个相对于父元素的浮动,里面放了一个媒体对象 -->
						        <div class="mediaheading">
						        	<div class="media">
									    <a class="pull-left" href="#">
									        <img class="media-object" src="../images/45.png">
									  	</a>
									  	<div class="media-body">
									    	<a href="#"><h5 class="media-heading">成都高新区人力资源协会</h5></a>
									    	<div class="government">政府单位/专业服务、人力资源/成都</div>
									    	<div class="huoyuedu">活跃度<span>90%</span></div>
									    	<div><img src="../images/47.png">&nbsp;<img src="../images/48.png"></div>
									  	</div>
									</div>
						        </div>
						        <div class="media-body">
						            <a href="#"><h3 class="media-heading1">产品经理<small>&nbsp;&nbsp;&nbsp;[匹配度100%]</small></h3></a>
							    	<div class="mbs"><span>8-10k</span></div><div class="mbs">本科</div><div class="mbs">3-5年工作经验</div>
							    	<div class="mbs1">产品开发&nbsp;&nbsp;&nbsp;用户研究&nbsp;&nbsp;&nbsp;用户体验&nbsp;&nbsp;&nbsp;视觉设计</div>
							    	<div>发布日期：2017/8/30</div>
						        </div>
						    </li>
						    <li class="media">
						    	<div class="jiaji"><img src="../images/412.png"></div>
						    <!-- 做中间的一条横线 -->
						    <div class="hengxian"></div>
						    <!-- 做一个相对于父元素的浮动,里面放了一个媒体对象 -->
						        <div class="mediaheading">
						        	<div class="media">
									    <a class="pull-left" href="#">
									        <img class="media-object" src="../images/45.png">
									  	</a>
									  	<div class="media-body">
									    	<a href="#"><h5 class="media-heading">成都高新区人力资源协会</h5></a>
									    	<div class="government">政府单位/专业服务、人力资源/成都</div>
									    	<div class="huoyuedu">活跃度<span>90%</span></div>
									    	<div><img src="../images/47.png">&nbsp;<img src="../images/48.png"></div>
									  	</div>
									</div>
						        </div>
						        <div class="media-body">
						            <a href="#"><h3 class="media-heading1">产品经理<small>&nbsp;&nbsp;&nbsp;[匹配度100%]</small></h3></a>
							    	<div class="mbs"><span>8-10k</span></div><div class="mbs">本科</div><div class="mbs">3-5年工作经验</div>
							    	<div class="mbs1">产品开发&nbsp;&nbsp;&nbsp;用户研究&nbsp;&nbsp;&nbsp;用户体验&nbsp;&nbsp;&nbsp;视觉设计</div>
							    	<div>发布日期：2017/8/30</div>
						        </div>
						    </li>
						    <li class="media">
						    	<div class="jiaji"><img src="../images/412.png"></div>
						    <!-- 做中间的一条横线 -->
						    <div class="hengxian"></div>
						    <!-- 做一个相对于父元素的浮动,里面放了一个媒体对象 -->
						        <div class="mediaheading">
						        	<div class="media">
									    <a class="pull-left" href="#">
									        <img class="media-object" src="../images/45.png">
									  	</a>
									  	<div class="media-body">
									    	<a href="#"><h5 class="media-heading">成都高新区人力资源协会</h5></a>
									    	<div class="government">政府单位/专业服务、人力资源/成都</div>
									    	<div class="huoyuedu">活跃度<span>90%</span></div>
									    	<div><img src="../images/47.png">&nbsp;<img src="../images/48.png"></div>
									  	</div>
									</div>
						        </div>
						        <div class="media-body">
						            <a href="#"><h3 class="media-heading1">产品经理<small>&nbsp;&nbsp;&nbsp;[匹配度100%]</small></h3></a>
							    	<div class="mbs"><span>8-10k</span></div><div class="mbs">本科</div><div class="mbs">3-5年工作经验</div>
							    	<div class="mbs1">产品开发&nbsp;&nbsp;&nbsp;用户研究&nbsp;&nbsp;&nbsp;用户体验&nbsp;&nbsp;&nbsp;视觉设计</div>
							    	<div>发布日期：2017/8/30</div>
						        </div>
						    </li>
						</ul>
					</div>
					<div class="row" id="row3-7-6">
						当前位置：<a href="#">职位搜索</a>><a href="#">成都高新区人力资源协会招聘</a>><a href="#">产品经理招聘</a>
					</div>
					
				</div>
			</div>
			<div class="col-md-3 col-lg-3 col-xs-3 col-sm-3">
				<div class="container" id="container3">
					<div class="row" id="row3-3-1">
						<div><img class="img-circle" src="../images/49.png"></div>
						<div class="r331d1">成都高新区人力资源协会</div>
						<div class="r331d2">活跃度<span>90%</span></div>
						<div><img src="../images/47.png">&nbsp;<img src="../images/48.png"></div>
					</div>
					<div class="row" id="row3-3-2">
						<p>行业：政府单位/专业服务、人力资源</p>
						<p>规模：100-500人</p>
						<p>公司地址：成都市高新区大源国际人才城A3栋22楼</p>
						<div id="map">
							<!--百度地图容器-->
    						<div style="width:250px;height:280px;border:#ccc solid 1px;font-size:12px" id="map"></div>
						</div>
						<a href="#"><p class="more">查看更多>></p></a>
					</div>
					<div class="row" id="row3-3-3">
						<img src="../images/410.png">
					</div>
					<div class="row" id="row3-3-4">
						<div>推荐企业：</div>
						<ul>
							<a href="#"><li>成都高新区人力资源协会</li></a>
							<a href="#"><li>成都高新区人才服务中心</li></a>
							<a href="#"><li>成都高新区财政服务中心</li></a>
							<a href="#"><li>成都高新区人力资源协会</li></a>
							<a href="#"><li>成都高新区人才服务中心</li></a>
						</ul>
					</div>
					<div class="row" id="row3-3-5">
						<div class="r335d1">订阅的高新职位：</div>
						<div>微信订阅</div>
						<!-- 媒体对象 -->
						<div class="media">
						    <a class="pull-left" href="#">
						        <img class="media-object" src="../images/411.png">
						  	</a>
						  	<div class="media-body">
						    	<h4 class="media-heading">扫描二维码随时关注最新高薪职位或在微信公众号中搜索"高新才富"</h4>						    	
						  	</div>
						</div>
					</div>
				</div>
			</div>
	</div>
<script src="../js/jquery-1.11.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/4.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
		//-------------------------------------------------------------活动------------------------------------------------------------------------------
		var parameter = decodeURI(window.location.search.substring(1));
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findT_Com_InfoVoByJobAndCompanynameMethod",
			data:parameter,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				$("#row3-7-1 .media-heading").text(obj.job);
				$("#row3-7-1 .media-heading").append('<small>&nbsp;&nbsp;&nbsp;简历匹配度'+obj.null11+'%</small>');
				$("#mbfirst").text(obj.salary);
				$(".mb:eq(1)").text(obj.education_required);
				$(".mb:eq(2)").text(obj.experience_required);
				$(".mb1").text(obj.job_required);
				$(".mb1").next().text('发布日期：'+obj.release_time.substring(0,4)+'/'+obj.release_time.substring(5,7)+'/'+obj.release_time.substring(8,10)+'');
				$(".mb2").append('<img src="../images/42.png">');
				$(".mb2").append(obj.street);
				$("#row3-7-2 ul").empty();
				$("#row3-7-2 ul").append('<li class="r372b">工作职责：</li>');
				var descriptarray = obj.job_description.split(' ');
				for(var i=0;i<descriptarray.length;i++){
					$("#row3-7-2 ul").append('<li>'+(i+1)+'、'+descriptarray[i]+'</li>');
				}
				$("#row3-7-2 ul").append('<li class="r372b">任职要求：</li>');
				var jobrequiredarray = obj.null41.split(' ');
				for(var i=0;i<jobrequiredarray.length;i++){
					$("#row3-7-2 ul").append('<li>'+(i+1)+'、'+jobrequiredarray[i]+'</li>');
				}				
				 $("#row3-7-3 .p2").text(obj.job_label);
				$("#row3-3-1 img:first").attr("src","../images/"+obj.logo);
				$("#row3-3-1 .r331d1").text(obj.company_name);
				$("#row3-3-1 .r331d2 span").text(obj.activity_degree+"%");
				$("#row3-3-2 p:first").text('行业：'+obj.company_type+'/'+obj.industry_categroy+'');
				$("#row3-3-2 p:eq(1)").text('规模：'+obj.company_scale+'人');
				$("#row3-3-2 p:eq(2)").text('公司地址：'+obj.city+''+obj.street+''); 
			},
			error:function(data){
				alert("出错了");
			}		
		});
	});
</script>

</body>
</html>
