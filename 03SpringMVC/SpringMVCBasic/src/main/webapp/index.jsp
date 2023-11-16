<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.7.1/jquery.js"></script>
<!DOCTYPE html>
<html>
<head>
    <title>JSP</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<h1>表单提交</h1>
<form action="book/add2" method="post">
    <label>图书名称<input type="text" name="name"><br/></label>
    <label>图书作者<input type="text" name="author"><br/></label>
    <label>图书价格<input type="text" name="price"><br/></label>
    <label>图书日期<input type="text" name="date"><br/></label>
    <label><input type="submit" value="提交"><br/></label>
</form>
<br/>
${key1}
<input type="button" value="AJAX提交" id="btn1"/>
<%--<script type="text/javascript" src="js/jquery-3.7.1.js"></script>--%>
<script type="text/javascript">
    $("#btn1").click(function () {
        $.ajax({
            url: "book/add",
            type: "get",
            headers: {"token":"000"},
            contentType: "application/json",
            success: function (res) {
                console.log(res);
            }
        });
    });
</script>

</body>
</html>