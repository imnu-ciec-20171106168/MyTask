<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/login.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	function validate() {
		var email = document.getElementById("email");
		var password = document.getElementById("password");
		var agree = document.getElementById("agree");
		if (email.value == "") {
			alert("学号不能为空！");
			email.focus();
			return false;
		}
		if (password.value == "") {
			alert("密码不能为空！");
			password.focus();
			return false;
		}
		if(channel.value == ""){
			alert("请先确认您的身份!")
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<iframe src="top.jsp" width="100%" height="100" scrolling="no"
		frameborder="0"></iframe>
	<div class="content">
		<div class="page_name">注册</div>
		<div class="login_content">
			<form action="RegisterServlet" method="POST"
				onsubmit="return validate();">
				<div class="login_l">
					<p class="font14">使用学号进行注册</p>
					<div class="span1">
						<label class="tn-form-label">学号：</label> <input class="tn-textbox"
							type="text" name="email" id="email">
					</div>
					<div class="span1">
						<label class="tn-form-label">密码：</label> <input class="tn-textbox"
							type="password" name="password" id="password">
					</div>
					<div class="tn-form-row-button">
						<div class="span1">
							<input name="" type="submit" class="tn-button-text" value="立即注册">
							<p class="it-register-text"><p>
								请选择您的身份: <input name="channel" type="checkbox"  value="老师">老师
      <input name="channel" type="checkbox"  value="学生">学生
      </p></p>
							
					</div>
				</div>

      </div>
 
			</form>
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
</div>
<iframe src="foot.jsp" width="100%" height="150" scrolling="no"
		frameborder="0"></iframe>
</body>
</html>