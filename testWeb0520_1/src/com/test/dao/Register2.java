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
	//�ֵ� ������ 
	//*CRUD Create Retrieve Update Delete <-���ø����̼� ����
	//SELECT
	//VIEW
	//INSERT
	//UPDATE
	//DELETE 
	public static Connection getConnection()
			throws NamingException, SQLException {
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
		return ds.getConnection(); //Ŀ�ؼ� ��ü�� ���ϵǴ°�!
	}
	public static List<Register> getAllRecords() throws NamingException, SQLException{ //���Ƿ� ���� ��, �����ΰ� �ٸ������� ��� ��밡��
		Connection conn = getConnection();
		String strSql = "SELECT * FROM REGISTER";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		ResultSet rs = stmt.executeQuery();
		List<Register> list= new ArrayList<Register>(); //������ ������ش�
		while (rs.next()) { //Ŀ���� �ű�� �а� ��
			//����Ʈ�� �������� Ÿ���̶� 
			Register r= new Register();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setPassword(rs.getString("password"));
			r.setEmail(rs.getString("Email"));
			r.setSex(rs.getString("sex"));
			r.setCountry(rs.getString("COUNTRY"));
			
			list.add(r); //����Ʈ�� �߰�
			
		}
		return null;
	}
	
	
}
