<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/my_resume.css" type="text/css" rel="stylesheet" />
<meta content="大学生求职,大学生就业,大学生招聘,IT人才,IT人才招聘,大学生名企招聘,,大学生找工作,IT名企招聘，IT行业招聘，IT企业快速入职" name="keywords">
<meta content="锐聘专注于为企业提供高效的人力资源解决方案，同时面向IT类技术人才推出快速一站式免费就业服务。秉承QST青软实训人才服务理念，为数千家企业量身定做个性化、全程化的人才培养体系，同时帮助中高级人才铺设成功之路，为人才和企业架设起沟通之桥。" name="description">
<script type="text/javascript">
	function validate(){
		var realnumber = document.getElementById("realnumber");
		var realname = document.getElementById("realname");
		var realgrade = document.getElementById("realgrade");
		var telephone = document.getElementById("telephone");
		var starttime = document.getElementById("starttime");
		var endtime = document.getElementById("endtime");
		var phonePattern = /^(((13[0-9]{1})|159|153)+\d{8})$/;
		if(realname.value == ""){
			alert("姓名不能为空！");
			realname.focus();
			return false;
		}
		if(telephone.value == ""){
			alert("手机号不能为空！");
			telephone.focus();
			return false;
		}else if(!phonePattern.test(telephone.value)){
			alert("手机号格式不正确！");
			telephone.focus();
			return false;
		}
		return true;
	}
		
</script>
</head>

<body>
<iframe src="top.jsp" width="100%" height="100"  scrolling="no" frameborder="0" ></iframe>

<div class="resume_con">
	<!--tab设置-->
	<div class="user_operate">
		<ul style="float:left">
			<li><a href="applyleave.jsp" class="active">学生申请请假</a></li>
			<li><a href="applycancel.jsp">学生申请销假</a></li>
			<li><a href=queryrecord.jsp">查询请假记录</a></li>
			<div class="clear"></div>
		</ul>
		<div class="clear"></div>
	</div>
    <!--主体部分-->
    <div class="resume_main">
    	<!--左边-->
	    <div class="resume_left">
			<div class="resume_title">
				<div style="float:left">学生端</div>
			</div>
			<div class="all_resume" style="text=align:center;" align="center">
			<form action="ApplyLeaveServlet?type=add" method="post" onsubmit="return validate();">
			
			<div class="table_style">
					<table width="300" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">学号：</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" id="realnumber" name="realnumber"></td>
					  	</tr>
					</table>
			
				<div class="table_style">
					<table width="300" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">姓名：</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" id="realname" name="realname"></td>
					  	</tr>
					</table>
					
					<div class="table_style">
					<table width="300" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">班级：</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" id="realgrade" name="realgrade"></td>
					  	</tr>
					</table>
					
					<div class="he"></div>
					<table width="300" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
					  <tr>
					    <th width="110" align="right" bgcolor="#F8F8F8">手机：</th>
					    <td bgcolor="#F8F8F8" align ="left">
					    	<input type="text" id="telephone" name="telephone"></td>
					  </tr>
					</table>
					
					<div class="he"></div>
					<table width="300" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
					  <tr>
					    <th width="110" align="right" bgcolor="#F8F8F8">起始日期：</th>
					    <td bgcolor="#F8F8F8" align ="left">
					    	<input name="starttime" type="text" id="starttime" onclick="SelectDate(this)" /></td>
					  </tr>
					</table>
					
					<div class="he"></div>
					<table width="300" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
					  <tr>
					    <th width="110" align="right" bgcolor="#F8F8F8">结束日期：</th>
					    <td bgcolor="#F8F8F8" align ="left">
					    	<input name="endtime" type="text" id="endtime" onclick="SelectDate(this)" /></td>
					  </tr>
					</table>
					
					
					<div class="he"></div>
					<table width="300" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
					  <tr>
					    <th width="110" align="right" bgcolor="#F8F8F8">请假事由：</th>
					    <td bgcolor="#F8F8F8" align ="left">
					    	<input type="text" name="leavereson"></td>
					  </tr>
					</table>
					
					<div class="he"></div>
					<div class="he"></div>
					<div class="he"></div>
					<div style="margin-left:100px;">
					<input name="" type="submit" class="save1" value="提交"> 
					<input name="" type="reset" class="cancel2" value="取消"></div>
				</div>
				
				<div class="clear"></div>
				</form>
			</div>
	    </div>
    

<iframe src="foot.jsp" width="100%" height="150"  scrolling="no" frameborder="0" ></iframe>
</body>
</html>