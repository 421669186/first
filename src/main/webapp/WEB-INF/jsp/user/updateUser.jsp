<%--
  Created by IntelliJ IDEA.
  User: lcy
  Date: 2019/5/20
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>修改用户</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改用户</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" name="userForm">
        <input type="hidden" name="id" value="${user.id}"/>
        用户名称：<input type="text" name="userName" value="${user.userName}"/>
        用户账户：<input type="text" name="userNum" value="${user.userNum}"/>
        用户密码：<input type="password" name="userPassWord" value="${user.userPassWord}"/>
        <label>权限等级：</label>
        <select name="plevel">
            <option>--请选择--</option>
            <option value="1">1</option>
            <option value="2" selected="selected">2</option>
            <option value="3">3</option>
        </select><br><br><br>
        <input type="button" value="提交" onclick="updateUser()"/>
    </form>
    <script type="text/javascript">
        function updateUser() {
            var form = document.forms[0];
            form.action = "/user/updateUser";
            form.method = "post";
            form.submit();
        }
    </script>
</div>