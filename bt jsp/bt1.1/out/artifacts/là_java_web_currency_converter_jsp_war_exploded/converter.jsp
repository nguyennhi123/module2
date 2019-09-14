<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 21/06/2019
  Time: 9:52 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyen doi tien te</title>
</head>
<body>
<%
    float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));
    float vnd = usd * rate;
%>
<h1>Rate:<%=rate%></h1>
<h1>USD:<%=usd%></h1>
<h1>VND:<%=vnd%></h1>

</body>
</html>
