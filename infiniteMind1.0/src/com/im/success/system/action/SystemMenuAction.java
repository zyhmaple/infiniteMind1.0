package com.im.success.system.action;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.im.success.pub.util.ConstantUtil;
import com.im.success.service.ISystemMenuService;
import com.im.success.system.form.SystemMenuForm;
import com.im.success.system.model.SystemMenuVO;

@Scope("request")
@Controller
public class SystemMenuAction extends SystemMenuForm{

	private static final long serialVersionUID = -3504704853624092515L;
	
	@Autowired
	private ISystemMenuService systemMenuService;
	
	
	public String showMenu(){
		
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String getSystemMenuList() throws Exception
	{
		List<SystemMenuVO> list = systemMenuService.getSystemMenuList();
		
		JSONArray array = new JSONArray();
		
		for(SystemMenuVO menu:list)
		{
			if(ConstantUtil.Byte_Zero.toString().equals(menu.getMenu_PID()))
			{//menu 第一层
				JSONObject obj = new JSONObject();
				obj.put("menu_id", menu.getMenu_ID());
				obj.put("menu_name", menu.getMenu_Name());
				obj.put("menu_action",  menu.getMenu_Action());
				JSONArray nodes = findChildren(list,menu.getMenu_ID());
				if(nodes!=null)
					obj.put("menu_nodes",nodes);
				array.add(obj);
			}
		}
		
		this.setJsonMenu(array.toJSONString());
		
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public JSONArray findChildren(List<SystemMenuVO> list,String pid){
		
		JSONArray array = new JSONArray();
		
		for(SystemMenuVO menu:list)
		{
			if(pid.equals(menu.getMenu_PID())){
				
				JSONObject obj = new JSONObject();
				obj.put("menu_id", menu.getMenu_ID());
				obj.put("menu_name", menu.getMenu_Name());
				obj.put("menu_action",  menu.getMenu_Action());
				array.add(obj);
			}
		}
		if(array.size()>0)
			return array;
		else
			return null;
	}

}
