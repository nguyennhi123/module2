<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 28/06/2019
  Time: 2:37 CH
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
    <a href="/Customer?action=createCustomer">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>phone</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer">
        <tr>
            <td><a href="/Customer?action=view&id=${customer.getIdcustomer()}">${customer.getCustomerName()}</a></td>
            <td>${customer.getPhone()}</td>
            <td>${customer.getAddress()}</td>
            <td><a href="/Customer?action=edit&id=${customer.getIdcustomer()}">edit</a></td>
            <td><a href="/Customer?action=delete&id=${customer.getIdcustomer()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
