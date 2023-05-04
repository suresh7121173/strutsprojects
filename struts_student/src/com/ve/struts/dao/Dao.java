package com.ve.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ve.struts.bean.Sstudents;


public class Dao {
	
	Connection con;
	ResultSet rs;
	int s;
	
	public Connection getMyConnection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.230:1521:orcl", "training", "training");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public ResultSet getAllStudents() 
	{
		con=getMyConnection();
		String sql="select * from sstudents";
	
			PreparedStatement ps;
			try {
				ps = con.prepareStatement(sql);
				 rs=ps.executeQuery();
		
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return rs;
				
	 }
	
	public int insertStudent(int id,String name,String email,String country)
	{
		
		
		String sql="insert into sstudents values(?,?,?,?)";
		con=getMyConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, country);
			s=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return s;
		
	
	}
	public ResultSet getStudentById(int id)
	{
		String sql="select * from sstudents where id=?";
		con=getMyConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
	}
    
	public int updateStudent(int id,String name,String email,String country)
	{
		String sql="update sstudents set name=?, email=?, country=? where id=?";
		con=getMyConnection();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, country);
			ps.setInt(4, id);
			
			s=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return s;
	}
	
	public int deleteStudent(int id)
	{
		
		String sql="delete sstudents where id=?";
		con=getMyConnection();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1, id);
			s=ps.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return s;
	}
}
