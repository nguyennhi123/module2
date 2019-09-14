<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/06/2019
  Time: 3:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      .login {
        height:250px; width:230px;
        padding-bottom: 40px;
        padding-top: 10px;
        padding-left: 30px;
        padding-right: 30px;
        border:5px #CCC solid;
        margin-left: 500px;
      }
      .login input {
        padding:5px; margin:5px
      }
    </style>
  </head>
  <body>

  <form method="post" action="/Calculate">

    <div class="login">
      <h3>Product Discount Calculator</h3>
    <label>Product Description:</label><br>
    <input type="text" name="product"placeholder="Product Description:"><br>
    <label>List Price:</label><br>
    <input type="text" name="Price" placeholder="List Price:"><br>
    <label>Discount Percent:</label><br>
    <input type="text"name="Discount" placeholder="Discount Percent:"><br>
    <input type="submit" id="submit" value="Calculate Discount" >
    </div>
  </form>
  </body>
</html>
