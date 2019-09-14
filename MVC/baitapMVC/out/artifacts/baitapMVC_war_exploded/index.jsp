<%@ page import="jdbc.DBConnection" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 01/07/2019
  Time: 8:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    DBConnection db = new DBConnection();
    Connection conn = db.getConnection();
    if(conn == null){
      out.print("connection fail!");
    }
    else{
      out.print("connection success! <br><br>");
      out.print("<a href='/homes'>Home<a>");
    }
  %>
  </body>
</html>
