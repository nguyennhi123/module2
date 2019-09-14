<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 6/16/2019
  Time: 10:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display page</title>
    <style>
        div {
            text-align: center;
        }

        table, th, td {
            border-collapse: collapse;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<div id="container">
    <h1>Display Customer List</h1>
    <div id="customer_list">
        <table>
            <thead>
            <tr>
                <th>Name</th>
                <th>DoB</th>
                <th>Address</th>
                <th>Image</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${listuser}" var = "list">
            <tr>
                <td>${list.name1}</td>
                <td>${list.name2}</td>
                <td>${list.name3}</td>
                <td>${list.name4}</td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
