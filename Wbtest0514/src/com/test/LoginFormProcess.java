package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginFormProcess")
public class LoginFormProcess extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws 
	ServletException, IOException {
		res.setContentType("text/html; charset=utf-8" );
		PrintWriter out = res.getWriter();
		out.print("LoginFormProcess<br>");
		out.print("<b> UserName: ");
		String userName = req.getParameter("userName");
		String userPassword = req.getParameter("userPassword");
		if(userName.equals("홍길동") && userPassword.equals("1234")) {
			out.print("<b> 로그인 성공");
		}else {
			out.print("<b> 로그인 정보가 일치하지 않습니다.");
		}
		
		out.close();
	}
}
