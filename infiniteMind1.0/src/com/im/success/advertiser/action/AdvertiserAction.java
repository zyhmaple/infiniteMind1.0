package com.im.success.advertiser.action;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.im.success.advertiser.form.AdvertiserForm;
import com.im.success.advertiser.model.AdvertiserSearchVO;
import com.im.success.advertiser.model.AdvertiserVO;
import com.im.success.pub.util.ConstantUtil;
import com.im.success.service.IAdvertiserService;
import com.zyh.maple.fm.util.FmUuidUtils;

@Scope("request")
@Controller
public class AdvertiserAction extends AdvertiserForm{

	private static final long serialVersionUID = -3279010348294307042L;
	
	@Autowired
	private IAdvertiserService adrService;
	
	private List<AdvertiserSearchVO> searchList;
	
	private Map<String,String> agentDropListMap;
	
	private Map<String,String> advertDropListMap;
	
	
	public String createAdr() throws Exception{
		if(this.getAdr_Name()==null||ConstantUtil.EmptyStr.equals(this.getAdr_Name().trim()))
		return SUCCESS;
		
		int result = adrService.insert(formatForm());
		
		return result ==1 ?SUCCESS:ERROR;
		
	}

	public String updateAdr() throws Exception{
		
		int result = adrService.update(formatForm());
		
		return result ==1 ?SUCCESS:ERROR;
		
	}
	
	public String deleteAdr() throws Exception{
		
		int result = adrService.delete(formatForm());
		
		return result ==1 ?SUCCESS:ERROR;
		
	}
	
	/**
	 * 查询代理商或广告主，初始化加载
	 * @return
	 * @throws Exception 
	 */
	public String getAgentOrAdr() throws Exception{
		
		AdvertiserVO searchVo = new AdvertiserVO();
		searchVo.setAdr_Type(this.getAdr_Type());
		
		setSearchList((List)adrService.queryList(searchVo));
		
		if(this.getAdr_Type()!=null && ConstantUtil.Byte_One==this.getAdr_Type())
			this.agentDropListMap = new HashMap<String, String>();
		else
			this.advertDropListMap = new HashMap<String, String>();
		

		for(int i=0;i<this.searchList.size();i++){
			AdvertiserSearchVO tempAdr =searchList.get(i);
			
			String id=tempAdr.getAdr_ID();
			String name=tempAdr.getAdr_Name();
			Byte type=this.getAdr_Type();
			String agentName=tempAdr.getAdr_AgentName();
			
			if(type!=null&&type==ConstantUtil.Byte_One)
			{//只查代理
				agentDropListMap.put(id,name);
			}else
			{
				advertDropListMap.put(id,name+","+agentName);
			}
		}
		
		
		return SUCCESS;
	}
	
	/**
	 * 条件查询广告主
	 * @return
	 */
	public String getAdvertiser(){
		
		return SUCCESS;
	}
	
	public String queryAll() throws Exception{
		
		setSearchList((List)adrService.queryAll());
		
		return SUCCESS;
	}
	private AdvertiserVO formatForm() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		AdvertiserVO adrVO = new AdvertiserVO();
		if(this.getAdr_ID()==null)
			this.setAdr_ID(FmUuidUtils.getFmUuid());
		
		for(Field field:adrVO.getClass().getDeclaredFields())
		{
			field.setAccessible(true);
			Field tpField =this.getClass().getSuperclass().getDeclaredField(field.getName());
			if (("serialVersionUID").equals(field.getName())||tpField == null)
				continue;
			tpField.setAccessible(true);
			field.set(adrVO, tpField.get(this));

		}

		return adrVO;
	}

	public List<AdvertiserSearchVO> getSearchList() {
		return searchList;
	}


	public void setSearchList(List<AdvertiserSearchVO> searchList) {
		this.searchList = searchList;
	}

	public Map<String, String> getAgentDropListMap() {
		return agentDropListMap;
	}

	public Map<String, String> getAdvertDropListMap() {
		return advertDropListMap;
	}

	public void setAgentDropListMap(Map<String, String> agentDropListMap) {
		this.agentDropListMap = agentDropListMap;
	}

	public void setAdvertDropListMap(Map<String, String> advertDropListMap) {
		this.advertDropListMap = advertDropListMap;
	}


	
}
