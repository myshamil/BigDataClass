package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LocalTestServlet3")
public class LocalTestServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
	}

}
