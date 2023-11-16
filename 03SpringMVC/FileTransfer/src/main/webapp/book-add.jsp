<%--
  Created by IntelliJ IDEA.
  User: Deean
  Date: 2023-11-16
  Time: 23:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>添加图书信息</h4>
<form action="book/add" method="post" enctype="multipart/form-data">
    <label>图书名称<input type="text" name="bookName"><br/></label>
    <label>图书作者<input type="text" name="bookAuthor"><br/></label>
    <label>图书价格<input type="text" name="bookPrice"><br/></label>
    <label>图书封面<input type="file" name="bookImage"><br/></label>
    <label>图书日期<input type="text" name="bookDate"><br/></label>
    <label><input type="submit" value="提交"><br/></label>
</form>
</body>
</html>
