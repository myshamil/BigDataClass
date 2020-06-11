package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.test.beans.Register;

public class Register2 {
	//주된 로직들 
	//*CRUD Create Retrieve Update Delete <-어플리케이션 레벨
	//SELECT
	//VIEW
	//INSERT
	//UPDATE
	//DELETE 
	public static Connection getConnection()
			throws NamingException, SQLException {
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
		return ds.getConnection(); //커넥션 객체로 리턴되는것!
	}
	public static List<Register> getAllRecords() throws NamingException, SQLException{ //임의로 만든 것, 만들어두고 다른곳에서 계속 사용가능
		Connection conn = getConnection();
		String strSql = "SELECT * FROM REGISTER";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		ResultSet rs = stmt.executeQuery();
		List<Register> list= new ArrayList<Register>(); //공간을 만들어준다
		while (rs.next()) { //커서를 옮기며 읽게 함
			//리스트가 레지스터 타입이라 
			Register r= new Register();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setPassword(rs.getString("password"));
			r.setEmail(rs.getString("Email"));
			r.setSex(rs.getString("sex"));
			r.setCountry(rs.getString("COUNTRY"));
			
			list.add(r); //리스트에 추가
			
		}
		return null;
	}
	
	
}
