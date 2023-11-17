<%--
  Created by IntelliJ IDEA.
  User: Deean
  Date: 2023-11-17
  Time: 22:15
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/css/bootstrap.min.css"
      integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/css/bootstrap-theme.min.css"
      integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/js/bootstrap.min.js"
        integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
        crossorigin="anonymous"></script>
<body>
<h4>文件列表</h4>

<div class="row" id="container"></div>

<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
    $.get("book/list", function (res) {
        for (let i = 0; i < res.length; i++) {
            const fn = res[i];
            const htmlStr = "<div class='col-lg-2 col-md-3 col-sm-4 col-xs-6'><div class='thumbnail'><img src='img/" + fn + "' alt='...'><div class='caption'><p><a href='book/download?fileName=" + fn + "' class='btn btn-primary' role='button'>下载</a></p></div></div></div>";
            $("#container").append(htmlStr);
        }
    }, "json");
</script>
</body>
</html>
