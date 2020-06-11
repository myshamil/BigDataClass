<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.test.dao.*"%>
<%@ page import="com.test.beans.*"%>
<%		
	/* InitialContext ic = new InitialContext();
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	Connection conn = ds.getConnection(); */
/*	Connection conn = RegisterDao.getConnection();
 	String strSql = "SELECT * FROM REGISTER";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	ResultSet rs = stmt.executeQuery();*/
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<table border="1">
	<tr>
		<td>번호</td><td>이름</td><td>암호</td><td>이메일</td><td>성별</td><td>국가</td>
	</tr>
<%	
	List<Register> list = RegisterDao.getAllRecords();
	for(Register r : list){
	%>	
 
		<tr>
			<td><%=r.getId()%></td>
			<td><%=r.getName()%></td>
			<td><%=r.getPassword()%></td>	
			<td><%=r.getEmail()%></td>		
			<td><%=r.getSex()%></td>	
			<td><%=r.getCountry()%></td>	
		</tr>
	<% 
	}
	%>
	</table>
</html>