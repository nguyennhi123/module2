<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 21/06/2019
  Time: 10:40 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<%!
Map<String,String> dictionary = new HashMap<>();
%>
<%
    dictionary.put("hello","xinchao");
    dictionary.put("goodbye","tam biet");
    dictionary.put("sun","mat troi");
    String seach = request.getParameter("world");
    String result = dictionary.get(seach);
    if (result!=null){
        out.println("world: "+ seach);
        out.println("result: "+result);
    }else {
        out.println("not found");
    }

%>

</body>
</html>
