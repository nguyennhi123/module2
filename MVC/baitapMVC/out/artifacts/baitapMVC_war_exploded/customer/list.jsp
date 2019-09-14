<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 02/07/2019
  Time: 11:04 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customer?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>phone</td>
        <td>sex</td>
        <td>idEmployers</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/customer?action=view&id=${customer.getIdcustomer()}">${customer.getName()}</a></td>
            <td>${customer.getPhone()}</td>
            <td>${customer.getSex()}</td>
            <td>${customer.getIdemployers()}</td>
            <td><a href="/customer?action=edit&id=${customer.getIdcustomer()}">edit</a></td>
            <td><a href="/customer?action=delete&id=${customer.getIdcustomer()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

