<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<h3>表单提交</h3>
<form action="book/add" method="post">
    <label>图书名称<input type="text" name="name"><br/></label>
    <label>图书作者<input type="text" name="author"><br/></label>
    <label>图书价格<input type="text" name="price"><br/></label>
    <label>图书日期<input type="text" name="date"><br/></label>
    <label><input type="submit" value="提交"><br/></label>
</form>

<br/>
<h3>URL提交</h3>
<a href="book/add?bookName=Java">添加图书</a>

<br/>
<h3>AJAX提交</h3>
<input type="button" value="AJAX提交" id="btn1">
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
    $("#btn1").click(function () {
        const obj = {};
        obj.bookName = "java";
        obj.bookAuther = "张三";
        obj.bookPrice = 3.33;
        $.ajax({
            url: "book/list",
            type: "post",
            headers: {},
            contentType: "application/json",
            data: obj,
            success: function (res) {
                console.log(res);
            }
        });
    });
</script>
</body>
</html>