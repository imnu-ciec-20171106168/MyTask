package cn.edu.imnu.mytask.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.imnu.mytask.dao.InformationDao;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
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
		PrintWriter out=response.getWriter();
		int tags = 0;
		String realnumber=request.getParameter("realnumber");
		String realname=request.getParameter("realname");
		String realgrade=request.getParameter("realgrade");
		String realsex=request.getParameter("realsex");
		String telephone=request.getParameter("telephone");
		String dormitory=request.getParameter("dormitory");
		InformationDao dao = new InformationDao();
		boolean flag=dao.isExistInformation(realnumber);
		if(flag)
		{
			response.sendRedirect("student.jsp");
		}else {
			response.sendRedirect("login.jsp");		
		}
	}

}
