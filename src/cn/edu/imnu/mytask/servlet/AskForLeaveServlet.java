package cn.edu.imnu.mytask.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.imnu.mytask.bean.ApplyLeaveBean;
import cn.edu.imnu.mytask.dao.ApplyLeaveDao;
import cn.edu.imnu.mytask.dao.InformationDao;

/**
 * Servlet implementation class AskForLeaveServlet
 */
@WebServlet("/AskForLeaveServlet")
public class AskForLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AskForLeaveServlet() {
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
		//PrintWriter out=response.getWriter();
		String realnumber = request.getParameter("realnumber");
		String realname = request.getParameter("realname");
		String realgrade = request.getParameter("realgrade");
		String telephone = request.getParameter("telephone");
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String operate1 = "待批准";
		String operate2 = "未销假";
		int studentid = 0;
		String leavereason = request.getParameter("leavereason");
		//SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		ApplyLeaveDao dao = new ApplyLeaveDao();
		InformationDao dao2 = new InformationDao();
		studentid = dao2.studentid(realnumber);
		dao.saveLeaveInfo(realnumber, realname, realgrade, starttime, endtime, telephone, operate1, operate2, leavereason,studentid);
		response.sendRedirect("applysucceed.jsp");
	}

}
