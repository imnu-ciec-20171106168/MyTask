<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
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
		if(realnumber.value == ""){
			alert("学号不能为空！");
			realname.focus();
			return false;
		}
		if(realname.value == ""){
			alert("姓名不能为空！");
			realname.focus();
			return false;
		}
		if(realgrade.value == ""){
			alert("班级不能为空！");
			realname.focus();
			return false;
		}
		if(telephone.value == ""){
			alert("手机号不能为空！");
			telephone.focus();
			return false;
		}
		if(starttime.value == ""){
			alert("起始日期不能为空！");
			realname.focus();
			return false;
		}
		if(endtime.value == ""){
			alert("结束日期不能为空！");
			realname.focus();
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

        <h1 align="center">个人信息统计</h1>
        <p align="center">在这里提交你的信息</p>
    </div>
    
    <div class="row" align="center">
		<table width="480" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">学生学号</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" class="form-control" style="height:36px;width:420px" id="realnumber" name="realnumber"></td>
					  	</tr>
					</table>
					
					<table width="480" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">学生姓名</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" class="form-control" style="height:36px;width:420px" id="realname" name="realname"></td>
					  	</tr>
					</table>

					<table width="480" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">学生班级</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" class="form-control" style="height:36px;width:420px" id="realgrade" name="realgrade"></td>
					  	</tr>
					</table>
     	    
     	    <table width="480" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">联系电话</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" class="form-control" style="height:36px;width:420px" id="telephone" name="telephone"></td>
					  	</tr>
					</table>
					
					<table width="480" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="right" bgcolor="#F8F8F8">起始日期</th>
						<td bgcolor="#F8F8F8" align ="left">
   							<input type="text" class="form-control" style="height:36px;width:420px" id="starttime" name="starttime"></td>
					  	</tr>
					</table>
					
					<table width="480" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
						<tr>
						<th width="110" align="canter" bgcolor="#F8F8F8">结束日期</th>
						<td bgcolor="#F8F8F8" align ="center">
   							<input type="text" class="form-control" style="height:36px;width:420px" id="endtime" name="endtime"></td>
					  	</tr>
					</table>
     	    
        <div class="panel panel-info" style="width: 480px">
            <div class="panel-heading">
                <h3 class="panel-title" align="center">请假原因</h3>
            </div>
            <textarea class="form-control" rows="4" style="resize: none;height: 100%;width: 100%" name="leavereson" ></textarea>
        </div>

        <div>
           
            <input name="" type="submit" class="save1" value="提交"> 
			<input name="" type="reset" class="cancel2" value="取消">
        </div>
    </div>
</div>
<iframe src="foot.jsp" width="100%" height="150"  scrolling="no" frameborder="0" ></iframe>
</body>
</html>