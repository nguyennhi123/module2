<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 18/07/2019
  Time: 2:19 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <legend>login</legend>
        <table>
            <tr>
                <td><form:label path="account"></form:label>Account</td>
                <td><form:input path="account"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="passworld">Passworld</form:label></td>
                <td><form:input path="passworld"></form:input></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>login</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>

</body>
</html>
