<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/06/2019
  Time: 10:37 SA
  To change this template use File | Settings | File Templates.
--%>
<html>
<style type="text/css">
  .login{
    height:180px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input{
    padding: 5px;margin: 5px;
  }
</style>
<body>
<form method="post" action="/login">
  <div class="login">
    <h2>login</h2>
    <input type="text" name="usename" size="20" placeholder="usename"/>
    <input type="password" name="password" size="20" placeholder="password"/>
    <input type="submit"value="sign in"/>
  </div>
</form>
</body>
</html>
