<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16/07/2019
  Time: 2:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<form action="convert" method="post" >
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value=""/><br/>
    <input type="submit" value="Converter"/>

</form>
<div>${result}</div>

</body>
</html>
