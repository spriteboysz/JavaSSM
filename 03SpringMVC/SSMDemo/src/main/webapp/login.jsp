<%--
  Created by IntelliJ IDEA.
  User: Deean
  Date: 2023-11-17
  Time: 21:55
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>登录页面</h3>
${tips}
<form action="student/login" method="post">
    <label>账号<input type="text" name="stuName"/><br/> </label>
    <label>密码<input type="password" name="stuPassword"/><br/> </label>
    <label><input type="submit" value="提交"/><br/> </label>
</form>

</body>
</html>
