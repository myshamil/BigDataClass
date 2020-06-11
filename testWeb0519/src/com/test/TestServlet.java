package com.test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession s1 = request.getSession(false);
		if(s1 != null) {
			out.print("not null");
		}
		//out.print(s1.getId());
//		if(s1.isNew()) {
//			out.print(s1.getId());
//		} else {
//			out.print("not new");
//		}
		
		
			
	
	}

}
