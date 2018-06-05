<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">


  <head>
   <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>resume</title>
	<link href="http://www.imooc.com/data/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/2.css">
	<script src="../js/html5shiv.js"></script>
	<script src="../js/respond.min.js"></script>
	<script type="text/javascript">
		
	
	
    //调用实例
//      onclick="new Calendar().show(this);" readonly="readonly" 
/**
 * Calendar
 * @param   beginYear           1990
 * @param   endYear             2010
 * @param   language            0(zh_cn)|1(en_us)|2(en_en)|3(zh_tw)
 * @param   patternDelimiter    "-"
 * @param   date2StringPattern  "yyyy-MM-dd"
 * @param   string2DatePattern  "ymd"
 * @version 1.0 build 2006-04-01
 * @version 1.1 build 2006-12-17
 * @author  KimSoft (jinqinghua [at] gmail.com)
 * NOTE!    you can use it free, but keep the copyright please
 * IMPORTANT:you must include this script file inner html body elment 
 */
function Calendar(beginYear, endYear, language, patternDelimiter, date2StringPattern, string2DatePattern) {
	this.beginYear = beginYear || new Date().getFullYear()-100;
	this.endYear   = endYear   || new Date().getFullYear()-4;
	this.language  = language  || 0;
	this.patternDelimiter = patternDelimiter     || "-";
	this.date2StringPattern = date2StringPattern || Calendar.language["date2StringPattern"][this.language].replace(/\-/g, this.patternDelimiter);
	this.string2DatePattern = string2DatePattern || Calendar.language["string2DatePattern"][this.language];
	
	this.dateControl = null;
	this.panel  = this.getElementById("__calendarPanel");
	this.iframe = window.frames["__calendarIframe"];
	this.form   = null;
	
	this.date = new Date(1995, 5, 1);
	this.year = this.date.getFullYear();
	this.month = this.date.getMonth();
	
	this.colors = {"bg_cur_day":"#00CC33","bg_over":"#EFEFEF","bg_out":"#FAF601"};
};

Calendar.language = {
	"year"   : ["\u5e74", "", "", "\u5e74"],
	"months" : [
				["\u4e00\u6708","\u4e8c\u6708","\u4e09\u6708","\u56db\u6708","\u4e94\u6708","\u516d\u6708","\u4e03\u6708","\u516b\u6708","\u4e5d\u6708","\u5341\u6708","\u5341\u4e00\u6708","\u5341\u4e8c\u6708"],
				["JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"],
				["JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"],
				["\u4e00\u6708","\u4e8c\u6708","\u4e09\u6708","\u56db\u6708","\u4e94\u6708","\u516d\u6708","\u4e03\u6708","\u516b\u6708","\u4e5d\u6708","\u5341\u6708","\u5341\u4e00\u6708","\u5341\u4e8c\u6708"]
				],
	"weeks"  : [["\u65e5","\u4e00","\u4e8c","\u4e09","\u56db","\u4e94","\u516d"],
				["Sun","Mon","Tur","Wed","Thu","Fri","Sat"],
				["Sun","Mon","Tur","Wed","Thu","Fri","Sat"],
				["\u65e5","\u4e00","\u4e8c","\u4e09","\u56db","\u4e94","\u516d"]
		],
	"clear"  : ["\u6e05\u7a7a", "Clear", "Clear", "\u6e05\u7a7a"],
	"close"  : ["\u5173\u95ed", "Close", "Close", "\u95dc\u9589"],
	"date2StringPattern" : ["yyyy-MM-dd", "yyyy-MM-dd", "yyyy-MM-dd", "yyyy-MM-dd"],
	"string2DatePattern" : ["ymd","ymd", "ymd", "ymd"]
};

Calendar.prototype.draw = function() {
	calendar = this;
	
	var _cs = [];
	_cs[_cs.length] = '<form id="__calendarForm" name="__calendarForm" method="post">';
	_cs[_cs.length] = '<table id="__calendarTable" width="100%" border="0" cellpadding="3" cellspacing="1" align="center">';
	_cs[_cs.length] = ' <tr>';
	_cs[_cs.length] = '  <th><input class="l" name="goPrevMonthButton" type="button" id="goPrevMonthButton" value="&lt;" \/><\/th>';
	_cs[_cs.length] = '  <th colspan="5"><select class="year" name="yearSelect" id="yearSelect"><\/select><select class="month" name="monthSelect" id="monthSelect"><\/select><\/th>';
	_cs[_cs.length] = '  <th><input class="r" name="goNextMonthButton" type="button" id="goNextMonthButton" value="&gt;" \/><\/th>';
	_cs[_cs.length] = ' <\/tr>';
	_cs[_cs.length] = ' <tr>';
	for(var i = 0; i < 7; i++) {
		_cs[_cs.length] = '<th class="theader">';
		_cs[_cs.length] = Calendar.language["weeks"][this.language][i];
		_cs[_cs.length] = '<\/th>';	
	}
	_cs[_cs.length] = '<\/tr>';
	for(var i = 0; i < 6; i++){
		_cs[_cs.length] = '<tr align="center">';
		for(var j = 0; j < 7; j++) {
			switch (j) {
				case 0: _cs[_cs.length] = '<td class="sun">&nbsp;<\/td>'; break;
				case 6: _cs[_cs.length] = '<td class="sat">&nbsp;<\/td>'; break;
				default:_cs[_cs.length] = '<td class="normal">&nbsp;<\/td>'; break;
			}
		}
		_cs[_cs.length] = '<\/tr>';
	}
	_cs[_cs.length] = ' <tr>';
	_cs[_cs.length] = '  <th colspan="3"><input type="button" class="b" name="clearButton" id="clearButton" \/><\/th>';
	_cs[_cs.length] = '  <th colspan="1"><\/th>';
	_cs[_cs.length] = '  <th colspan="3"><input type="button" class="b" name="closeButton" id="closeButton" \/><\/th>';
	_cs[_cs.length] = ' <\/tr>';
	_cs[_cs.length] = '<\/table>';
	_cs[_cs.length] = '<\/form>';
	
	this.iframe.document.body.innerHTML = _cs.join("");
	this.form = this.iframe.document.forms["__calendarForm"];

	this.form.clearButton.value = Calendar.language["clear"][this.language];
	this.form.closeButton.value = Calendar.language["close"][this.language];
	
	this.form.goPrevMonthButton.onclick = function () {calendar.goPrevMonth(this);};
	this.form.goPrevMonthButton.style.cursor = "pointer";
	this.form.goNextMonthButton.onclick = function () {calendar.goNextMonth(this);};
	this.form.goNextMonthButton.style.cursor = "pointer";
	this.form.yearSelect.onchange = function () {calendar.update(this);};
	this.form.yearSelect.style.cursor = "pointer";
	this.form.monthSelect.onchange = function () {calendar.update(this);};
	this.form.monthSelect.style.cursor = "pointer";
	
	this.form.clearButton.onclick = function () {calendar.dateControl.value = "";calendar.hide();};
	this.form.clearButton.style.cursor = "pointer";
	this.form.closeButton.style.cursor = "pointer";
	this.form.closeButton.onclick = function () {calendar.hide();};	
};

Calendar.prototype.bindYear = function() {
	var ys = this.form.yearSelect;
	ys.length = 0;
	for (var i = this.beginYear; i <= this.endYear; i++){
		ys.options[ys.length] = new Option(i + Calendar.language["year"][this.language], i);
	}	
};

Calendar.prototype.bindMonth = function() {
	var ms = this.form.monthSelect;
	ms.length = 0;
	for (var i = 0; i < 12; i++){
		ms.options[ms.length] = new Option(Calendar.language["months"][this.language][i], i);
	}
};

Calendar.prototype.goPrevMonth = function(e){
	if (this.year == this.beginYear && this.month == 0){return;}
	this.month--;
	if (this.month == -1) {
		this.year--;
		this.month = 11;
	}
	this.date = new Date(this.year, this.month, 1);
	this.changeSelect();
	this.bindData();
};

Calendar.prototype.goNextMonth = function(e){
	if (this.year == this.endYear && this.month == 11){return;}
	this.month++;
	if (this.month == 12) {
		this.year++;
		this.month = 0;
	}
	this.date = new Date(this.year, this.month, 1);
	this.changeSelect();
	this.bindData();
};

Calendar.prototype.changeSelect = function() {
	var ys = this.form.yearSelect;
	var ms = this.form.monthSelect;
	for (var i= 0; i < ys.length; i++){
		if (ys.options[i].value == this.date.getFullYear()){
			ys[i].selected = true;
			break;
		}
	}
	for (var i= 0; i < ms.length; i++){
		if (ms.options[i].value == this.date.getMonth()){
			ms[i].selected = true;
			break;
		}
	}
};

Calendar.prototype.update = function (e){
	this.year  = e.form.yearSelect.options[e.form.yearSelect.selectedIndex].value;
	this.month = e.form.monthSelect.options[e.form.monthSelect.selectedIndex].value;
	this.date = new Date(this.year, this.month, 1);
	this.changeSelect();
	this.bindData();
};

Calendar.prototype.bindData = function () {
	var calendar = this;
	var dateArray = this.getMonthViewDateArray(this.date.getFullYear(), this.date.getMonth());
	var tds = this.getElementsByTagName("td", this.getElementById("__calendarTable", this.iframe.document));
	for(var i = 0; i < tds.length; i++) {
  		tds[i].style.backgroundColor = calendar.colors["bg_over"];
  		tds[i].style.cursor = "pointer";
		tds[i].onclick = null;
		tds[i].onmouseover = null;
		tds[i].onmouseout = null;
		tds[i].innerHTML = dateArray[i] || "&nbsp;";
		if (i > dateArray.length - 1) continue;
		if (dateArray[i]){
			tds[i].onclick = function () {
				if (calendar.dateControl){
					calendar.dateControl.value = new Date(calendar.date.getFullYear(),
														calendar.date.getMonth(),
														this.innerHTML).format(calendar.date2StringPattern);
				}
				calendar.hide();
			};
			tds[i].onmouseover = function () {this.style.backgroundColor = calendar.colors["bg_out"];};
			tds[i].onmouseout  = function () {this.style.backgroundColor = calendar.colors["bg_over"];};
			var today = new Date();
			if (today.getFullYear() == calendar.date.getFullYear()) {
				if (today.getMonth() == calendar.date.getMonth()) {
					if (today.getDate() == dateArray[i]) {
						tds[i].style.backgroundColor = calendar.colors["bg_cur_day"];
						tds[i].onmouseover = function () {this.style.backgroundColor = calendar.colors["bg_out"];};
						tds[i].onmouseout  = function () {this.style.backgroundColor = calendar.colors["bg_cur_day"];};
					}
				}
			}
		}//end if
	}//end for
};

Calendar.prototype.getMonthViewDateArray = function (y, m) {
	var dateArray = new Array(42);
	var dayOfFirstDate = new Date(y, m, 1).getDay();
	var dateCountOfMonth = new Date(y, m + 1, 0).getDate();
	for (var i = 0; i < dateCountOfMonth; i++) {
		dateArray[i + dayOfFirstDate] = i + 1;
	}
	return dateArray;
};

Calendar.prototype.show = function (dateControl, popuControl) {
	if (this.panel.style.visibility == "visible") {
		this.panel.style.visibility = "hidden";
	}
	if (!dateControl){
		throw new Error("arguments[0] is necessary!");
	}
	this.dateControl = dateControl;
	popuControl = popuControl || dateControl;

	this.draw();
	this.bindYear();
	this.bindMonth();
	//设置默认的时间是1995年 这样选择年的时候出现的是76年到95年的 因为 访问网页这个年龄段最多,增强用户体验!
	var ys = this.form.yearSelect;
	ys[83].selected = true;
	this.date = new Date(1995, 5, 1);
	if (dateControl.value.length > 0){
		this.date  = new Date(dateControl.value.toDate(this.patternDelimiter, this.string2DatePattern));
		this.year  = this.date.getFullYear();
		this.month = this.date.getMonth();
	}
	this.changeSelect();
	this.bindData();

	var xy = this.getAbsPoint(popuControl);
	this.panel.style.left = xy.x + "px";
	this.panel.style.top = (xy.y + dateControl.offsetHeight) + "px";
	this.panel.style.visibility = "visible";
};

Calendar.prototype.hide = function() {
	this.panel.style.visibility = "hidden";
};

Calendar.prototype.getElementById = function(id, object){
	object = object || document;
	return document.getElementById ? object.getElementById(id) : document.all(id);
};

Calendar.prototype.getElementsByTagName = function(tagName, object){
	object = object || document;
	return document.getElementsByTagName ? object.getElementsByTagName(tagName) : document.all.tags(tagName);
};

Calendar.prototype.getAbsPoint = function (e){
	var x = e.offsetLeft;
	var y = e.offsetTop;
	while(e = e.offsetParent){
		x += e.offsetLeft;
		y += e.offsetTop;
	}
	return {"x": x, "y": y};
};

/**
 * @param   d the delimiter
 * @param   p the pattern of your date
 * @author  meizz
 * @author  kimsoft add w+ pattern
 */
Date.prototype.format = function(style) {
	var o = {
		"M+" : this.getMonth() + 1, //month
		"d+" : this.getDate(),      //day
		"h+" : this.getHours(),     //hour
		"m+" : this.getMinutes(),   //minute
		"s+" : this.getSeconds(),   //second
		"w+" : "\u65e5\u4e00\u4e8c\u4e09\u56db\u4e94\u516d".charAt(this.getDay()),   //week
		"q+" : Math.floor((this.getMonth() + 3) / 3),  //quarter
		"S"  : this.getMilliseconds() //millisecond
	};
	if (/(y+)/.test(style)) {
		style = style.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	}
	for(var k in o){
		if (new RegExp("("+ k +")").test(style)){
			style = style.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
		}
	}
	return style;
};

/**
 * @param d the delimiter
 * @param p the pattern of your date
 * @rebuilder kimsoft
 * @version build 2006.12.15
 */
String.prototype.toDate = function(delimiter, pattern) {
	delimiter = delimiter || "-";
	pattern = pattern || "ymd";
	var a = this.split(delimiter);
	var y = parseInt(a[pattern.indexOf("y")], 10);
	//remember to change this next century ;)
	if(y.toString().length <= 2) y += 2000;
	if(isNaN(y)) y = new Date().getFullYear();
	var m = parseInt(a[pattern.indexOf("m")], 10) - 1;
	var d = parseInt(a[pattern.indexOf("d")], 10);
	if(isNaN(d)) d = 1;
	return new Date(y, m, d);
};

document.writeln('<div id="__calendarPanel" style="position:absolute;visibility:hidden;z-index:9999;background-color:#FFFFFF;border:1px solid #666666;width:200px;height:216px;">');
document.writeln('<iframe name="__calendarIframe" id="__calendarIframe" width="100%" height="100%" scrolling="no" frameborder="0" style="margin:0px;"><\/iframe>');
var __ci = window.frames['__calendarIframe'];
__ci.document.writeln('<!DOCTYPE html PUBLIC "-\/\/W3C\/\/DTD XHTML 1.0 Transitional\/\/EN" "http:\/\/www.w3.org\/TR\/xhtml1\/DTD\/xhtml1-transitional.dtd">');
__ci.document.writeln('<html xmlns="http:\/\/www.w3.org\/1999\/xhtml">');
__ci.document.writeln('<head>');
__ci.document.writeln('<meta http-equiv="Content-Type" content="text\/html; charset=utf-8" \/>');
__ci.document.writeln('<title>Birthday Calendar(UTF-8) Written By CXW<\/title>');
__ci.document.writeln('<style type="text\/css">');
__ci.document.writeln('<!--');
__ci.document.writeln('body {font-size:12px;margin:0px;text-align:center;}');
__ci.document.writeln('form {margin:0px;}');
__ci.document.writeln('select {font-size:12px;background-color:#EFEFEF;}');
__ci.document.writeln('table {border:0px solid #CCCCCC;background-color:#FFFFFF}');
__ci.document.writeln('th {font-size:12px;font-weight:normal;background-color:#FFFFFF;}');
__ci.document.writeln('th.theader {font-weight:normal;background-color:#666666;color:#FFFFFF;width:24px;}');
__ci.document.writeln('select.year {width:64px;}');
__ci.document.writeln('select.month {width:60px;}');
__ci.document.writeln('td {font-size:12px;text-align:center;}');
__ci.document.writeln('td.sat {color:#0000FF;background-color:#EFEFEF;}');
__ci.document.writeln('td.sun {color:#FF0000;background-color:#EFEFEF;}');
__ci.document.writeln('td.normal {background-color:#EFEFEF;}');
__ci.document.writeln('input.l {border: 1px solid #CCCCCC;background-color:#EFEFEF;width:20px;height:20px;}');
__ci.document.writeln('input.r {border: 1px solid #CCCCCC;background-color:#EFEFEF;width:20px;height:20px;}');
__ci.document.writeln('input.b {border: 1px solid #CCCCCC;background-color:#EFEFEF;width:100%;height:20px;}');
__ci.document.writeln('-->');
__ci.document.writeln('<\/style>');
__ci.document.writeln('<\/head>');
__ci.document.writeln('<body>');
__ci.document.writeln('<\/body>');
__ci.document.writeln('<\/html>');
__ci.document.close();
document.writeln('<\/div>');
var calendar = new Calendar();

function changeImage(img){
	img.src = img.src+"?"+new Date().getTime();
	}
	
	var iscommitted = false;
    function dosubmit(){
    		if(!iscommitted){
    			iscommitted=true;
    			return true;
    		}else{
    		return false;
    		}
    	}
    	
    </script>
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
				//工作经验
				/*  var workExpShow = false;
				$("body").on("click","#addWorkExpBut",function(){
					console.log(!workExpShow)
					 if(!workExpShow) {
						$("#addWorkExpCancle").empty().append("取消");
						workExpShow = true;
					} else {
						$("#addWorkExpCancle").empty().append("添加");
						workExpShow = false;
					}  
					//$("#addWorkExp").slideToggle();
				}).on("click","#addWorkExpBut2",function(){
					$("#addWorkExpCancle").empty().append("添加");
					workExpShow = false;
				}); */
				//教育经历
				/* var educateExpShow = false;
				$("body").on("click","#addEducateExpBut",function(){
					console.log(!educateExpShow)
					if(!educateExpShow) {
						$("#addEducateExpCancel").empty().append("取消");
						educateExpShow = true;
					} else {
						$("#addEducateExpCancel").empty().append("添加");
						educateExpShow = false;
					}
				}).on("click","#addEducateExpBut2",function(){
					$("#addEducateExpCancel").empty().append("添加");
					educateExpShow = false;
				}); */
				//项目经验
				/* var show = false;
				$("body").on("click","#itemsExpModelBut",function(){
					$("#itemsExpModel").hide();
					$("#cancel").empty().append("取消");
					show = true;
				}).on("click","#cancelAddItemsExp1",function(){
					if(!show) {
						$("#itemsExpModel").hide();
						$("#cancel").empty().append("取消");
						show = true;
					} else {
						$("#itemsExpModel").show();
						$("#cancel").empty().append("添加");
						show = false;
					}
				}).on("click","#cancelAddItemsExp2",function(){
					if(!show) {
						$("#itemsExpModel").hide();
						$("#cancel").empty().append("取消");
						show = true;
					} else {
						$("#itemsExpModel").show();
						$("#cancel").empty().append("添加");
						show = false;
					}
				}); */
				//作品展示
				/* var itemsShow = false;
				$("body").on("click","#addShowItemsModelBut",function(){
					$("#addShowItemsModel").hide();
					$("#addShowItemsCancel").empty().append("取消");
					itemsShow = true;
				}).on("click","#addShowItemsBut",function(){
					if(!itemsShow) {
						$("#addShowItemsModel").hide();
						$("#addShowItemsCancel").empty().append("取消");
						itemsShow = true;
					} else {
						$("#addShowItemsModel").show();
						$("#addShowItemsCancel").empty().append("添加");
						itemsShow = false;
					}
				}).on("click","#addShowItemsBut2",function(){
					if(!itemsShow) {
						$("#addShowItemsModel").hide();
						$("#addShowItemsCancel").empty().append("取消");
						itemsShow = true;
					} else {
						$("#addShowItemsModel").show();
						$("#addShowItemsCancel").empty().append("添加");
						itemsShow = false;
					}
				}); */
				//自我描述
				/* var selfDescShow = false;
				$("body").on("click","#addSelfDescModelBut",function(){
					$("#addSelfDescModel").hide();
					$("#addSelfDescCancel").empty().append("取消");
					selfDescShow = true;
				}).on("click","#addSelfDescBut",function(){
					if(!selfDescShow) {
						$("#addSelfDescModel").hide();
						$("#addSelfDescCancel").empty().append("取消");
						selfDescShow = true;
					} else {
						$("#addSelfDescModel").show();
						$("#addSelfDescCancel").empty().append("添加");
						selfDescShow = false;
					}
				}).on("click","#addSelfDescBut2",function(){
					if(!selfDescShow) {
						$("#addSelfDescModel").hide();
						$("#addSelfDescCancel").empty().append("取消");
						selfDescShow = true;
					} else {
						$("#addSelfDescModel").show();
						$("#addSelfDescCancel").empty().append("添加");
						selfDescShow = false;
					}
				}); */
				//期望工作
				/* var expectJobShow = false;
				$("body").on("click","#addExpecJobModelBut",function(){
					$("#addExpecJobModel").hide();
					$("#addExpecJobCancel").empty().append("取消");
					expectJobShow = true;
				}).on("click","#addExpecJobBut",function(){
					if(!expectJobShow) {
						$("#addExpecJobModel").hide();
						$("#addExpecJobCancel").empty().append("取消");
						expectJobShow = true;
					} else {
						$("#addExpecJobModel").show();
						$("#addExpecJobCancel").empty().append("添加");
						expectJobShow = false;
					}
				}).on("click","#addExpecJobBut2",function(){
					if(!expectJobShow) {
						$("#addExpecJobModel").hide();
						$("#addExpecJobCancel").empty().append("取消");
						expectJobShow = true;
					} else {
						$("#addExpecJobModel").show();
						$("#addExpecJobCancel").empty().append("添加");
						expectJobShow = false;
					}
				}); */
			})
		</script>
	<![endif]-->
  </head>
  
  <body>
  <!-- <iframe src="header.html" width="100%" height="100%" frameborder="0" scrolling="no"></iframe> -->
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
		<!--body-->
		<div class="container" style="margin-top: 20px;">
			<div class="row">
				<!--left-->
				<div class="col-md-7" style="border: 0.5px solid rgba(192,192,192,0.2);background-color: whitesmoke;">
					<div class="row" style="background-color: orange;">
						<div class="col-md-12" align="center">
							<h3 style="color: white;margin-top: 10px;">简历详情</h3>
						</div>
					</div>
					<!--choice-->
					<div class="row" style="margin-top: 20px;">
						<div class="col-md-6 col-md-offset-3" align="center">
							<select class="form-control" style="background-color: whitesmoke;" id="presentCondition">
							  <option value="我目前正在职，考虑换个新环境">我目前正在职，考虑换个新环境</option>
							  <option value="我已离职，可快速到岗">我已离职，可快速到岗</option>
							  <option value="我暂时不想找工作">我暂时不想找工作</option>
							  <option value="我是应届毕业生" >我是应届毕业生</option>
							</select>
						</div>
						<div class="col-md-3"></div>
					</div>
					<!--work-exp-head-->
					<div class="row" style="margin-top: 30px;" id="workexphead">
						<div class="col-md-4 col-md-offset-1" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="center">
							<span class="badge">工作经历</span>
						</div>
						<div class="col-md-3" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="left">
							<a class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addWorkExp" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;">
								<font id="addWorkExpBut" style="color: gray;font-size: 14px;">
									<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
									<font id="addWorkExpCancle">添加</font>
								</font>
							</a>
						</div>
						<!--append-work-exp-->
						<div class="col-md-12" id="basicjob">
							<div class="collapse" id="addWorkExp" style="margin-top: 20px;">
							  <div class="well" style="border: none;background-color: lightgoldenrodyellow;margin-bottom: 0px;">
							    <div class="row">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">公司</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<input class="form-control" type="text" id="form-company">
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">职位</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<input class="form-control" type="text" id="form-position">
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">在职时间</h5>
							    	</div>
							    	<div class="col-md-4">
							    		<input type="text" id="zaizhitime" onclick="new Calendar().show(this);" readonly="readonly"/>
							    	</div>
							    	<div class="col-md-4">
							    		<input type="text" id="lizhitime" onclick="new Calendar().show(this);" readonly="readonly"/>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">工作内容</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<div class="panel panel-default" style="margin-bottom: 0px;">
										  <div class="panel-heading"></div>
										  <div class="panel-body" style="padding: 0px;">
										    <textarea class="form-control" style="width: 100%;border: none;" rows="6" id="form-content"></textarea>
										 	<input type="hidden" id="hidecontent"/>
										  </div>
										</div>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 20px;">
							    	<div class="col-md-3 col-md-offset-3">						
							    		<button type="button" id="tijiao" class="btn btn-default" style="background-color: orange;color: white;border: none;">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;
							    		<button id="addWorkExpBut2" class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addWorkExp" aria-expanded="false" aria-controls="collapseExample" style="border: none;background-color: lightgoldenrodyellow;color: orange;">
										  取消
										</button>
							    	</div>
							    </div>
							  </div>
							</div>
						</div>
						<!--work-exp(for循环遍历)-->
						<!-- <div class="col-md-12">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-5 col-md-offset-1">
									<div class="media">
									  <div class="media-body" style="padding-top: 5px;">
									    <h5 class="media-heading">四川新绿色药业</h5>
									    <font style="color: gray;font-size: 13px;">本科.公共事业管理</font>
									  </div>
									</div>
								</div>
								<div class="col-md-5" align="right">
									<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>
									<p style="color: gray;margin: 10px 0px 0px 0px;">2016.04-2016.09</p>
								</div>
								<div class="col-md-1"></div>
							</div>
						</div> -->
					</div>
					
					<!--educate-exp-head-->
					<div class="row" style="margin-top: 30px;" id="educateexphead">
						<div class="col-md-4 col-md-offset-1" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="center">
							<span class="badge">教育经历</span>
						</div>
						<div class="col-md-3" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="left" id="tianjia">
							<a id="addEducateExpBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addEducateExp" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;">
								<font style="color: gray;font-size: 14px;">
									<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
									<font id="addEducateExpCancel">添加</font>
								</font>
							</a>
						</div>
						<!--append-educate-exp-->
						<div class="col-md-12" id="basiceducation">
							<div class="collapse" id="addEducateExp" style="margin-top: 20px;">
							  <div class="well" style="border: none;background-color: lightgoldenrodyellow;margin-bottom: 0px;">
							    <div class="row">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">学校名称</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<input class="form-control" type="text" id="form-school">
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">所学专业</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<input class="form-control" type="text" id="form-specialty">							    		
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">学历</h5>
							    	</div>
							    	<div class="col-md-4" id="xueli">
							    		<select class="form-control" id="form-option">
							    			
							    		</select>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">毕业年份</h5>
							    	</div>
							    	<div class="col-md-4">
							    		<input type="text" id="graduatetime" onclick="new Calendar().show(this);" readonly="readonly"/>
							    		<input type="hidden" id="hideeducontent"/>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 20px;">
							    	<div class="col-md-3 col-md-offset-3">
							    		<button id="addEducateExpBut1" type="button" class="btn btn-default" style="background-color: orange;color: white;border: none;">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;
							    		<button id="addEducateExpBut2" class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addEducateExp" aria-expanded="false" aria-controls="collapseExample" style="border: none;background-color: lightgoldenrodyellow;color: orange;">
										  取消
										</button>
							    	</div>
							    </div>
							  </div>
							</div>
						</div>
						<!--educate-exp(for循环)-->
						<!-- <div class="col-md-12">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-5 col-md-offset-1">
									<div class="media">
									  <div class="media-left">
									      <img class="media-object" src="img/电脑.jpg" alt="..." style="width: 50px;height: 50px;">
									  </div>
									  <div class="media-body" style="padding-top: 5px;">
									    <h5 class="media-heading">四川传媒学院</h5>
									    <font style="color: gray;font-size: 13px;">本科.公共事业管理</font>
									  </div>
									</div>
								</div>
								<div class="col-md-5" align="right">
									<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>
									<p style="color: gray;margin: 10px 0px 0px 0px;">2016年毕业</p>
								</div>
								<div class="col-md-1"></div>
							</div>
						</div> -->
					</div>
					
					<!--items-exp-head-->
					<div class="row" style="margin-top: 30px;" id="itemsexphead">
						<div class="col-md-4 col-md-offset-1" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="center">
							<span class="badge">项目经验</span>
						</div>
						<div class="col-md-3" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="left">
							<a id="cancelAddItemsExp1" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href=".addItemsExp" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;">
								<font style="color: gray;font-size: 14px;">
									<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>&nbsp;<font id="cancel">添加</font>
								</font>
							</a>
						</div>
						<!--append-items-exp-->
						<div class="col-md-12" id="basicproject">
							<div class="collapse addItemsExp" id="addItemsExp" style="margin-top: 20px;">
							  <div class="well" style="border: none;background-color: lightgoldenrodyellow;margin-bottom: 0px;">
							    <div class="row">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top:8px;">项目名称</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<input class="form-control" type="text" id="projectName">
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">你的职责</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<input class="form-control" type="text" id="projectNull2">
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">项目起止时间</h5>
							    	</div>
							    	<div class="col-md-4">
							    		<input type="text" id="projectstarttime" onclick="new Calendar().show(this);" readonly="readonly"/>
							    	</div>
							    	<div class="col-md-4">
							    		<input type="text" id="projectendtime" onclick="new Calendar().show(this);" readonly="readonly"/>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">项目描述</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<div class="panel panel-default" style="margin-bottom: 0px;">
										  <div class="panel-heading"></div>
										  <div class="panel-body" style="padding: 0px;">
										    <textarea class="form-control" style="width: 100%;border: none;" rows="6" id="projectProfile"></textarea>
										    <input type="hidden" id="hideprojectcontent"/>
										  </div>
										</div>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 20px;">
							    	<div class="col-md-3 col-md-offset-3">
							    		<button type="button" id="projecttijiao" class="btn btn-default" style="background-color: orange;color: white;border: none;">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;
							    		<button id="cancelAddItemsExp2" class="btn btn-primary" type="button" data-toggle="collapse" data-target=".addItemsExp" aria-expanded="false" aria-controls="collapseExample" style="border: none;background-color: lightgoldenrodyellow;color: orange;">
										  取消
										</button>
							    	</div>
							    </div>
							  </div>
							</div>
						</div>
						<!--educate-exp(for循环)-->
						 <!-- <div class="col-md-12">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-5 col-md-offset-1">
									<div class="media">									  
									  <div class="media-body" style="padding-top: 5px;">
									    <h5 class="media-heading">四川传媒学院</h5>
									    <font style="color: gray;font-size: 13px;">本科.公共事业管理</font>
									  </div>
									</div>
								</div>
								<div class="col-md-5" align="right">
									<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>
									<p style="color: gray;margin: 10px 0px 0px 0px;">2016年毕业</p>
								</div>
								<div class="col-md-1"><input type="hidden" id="hideprojectcontent"/></div>
							</div>
						</div> --> 
						<!-- <div class="col-md-12" id="itemsExpModel">
							items-exp
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-10 col-md-offset-1" style="border: 1px dashed rgba(192,192,192,1);" align="center">
									<a id="itemsExpModelBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href=".addItemsExp" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;margin-top: 40px;margin-bottom: 40px;">
										<font style="color: gray;font-size: 14px;"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>&nbsp;添加项目经验</font>
									</a>
								</div>
								<div class="col-md-1"></div>
							</div>
						</div> -->
					</div>
					
					<!--show-items-head-->
					<div class="row" style="margin-top: 30px;" id="showitemshead">
						<div class="col-md-4 col-md-offset-1" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="center">
							<span class="badge">作品展示</span>
						</div>
						<div class="col-md-3" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="left">
								<a id="addShowItemsBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addShowItems" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;">
									<font style="color: gray;font-size: 14px;">
										<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
										<font id="addShowItemsCancel">添加</font>
									</font>
								</a>
						</div>
						<!--append-show-items-->
						<div class="col-md-12" id="basicopus">
							<div class="collapse" id="addShowItems" style="margin-top: 20px;">
							  <div class="well" style="border: none;background-color: lightgoldenrodyellow;margin-bottom: 0px;">
							    <div class="row">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">作品标题</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<input class="form-control" type="text" id="opushead">
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">作品描述</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<div class="panel panel-default">
										  <div class="panel-heading"></div>
										  <div class="panel-body" style="padding: 0px;">
										    <textarea class="form-control" id="opusprofile" style="width: 100%;border: none;" rows="6"></textarea>
										  	<input type="hidden" id="hideopuscontent"/>
										  </div>
										</div>
							    	</div>
							    </div>
							    <div class="row">
							    	<div class="col-md-3 col-md-offset-3">
							    		<button type="button" id="addShowItemsBut1" class="btn btn-default" style="background-color: orange;color: white;border: none;">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;
							    		<button id="addShowItemsBut2" class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addShowItems" aria-expanded="false" aria-controls="collapseExample" style="border: none;background-color: lightgoldenrodyellow;color: orange;">
										  取消
										</button>
							    	</div>
							    </div>
							  </div>
							</div>
						</div>
						<!--show-items-->
						<!-- <div class="col-md-12">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-5 col-md-offset-1">
									<div class="media">									  
									  <div class="media-body" style="padding-top: 5px;">
									    <h5 class="media-heading">四川传媒学院</h5>
									    <font style="color: gray;font-size: 13px;">本科.公共事业管理</font>
									  </div>
									</div>
								</div>
								<div class="col-md-5" align="right">
									<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>
								</div>
								<div class="col-md-1"><input type="hidden"/></div>
							</div>
						</div>  -->
						<!-- <div class="col-md-12" id="addShowItemsModel">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-10 col-md-offset-1" style="cursor: pointer;border: 1px dashed rgba(192,192,192,1);" align="center">
									<a id="addShowItemsModelBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addShowItems" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;margin-top: 40px;margin-bottom: 40px;">
										<font style="color: gray;font-size: 14px;"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>&nbsp;展示我的作品</font>
									</a>
								</div>
								<div class="col-md-1"></div>
							</div>
						</div> -->
					</div>
					
					
					<!--self-description-head-->
					<div class="row" style="margin-top: 30px;" id="selfdescriptionhead">
						<div class="col-md-4 col-md-offset-1" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="center">
							<span class="badge">自我描述</span>
						</div>
						<div class="col-md-3" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="left">
							<a id="addSelfDescBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addSelfDesc" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;">
								<font style="color: gray;font-size: 14px;">
									<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
									<font id="addSelfDescCancel">更新</font>
								</font>
							</a>
						</div>
						<!--append-self-description-->
						<div class="col-md-12" id="basicselfdesc">
							<div class="collapse" id="addSelfDesc" style="margin-top: 20px;">
							  <div class="well" style="border: none;background-color: lightgoldenrodyellow;margin-bottom: 0px;">
							    <div class="row">
							    	<div class="col-md-3"></div>
							    	<div class="col-md-9">
							    		<h4 style="color: gray;">提供几个思路，试着从这些点描述自己：</h4>
							    		<p style="color: gray;">· 你认为值得称道的工作细节；</p>
							    		<p style="color: gray;">· 你曾经克服过的最大挑战；</p>
							    		<p style="color: gray;">· 你在找工作时最看重的方面；</p>
							    		<p style="color: gray;">· 你曾经引以为豪的个人项目或者事迹；</p>
							    		<p style="color: gray;">· 如果你是一位团队领导者，说说你的管理哲学以及独到的行业见解</p>
							    		<p style="color: gray;">· 其它你认为能展示你优势的事情</p>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">自我描述</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<div class="panel panel-default">
										  <div class="panel-heading"></div>
										  <div class="panel-body" style="padding: 0px;">
										    <textarea id="selfdescription" class="form-control" style="width: 100%;border: none;" rows="6"></textarea>
										  </div>
										</div>
							    	</div>
							    </div>
							    <div class="row">
							    	<div class="col-md-3 col-md-offset-3">
							    		<button id="addSelfDescBut1" type="button" class="btn btn-default" style="background-color: orange;color: white;border: none;">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;
							    		<button id="addSelfDescBut2" class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addSelfDesc" aria-expanded="false" aria-controls="collapseExample" style="border: none;background-color: lightgoldenrodyellow;color: orange;">
										  取消
										</button>
							    	</div>
							    </div>
							  </div>
							</div>
						</div>
						 <!-- <div class="col-md-12">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-5 col-md-offset-1">
									<div class="media">									  
									  <div class="media-body" style="padding-top: 5px;">
									    <h5 class="media-heading">四川传媒学院</h5>
									    <font style="color: gray;font-size: 13px;">本科.公共事业管理</font>
									  </div>
									</div>
								</div>
								<div class="col-md-5" align="right">
									<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>
								</div>
								<div class="col-md-1"><input type="hidden"/></div>
							</div>
						</div>  --> 
						<!--self-description-->
						<!-- <div class="col-md-12" id="addSelfDescModel">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-10 col-md-offset-1" style="cursor: pointer;border: 1px dashed rgba(192,192,192,1);" align="center">
									<a id="addSelfDescModelBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addSelfDesc" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;margin-top: 40px;margin-bottom: 40px;">
										<font style="color: gray;font-size: 14px;"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>&nbsp;更新自我描述</font>
									</a>
								</div>
								<div class="col-md-1"></div>
							</div>
						</div> -->
					</div>
					
					<!--expect-job-head-->
					<div class="row" style="margin-top: 30px;" id="expectjobhead">
						<div class="col-md-4 col-md-offset-1" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="center">
							<span class="badge">期望工作</span>
						</div>
						<div class="col-md-3" style="border-bottom: 1px solid rgba(192,192,192,0.5);margin-top: 10px;"></div>
						<div class="col-md-2" align="left">
							<a id="addExpecJobBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addExpecJob" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;">
								<font style="color: gray;font-size: 14px;">
									<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
									<font id="addExpecJobCancel">更新</font>
								</font>
							</a>
						</div>
						<!--append-expect-job-->
						<div class="col-md-12" id="basicexpectjob">
							<div class="collapse" id="addExpecJob" style="margin-top: 20px;">
							  <div class="well" style="border: none;background-color: lightgoldenrodyellow;">
							    <div class="row">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">期望职位</h5>
							    	</div>
							    	<div class="col-md-4">
							    		<input class="form-control" type="text" id="form-job">
							    	</div>
							    	<div class="col-md-2">
							    		<select class="form-control" id="form-type">							    			
							    			<option>其他</option>
							    			<option>全职</option>
							    			<option>兼职</option>
							    			<option>实习</option>
							    		</select>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">期望城市</h5>
							    	</div>
							    	<div class="col-md-3">
							    		<select class="form-control" id="form-city">
							    			<option>北京</option>
							    			<option>上海</option>
							    			<option>天津</option>
							    			<option>重庆</option>
							    			<option>唐山</option>
							    			<option>秦皇岛</option>
							    			<option>成都</option>
							    		</select>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">期望月薪</h5>
							    	</div>
							    	<div class="col-md-3">
							    		<select class="form-control" id="form-salary">
							    			<option>0-500</option>
							    			<option>500-1000</option>
							    			<option>1000-3000</option>
							    			<option>3000-5000</option>
							    			<option>5000-10000</option>
							    			<option>10000-15000</option>
							    			<option>15000-20000</option>
							    			<option>20000-50000</option>
							    			<option>50000以上</option>
							    		</select>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 10px;">
							    	<div class="col-md-3" align="right">
							    		<h5 style="color: gray;margin-top: 8px;">补充说明(若有)</h5>
							    	</div>
							    	<div class="col-md-8">
							    		<div class="panel panel-default" style="margin-bottom: 0px;">
										  <div class="panel-heading"></div>
										  <div class="panel-body" style="padding: 0px;">
										    <textarea class="form-control" style="width: 100%;border: none;" rows="6" id="form-supplement"></textarea>
										  </div>
										</div>
							    	</div>
							    </div>
							    <div class="row" style="margin-top: 20px;">
							    	<div class="col-md-3 col-md-offset-3">
							    		<button id="addExpecJobBut1" type="button" class="btn btn-default" style="background-color: orange;color: white;border: none;">确认</button>&nbsp;&nbsp;&nbsp;&nbsp;
							    		<button id="addExpecJobBut2" class="btn btn-primary" type="button" data-toggle="collapse" data-target="#addExpecJob" aria-expanded="false" aria-controls="collapseExample" style="border: none;background-color: lightgoldenrodyellow;color: orange;">
										  取消
										</button>
							    	</div>
							    </div>
							  </div>
							</div>
						</div>
						<!-- <div class="col-md-12">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-5 col-md-offset-1">
									<div class="media">									  
									  <div class="media-body" style="padding-top: 5px;">
									    <h5 class="media-heading">java工程师.全职</h5>
									    <font style="color: gray;font-size: 13px;">成都.15k-25k</font>
									  </div>
									</div>
								</div>
							</div>
						</div> -->  
						<!--expect-job-->
						<!-- <div class="col-md-12" id="addExpecJobModel">
							<div class="row" style="margin-top: 20px;">
								<div class="col-md-10 col-md-offset-1" style="cursor: pointer;border: 1px dashed rgba(192,192,192,1);" align="center">
									<a id="addExpecJobModelBut" class="btn btn-primary btn-xs" role="button" data-toggle="collapse" href="#addExpecJob" aria-expanded="false" aria-controls="collapseExample" style="background: whitesmoke;border: none;margin-top: 40px;margin-bottom: 40px;">
										<font style="color: gray;font-size: 14px;"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>&nbsp;添加期望职位</font>
									</a>
								</div>
								<div class="col-md-1"></div>
							</div>
						</div> -->
					</div>
					<!--bottom-->
					<div class="row" style="margin-top: 40px;"></div>
				</div>
				
				
				<!--right-->
				<div class="col-md-4" style="border: 0.5px solid rgba(192,192,192,0.2);box-shadow: 0 0 30px #888888;;margin-left: 50px;background-color: ghostwhite;">
					<!--headPic-->
					<div class="row" style="margin-top: 20px;">
						<div id="headpic" class="col-md-12" style="border-bottom: 3px solid orange;" align="center">
							<img src="img/汽车.jpg" class="img-circle" style="height: 80px;width: 80px;border: 3px solid orange;"/>
							<h3 style="margin: 5px 0px 0px 0px;">严强</h3>
							<p style="font-size: 13px;color: gray;margin-bottom: 2px;">男</p>
							<p style="font-size: 12px;color: orange;">简历完成度：100%</p>
						</div>
					</div>
					<!--introduce-->
					<div class="row" style="margin-top: 10px;">
						<div class="col-md-6" id="basicinformation1">
							<p><span class="glyphicon glyphicon-user" aria-hidden="true" style="color: gray;font-size: 16px;"></span>&nbsp;&nbsp;21岁</p>
							<p><span class="glyphicon glyphicon-briefcase" aria-hidden="true" style="color: gray;font-size: 16px;"></span>&nbsp;&nbsp;4年工作经验</p>
							<p><span class="glyphicon glyphicon-phone" aria-hidden="true" style="color: gray;font-size: 16px;"></span>&nbsp;&nbsp;12414355867</p>
							<p><span class="glyphicon glyphicon-envelope" aria-hidden="true" style="color: gray;font-size: 16px;"></span>&nbsp;&nbsp;123843335@qq.com</p>
						</div>
						<div class="col-md-6" id="basicinformation2">
							<p><span class="glyphicon glyphicon-education" aria-hidden="true" style="color: gray;font-size: 16px;"></span>&nbsp;&nbsp;本科</p>
							<p><span class="glyphicon glyphicon-map-marker" aria-hidden="true" style="color: gray;font-size: 16px;"></span>&nbsp;&nbsp;成都</p>
						</div>
					</div>
					<!--skill-level-->
					<div class="row" style="margin-top: 30px;">
						<div class="col-md-4 col-md-offset-4">
							<font style="color: gray;">5项职业胜任力</font>
						</div>
						<div class="col-md-4" align="right">
							<a href="#" style="color: gray;font-size: 12px;">立即评测</a>
						</div>
					</div>
					<!--skill-level-->
					<div class="row" style="margin-top: 30px;padding-left: 0px;padding-right: 0px;">
						<div class="col-md-3" align="right" style="padding: 0;">
							<font style="color: gray;">沟通协调能力</font>
						</div>
						<div class="col-md-7">
							<div class="progress" style="margin-bottom: 0px;">
							  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
							    <span class="sr-only">100% Complete (warning)</span>
							  </div>
							</div>
						</div>
						<div class="col-md-2" align="left">
							<font style="color: gray;">10</font>
						</div>
					</div>
					<!--skill-level-->
					<div class="row" style="margin-top: 30px;padding-left: 0px;padding-right: 0px;">
						<div class="col-md-3" align="right" style="padding: 0;">
							<font style="color: gray;">沟通协调能力</font>
						</div>
						<div class="col-md-7">
							<div class="progress" style="margin-bottom: 0px;">
							  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
							    <span class="sr-only">60% Complete (warning)</span>
							  </div>
							</div>
						</div>
						<div class="col-md-2" align="left">
							<font style="color: gray;">10</font>
						</div>
					</div>
					<!--skill-level-->
					<div class="row" style="margin-top: 30px;padding-left: 0px;padding-right: 0px;">
						<div class="col-md-3" align="right" style="padding: 0;">
							<font style="color: gray;">沟通协调能力</font>
						</div>
						<div class="col-md-7">
							<div class="progress" style="margin-bottom: 0px;">
							  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
							    <span class="sr-only">60% Complete (warning)</span>
							  </div>
							</div>
						</div>
						<div class="col-md-2" align="left">
							<font style="color: gray;">10</font>
						</div>
					</div>
					<!--skill-level-->
					<div class="row" style="margin-top: 30px;padding-left: 0px;padding-right: 0px;">
						<div class="col-md-3" align="right" style="padding: 0;">
							<font style="color: gray;">沟通协调能力</font>
						</div>
						<div class="col-md-7">
							<div class="progress" style="margin-bottom: 0px;">
							  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
							    <span class="sr-only">60% Complete (warning)</span>
							  </div>
							</div>
						</div>
						<div class="col-md-2" align="left">
							<font style="color: gray;">10</font>
						</div>
					</div>
					<!--skill-level-->
					<div class="row" style="margin-top: 30px;padding-left: 0px;padding-right: 0px;">
						<div class="col-md-3" align="right" style="padding: 0;">
							<font style="color: gray;">沟通协调能力</font>
						</div>
						<div class="col-md-7">
							<div class="progress" style="margin-bottom: 0px;">
							  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
							    <span class="sr-only">60% Complete (warning)</span>
							  </div>
							</div>
						</div>
						<div class="col-md-2" align="left">
							<font style="color: gray;">10</font>
						</div>
					</div>
					<!--self-introduce-->
					<div class="row" style="margin-top: 30px;margin-bottom: 20px;">
						<div class="col-md-12">
							<textarea class="form-control" placeholder="一句话简单地介绍自己" style="border: 0.5px solid rgba(192,192,192,0.2);width: 100%;background-color: ghostwhite;height: 30px;"></textarea>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!--copyright-->
		<div class="container" style="margin-top: 30px;">
			
		</div>
  
  
  
  
  
	<script src="../js/jquery-1.11.1.min.js"></script>
	<script src="../http://www.imooc.com/data/jquery-ui-1.9.2.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/resume.js"></script>
  </body>
</html>
