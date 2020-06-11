<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>
<%
	String id=request.getParameter("id");

 	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url, "scott", "1234"); 

	String strSql = "SELECT * FROM EMPLOYEE WHERE ID = ?";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	stmt.setString(1, id);
	ResultSet rs = stmt.executeQuery();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% while(rs.next()){ 
	%>
	<table border = "1">
	<tr>
		<td>사번</td><td><%=rs.getString("ID") %></td>	
	</tr>
	<tr>
		<td>이름</td><td><%=rs.getString("NAME") %></td>	
	</tr>
	<tr>
		<td>이메일</td><td><%=rs.getString("EMAIL") %></td>	
	</tr>
	</table>
	<%}%>
	<br>
	<a href="list.jsp">목록</a>&nbsp;
	<a href="update.jsp?id=<%=id %>">수정</a>&nbsp;
	<a href="delete.jsp?id=<%=id %>">삭제</a>
</body>

</body>
</html>