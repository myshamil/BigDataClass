<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.beans.*"%>
<%@ page import="com.test.dao.*"%>
<%@ page import="java.util.*"%>
<%
 /* 	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = 
		DriverManager.getConnection(url, "scott", "1234");
	String strSql = "SELECT * FROM DEPT_ID";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	ResultSet rs = stmt.executeQuery(); */ 
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<Dept> depts = DeptDao.getAllRecords();
	for(Dept d : depts){
%>
	<%=d.getDeptId()%>	
	<%=d.getDeptName()%>	
	<%=d.getLocId()%><br>	
<%	}%>

	<%-- <%
	while(rs.next()){
	%>
		<%=rs.getString("DEPT_ID") %>
		<%=rs.getString("DEPT_NAME") %>
		<%=rs.getString("LOC_ID") %>
	
	<%
	}
	
	
	%> --%>

</body>
</html>