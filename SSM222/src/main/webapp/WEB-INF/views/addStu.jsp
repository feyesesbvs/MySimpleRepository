<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<h1>添加用户</h1>
<s:form action="success" method="post">
    <table width="100%" border="1">
       姓名：<input type="text" name="name" value="${student.name}">
        qq：<input type="text" name="qq" value="${student.qq}">
        职业：<input type="text" name="jobs" value="${student.jobs}">
        加入时间：<input type="text" name="joinTime" value="${student.join_time}">
       学校：<input type="text" name="school" value="${student.school}">
       上线ID：<input type="text" name="onlineId" value="${student.online_id}">
        链接：<input type="text" name="dataUrl" value="${student.data_url}">
       宣言：<input type="text" name="declaration" value="${student.declaration}">
        入门师兄：<input type="text" name="teacher" value="${student.teacher}">
       消息来源：<input type="text" name="sources" value="${student.sources}">
    <input type="submit" value="添加" />
    </table>
</s:form>
</body>
</html>