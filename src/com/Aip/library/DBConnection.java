package com.Aip.library;

import java.sql.*;

public class DBConnection {
	
	public static void inserData(String addmNo, String name, String dob, String gender, String sclass, String fname, String mname, String contactno, String address)
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "shadow");
			String query = "insert into studentManagement values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, addmNo);
			pstmt.setString(2, name);
			pstmt.setString(3, dob);
			pstmt.setString(4, gender);
			pstmt.setString(5, sclass);
			pstmt.setString(6, fname);
			pstmt.setString(7, mname);
			pstmt.setString(8, contactno);
			pstmt.setString(9, address);
			pstmt.executeUpdate();
			con.close();
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void updateData(String addmNo, String name, String dob, String gender, String sclass, String fname, String mname, String contactno, String address)
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "shadow");
			String query = "update studentManagement set sName=?,dob=?,gender=?,stClass=?,fName=?,mName=?,conNo=?,address=? where addmNo=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, dob);
			pstmt.setString(3, gender);
			pstmt.setString(4, sclass);
			pstmt.setString(5, fname);
			pstmt.setString(6, mname);
			pstmt.setString(7, contactno);
			pstmt.setString(8, address);
			pstmt.setString(9, addmNo);
			pstmt.executeUpdate();
			con.close();
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void deleteData(String addmNo)
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "shadow");
			String query = "delete from studentManagement where addmNo=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, addmNo);
			pstmt.executeUpdate();
			con.close();
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
