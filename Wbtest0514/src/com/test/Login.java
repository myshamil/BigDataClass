package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter(); 
		out.println("<html><body>");
		out.print("id :");
		out.print("<input type =text name= userId><br>");
		out.print("pwd : ");
		out.print("<input type =text name= userPwd><br>");
		out.print("<input type =button value= 'Login'><br>");
		out.println("</body></html>");
	}

}
