<%--
  Created by IntelliJ IDEA.
  User: xiaofeiwang
  Date: 2020-10-15
  Time: 12:49 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<h2>Success!!!</h2><br/>
<table border="1" bgcolor="#a52a2a">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>money</th>
    </tr>
    <c:forEach items="${list}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>
</table>

</body>

</html>
