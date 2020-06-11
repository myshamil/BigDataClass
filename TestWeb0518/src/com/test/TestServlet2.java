package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletContext sc = this.getServletContext();
		String userName = sc.getInitParameter("userName");
		out.print(userName);
		Student stu = (Student)sc.getAttribute("student1"); //타입 캐스팅을 안하면 오브젝트 객체라 뽑아낼 수 없음
		out.print(stu.getName()+ ", "+ stu.getAge());
		out.close();
	}

}
