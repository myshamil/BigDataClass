package com.workshopAns;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		out.print("<form action=\"ValidateUser\" method=\"POST\">");
		out.print("<table border=\"1\">");
		out.print("<caption>����� ����</caption>");
		out.print("<tr>");
		out.print("<td>���̵�</td>");
		out.print("<td><input type=\"text\" name=\"id\"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>��й�ȣ</td>");
		out.print("<td><input type=\"password\" name=\"pwd\"></td>");
		out.print("</tr>");
		out.print("<tr align=\"center\">");
		out.print("<td colspan=\"2\"><input type=\"submit\" value=\"�α���\"></td>");
		out.print("</tr>");
		out.print("</table></form></body></html>");
		
		
		
	}

}
