<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	  li{
        float:left;                
        list-style-type: none;
        padding:10px 20px;
    }
    ul{
        overflow: auto;
        background-color:gray;
    }
	
	
	</style>

  </head>
  
  <body>
    <ul>
  <li> 首页 </li>
  <li> 产品 </li>
  <li> 解决方案 </li>
  <li> 招聘 </li>
  <li> 留言 </li>
  <li> 关于我们 </li>
</ul>
  </body>
</html>
