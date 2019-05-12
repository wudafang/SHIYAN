<%@page import="com.ysd.entity.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'user.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
td {
	border: solid 1px #ccc;
}

table {
	border-collapse: collapse;
}
</style>
</head>

<body>
	<table>
		<%
		int s;
			List<User> user = (List<User>) request.getAttribute("list");
			for (int i = 0; i < user.size(); i++) {
				User u = user.get(i);
				s = i + 1;
		%>
		<%
			if (s % 2 == 1) {
		%>
		<tr style="background-color:greenyellow;">
			<%
				} else {
			%>
		
		<tr>
			<%
				}
			%>
		
	
			<td><%=s%></td>
			<td><%=u.getUname()%></td>
			<td><%=u.getUhobby()%></td>

		</tr>
		<%
			}
		%>

	</table>
</body>
</html>
