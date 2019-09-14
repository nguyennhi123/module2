<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 04/07/2019
  Time: 6:54 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["customer"].getName()}"></td>
            </tr>
            <tr>
                <td>phone: </td>
                <td><input type="text" name="phone" id="phone" value="${requestScope["customer"].getPhone()}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="sex" id="sex" value="${requestScope["customer"].getSex()}"></td>
            </tr>
            <tr>
                <td>IdEmployer: </td>
                <td><input type="text" name="idemployers" id="idemployers" value="${requestScope["customer"].getIdemployers()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="update Customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

