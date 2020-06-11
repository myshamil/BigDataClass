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
	
	String name ="";
	String email="";
	while(rs.next()){
		name = rs. getString ("name");
		email= rs. getString("email");
	}
	rs.close();
	conn.close();


%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateProcess.jsp" method="get">
사번 : <input type= "text" name= "id" value = "<%=id%>"><br>
이름 : <input type= "text" name= "name" value = "<%=name%>"><br>
이메일 : <input type= "text" name= "email" value = "<%=email%>"><br>
<input type="submit" value = "저장">
<input type="reset" value = "재입력">

</form>
</body>
</html>