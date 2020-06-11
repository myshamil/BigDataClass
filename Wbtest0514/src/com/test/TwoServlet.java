package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TwoServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
	
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Servlet is initialized");		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		out.print("<html><body>");
		out.print("<b>Hello , TwoServlet");
		out.print("</body></html>");
		System.out.println("Servlet is serviced");	
	}

}
