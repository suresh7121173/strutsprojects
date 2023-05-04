package com.ve.struts.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ve.struts.bean.Sstudents;
import com.ve.struts.dao.Dao;

public class UpdateProcess extends ActionSupport {


	private int id;
	private String name,email,country;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}

	//******************************FOR DAO*****************************************

	Dao d=new Dao();


	public Dao getD() {
		return d;
	}



	public void setD(Dao d) {
		this.d = d;
	}


	//**********************************RESULTSET AND STUDENT AND LIST<STUDENT>**********************************************


	ResultSet rs;
	Sstudents st;
	List<Sstudents> ls=new ArrayList<Sstudents>();



	public ResultSet getRs() {
		return rs;
	}



	public void setRs(ResultSet rs) {
		this.rs = rs;
	}



	public Sstudents getSt() {
		return st;
	}



	public void setSt(Sstudents st) {
		this.st = st;
	}



	public List<Sstudents> getLs() {
		return ls;
	}



	public void setLs(List<Sstudents> ls) {
		this.ls = ls;
	}


	//**********************************************************************************************

	@Override
	public String execute() throws Exception
	{
		int a=d.updateStudent(id, name, email, country);

		rs=d.getAllStudents();
		if(rs!=null)
		{
			try
			{
				while(rs.next())
				{
					st=new Sstudents();
					st.setId(rs.getInt(1));
					st.setName(rs.getString(2));
					st.setEmail(rs.getString(3));
					st.setCountry(rs.getString(4));

					ls.add(st);

				}
			} 
			catch (Exception e)
			{

				e.printStackTrace();
			}

		}

		if(a>0)
		{
			return "success";
		}
		else
		{
			return "failure";
		}

	}
}
