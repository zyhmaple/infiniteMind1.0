package com.im.success.adverttarget.action;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.im.success.adverttarget.form.AdvertTargetForm;
import com.im.success.adverttarget.model.AdvertTargetRelVO;
import com.im.success.adverttarget.model.AdvertTargetVO;
import com.im.success.adverttarget.model.AdvertTargetVO2;
import com.im.success.entity.IEntityVO;
import com.im.success.pub.util.ConstantUtil;
import com.im.success.service.IAdvertTargetService;

@Scope("request")
@Controller
public class AdvertTargetAction extends AdvertTargetForm {

	private static final long serialVersionUID = -5233402051618489610L;
	
	private final Logger loggor = LoggerFactory.getLogger(AdvertTargetAction.class);
	
	@Autowired
	private IAdvertTargetService adtService;
	
	
	/**
	 * 展示 Adt 面板
	 * @return
	 * @throws Exception 
	 */
	public String showAdvertTarget() throws Exception
	{
		if(this.getExpandTree()!=null)
			this.setExpandTree(URLDecoder.decode(this.getExpandTree(),"UTF-8"));
		this.setJsonTree(URLEncoder.encode(getListToJsonTree().toJSONString(),"UTF-8"));
		if(this.getExpandTree()!=null)
			this.setExpandTree(URLEncoder.encode(this.getExpandTree(),"UTF-8"));
		return SUCCESS;
	}
	
	/**
	 * 展示 Adt 面板
	 * @return
	 * @throws Exception 
	 */
	public String show2AdvertTarget() throws Exception
	{
/*		if(this.getExpandTree()!=null)
			this.setExpandTree(URLDecoder.decode(this.getExpandTree(),"UTF-8"));
		this.setJsonTree(URLEncoder.encode(getListToJsonTree().toJSONString(),"UTF-8"));
		if(this.getExpandTree()!=null)
			this.setExpandTree(URLEncoder.encode(this.getExpandTree(),"UTF-8"));*/
		return SUCCESS;
	}
	
	/**
	 * Create Adt
	 * @return
	 * @throws Exception
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.SERIALIZABLE)
	public String createAdvertTarget() throws Exception{
		
		if(!isValidAdt()) return SUCCESS;
		
		int result = adtService.insert(formVO());
		 adtService.inserts(formVO2());
		
		
		return (result==1) ? showAdvertTarget() : ERROR ;
	}
	
	/**
	 * Edit Adt
	 * @return
	 * @throws Exception
	 */
	public String editAdvertTarget() throws Exception{
		
		if(!isValidAdt()) return SUCCESS;
		
		int result = adtService.update(formVO());

		
		return (result==1) ? showAdvertTarget() : ERROR ;
	}
	
	/**
	 * Delete Adt
	 * @return
	 * @throws Exception
	 */
	public int deleteAdvertTarget() throws Exception{

		if(!isValidAdt()) return 0;
		
		int result = adtService.delete(formVO());
		

		return result;
	}
	

	/**
	 * FormVo to AdtVO
	 * @return
	 */
	public AdvertTargetVO formVO()
	{
		if(!isValidAdt()) return null;
		
		AdvertTargetVO adt = new AdvertTargetVO();

		//目录
		if(ConstantUtil.Byte_Zero.equals(this.getAdt_Type())){
			adt.setAdt_CatalogLevel((byte)1);
		}
		else{
			adt.setAdt_CatalogLevel(this.getAdt_Type());
		}

		adt.setAdt_ID(this.getAdt_ID());//目标属性，手动输入
		adt.setAdt_Name(this.getAdt_Name());
		adt.setAdt_Parent_ID(this.getAdt_Parent_ID());

		adt.setAdt_IsMatch(this.getAdt_IsMatch()==null ? 0 : this.getAdt_IsMatch());

		return adt;
	}
	
	/**
	 * FormVo to AdtVO
	 * @return
	 */
	public List<Object> formVO2()
	{
		if(!isValidAdt()) return null;
		
		List<Object> list = new ArrayList<Object>();
		
		AdvertTargetVO2 adt = new AdvertTargetVO2();

		//目录
		if(ConstantUtil.Byte_Zero.equals(this.getAdt_Type())){
			adt.setAdt_CatalogLevel((byte)1);
		}
		else{
			adt.setAdt_CatalogLevel(this.getAdt_Type());
		}

		adt.setAdt_ID(this.getAdt_ID());//目标属性，手动输入
		adt.setAdt_Name(this.getAdt_Name());
		
		list.add(adt);
		
		//新增子节点，自己到自己的关系
		AdvertTargetRelVO adtRel = new AdvertTargetRelVO();
		adtRel.setAdt_Parent_ID(this.getAdt_Parent_ID());

		adtRel.setAdt_ID(this.getAdt_ID());
		
		list.add(adtRel);
		return list;
	}
	
	public String produceAdtID(String adt_Name){
		String result = "";//adt_Name.hashCode();
		
		return result;
	}
	
	
	public String tryAdvertTarget(){

		
		return ERROR;
	}
	
	private boolean isValidAdt(){
		
		if(this.getAdt_ID() == null) return false;
		
		if(ConstantUtil.EmptyStr.equals(this.getAdt_Name())) return false;
		
		return true;
		
	}
	
	public String getAdtList() throws Exception
	{
		this.setJsonTree(getListToJsonTree().toJSONString());
		
		return SUCCESS;
	}

	@SuppressWarnings("unchecked")
	private JSONArray getListToJsonTree() throws Exception {
		@SuppressWarnings("rawtypes")
		List adtList = adtService.queryAll();
		
		//默认从根目录【id:0】递归
		JSONArray json = assembleJqTree(adtList,ConstantUtil.Byte_Zero.toString());
		
		return json;
	}
	
	@SuppressWarnings("unchecked")
	private JSONArray assembleJqTree(List<AdvertTargetVO> adtlist,String parentId){
		
		Iterator<AdvertTargetVO>  adtItr = adtlist.iterator();
		
		JSONArray jsonbranch = new JSONArray();
		
		while(adtItr.hasNext())
		{
			AdvertTargetVO adt = adtItr.next();
			
			if(parentId.equals(adt.getAdt_Parent_ID()))
			{	//find child,不存在叶和目录工程

				if(ConstantUtil.Byte_NintyNine == adt.getAdt_CatalogLevel())
				{	//叶节点
					JSONObject leaf = new JSONObject();
					leaf.put("id", adt.getAdt_ID());
					leaf.put("text", adt.getAdt_Name());
					if(getNodeExpand(parentId))
						leaf.put("expand","on");
					else
						leaf.put("expand","off");
					jsonbranch.add(leaf);
				}
				else
				{	//目录
					JSONObject catalog = new JSONObject();
					catalog.put("id", adt.getAdt_ID());
					catalog.put("text", adt.getAdt_Name());
					if(getNodeExpand(adt.getAdt_ID()))
						catalog.put("expand","on");
					else
						catalog.put("expand","off");
					catalog.put("nodes", assembleJqTree(adtlist,adt.getAdt_ID()));
					jsonbranch.add(catalog);
				}
				//adtItr.remove();

			}
		}
		
		return jsonbranch;	

	}

	
	public boolean getNodeExpand(String nodeId)
	{
		if(this.getExpandTree()==null || "".equals(this.getExpandTree()))
			return false;
		
		JSONArray expandTree =  (JSONArray) JSONValue.parse(this.getExpandTree());
		
		for(int i=0 ;i<expandTree.size(); i++)
		{
			JSONObject node = (JSONObject) expandTree.get(i);
			if(node.containsValue("span_"+nodeId))
				return true;
		}
		return false;
	}
}
