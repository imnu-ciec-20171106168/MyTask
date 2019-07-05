<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 实例</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<form action="ApplyLeaveServlet?type=add" method="post" onsubmit="return validate();">
<div class="container">
    <div class="jumbotron">
        <h1 align="center">个人信息统计</h1>
        <p align="center">你已成功提交请假信息</p>
    </div>
    <div class="row" align="center">
        <div class="panel panel-info" style="width: 450px;height: 200px">
            <div class="panel-heading">
                <h3 class="panel-title" align="center">请点击确定按钮</h3>
            </div>
            
        </div>

        <div>
        	<li><a href="student.jsp" class="btn btn-success" >确定</a></li>
        </div>
    </div>
</div>

</body>
</html>
