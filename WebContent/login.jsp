<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>请假管理系统</title>
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/login.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	function validate(){
		var email = document.getElementById("email");
		var password = document.getElementById("password");
		if (email.value == ""){
			alert("学号不能为空！");
			email.focus();
			return false;
		}
		if(password.value == ""){
			alert("密码不能为空！");
			password.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<iframe src="top.jsp" width="100%" height="100"  scrolling="no" frameborder="0" ></iframe>
<div class="content">
  <div class="page_name">登陆</div>
  <div class="login_content">
  <form action="LoginServlet" method="POST" onsubmit = "return validate();">
    <div class="login_l">
      <p class="font14">使用学号密码登录</p>
      <div class="span1">
        <label class="tn-form-label">学号：</label>
        <input  class="tn-textbox" type="text">
      </div>
      <div class="span1">
        <label class="tn-form-label">密码：</label>
        <input class="tn-textbox"  type="password">
      </div>
      <div class="tn-form-row-button">
        <div class="span1">
          <input name="" type="text" class="tn-button-text" value="登   录">
          <span class="it-register-text">
          <input checked="checked" class="tn-checkbox" value="true" type="checkbox">
          </span> 
          </div>

      </div>
 </form>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
</div>
<iframe src="foot.jsp" width="100%" height="150"  scrolling="no" frameborder="0" ></iframe>
</body>
</html>