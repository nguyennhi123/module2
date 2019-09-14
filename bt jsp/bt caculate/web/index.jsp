<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 21/06/2019
  Time: 11:35 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Simple calculator</h2>
  <form method="post" action="/calculate">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>First operand:</td>
          <td><input type="text" name="first-operand"></td>
        </tr>
        <tr>
          <td>Operator:</td>
          <td><select name="Operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
          </td>
        </tr>
        <tr>
          <td>Second Operand </td>
          <td><input type="text" name="second-operand"></td>
        </tr>
        <tr>
          <td><input type="submit" id="submit" value="result"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
