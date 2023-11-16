<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>图书管理</title>
</head>
<body>
<table width="100%" height="800">
    <tr>
        <td width="200" style="border-right: deepskyblue 2px solid; background:rgba(255,0,0,0.1)">
            <ul>
                <li><a href="book-add.jsp" target="mainFrame">文件上传</a></li>
                <li><a href="">文件下载</a></li>
            </ul>
        </td>
        <td>
            <iframe name="mainFrame" width="100%" height="800" frameborder="0"></iframe>
        </td>
    </tr>
</table>
</body>
</html>