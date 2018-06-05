<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>公司列表</title>
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<script src="../js/jquery-1.11.1.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		<style type="text/css">
			a{
				color: black;
			}
			.addedClass{
				box-shadow: 0 0 50px #888888;
			}
			
		</style>
		<script type="text/javascript">
			$(function(){
				$(".enterpriseChoosed").on("mouseover",function(){
					$(this).addClass("addedClass")
				}).on("mouseout",function(){
					$(this).removeClass("addedClass")
				})
			})
			
		</script>
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
				    				<a href="#" >腾讯</a>&nbsp;&nbsp;<a href="#" >京东</a>
				    				&nbsp;&nbsp;<a href="#" >京东</a>&nbsp;&nbsp;<a href="#" >工商银行</a>
				    				&nbsp;&nbsp;<a href="#" >滴滴</a>&nbsp;&nbsp;<a href="#" >百度</a>
						    		&nbsp;&nbsp;<a href="#" >中国移动</a>&nbsp;&nbsp;<a href="#" >网易</a>
						    		&nbsp;&nbsp;<a href="#" >完美世界</a>&nbsp;&nbsp;<a href="#" >中国银行</a>
						    		&nbsp;&nbsp;<a href="#" >中置集团</a>&nbsp;&nbsp;<a href="#" >万科物业</a>
						    		&nbsp;&nbsp;<a href="#" >广汽集团</a>&nbsp;&nbsp;<a href="#" >百度</a>
						    		&nbsp;&nbsp;<a href="#" >阿里巴巴</a>&nbsp;&nbsp;<a href="#" >腾讯</a>
						    		&nbsp;&nbsp;<a href="#" >京东</a>&nbsp;&nbsp;<a href="#" >京东</a>
						    		&nbsp;&nbsp;<a href="#" >工商银行</a>&nbsp;&nbsp;<a href="#" >滴滴</a>
						    		&nbsp;&nbsp;<a href="#" >中国移动</a>&nbsp;&nbsp;<a href="#" >网易</a>
						    		&nbsp;&nbsp;<a href="#" >完美世界</a>&nbsp;&nbsp;<a href="#" >中国银行</a>
						    		&nbsp;&nbsp;<a href="#" >中置集团</a>&nbsp;&nbsp;<a href="#" >万科物业</a>
						    		&nbsp;&nbsp;<a href="#" >广汽集团</a>
						    		&nbsp;&nbsp;<a href="#" style="color: orange;">查看全部企业>></a>
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
					<a href="javascript:void(0)">高新</a>&nbsp;&nbsp;<a href="javascript:void(0)" >金融城</a>&nbsp;&nbsp;<a href="javascript:void(0)" >孵化园</a>
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
					<a href="#">计算机/互联网/游戏/电子</a>&nbsp;&nbsp;<a href="javascript:void(0)" >会计/金融/银行/保险</a>&nbsp;&nbsp;<a href="javascript:void(0)" >贸易/消费/制造/营运</a>
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
						    	企业规模
							    <span class="caret"></span>
							  </button>
							  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" id="company_scale">
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
						    	企业性质
							    <span class="caret"></span>
							  </button>
							  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1" id="company_type">
							    <li><a href="javascript:void(0)">内资企业</a></li>
							    <li><a href="javascript:void(0)">国有企业</a></li>
							    <li><a href="javascript:void(0)">事业单位</a></li>
							    <li><a href="javascript:void(0)">外资及合资企业</a></li>
							    <li><a href="javascript:void(0)">其他企事业单位</a></li>
							  </ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--body-->
		<div class="container" style="margin-top: 10px;">
			<div class="row" id="companyList">
				<div class="col-md-3 enterpriseChoosed" align="center" style="border: 0.5px solid rgba(192,192,192,0.2);margin-top: 10px;">
					<div class="row" style="margin-top: 5px;">
						<img src="../img/computer.jpg" style="height: 60px;width: 60px;" />
						<p style="margin-top: 5px;"><font style="font-weight: bold;">成都高新人力资源协会</font><br/>
						<font color="darkgray" size="2px">政府单位/专业服务、人力资源/成都</font><br />
						<span class="glyphicon glyphicon glyphicon-pawn" aria-hidden="true"></span>&nbsp;
						<span class="glyphicon glyphicon glyphicon-level-up" aria-hidden="true"></span><br />
						--------------------------------------------------<br />
						</p>
					</div>
					<div class="row">
						<div class="col-md-4" align="center">
							<p><font size="2px" color="orange">7</font><br/><font size="2px">在招职位</font></p>
						</div>
						<div class="col-md-4" align="center">
							<p><font size="2px" color="orange">99%</font><br/><font size="2px">活跃度</font></p>
						</div>
						<div class="col-md-4">
							<p><a href="#"><font size="2px" color="orange">12</font></a><br/><font size="2px">面试评价</font></p>
						</div>
					</div>
				</div>
				
				<div class="col-md-3 enterpriseChoosed" align="center" style="border: 0.5px solid rgba(192,192,192,0.2);margin-top: 10px;">
					<div class="row" style="margin-top: 5px;">
						<img src="../img/电脑.jpg" style="height: 60px;width: 60px;" />
						<p style="margin-top: 5px;"><font style="font-weight: bold;">成都高新人力资源协会</font><br/>
						<font color="darkgray" size="2px">政府单位/专业服务、人力资源/成都</font><br />
						<span class="glyphicon glyphicon glyphicon-pawn" aria-hidden="true"></span>&nbsp;
						<span class="glyphicon glyphicon glyphicon-level-up" aria-hidden="true"></span><br />
						--------------------------------------------------<br />
						</p>
					</div>
					<div class="row">
						<div class="col-md-4" align="center">
							<p><font size="2px" color="orange">7</font><br/><font size="2px">在招职位</font></p>
						</div>
						<div class="col-md-4" align="center">
							<p><font size="2px" color="orange">99%</font><br/><font size="2px">活跃度</font></p>
						</div>
						<div class="col-md-4">
							<p><a href="#"><font size="2px" color="orange">12</font></a><br/><font size="2px">面试评价</font></p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--footer-->
		<div class="container" style="margin-top: 20px;">
			<div class="row" align="center">
				<nav aria-label="Page navigation">
				  <ul class="pagination">
				    <li>
				      <a href="#" aria-label="Previous">
				        <span aria-hidden="true" style="color: black;">上一页</span>
				      </a>
				    </li>
				    <li><a href="#" style="color: black;">1</a></li>
				    <li><a href="#" style="color: black;">2</a></li>
				    <li><a href="#" style="color: black;">3</a></li>
				    <li><a href="#" style="color: black;">4</a></li>
				    <li><a href="#" style="color: black;">5</a></li>
				    <li>
				      <a href="#" aria-label="Next">
				        <span aria-hidden="true" style="color: black;">下一页</span>
				      </a>
				    </li>
				  </ul>
				</nav>
			</div>
		</div>
		<!--copyright-->
		<div class="container" style="margin-top: 30px;">
			
		</div>
		
		
	<script type="text/javascript">	
		$(document).ready(function(){
		var companydata = null;
		var representpage=1;
		
//---------------------------------分页事件---------------------------------------------
	//-------------------完成分页栏的创建---------------------
	function fenye(){
		var pageParent = $(".pagination");
		var pagecontent = '<li><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true" style="color: black;">上一页</span></a></a></li>';
		pageParent.empty();
		pageParent.append(pagecontent);
		var RepresentPage=null;
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"fenyeSetMethod",
			data:"representPage=1",
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var pageContentli = '';
				var yeshu = obj.totalPage;
				for(var i=1;i<=obj.totalPage;i++){
					if(i==representpage){
						pageContentli+='<li class="active"><a href="javascript:void(0)" style="color: black;">'+i+'</a></li>';
					}else{
						pageContentli+='<li><a href="javascript:void(0)" style="color: black;">'+i+'</a></li>';
					}
				}
				pageParent.append(pageContentli);
				var pageContentend = '<li><a href="javascript:void(0)" aria-label="Next"><span aria-hidden="true" style="color: black;">下一页</span></a></li>';
				pageParent.append(pageContentend);
				//--------------------分页点击事件--------------------------------
				pageParent.find("li:not(:first):not(:last)").each(function(index,element){
					$(this).on("click",function(){
						representpage = $(this).text();						
						$.ajax({
							type:"POST",
							url:"fenyeSetMethod",
							data:"representPage="+representpage,
							dataType:"json",//指定服务器返回的数据类型
							success:function(data){
								//alert(companydata);
								display(companydata);
							},
							error:function(){
								alert("出错了");
							}
						});
					});
				});
				//-------------------------上一页下一页点击事件-------------------------------
				pageParent.find("li:first").each(function(index,element){
					$(this).on("click",function(){						
						if(representpage>1){
							representpage = representpage-1;
						}else{
							representpage=1;
						}
						$.ajax({
							type:"POST",
							url:"fenyeSetMethod",
							data:"representPage="+representpage,
							dataType:"json",//指定服务器返回的数据类型
							success:function(data){
								//alert(companydata);
								display(companydata);
							},
							error:function(){
								alert("出错了");
							}
						});
					});
				});
				pageParent.find("li:last").each(function(index,element){
					$(this).on("click",function(){						
						if(representpage<yeshu){
							representpage = representpage+1;
						}else{
							representpage=yeshu;
						}
						$.ajax({
							type:"POST",
							url:"fenyeSetMethod",
							data:"representPage="+representpage,
							dataType:"json",//指定服务器返回的数据类型
							success:function(data){
								//alert(companydata);
								display(companydata);
							},
							error:function(){
								alert("出错了");
							}
						});
					});
				});	
			},
			error:function(){
				alert("fenyeSetMethod出错了");
				}		
			});	
	}		
		
//------------------------------------------------------------display----------------------------------------------------------------------			
		function display(data){
		var obj = data;
			 $.ajax({
				type:"POST",
				contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
				url:"fenyeResultMethod",
				data:JSON.stringify(data),
				dataType:"json",//指定服务器返回的数据类型
				success:function(newdate){	
				//alert("fenyeResultMethodsuccess");			
					var obj = newdate;
					var parent = $("#companyList");
					parent.empty();	
					companylength = obj.length;		
					for(var i=0;i<obj.length;i++){
						if(i<4){
							var content = '<div class="col-md-3 enterpriseChoosed" align="center" style="border: 0.5px solid rgba(192,192,192,0.2);margin-top: 10px;">';
							content+='<div class="row" style="margin-top: 5px;">';
							content+='<img src="../images/'+obj[i].logo+'" style="height: 60px;width: 60px;" />';
							content+='<p style="margin-top: 5px;"><font style="font-weight: bold;">'+obj[i].company_name+'</font><br/>';
							content+='<font color="darkgray" size="2px">'+obj[i].company_type+'/'+obj[i].industry_categroy+'/'+obj[i].city+'</font><br />';
							content+='<span class="glyphicon glyphicon glyphicon-pawn" aria-hidden="true"></span>&nbsp;<span class="glyphicon glyphicon glyphicon-level-up" aria-hidden="true"></span><br />';
							content+='--------------------------------------------------<br /></p></div><div class="row"><div class="col-md-4" align="center">';
							content+='<p><font size="2px" color="orange">'+obj[i].job_count+'</font><br/><font size="2px">在招职位</font></p>';
							content+='</div><div class="col-md-4" align="center">';
							content+='<p><font size="2px" color="orange">'+obj[i].activity_degree+'%</font><br/><font size="2px">活跃度</font></p>';
							content+='</div><div class="col-md-4">';
							content+='<p><a href="#"><font size="2px" color="orange">'+obj[i].null3+'</font></a><br/><font size="2px">面试评价</font></p>';
							content+='</div></div></div>';
							parent.append(content);
						}
					}
					parent.find(".col-md-3").each(function(index,element){
						$(this).css("cursor","pointer");
						$(this).on("click",function(){
							var company_name = $(this).find("img").next().find("font:eq(0)").text();
							var url = encodeURI("http://localhost:8080/companyDetails?company_name="+company_name);				
							window.open(url,'_self');
						});
					});
					fenye(); 				
				},
				error:function(newdate){
					alert("出错了");
				}		
			});
	 
		}	
//--------------------------------------------------根据首页搜索跳转过来要执行的ajax---------------------------------------------------
			//alert(window.location.search.substring(1));
			 $.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findCompanysByNameMethod",
			data:window.location.search.substring(1),
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				companydata = data;
				display(data);					
			},
			error:function(data){
				alert("出错了");
			}		
		});  
		fenye();
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
//------------------------------------------------------写字楼区域------------------------------------------------------------------------------	
//--------------------写字楼区域01:页面加载时的大源国际展示---------
	function OfficeBuilding(title,id){
		$.ajax({
		type:"POST",
		//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findcompany_nameByStreetMethod",
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
					url:"findcompany_nameByStreetMethod",
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
//--------------------------------------------------根据地铁，行业领域，企业规模，企业性质进行条件查询--------------------------------------------------------------
var region = null;
var IndustryField = [];
var company_scale = null;
var company_type = null;
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
		var allConditionForCompanys= {};
		allConditionForCompanys.categroys=IndustryField; 
		allConditionForCompanys.region=region;
		allConditionForCompanys.company_scale=company_scale;
		allConditionForCompanys.company_type=company_type;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findCompanysByAllConditionMethod",
		data:JSON.stringify(allConditionForCompanys),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				companydata = data;
				representpage=1;
				display(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});		
	});
});
//------------------------------------------------------行业领域点击事件--------------------------------------------------------------
$("#industry_categroy").find("a").each(function(index,element){
	$(this).on("click",function(){
		var categroys = [];
		categroys = $(this).text().split("/");
		for(var i=0;i<categroys.length;i++){
			IndustryField[i]=categroys[i];
		}
		var allConditionForCompanys= {};
		allConditionForCompanys.categroys=IndustryField; 
		allConditionForCompanys.region=region;
		allConditionForCompanys.company_scale=company_scale;
		allConditionForCompanys.company_type=company_type;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findCompanysByAllConditionMethod",
		data:JSON.stringify(allConditionForCompanys),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				companydata = data;
				representpage=1;
				display(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});		
	});
});
//--------------------------------------------------------企业规模点击事件---------------------------------------------------------------
$("#company_scale").find("li").each(function(index,element){
	$(this).on("click",function(){
		company_scale = $(this).text();
		var allConditionForCompanys= {};
		allConditionForCompanys.categroys=IndustryField; 
		allConditionForCompanys.region=region;
		allConditionForCompanys.company_scale=company_scale;
		allConditionForCompanys.company_type=company_type;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findCompanysByAllConditionMethod",
		data:JSON.stringify(allConditionForCompanys),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				companydata = data;
				representpage=1;
				display(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});	
	});
});
//--------------------------------------------------------企业性质点击事件---------------------------------------------------------------
$("#company_type").find("li").each(function(index,element){
	$(this).on("click",function(){
		company_type = $(this).text();
		var allConditionForCompanys= {};
		allConditionForCompanys.categroys=IndustryField; 
		allConditionForCompanys.region=region;
		allConditionForCompanys.company_scale=company_scale;
		allConditionForCompanys.company_type=company_type;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findCompanysByAllConditionMethod",
		data:JSON.stringify(allConditionForCompanys),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
				companydata = data;
				representpage=1;
				display(data);		
			},
		error:function(data){
			alert("出错了");
			}		
		});	
	});
});








	});
</script>	
	</body>
</html>
