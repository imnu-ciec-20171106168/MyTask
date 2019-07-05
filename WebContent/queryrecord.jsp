<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<%@ page import="cn.edu.imnu.mytask.dao.ApplyLeaveDao ,cn.edu.imnu.mytask.bean.ApplyLeaveBean ,cn.edu.imnu.mytask.bean.InformationBean" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/my_resume.css" type="text/css" rel="stylesheet" />
<meta content="大学生求职,大学生就业,大学生招聘,IT人才,IT人才招聘,大学生名企招聘,,大学生找工作,IT名企招聘，IT行业招聘，IT企业快速入职" name="keywords">
<meta content="锐聘专注于为企业提供高效的人力资源解决方案，同时面向IT类技术人才推出快速一站式免费就业服务。秉承QST青软实训人才服务理念，为数千家企业量身定做个性化、全程化的人才培养体系，同时帮助中高级人才铺设成功之路，为人才和企业架设起沟通之桥。" name="description">
</head>
<body>

<!-- 从request对象中获取一个JavaBean对象 -->
<jsp:useBean id="applyleave" class="cn.edu.imnu.mytask.bean.ApplyLeaveBean" scope="request"></jsp:useBean>

<iframe src="top.jsp" width="100%" height="100"  scrolling="no" frameborder="0" ></iframe>
<div class="resume_con">
	<!--tab设置-->
	<div class="user_operate">
		<ul style="float:left">
			<li><a href="Bootstrp.jsp">学生申请请假</a></li>
			<li><a href="applycancel.jsp">学生申请销假</a></li>
			<li><a href="ApplyLeaveServlet?type=select" class="active">请假记录信息</a></li>
			<div class="clear"></div>
		</ul>
		<div class="clear"></div>
	</div>
    <!--主体部分-->
    <div class="resume_main">
			<div class="resume_title">
				<div style="float:left">学生端</div>
			</div>
			
        <h1 align="center">请假记录</h1>
    </div>
   
    <div class="row" align="center">
		
<h1>${xiaoxi}</h1>
	<table width="60" border="1" cellpadding="0">
		<tr>
			<th>学生学号</th>
			<th>学生姓名</th>
			<th>学生班级</th>
			<th>联系电话</th>
			<th>起始日期</th>
			<th>结束日期</th>
			<th>请假原因</th>
			<th>操作1</th>
			<th>操作2</th>
		</tr>
		<c:forEach var="U" items="${userAll}">
				<tr>
					<td><input type="text" style="height:80px;width:140px" id="realnumber"  value="${U.realnumber}" name="realnumber"></td>
					<jsp:getProperty property="realnumber" name="applyleave"/>
					<td><input type="text" style="height:80px;width:140px" id="realname" value="${U.realname}" name="realname"></td>
					<td><input type="text" style="height:80px;width:140px" id="realgrade" value="${U.realgrade}" name="realgrade"></td>
					<td><input type="text" style="height:80px;width:140px" id="starttime" value="${U.starttime}" name="starttime"></td>
					<td><input type="text" style="height:80px;width:140px" id="endtime" value="${U.endtime}" name="endtime"></td>
					<td><input type="text" style="height:80px;width:140px" id="leavereason" value="${U.leavereason}" name="leavereason"></td>
					<td><input type="text" style="height:80px;width:140px" id="operate1" value="${U.operate1}" name="operate1"></td>
					<td><input type="text" style="height:80px;width:140px" id="operate2" value="${U.operate2}" name="operate2"></td>
				</tr>
		</c:forEach>
		
<%
 
%>		
		
	</table>

<iframe src="foot.jsp" width="100%" height="150"  scrolling="no" frameborder="0" ></iframe>
</body>
</html>
