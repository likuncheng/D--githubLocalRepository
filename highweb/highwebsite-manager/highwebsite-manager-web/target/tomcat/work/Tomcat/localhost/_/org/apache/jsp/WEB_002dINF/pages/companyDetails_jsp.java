/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-06 02:34:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class companyDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<title>公司详情页面</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/3.css\">\r\n");
      out.write("\t<script src=\"../js/html5shiv.js\"></script>\r\n");
      out.write("\t<script src=\"../js/respond.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\t</script>\r\n");
      out.write("\t<!-- 引用 百度地图API -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=b1LafrGdC6GzRmW4E7VK1S21dc8nWxm8\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t<script src=\"../js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../js/3.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 开始使用栅格布局 -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\" id=\"row1\">\r\n");
      out.write("\t\t<div class=\"col-md-12 col-lg-12 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t<a href=\"\"><img alt=\"图片一\" src=\"../images/31.png\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row\" id=\"row2\" style=\"background-image:url(images/lijuan4.jpg)\">\r\n");
      out.write("\t\t<div class=\"row\" id=\"row21\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 col-md-offset-1 col-lg-6 col-lg-offset-1 col-sm-6 col-sm-offset-1 col-xs-6 col-xs-offset-1\">\r\n");
      out.write("\t\t\t<!-- 导航条1 -->\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-primary\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand btn btn-warning\" href=\"#\">企业版</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"http://localhost:8080/index\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">公司推荐</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">政策解读</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">校园招聘</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">活动专区</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-1\">\r\n");
      out.write("\t\t\t\t<!-- 导航条2 -->\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-primary\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">系统消息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">我的简历</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">投递记录</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t          <a href=\"##\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">用户名<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t          <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t        \t<li><a href=\"##\">我的订阅</a></li>\r\n");
      out.write("\t\t\t\t\t        \t<li><a href=\"##\">职位邀请</a></li>\r\n");
      out.write("\t\t\t\t\t        \t<li><a href=\"##\">账号设置</a></li>\r\n");
      out.write("\t\t\t\t\t        \t<li class=\"outlogin\"><a href=\"javascript:void(0)\">退出</a></li>\r\n");
      out.write("\t\t\t\t\t          </ul>\r\n");
      out.write("\t\t\t\t\t        </li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"right-col\">不同的公司相似的职位</div>\r\n");
      out.write("\t\t<div id=\"middle-add\" >\r\n");
      out.write("\t\t\t<div class=\"row\" id=\"row-1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-md-offset-4 col-lg-4 col-lg-offset-4 col-sm-4 col-sm-offset-4 col-xs-4 col-xs-offset-4\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-circle\" alt=\"\" src=\"../images/32.png\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" id=\"row-1-a1\"><p id=\"p-1\">成都高新区人力资源协会</p></a>\r\n");
      out.write("\t\t\t\t\t\t<p>活跃度<span>90%</span>&nbsp;&nbsp;&nbsp;&nbsp;<span>300</span>人关注</p>\r\n");
      out.write("\t\t\t\t\t\t<div><a href=\"#\"><img src=\"../images/33.png\"></a></div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img src=\"../images/34.png\"></a><a href=\"#\"><img src=\"../images/35.png\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"middle\">\r\n");
      out.write("\t\t\t<div class=\"container\" id=\"container2\">\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row\" id=\"row-2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12 col-lg-12 col-xs-12 col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"company\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>公司介绍</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<p>成都高新技术产业开发区(Chengdu Hi-Tech Industrial Development Zone),简称成都高新区，由成都高新南区、成都高新西区、成都高新\r\n");
      out.write("\t\t\t\t\t\t\t东区组成。成都高新区实行省市共建、以市为主的管理体制，由成都市接管，不属于国家法定行政区划。成都高新区(不含东区)属于成都市中心城区。[1-2]</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>成都高新区托管总面积613平方公里。其中高新南区87平方公里，高新西区43平方公里，高新东区483平方公里；共划分为7个街道、12个乡镇，其中高新南区包括\r\n");
      out.write("\t\t\t\t\t\t\t武侯区的4个街道和双流区的1个街道，高新西区包括郫都区的2个街道，高新东区包括简阳市的12个乡镇。被托管的19个乡、镇、街道的人大、政协、军事等非行政事务仍\r\n");
      out.write("\t\t\t\t\t\t\t由原属地管辖。</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\" id=\"row-3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 col-xs-8 col-sm-8 col-lg-8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-8-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"../images/36.png\">\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"display:inline-block;\">招聘职位(<span>4</span>个)</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-8-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"media-list\">\r\n");
      out.write("\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-8-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"div1\">面试评价</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"div2\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-8-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"totaleval\" class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"divtotal1\">综合评分：</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"rating\" id=\"rating\">\r\n");
      out.write("\t\t\t\t\t\t\t        <li class=\"rating-item\" title=\"很不好\" style=\"background-image:url(img/rating.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t        <li class=\"rating-item\" title=\"不好\" style=\"background-image:url(img/rating.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t        <li class=\"rating-item\" title=\"一般\" style=\"background-image:url(img/rating.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t        <li class=\"rating-item\" title=\"好\" style=\"background-image:url(img/rating.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t        <li class=\"rating-item\" title=\"很好\" style=\"background-image:url(img/rating.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"score\">3.7</div><div class=\"eva\">(来自172份评价)</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\" id=\"totaleval2\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"totaleval2-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"totaleval2-1-1\" style=\"display:inline-block;\">描述相符</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"rating1 totaleval2-1-2\" id=\"rating1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"rating-item1\" title=\"很不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item1\" title=\"不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item1\" title=\"一般\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item1\" title=\"好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item1\" title=\"很好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"totaleval2-1-3\">2.3</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"totaleval2-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"totaleval2-2-1\" style=\"display:inline-block;\">面试官</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"rating2 totaleval2-2-2\" id=\"rating2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"rating-item2\" title=\"很不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item2\" title=\"不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item2\" title=\"一般\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item2\" title=\"好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item2\" title=\"很好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"totaleval2-2-3\">3.6</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"totaleval2-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"totaleval2-3-1\" style=\"display:inline-block;\">公司环境</div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"rating3 totaleval2-3-2\" id=\"rating3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"rating-item3\" title=\"很不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item3\" title=\"不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item3\" title=\"一般\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item3\" title=\"好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"rating-item3\" title=\"很好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"totaleval2-3-3\">2</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-8-5\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"media-list\">\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t            <img class=\"media-object img-circle\" src=\"../images/315.png\">\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t        <div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"media-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t            \t吴*虎&nbsp;&nbsp;&nbsp;综合评分：\r\n");
      out.write("\t\t\t\t\t\t\t            \t<!-- 综合评分的分数，用隐藏框传到js里面 -->\t\t\t\t\t\t\t            \t\r\n");
      out.write("\t\t\t\t\t\t\t            \t<input type=\"hidden\" value=\"2.3\" class=\"hiddeneva\"/>\r\n");
      out.write("\t\t\t\t\t\t\t            \t<!-- 需要设置ul的id属性线性增长 -->\r\n");
      out.write("\t\t\t\t\t\t\t            \t<ul class=\"ratingall\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"rating-itemall\" title=\"很不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"一般\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"很好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t            \t&nbsp;&nbsp;&nbsp;面试职位：java开发工程师\r\n");
      out.write("\t\t\t\t\t\t\t            \t<p class=\"day\" style=\"float:right;top:0px;right:0px;\">2017-8-20</p>\r\n");
      out.write("\t\t\t\t\t\t\t            \t\r\n");
      out.write("\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div><img src=\"../images/316.png\">&nbsp;&nbsp;</div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div><span>[面试过程]</span>当天就面试了两轮，等到该HR面试的时候都已经中午，HR不在，当时说是后面电话联系，\r\n");
      out.write("\t\t\t\t\t\t\t            \t然后就没有然后了。。。。\r\n");
      out.write("\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div><span>[其他评价]</span>公司环境还可以，交通也很方便</div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"last\">有用(2)</div>\r\n");
      out.write("\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t            <img class=\"media-object img-circle\" src=\"../images/315.png\">\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t        <div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"media-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t            \t刘*恒&nbsp;&nbsp;&nbsp;综合评分：\r\n");
      out.write("\t\t\t\t\t\t\t            \t<!-- 综合评分的分数，用隐藏框传到js里面 -->\r\n");
      out.write("\t\t\t\t\t\t\t            \t<input type=\"hidden\" value=\"3.4\" class=\"hiddeneva\"/>\r\n");
      out.write("\t\t\t\t\t\t\t            \t<ul class=\"ratingall\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"rating-itemall\" title=\"很不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"一般\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"很好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t            \t&nbsp;&nbsp;&nbsp;面试职位：系统策划<span>(已下线)</span>\r\n");
      out.write("\t\t\t\t\t\t\t            \t<p class=\"day\" style=\"float:right;top:0px;right:0px;\">2017-8-02</p>\r\n");
      out.write("\t\t\t\t\t\t\t            \t\r\n");
      out.write("\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div><img src=\"../images/316.png\">&nbsp;&nbsp;<img src=\"../images/317.png\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div><span>[面试过程]</span>公司的程序实力，感觉还不错，还是蛮想一起合作的，看面试结果了\r\n");
      out.write("\t\t\t\t\t\t\t            </div>\t\t\t\t\t\t\t           \r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"last\">有用(0)</div>\r\n");
      out.write("\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t            <img class=\"media-object img-circle\" src=\"../images/315.png\">\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t        <div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"media-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t            \t杨*&nbsp;&nbsp;&nbsp;综合评分：\r\n");
      out.write("\t\t\t\t\t\t\t            \t<!-- 综合评分的分数，用隐藏框传到js里面 -->\r\n");
      out.write("\t\t\t\t\t\t\t            \t<input type=\"hidden\" value=\"2.6\" class=\"hiddeneva\"/>\r\n");
      out.write("\t\t\t\t\t\t\t            \t<ul class=\"ratingall\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"rating-itemall\" title=\"很不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"不好\" style=\"background-image:url(img/ratingsmall.png);\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"一般\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t    <li class=\"rating-itemall\" title=\"很好\" style=\"background-image:url(img/ratingsmall.png)\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t            \t&nbsp;&nbsp;&nbsp;面试职位：java开发工程师<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t            \t<p class=\"day\" style=\"float:right;top:0px;right:0px;\">2017-07-11</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t            \t\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div><img src=\"../images/316.png\">&nbsp;&nbsp;<img src=\"../images/317.png\">&nbsp;&nbsp;<img src=\"images/318.png\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div><span>[面试过程]</span>笔试题没做好，一半都不会，链表反转......面试问的问题都是项目上的，框架有些理解不够深，没有offer，当增加经验了吧。\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div><span>[其他评价]</span>hr很温柔，面试官很不错，不懂的会耐心讲解。公司环境挺舒服的，希望可以进入公司学习工作</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"last\">有用(2)</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-8-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:void(0)\"><img src=\"../images/311.png\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-8-7\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 分页导航 -->\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"pagination pagination-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"javascript:void(0)\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li class=\"connect\"><a href=\"javascript:void(0)\">上一页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li class=\"active\"><a href=\"javascript:void(0)\">1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"javascript:void(0)\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"javascript:void(0)\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"javascript:void(0)\">4</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"javascript:void(0)\">5</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li class=\"connect\"><a href=\"javascript:void(0)\">下一页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li><a href=\"javascript:void(0)\">尾页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-xs-4 col-sm-4 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-4-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"row3-4-1-div\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"../images/38.png\"><p>公司基本情况</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row3-4-1-div2\"><img src=\"../images/617.png\"><p class=\"introduce\">移动互联网,教育</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row3-4-1-div2\"><img src=\"../images/618.png\"><p class=\"introduce\">非盈利性机构</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row3-4-1-div2\"><img src=\"../images/619.png\"><p class=\"introduce\">15-50人</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row3-4-1-div2\"><img src=\"../images/620.png\"><p class=\"introduce\">成都市高新区大源国际A3栋22楼</p></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-4-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--百度地图容器-->\r\n");
      out.write("    \t\t\t\t\t\t<div style=\"width:290px;height:245px;border:#ccc solid 1px;font-size:12px\" id=\"map\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-4-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"row3-4-3-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div><img src=\"../images/39.png\"><p style=\"display:inline-block;font-size:20px\">职位标签</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"welfaref\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"welfare\">股权分红</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"welfare\">五险一金</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"welfare\">扁平管理</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"welfare\">带薪年假</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"welfare\">绩效奖金</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"welfare\">定期体检</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"welfare\">管理规范</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\" id=\"row3-4-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"div1\">相似职位</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"div2\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 媒体列表 -->\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"media-list\">\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t            <img class=\"media-object\" src=\"../images/310.png\">\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t        <div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t            <a href=\"#\"><div class=\"media-heading\">产品经理助理</div></a>\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"salary\">5-6K</div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div>高新人力协会(高新.大源国际)</div>\r\n");
      out.write("\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t            <img class=\"media-object\" src=\"../images/310.png\">\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t        <div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t            <a href=\"#\"><h4 class=\"media-heading\">产品经理助理</h4></a>\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"salary\">5-6K</div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div>高新人力协会(高新.大源国际)</div>\r\n");
      out.write("\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t            <img class=\"media-object\" src=\"../images/310.png\">\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t        <div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t            <a href=\"#\"><h4 class=\"media-heading\">产品经理助理</h4></a>\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"salary\">5-6K</div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div>高新人力协会(高新.大源国际)</div>\r\n");
      out.write("\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t    <li class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t        <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t            <img class=\"media-object\" src=\"../images/310.png\">\r\n");
      out.write("\t\t\t\t\t\t\t        </a>\r\n");
      out.write("\t\t\t\t\t\t\t        <div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t            <a href=\"#\"><h4 class=\"media-heading\">产品经理助理</h4></a>\r\n");
      out.write("\t\t\t\t\t\t\t            <div class=\"salary\">5-6K</div>\r\n");
      out.write("\t\t\t\t\t\t\t            <div>高新人力协会(高新.大源国际)</div>\r\n");
      out.write("\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
