package com.ve.struts.models;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ve.struts.bean.Sstudents;
import com.ve.struts.dao.Dao;

public class Home extends ActionSupport {

	ResultSet rs;
	Sstudents st;
	List<Sstudents> ls=new ArrayList<Sstudents>();
	Dao d=new Dao();
	
	
	
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



	public Dao getD() {
		return d;
	}



	public void setD(Dao d) {
		this.d = d;
	}


//***************************************************************************
	
	
	@Override
	public String execute() throws Exception
	{
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
		return "success";

	}
}