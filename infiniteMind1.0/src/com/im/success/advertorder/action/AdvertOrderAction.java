package com.im.success.advertorder.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.im.success.advertorder.form.AdvertOrderForm;
import com.im.success.advertorder.model.AdvertOrderMPExtendVO;
import com.im.success.advertorder.model.AdvertOrderVO;
import com.im.success.entity.IAdvertOrderVO;
import com.im.success.entity.IEntityVO;
import com.im.success.pub.util.ConstantUtil;
import com.im.success.service.IAdvertOrderService;

@Scope("request")
public class AdvertOrderAction extends AdvertOrderForm {

	private static final long serialVersionUID = 8243872710225896268L;
	
	@Autowired
	public IAdvertOrderService adoService ;
	
	
	public String createAdoBill() throws Exception
	{
		if(this.getAdo_PlatType()==null||ConstantUtil.EmptyStr.equals(this.getAdo_PlatType()))
				return SUCCESS;
		
		adoService.insert(formatFrom());
		
		return SUCCESS;
	}
	
	public String editAdoBill() 
	{
		
		return SUCCESS;
	}
	
	public String listAdoBill()
	{
		return SUCCESS;
	}
	
	public IEntityVO formatFrom()
	{
		AdvertOrderVO returnVO = null;
		
		
		if(this.getAdo_PlatType()<ConstantUtil.PlatType_PC)
		{
			
		}else if(this.getAdo_PlatType()<ConstantUtil.PlatType_MP)
		{
			returnVO = new AdvertOrderMPExtendVO();
			((AdvertOrderMPExtendVO)returnVO).setAdo_OsType(this.getAdo_OsType());
			((AdvertOrderMPExtendVO)returnVO).setAdo_NetType(this.getAdo_NetType());
			((AdvertOrderMPExtendVO)returnVO).setAdo_DmpOrderId(this.getAdo_DmpOrderId());
			((AdvertOrderMPExtendVO)returnVO).setAdo_DmpOrderName(this.getAdo_DmpOrderName());
			
		}else if(this.getAdo_PlatType()<ConstantUtil.PlatType_OTT)
		{
			
		}
		
		//订单基础信息
		returnVO.setAdo_ID(this.getAdo_ID());
		returnVO.setAdo_Name(this.getAdo_Name());
		returnVO.setAdo_PlatType(this.getAdo_PlatType());
		returnVO.setAdo_BeginDate(this.getAdo_BeginDate());
		returnVO.setAdo_EndDate(this.getAdo_EndDate());
		returnVO.setAdo_Adg_ID(this.getAdo_Adr_ID());
		returnVO.setAdo_FreqTarget(this.getAdo_FreqTarget());
		returnVO.setAdo_FreqCyc(this.getAdo_FreqCyc());
		returnVO.setAdo_Frequency(this.getAdo_Frequency());
		returnVO.setAdo_IsAdd(this.getAdo_IsAdd());
		returnVO.setAdo_AddAdo_ID(this.getAdo_AddAdo_ID());
		returnVO.setAdo_AddDate(this.getAdo_AddDate());
		returnVO.setAdo_Priority(this.getAdo_Priority());
		returnVO.setAdo_Status(this.getAdo_Status());
		returnVO.setAdo_Status_Desc(this.getAdo_Status_Desc());
		returnVO.setAdo_Switch(this.getAdo_Switch());
		returnVO.setAdo_CreateTime(this.getAdo_CreateTime());
		returnVO.setAdo_UpdateTime(this.getAdo_UpdateTime());
		returnVO.setAdo_IsDele(this.getAdo_IsDele());
		
		return returnVO;
	}

	
}
