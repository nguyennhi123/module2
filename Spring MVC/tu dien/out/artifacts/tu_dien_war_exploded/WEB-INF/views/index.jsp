<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16/07/2019
  Time: 2:56 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="results">
    <label>Nhập từ </label><br/>
    <input type="text" name="key" placeholder="Nhập từ" value=""/><br/>
    <input type="submit" value="Converter"/>
</form>
<div>${result}</div>

</body>
</html>
