package com.workshopAns;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet{
	
	private boolean userExists(String id, String pwd){
		String idDB = "ȫ�浿";
		String pwdDB = "1234";
		if (id.equals(idDB) && pwd.equals(pwdDB)){
			return true;
		} else {return false;}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		if (userExists(id, pwd) == true) {
			resp.sendRedirect("Welcome");
		} else {
			out.print("<script>alert('����� ���̵� ��й�ȣ�� �߸��Ǿ����ϴ�. �ٽ� �Է��ϼ���.');");
			out.print("location.href=\"LoginForm\"</script>");
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<script>alert('�߸��� �����Դϴ�. �α��� �������� �̵��մϴ�.');");
		out.print("location.href=\"LoginForm\"</script>");
	}
	
}
