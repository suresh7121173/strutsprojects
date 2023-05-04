package com.ve.struts.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ve.struts.bean.Sstudents;
import com.ve.struts.dao.Dao;

public class TestClass {

	public static void main(String[] args) throws Exception {

		Dao d=new Dao();
		ResultSet rs;
		List<Sstudents> s=new ArrayList<Sstudents>();
		
		
		rs=d.getAllStudents();
		while(rs.next())
		{
			s.add(new Sstudents(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			System.out.println(rs.getInt(1)+rs.getString(2));
		}
		for(Sstudents v:s)
		{
			System.out.println("hello");
			v.toString();
		}
		System.out.println("hsdello");
	}

}
