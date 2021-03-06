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

	
//------------------------------------------------------------地图代码-----------------------------------------------------------------------	
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
	
}