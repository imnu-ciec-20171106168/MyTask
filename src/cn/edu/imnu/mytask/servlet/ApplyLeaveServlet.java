package cn.edu.imnu.mytask.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String type = request.getParameter("type");
		if("add".equals(type)) {
			ApplyLeaveBean applyleave = this.requestDataObj(request);
			InformationBean applicant=(InformationBean)request.getSession().getAttribute("SESSION_APPLICANT");
			ApplyLeaveDao dao=new ApplyLeaveDao();
			int leaverecordID=dao.add(applyleave,applicant.getApplicantId());
			request.getSession().setAttribute("SESSION_RESUMEID", leaverecordID);
			response.sendRedirect("resume.jsp");
		}
	}
	
	private ApplyLeaveBean requestDataObj(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ApplyLeaveBean applyleave = null;
		String realnumber = request.getParameter("realnumber");
		String realname = request.getParameter("realname");
		String realgrade = request.getParameter("realgrade");
		String telephone = request.getParameter("telephone");
		String startimes = request.getParameter("startime");
		String endtimes = request.getParameter("endtime");
		String leavereason = request.getParameter("leavereason");
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	    Date startime = null;
		try {
			startime = (Date) sdf.parse(startimes);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			startime = null;
		}
		Date endtime = null;
		try {
			endtime = (Date) sdf.parse(endtimes);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			endtime = null;
		}
		applyleave = new ApplyLeaveBean(realnumber,realname,realgrade,startime,endtime,telephone,leavereason);
		return applyleave;
	}

}
