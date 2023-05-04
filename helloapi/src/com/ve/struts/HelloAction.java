package com.ve.struts;

public class HelloAction {
	
	private String uname;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String execute()
	{
		return "wish";
	}

}
