package com.im.success.system.model;

import java.io.Serializable;

public class SystemMenuVO implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	
	
	private String menu_ID;
	
	private String menu_Name;
	
	private String menu_Action;
	
	private String menu_PID;
	
	private String menu_Sequence;

	public String getMenu_ID() {
		return menu_ID;
	}

	public void setMenu_ID(String menu_ID) {
		this.menu_ID = menu_ID;
	}

	public String getMenu_Name() {
		return menu_Name;
	}

	public void setMenu_Name(String menu_Name) {
		this.menu_Name = menu_Name;
	}

	public String getMenu_Action() {
		return menu_Action;
	}

	public void setMenu_Action(String menu_Action) {
		this.menu_Action = menu_Action;
	}

	public String getMenu_PID() {
		return menu_PID;
	}

	public void setMenu_PID(String menu_PID) {
		this.menu_PID = menu_PID;
	}

	public String getMenu_Sequence() {
		return menu_Sequence;
	}

	public void setMenu_Sequence(String menu_Sequence) {
		this.menu_Sequence = menu_Sequence;
	}
	
}
