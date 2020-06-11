package com.test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();	
		Cookie[] c = req.getCookies();
		if(c != null) {
			//out.print(c[0].getName() + ", " + c[0].getValue());
			if(c[0].getValue().equals("Y")) {
				out.print("Logined");
			} else {
				out.print("<html><body>");
				out.print("<form action='LoginProcess3' method='get'>");
				out.print("���̵� : <input type='text' name='userId'><br>");
				out.print("��й�ȣ : <input type='password' name='userPwd'><br>");
				out.print("<input type='submit' value='�α���'>");
				out.print("</form>");
				out.print("</body></html>");
				out.close();
			}			
		} else {
			out.print("<html><body>");
			out.print("<form action='LoginProcess3' method='get'>");
			out.print("���̵� : <input type='text' name='userId'><br>");
			out.print("��й�ȣ : <input type='password' name='userPwd'><br>");
			out.print("<input type='checkbox' name='state'>�α��� ���� ����<br>");
			out.print("<input type='submit' value='�α���'>");
			out.print("</form>");
			out.print("</body></html>");
			out.close();	
		}
	}
}
