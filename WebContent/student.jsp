<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生请假管理系统</title>
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/login.css" type="text/css" rel="stylesheet" />
</head>
<body>
<style>
.success_content {
	width: 1000px;
	background: #fff;
	margin: 15px auto;
	box-shadow: 0 1px 3px #999;
	font-family: microsoft yahei;
}

.success_left {
	background: url(images/it-line03.png) repeat;
	width: 360px;
	float: left;
	height: 300px;
}

.success_left h3 {
	color: #19a8b6;
}

.success_right {
	float: left;
	text-align: center;
	width: 600px;
	padding-top: 50px;
}

.it-pageimg {
	background: url(images/it-img.png) no-repeat -710px -40px;
	height: 160px;
	width: 160px;
	margin: 30px 0px 0px 70px;
}

.green16 {
	font-size: 16px;
	color: #19a8b6;
}

.tn-button {
	background: url(images/it-button.png) no-repeat -205px -10px;
	height: 45px;
	width: 146px;
	font-size: 16px;
	display: inline-block;
	text-align: center;
	color: white;
	line-height: 45px;
}

.tn-button:hover {
	background: url(images/it-button.png) no-repeat -205px -65px;
	width: 146px;
	height: 45px;
}

.success_right p {
	line-height: 50px;
}

.success_right p span {
	margin-left: 20px;
}
</style>
<body>
	<iframe src="top.jsp" width="100%" height="120" scrolling="no"
		frameborder="0"></iframe>
	<div class="success_content">
		<div class="success_left">
			<div class=it-pageimg></div>
			<h3 align="center">登录成功！</h3>
		</div>
		<div class="success_right">
			<p class="green16">欢迎来到学生请假管理系统！</p>
			<p>
				<a href="applyleave.jsp"><span class="tn-button">学生申请请假</span></a>
				<a href="applycancel.jsp"><span class="tn-button">学生申请销假</span></a>
				<a href="queryrecord.jsp"><span class="tn-button">查询请假记录</span></a>
			</p>
		</div>
		<div class="clear"></div>
	</div>
	<iframe src="foot.jsp" width="100%" height="150" scrolling="no"
		frameborder="0"></iframe>
</body>
</html>