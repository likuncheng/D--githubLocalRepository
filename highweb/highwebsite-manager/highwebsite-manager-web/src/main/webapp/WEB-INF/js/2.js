window.onload=function(){
		
	$(".navbar-nav>li>a").hover(function(){
		$(this).css("background","rgb(148, 148, 148)").css("color","rgb(255, 136, 0)");
	},function(){
		$(this).css("background","rgb(180, 180, 180)").css("color","white");
	});
	$(".dropdown-menu>li>a").hover(function(){
		//alert("dsd");
		$(this).css("background","rgb(148, 148, 148)").css("color","white");
	},function(){
		$(this).css("background","rgb(165, 165, 165)");
	});
	$("#myTab>li>a").on("click",function(){
		$("#myTab>li>a").css("border-bottom","1px solid white").css("font-size","16px");
		$(this).css("border-bottom","2px solid #000").css("font-size","16px");
	});
	
	$("#row5 .col-md-11").hover(
			function(){
				$(this).css("cursor","pointer");
			},
			function(){
				
			}
	);
	
	
	$("#row5 .row11").each(function(index,value){
		var topl = (index)*0;
		$(this).css("top",topl+"px");
	});
	
	$("#row5 .row11").hover(function(){
		$(this).css("border-top","1px solid rgb(180, 180, 180)").css("border-bottom","1px solid rgb(180, 180, 180)").css("border-left","1px solid rgb(180, 180, 180)")
		$(this).find(".tanchukuang").css("display","block").css("border","1px solid rgb(180, 180, 180)");
	},function(){
		$(this).css("border","1px solid white");
		$(this).find(".tanchukuang").css("display","none").css("border","1px solid white");
	});
	
	$("#row5 .row11 .tanchukuang").each(function(index,value){
		$(this).find("div a").each(function(index,value){
			if(index<3){
				$(this).css("color","#00FF99");
			}
		});
	});

	
//-----------------------------------------------------高新、金融城、孵化园数据展示--------------------------------------------------------------------------	
	$("#myTab li:lt(9)").each(function(index,element){
		$(this).on("click",function(){
			var region = $(this).find("a").attr("href").substring(1);
			var dataa = "region="+region;
			//alert(region);
			$.ajax({
				type:"POST",
				//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
				url:"findT_Com_InfoByLocationMethod",
				data:dataa,
				dataType:"json",//指定服务器返回的数据类型
				success:function(data){
					var obj = data;
					$("#"+region+" "+".pp").text(obj[0].company_name).attr("style","font-size:17px;font-weight:bold;padding:5px;cursor: pointer;");
					$("#"+region+" "+".col-md-8 .row .media-heading:eq(0)").text(obj[0].industry_categroy);
					$("#"+region+" "+".col-md-8 .row .media-heading:eq(1)").html(obj[0].company_profile);
					$("#"+region+" "+".col-md-8 .row .media-heading:eq(2)").html(obj[0].company_scale);
					$("#"+region+" "+".col-md-8 .row .media-heading:eq(3)").html(obj[0].null1);
					$("#"+region+" "+"#span1").html(obj[0].job_count); 
					$("#"+region+" "+".pp2").html(obj[0].company_type);
					var s = obj[0].null2;
					var array = s.split(",");
					$("#"+region+" "+"#"+region+"comenvir").empty();
					for(var j=0;j<array.length;j++){				
						var comenvirpic = $("<div class='col-md-3'><img  src='../images/"+array[j]+"'></div>");
						$("#"+region+" "+"#"+region+"comenvir").append(comenvirpic);
					}
					$("#"+region+" "+".col-md-4 .row").empty();
					 for(var i=0;i<=obj.length;i++){					
							if(i<16){
								var content = $("<div class='col-md-3'><img class='img-circle' src='../images/"+obj[i].logo+"'></div>");										
								content.css("cursor","pointer");
								$("#"+region+" "+".col-md-4 .row").append(content);					
								content.on("click",function(){
									var logo = $(this).children().attr("src").substring(10);
												$.ajax({
													type:"POST",
													//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
													url:"findT_Com_InfoByLogoMethod",
													data:"logo="+logo,											
													dataType:"json",//指定服务器返回的数据类型
													success:function(data){
													var obj = data;
													$("#"+region+" "+".pp").text(obj.company_name);
													$("#"+region+" "+".col-md-8 .row .media-heading:eq(0)").text(obj.industry_categroy);	
													$("#"+region+" "+".col-md-8 .row .media-heading:eq(1)").html(obj.company_profile);
													$("#"+region+" "+".col-md-8 .row .media-heading:eq(2)").html(obj.company_scale);
													$("#"+region+" "+".col-md-8 .row .media-heading:eq(3)").html(obj.null1);
													$("#"+region+" "+"#span1").html(obj.job_count); 
													$("#"+region+" "+".pp2").html(obj.company_type);	
													var s = obj.null2;
													var array = s.split(",");
													$("#"+region+" "+"#"+region+"comenvir").empty();
													for(var j=0;j<array.length;j++){				
														var comenvirpic = $("<div class='col-md-3'><img  src='../images/"+array[j]+"'></div>");												
														$("#"+region+" "+"#"+region+"comenvir").append(comenvirpic);
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
			
		});
	});
	
//---------------------------------------------------技术、产品、运营、设计、市场、销售、职能数据展示----------------------------------------------------			
	//alert($("#row7 #myTab li").length);	
	$("#row7 #myTab li").each(function(index,element){
		var ahref = $(this).find("a").attr("href").substring(1);
		var parentaddress = "#myTabContent #"+ahref+" .row";
		$(this).on("click",function(){
			var job_category = $(this).find("a").html();
			//alert(job_category);
			$.ajax({
				type:"POST",
				//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
				url:"findIndexJobCompanyMethod",
				data:"job_category="+job_category,
				dataType:"json",//指定服务器返回的数据类型
				success:function(data){
					var obj = data;
					//alert(obj.length);
					var parent = $(parentaddress);
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
			
			
			
			
			
		});
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
//-----------------------------------------------------------搜索-------------------------------------------------------------------------------------		
	$("#row3 .input-group-addon a").on("click",function(){	
		research();
	});
	$("#research").keydown(function(e){
		if(e.keyCode==13){
			research();
		}
	});
	function research(){
		var content = $("#row3 .form-control").val();		
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
//---------------------------------------技术、产品、运营、设计、市场、销售、职能页面跳转-----------------------------------------------------------	
	$(".tanchukuang a").on("click",function(){
		var content = $(this).text();
		window.open("http://localhost:8080/jobList?job="+content,'_self');
	});
//---------------------------------------高新、金融城、孵化园页面跳转-----------------------------------------------------------	
	$(".pp").on("click",function(){
		var content = $(this).text();
		window.open("http://localhost:8080/companyDetails?company_name="+content,'_self');
	});
//---------------------------------------技术、产品、运营、设计、市场、销售、职能选项卡页面跳转-----------------------------------------------------------	
	
	
	
}