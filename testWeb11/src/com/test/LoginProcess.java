package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {	
	private boolean validateUser(String userId, 
			String userPwd) {
		if(userId.equals("ȫ�浿") && userPwd.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}	
	public void doGet(HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		//out.print(userId + ", " + userPwd);
		boolean loginFlag = this.validateUser(userId, userPwd);
		if(loginFlag) {
			//out.print("Login Sucessful");
			out.print("<script>alert('Login Sucessful');history.back(-1);</script>");
		} else {
			out.print("Login Error");
		}
		out.print("</body></html>");
		out.close();
	}
}
