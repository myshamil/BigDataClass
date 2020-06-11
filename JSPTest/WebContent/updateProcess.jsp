<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url ="jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url,"scott", "1234");
	
	String strSql= "UPDATE EMPLOYEE SET NAME=?, EMAIL=? WHERE ID=?";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	stmt.setString(1, name);
	stmt.setString(2, email); 
	stmt.setInt(3, Integer.parseInt(id));
	stmt.executeUpdate();
	stmt.close();
	
 	response.sendRedirect("list.jsp");
	



%>
