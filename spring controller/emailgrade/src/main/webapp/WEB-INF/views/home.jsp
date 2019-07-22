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
    <title>Datetime</title>
</head>
<body>
    <h2>Current Local Times Around the World</h2>
<span>Current time in ${city} <strong>${date}</strong></span>
    <form action="/worldclock" id="locale" method="get">
        <select name="city" onchange="document.getElementById('locale').submit()">
            <option value="asia/Ho_Chi_Minh">select a city</option>
            <option value="asia/Ho_Chi_Minh">Ho Chi Minh</option>
            <option value="Singapore">Singapore</option>
            <option value="Asia/Hong_Kong">Hong Kong</option>
            <option value="Asia/Tokyo">Tokyo</option>
            <option value="Asia/Seoul">Seoul</option>
            <option value="Europe/London">London</option>
            <option value="Europe/Madrid">Madrid</option>
            <option value="America/New_York">New York</option>
            <option value="Australia/Sydney">Sydney</option>
            <option value="Argentina/Buenos_Aires">Buenos Aires</option>
        </select>

</form>


</body>
</html>
