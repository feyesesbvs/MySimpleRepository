<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


    <title>用户操作</title>
</head>

<body>
<h1><%=path%>操作成功<%=basePath%></h1>
修改成功!!
</body>
</html>