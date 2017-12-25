package com.im.success.service;

import java.util.List;

import com.im.success.system.model.SystemMenuVO;

public interface ISystemMenuService  extends IIMBaseService{

	
	public List<SystemMenuVO> getSystemMenuList() throws Exception;
	
	public String getMenuActionUrl(String menu_ID) throws Exception;
	
	
}
