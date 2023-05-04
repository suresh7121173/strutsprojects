package com.ve.struts.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class EmployeeService {
	
	Connection con;
	Statement st;
	ResultSet rs;
	String status="";
	public EmployeeService()
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.230:1521:orcl", "training", "training");
			st=con.createStatement();
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	 public String registration(String uid,String uname,String email,String mobile)
	 {
	
		 try {
			rs=st.executeQuery("select * from registers where userid='"+uid+"'");
			Boolean s=rs.next();
			if(s==true)
			{
				st.executeUpdate("update registers set uname='"+uname+"' where userid='"+uid+"'");
				status="existed";
			}
			else
			{
				st.executeUpdate("insert into registers values('"+uid+"','"+uname+"','"+email+"','"+mobile+"')");
				status="success";
			}
		} 
		 catch (Exception e) {
			
			status="failure";
			e.printStackTrace();
		}
		 
		 
		 return status;
	 }

}
