package com.im.success.system.form;

import com.opensymphony.xwork2.ActionSupport;

public class SystemMenuForm extends ActionSupport{

	private static final long serialVersionUID = 8460418300751337322L;
	
	private String jsonMenu;

	public String getJsonMenu() {
		return jsonMenu;
	}

	public void setJsonMenu(String jsonMenu) {
		this.jsonMenu = jsonMenu;
	}
	
	

}
