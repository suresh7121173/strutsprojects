package com.ve.struts.login;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	private String uname;
	private String pwd;
	private String message="";
	
	
	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String execute() throws Exception {
		
		String result;
		if(uname.equals("venky") && pwd.equals("venky"))
		{
			result=SUCCESS;
			message=" ";
		}
		else
		{
			result=ERROR;
			message="username and password are incorect";
		}
		return result;
	}

}
