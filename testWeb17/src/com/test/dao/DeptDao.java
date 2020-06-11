package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.beans.Dept;

public class DeptDao {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:company";
		Connection conn = 
			DriverManager.getConnection(url, "scott", "1234");
		return conn;
	}
	public static List<Dept> getAllRecords() throws ClassNotFoundException, SQLException{
		List<Dept> depts = new ArrayList<Dept>();
		Connection conn = getConnection();
		String strSql = "SELECT * FROM DEPT ORDER BY DEPT_ID DESC";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Dept d = new Dept();
			d.setDeptId(rs.getInt("DEPT_ID"));
			d.setDeptName(rs.getString("DEPT_NAME"));
			d.setLocId(rs.getInt("LOC_ID"));
			depts.add(d);
		}
		return depts;
	}
	public static Dept getRecordById(int dept_id) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		String strSql = "SELECT * FROM DEPT WHRERE DEPT_ID=?";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		stmt.setInt(1, dept_id);
		ResultSet rs = stmt.executeQuery();
		Dept d = null;
		while(rs.next()) {
			d= new Dept();
			d.setDeptId(rs.getInt("DEPT_ID"));
			d.setDeptName(rs.getString("DEPT_NAME"));
			d.setLocId(rs.getInt("LOC_ID"));
		}
		return null;
	}
	public static int save(Dept d) throws SQLException, ClassNotFoundException {
		Connection conn = getConnection();
		String strSql = "INSERT INTO DEPT VALUES(?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		stmt.setInt(1,d.getDeptId()); //?값 받아와서 형식 맞춰줘야함.
		stmt.setString(2, d.getDeptName());
		stmt.setInt(3, d.getLocId());
		int ret= stmt.executeUpdate();
		return ret;
	}
	public static int delete(int dept_id) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		String strSql = "DELETE FROM DEPT WHERE DEPT_ID = ?";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		stmt.setInt(1, dept_id);
		int ret= stmt.executeUpdate();
		return ret;
	}
	public static int update(Dept d) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		String strSql = "UPDATE DEPT SET DEPT_NAME=?," + "LOC_ID=? WHRER DEPT_ID=?";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		stmt.setString(1, d.getDeptName());
		stmt.setInt(2, d.getLocId());
		stmt.setInt(3, d.getDeptId()); 	
		int ret= stmt.executeUpdate();
		return ret;
	}
}
	


