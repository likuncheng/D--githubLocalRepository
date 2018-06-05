window.onload=function(){
	$(".navbar-nav>li>a").hover(function(){
		//alert("dsd");
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
	
	$(".pagination > li > a").hover(function(){
		$(this).css("font-weight","bold").css("color","white").css("background","rgb(255, 136, 0)");
	},function(){
		$(this).css("color","#000").css("background","white").css("font-weight","normal");
	});
	
	//----------------------------------------------------------------------------------------------------
	
	var rating = (function(){	
		//点亮
			var lightOn = function($item,num){
				var numInt = parseInt(num);
				if(numInt<num){
					$item.each(function(index){
					if(index<numInt){
						$(this).css("background-position","0-31px");	
					}
					else if(index == numInt){
						$(this).css("background-position","0-62px");
					}		
					else if(index > numInt){
						$(this).css("background-position","0 0");
					}});	
				}else{
					$item.each(function(index){
					if(index<num){
						$(this).css("background-position","0-31px");	
					}		
					else{
						$(this).css("background-position","0 0");
					}});
				}			
			};	
		var init = function(el,num,el1){
			var $rating = $(el);
			$item=$rating.find(el1);						
			//初始化
			lightOn($item,num);
		};
		return {
			init:init
		};	
	})();
	rating.init("#rating",$("#totaleval .score").text(),".rating-item");
	//--------------------------------------------------------------------------------------------------
	var rating1 = (function(){	
		//点亮
			var lightOn = function($item,num){
				var numInt = parseInt(num);
				if(numInt<num){
					$item.each(function(index){
					if(index<numInt){
						$(this).css("background-position","0-17px");	
					}
					else if(index == numInt){
						$(this).css("background-position","0-36px");
					}		
					else if(index > numInt){
						$(this).css("background-position","0 0");
					}});	
				}else{
					$item.each(function(index){
					if(index<num){
						$(this).css("background-position","0-17px");	
					}		
					else{
						$(this).css("background-position","0 0");
					}});
				}			
			};	
		var init = function(el,num,el1){
			var $rating = $(el);
			$item=$rating.find(el1);						
			//初始化
			lightOn($item,num);
			//事件绑定
		};
		return {
			init:init
		};	
	})();
	//正式和后台接触可以用for循环来进行动态添加
	rating1.init("#rating1",$(".totaleval2-1-3").text(),".rating-item1");
	rating1.init("#rating2",$(".totaleval2-2-3").text(),".rating-item2");
	rating1.init("#rating3",$(".totaleval2-3-3").text(),".rating-item3");
	rating1.init(".ratingall",$(".hiddeneva").val(),".rating-itemall");
	//线性增长class=ratingall的id
	$(".ratingall").each(function(index,value){
		$(this).attr("id","ratingall"+index);
	});
	$(".hiddeneva").each(function(index,value){
		rating1.init("#ratingall"+index,value.value,".rating-itemall");
	});
	$("#row3-8-6>a").on("click",function(){
		//alert($(".ratingall").length);
		if($(".ratingall").length>3){
			$("#row3-8-6").css("height","900px");
		}else{
			alert("多于三条评论才会展开");
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

	//------------------------------------------百度地图代码---------------------------------------------------------
	//创建和初始化地图函数：
    function initMap(){
      createMap();//创建地图
      setMapEvent();//设置地图事件
      addMapControl();//向地图添加控件
      addMapOverlay();//向地图添加覆盖物
    }
    function createMap(){ 
      map = new BMap.Map("map"); 
      map.centerAndZoom(new BMap.Point(104.072727,30.555159),15);
    }
    function setMapEvent(){
      map.enableScrollWheelZoom();
      map.enableKeyboard();
      map.enableDragging();
      map.enableDoubleClickZoom()
    }
    function addClickHandler(target,window){
      target.addEventListener("click",function(){
        target.openInfoWindow(window);
      });
    }
    function addMapOverlay(){
      var markers = [
        {content:"我的备注",title:"我的标记",imageOffset: {width:0,height:3},position:{lat:30.552795,lng:104.075098}}
      ];
      for(var index = 0; index < markers.length; index++ ){
        var point = new BMap.Point(markers[index].position.lng,markers[index].position.lat);
        var marker = new BMap.Marker(point,{icon:new BMap.Icon("http://api.map.baidu.com/lbsapi/createmap/images/icon.png",new BMap.Size(20,25),{
          imageOffset: new BMap.Size(markers[index].imageOffset.width,markers[index].imageOffset.height)
        })});
        var label = new BMap.Label(markers[index].title,{offset: new BMap.Size(25,5)});
        var opts = {
          width: 200,
          title: markers[index].title,
          enableMessage: false
        };
        var infoWindow = new BMap.InfoWindow(markers[index].content,opts);
        marker.setLabel(label);
        addClickHandler(marker,infoWindow);
        map.addOverlay(marker);
      };
    }
    //向地图添加控件
    function addMapControl(){
      var scaleControl = new BMap.ScaleControl({anchor:BMAP_ANCHOR_BOTTOM_LEFT});
      scaleControl.setUnit(BMAP_UNIT_IMPERIAL);
      map.addControl(scaleControl);
      var navControl = new BMap.NavigationControl({anchor:BMAP_ANCHOR_TOP_LEFT,type:BMAP_NAVIGATION_CONTROL_LARGE});
      map.addControl(navControl);
      var overviewControl = new BMap.OverviewMapControl({anchor:BMAP_ANCHOR_BOTTOM_RIGHT,isOpen:true});
      map.addControl(overviewControl);
    }
    var map;
      initMap();
      
      
 //===================================================
      
      
  		//---------------读取职位-------------------
  		$.ajax({
  			type:"POST",
  			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
  			url:"findAllJobsByCompanyNameMethod",
  			data:window.location.search.substring(1),
  			dataType:"json",//指定服务器返回的数据类型
  			success:function(data){
  				var obj = data;
  				$("#row3-8-1 p span").text(obj.length);
  				var parent = $("#row3-8-2>ul");
  				parent.empty();
  				for(var i=0;i<obj.length;i++){
  					var content = '<li class="media"><a class="pull-right" href="#">';
  					content+='<img class="media-object" src="../images/37.png"></a><div class="media-body">';	
  					content+='<a href="javascript:void(0)"><h4 class="media-heading">'+obj[i].job+'(<span>匹配度'+obj[i].null1+'%</span>)</h4></a>';
  					content+='<div class="media-body-div">'+obj[i].salary+'</div>';
  					content+='<div class="media-body-div1" style="display:inline-block;">'+obj[i].education_required+'</div>';
  					content+='<div class="media-body-div2">'+obj[i].experience_required+'年工作经验</div>';
  					content+='<div><a href="#">'+obj[i].job_required+'</a></div>';
  					content+='<div>发布日期：'+obj[i].release_time.substring(0,4)+'/'+obj[i].release_time.substring(5,7)+'/'+obj[i].release_time.substring(8,10)+'</div></div></li>';
  					parent.append(content);
  				}
  				parent.find(".media-heading").each(function(index,element){
  					$(this).on("click",function(){
  						var jobcontent = $(this).text();
  						var i = jobcontent.lastIndexOf("(");
  						var job = jobcontent.substring(0,i);											
  						var url = encodeURI("http://localhost:8080/jobDetails?job="+job+"&company_name="+obj[index].company_name);				
  						window.open(url,'_self');
  					});				
  				});
  			},
  			error:function(){
  				alert("出错了")
  			}
  		});
  		//-----------------读取面试评价-------------------------
  		$.ajax({
  			type:"POST",
  			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
  			url:"findAllEvasByCompanyNameMethod",
  			data:window.location.search.substring(1),
  			dataType:"json",//指定服务器返回的数据类型
  			success:function(data){
  				var obj = data;
  				var allscore=0;
  				var description_score=0;
  				var interviewer_score=0;
  				var environment_score=0;
  				var count=0;
  				for(var i=0;i<obj.length;i++)
  				{
  						 allscore=allscore+obj[i].overall_score;
  						description_score=description_score+obj[i].description_score;
  						interviewer_score=interviewer_score+obj[i].interviewer_score;
  						environment_score=environment_score+obj[i].environment_score; 
  						count+=1;
  						//alert(description_score+"--"+environment_score+"--"+count);					
  				}
  				 $("#totaleval .score").text((allscore/count).toFixed(1));
  				$("#totaleval .eva").text("(来自"+count+"份评价)");	
  				$("#totaleval2-1 .totaleval2-1-3").text((description_score/count).toFixed(1));
  				$("#totaleval2-2 .totaleval2-2-3").text((interviewer_score/count).toFixed(1));
  				$("#totaleval2-3 .totaleval2-3-3").text((environment_score/count).toFixed(1));
  				var evaparent = $("#row3-8-5 ul");
  				var evacount=0;
  				evaparent.empty();
  				for(var j=0;j<obj.length;j++){						
  						if(evacount<3){
  							evacount+=1;
  							var content = '<li class="media"><a class="pull-left"><img class="media-object img-circle" src="../images/315.png"></a>';
  							content+='<div class="media-body"><div class="media-heading">'+obj[j].application+'&nbsp;&nbsp;&nbsp;综合评分：';
  							content+='<input type="hidden" value="'+obj[j].p_overall_score+'" class="hiddeneva"/>';
  							content+='<ul class="ratingall">';
  							content+='<li class="rating-itemall" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>';
  							content+='<li class="rating-itemall" title="不好" style="background-image:url(img/ratingsmall.png);"></li>';
  							content+='<li class="rating-itemall" title="一般" style="background-image:url(img/ratingsmall.png);"></li>';
  							content+='<li class="rating-itemall" title="好" style="background-image:url(img/ratingsmall.png);"></li>';
  							content+='<li class="rating-itemall" title="很好" style="background-image:url(img/ratingsmall.png);"></li></ul>';
  							content+='&nbsp;&nbsp;&nbsp;面试职位：'+obj[j].interview_job+'';
  							content+='<p class="day" style="float:right;top:0px;right:0px;">'+obj[j].date.substring(0,4)+'-'+obj[j].date.substring(5,7)+'-'+obj[j].date.substring(8,10)+'</p>';
  							content+='</div><div>'+obj[j].overall+'&nbsp;&nbsp;</div>';
  							content+='<div><span>[面试过程]</span>'+obj[j].interview_process+'</div>';
  							content+='<div class="last">有用('+obj[j].dot+')</div></li>';
  							evaparent.append(content);
  							
  								//正式和后台接触可以用for循环来进行动态添加
								rating1.init("#rating1",$(".totaleval2-1-3").text(),".rating-item1");
								rating1.init("#rating2",$(".totaleval2-2-3").text(),".rating-item2");
								rating1.init("#rating3",$(".totaleval2-3-3").text(),".rating-item3");
								rating1.init(".ratingall",$(".hiddeneva").val(),".rating-itemall");
								//线性增长class=ratingall的id
								$(".ratingall").each(function(index,value){
									$(this).attr("id","ratingall"+index);
								});
								$(".hiddeneva").each(function(index,value){
									rating1.init("#ratingall"+index,value.value,".rating-itemall");
								});
								
  						}
  					} 
  			},
  			error:function(){
  				alert("出错了")
  			}
  		});
  //------------------读取公司信息----------------------
  		$.ajax({
  			type:"POST",
  			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
  			url:"findCompanyByNameMethod",
  			data:window.location.search.substring(1),
  			dataType:"json",//指定服务器返回的数据类型
  			success:function(data){
  				var obj = data;
  				$("#row-1 .col-md-4>img").attr("src","../images/"+obj.logo);
  				$("#p-1").text(obj.company_name);
  				$("#company p").text(obj.company_profile);
  				$("#row3-4-1 .row3-4-1-div2:first").text(obj.industry_categroy);
  				$("#row3-4-1 .row3-4-1-div2:eq(1)").text(obj.company_type);
  				$("#row3-4-1 .row3-4-1-div2:eq(2)").text(obj.company_scale);
  				$("#row3-4-1 .row3-4-1-div2:eq(3)").text(obj.city+obj.street);
  			},
  			error:function(){
  				alert("出错了");
  			}
  		});
  //-------------------------分页点击事件----------------------------------
  //--------------先创建分页---------------
  var totalcount = 0;
  		$.ajax({
  			type:"POST",
  			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
  			url:"findAllEvasCountByCompanyNameMethod",
  			data:window.location.search.substring(1),
  			dataType:"json",//指定服务器返回的数据类型
  			success:function(data){
  				var obj = data;
  				totalcount = obj;
  				var pageSize = 3;
  				var totalPage = 0;
  				if(totalcount%pageSize!=0){
  					totalPage = totalcount/pageSize+1;
  				}
  				else{
  					totalPage = totalcount/pageSize;
  				}
  				totalPage = totalPage.toFixed(0);
  				var parent = $("#row3-8-7").find("ul");
  				parent.empty();
  				var content = '<li><a href="javascript:void(0)">首页</a></li>';
  				content+='<li class="connect"><a href="javascript:void(0)">上一页</a></li>';	
  				for(var i=1;i<=totalPage;i++){
  					if(i==1){
  						content+='<li class="active"><a href="javascript:void(0)">'+i+'</a></li>';
  					}
  					else{
  						content+='<li><a href="javascript:void(0)">'+i+'</a></li>';
  					}
  				}
  				content+='<li class="connect"><a href="javascript:void(0)">下一页</a></li>';
  				content+='<li><a href="javascript:void(0)">尾页</a></li>';
  				parent.append(content);	
  				//--------------设置分页点击事件-----------
  				var representPage = 1;
  				parent.find("li:not(:first):not(:last):not('.connect')").each(function(index,element){
  					$(this).on("click",function(){
  						representPage = $(this).text();
  						fnyeclick(representPage,pageSize); 						
  						parent.find("li").each(function(index,element){
  							var count = parseInt(representPage)+1;
  							if(index==count){
  								$(this).addClass("active"); 								
  							}
  							else{
  								$(this).removeClass("active");   								
  							}
  						});
  					});
  				});
  				parent.find("li:eq(1)").on("click",function(){
  					if(representPage>1){
  						representPage = representPage-1;
  					}
  					else{
  						representPage=1;
  					}
  					fnyeclick(representPage,pageSize);
  					parent.find("li").each(function(index,element){
						var count = parseInt(representPage)+1;
						if(index==count){
							$(this).addClass("active"); 								
						}
						else{
							$(this).removeClass("active");   								
						}
					});
  				});
  				parent.find("li:eq(-2)").on("click",function(){
  					if(representPage<totalPage){
  						representPage = representPage+1;
  					}
  					else{
  						representPage=totalPage;
  					}
  					fnyeclick(representPage,pageSize);
  					parent.find("li").each(function(index,element){
						var count = parseInt(representPage)+1;
						if(index==count){
							$(this).addClass("active"); 								
						}
						else{
							$(this).removeClass("active");   								
						}
					});
  				});
  				parent.find("li:eq(0)").on("click",function(){ 					
  						representPage=1;
  					fnyeclick(representPage,pageSize);
  					parent.find("li").each(function(index,element){
						var count = parseInt(representPage)+1;
						if(index==count){
							$(this).addClass("active"); 								
						}
						else{
							$(this).removeClass("active");   								
						}
					});
  				});
  				parent.find("li:eq(-1)").on("click",function(){ 					
						representPage=totalPage;
					fnyeclick(representPage,pageSize);
					parent.find("li").each(function(index,element){
						var count = parseInt(representPage)+1;
						if(index==count){
							$(this).addClass("active"); 								
						}
						else{
							$(this).removeClass("active");   								
						}
					});
				});
  				
  					
  			},
  			error:function(){
  				alert("出错了");
  			}
  		});
      
 //===================================================		
      function fnyeclick(representPage,pageSize){
    	  $.ajax({
				type:"POST",
				//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
				url:"fenyeMethod",
				data:window.location.search.substring(1)+"&representPage="+representPage+"&pageSize="+pageSize,
				dataType:"json",//指定服务器返回的数据类型
				success:function(data){
					var obj = data;						
					var evaparent = $("#row3-8-5 ul");
					var evacount=0;
					evaparent.empty();
					for(var j=0;j<obj.length;j++){						
							if(evacount<3){
								evacount+=1;
								var content = '<li class="media"><a class="pull-left"><img class="media-object img-circle" src="../images/315.png"></a>';
								content+='<div class="media-body"><div class="media-heading">'+obj[j].application+'&nbsp;&nbsp;&nbsp;综合评分：';
								content+='<input type="hidden" value="'+obj[j].p_overall_score+'" class="hiddeneva"/>';
								content+='<ul class="ratingall">';
								content+='<li class="rating-itemall" title="很不好" style="background-image:url(img/ratingsmall.png);"></li>';
								content+='<li class="rating-itemall" title="不好" style="background-image:url(img/ratingsmall.png);"></li>';
								content+='<li class="rating-itemall" title="一般" style="background-image:url(img/ratingsmall.png);"></li>';
								content+='<li class="rating-itemall" title="好" style="background-image:url(img/ratingsmall.png);"></li>';
								content+='<li class="rating-itemall" title="很好" style="background-image:url(img/ratingsmall.png);"></li></ul>';
								content+='&nbsp;&nbsp;&nbsp;面试职位：'+obj[j].interview_job+'';
								content+='<p class="day" style="float:right;top:0px;right:0px;">'+obj[j].date.substring(0,4)+'-'+obj[j].date.substring(5,7)+'-'+obj[j].date.substring(8,10)+'</p>';
								content+='</div><div>'+obj[j].overall+'&nbsp;&nbsp;</div>';
								content+='<div><span>[面试过程]</span>'+obj[j].interview_process+'</div>';
								content+='<div class="last">有用('+obj[j].dot+')</div></li>';
								evaparent.append(content);
								
								//正式和后台接触可以用for循环来进行动态添加
								rating1.init("#rating1",$(".totaleval2-1-3").text(),".rating-item1");
								rating1.init("#rating2",$(".totaleval2-2-3").text(),".rating-item2");
								rating1.init("#rating3",$(".totaleval2-3-3").text(),".rating-item3");
								rating1.init(".ratingall",$(".hiddeneva").val(),".rating-itemall");
								//线性增长class=ratingall的id
								$(".ratingall").each(function(index,value){
									$(this).attr("id","ratingall"+index);
								});
								$(".hiddeneva").each(function(index,value){
									rating1.init("#ratingall"+index,value.value,".rating-itemall");
								});
								
										}
									} 
					
								},
								error:function(){
									alert("出错了");
								}
							});
      }
      
      
      
      
      
      
      
      
      
      
      
      
}