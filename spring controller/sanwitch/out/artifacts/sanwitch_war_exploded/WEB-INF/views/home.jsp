<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/07/2019
  Time: 10:20 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<form action="/condiment" method="get">
    <h1>Sandwich condiments</h1>
    <input type="checkbox"  name="condiment" value="Lettuce">Lettuce
    <input type="checkbox"  name="condiment" value="Tomato">Tomato
    <input type="checkbox"  name="condiment" value="Mustard">Mustard
    <input type="checkbox"  name="condiment" value="Sprouts">Sprouts<br><br>
    <input type="submit"  value="Save">
</form>
${result[0]}<br>
${result[1]}<br>
${result[2]}<br>
${result[3]}

</body>
</html>
