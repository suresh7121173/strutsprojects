package com.ve.struts.register;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private String uid;
	private String uname;
	private String email;
	private String mobile;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String execute() throws Exception
	{
		String status="";
		EmployeeService e=new EmployeeService();
		status=e.registration(uid,uname,email,mobile);
		
		return status;
	}

}
