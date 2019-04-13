<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/4/12
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Form</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/account_save.action">
    姓名：<input type="text" name="name"><br>
    金钱：<input type="text" name="money"><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
