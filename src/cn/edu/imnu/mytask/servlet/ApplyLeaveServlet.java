package cn.edu.imnu.mytask.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.imnu.mytask.bean.ApplyLeaveBean;
import cn.edu.imnu.mytask.bean.InformationBean;
import cn.edu.imnu.mytask.dao.ApplyLeaveDao;

/**
 * Servlet implementation class ApplyLeaveServlet
 */
@WebServlet("/ApplyLeaveServlet")
public class ApplyLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyLeaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String type = request.getParameter("type");
		ApplyLeaveDao dao=new ApplyLeaveDao();
		if("add".equals(type)) 
		{
			ApplyLeaveBean applyleave = this.requestDataObj(request);
			InformationBean applicant=(InformationBean)request.getSession().getAttribute("SESSION_APPLICANT");
			int leaverecordID=dao.add(applyleave,applicant.getApplicantId());
			request.getSession().setAttribute("SESSION_RESUMEID", leaverecordID);
			response.sendRedirect("applysucceed.jsp");
		}
		response.sendRedirect("applysucceed.jsp");	
		
		if("select".equals(type)) 
		{
			//从会话对象中获取当前登录学生的学号
			InformationBean applicant =(InformationBean)request.getSession().getAttribute("SESSION_APPLICANT");
			//根据学生的学号查询请假记录的基本信息
			ApplyLeaveBean applyleave = (ApplyLeaveBean) dao.selectApplyLeaveByID(applicant.getApplicantId());
			//将请假记录基本信息存入request对象进行封装
			request.setAttribute("applyleave", applyleave);
			request.getRequestDispatcher("applicant/queryrecord.jsp").forward(request, response); 
		}
	}
	
	private ApplyLeaveBean requestDataObj(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ApplyLeaveBean applyleave = null;
		String realnumber = request.getParameter("realnumber");
		String realname = request.getParameter("realname");
		String realgrade = request.getParameter("realgrade");
		String telephone = request.getParameter("telephone");
		String startimes = request.getParameter("starttime");
		String endtimes = request.getParameter("endtime");
		String operate1 = "待批准";
		String operate2 = "已销假";
		String leavereason = request.getParameter("leavereason");
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	    Date startime = null;    
		try {
			startime = (Date) sdf.parse(startimes);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(startimes);
			e.printStackTrace();
			startime = null;
		}
		Date endtime = null;
		try {
			endtime = (Date) sdf.parse(endtimes);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			endtime = null;
		}
		applyleave = new ApplyLeaveBean(realnumber,realname,realgrade,startime,endtime,telephone,operate1,operate2,leavereason);
		return applyleave;
	}

}
