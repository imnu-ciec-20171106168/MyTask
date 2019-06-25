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

import cn.edu.imnu.mytask.bean.ApplyLeave;
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
			ApplyLeave applyleave = this.requestDataObj(request);
			Applicant applicant=(Applicant)request.getSession().getAttribute("SESSION_APPLICANT");
			ResumeDAO dao=new ResumeDAO();
			int basicinfoID=dao.add(applyleave,applicant.getApplicantId());
			request.getSession().setAttribute("SESSION_RESUMEID", basicinfoID);
			response.sendRedirect("resume.jsp");
		}
	}
	
	private ApplyLeave requestDataObj(HttpServletRequest request) {
		// TODO Auto-generated method stub
		ApplyLeave basicinfo = null;
		String realName = request.getParameter("realName");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String jobIntention = request.getParameter("jobIntention");
		String jobExperience = request.getParameter("jobExperience");
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	    Date birthdayDate = null;
		try {
			birthdayDate = (Date) sdf.parse(birthday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			birthdayDate = null;
		}
		applyleave = new ApplyLeave(realnumber, realname, realgrade, startime, endtime, telephone, leavereason);
		return basicinfo;
	}

}
