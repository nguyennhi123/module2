<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 6/16/2019
  Time: 10:22 PM
  To change this template use File | Settings | File Templates.
--%><%
    import java.lang.String;
    import java.util.List;
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.codegym.CustomerList.DAO"%>
<%@ page import="java.lang.String"%>
<%@ page import="java.util.List"%>

<html>
<head>
    <title>Indexprocess Page</title>
</head>
<body>
<%
    request.setAttribute("listuser", DAO.exportUsers());
    RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
    rd.forward(request, response);
%>
</body>
</html>
