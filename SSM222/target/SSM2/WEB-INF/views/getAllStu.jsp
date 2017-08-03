<%@ page language="java" import="com.jnshu.pojo.Student" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h2><a href="${pageContext.request.contentType}/getStu/${student.id}">查询学员信息</a></h2>
<h2><a href="addStu">添加学员信息</a></h2>
 <table border="2" width="500">
     <tr>
         <td>ID</td>
         <td>qq</td>
         <td>name</td>
         <td>jobs</td>
         <td>join_time</td>
         <td>school</td>
         <td>online_id</td>
         <td>data_url</td>
         <td>declaration</td>
         <td>teacher</td>
         <td>sources</td>
         <td>编辑</td>

     </tr>
    <c:forEach items="${studentList}" var="student">
       <tr>
           <td>${student.id}</td>
           <td>${student.qq}</td>
           <td>${student.name}</td>
           <td>${student.jobs}</td>
           <td>${student.join_time}</td>
           <td>${student.school}</td>
           <td>${student.online_id}</td>
           <td>${student.data_url}</td>
           <td>${student.declaration}</td>
           <td>${student.teacher}</td>
           <td>${student.sources}</td>
           <td><a href="${pageContext.request.contentType}/updateStu/${student.id}">修改</a></td>
           <td ><a href="${pageContext.request.contentType}/deleteStu/${student.id}">删除</a></td>
       </tr>
    </c:forEach>
 </table>
</body>
</html>
