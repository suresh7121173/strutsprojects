package com.ve.struts.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.ve.struts.bean.Sstudents;
import com.ve.struts.dao.Dao;

public class StudentUpdate extends ActionSupport {

	Dao d=new Dao();

	int id;

	Sstudents s;


	public Sstudents getS() {
		return s;
	}


	public void setS(Sstudents s) {
		this.s = s;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Dao getD() {
		return d;
	}


	public void setD(Dao d) {
		this.d = d;
	}


	@Override
	public String execute() throws Exception
	{

		System.out.println("the id is"+id);
		
		ResultSet rs=d.getStudentById(id);
		if(rs!=null)
		{
			while(rs.next())
			{
				s=new Sstudents();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setCountry(rs.getString(4));
			}
			System.out.println("hello"+s.toString());
			return "success";
             
		}

		else
		{
			return "failure";
		}
	}


}
