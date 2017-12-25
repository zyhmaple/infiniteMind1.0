package com.im.success.advertorder.model;

import com.im.success.entity.EntityVOAnnotation;

/**
 * 订单查询VO
 * @author zyh
 *
 */
@EntityVOAnnotation(alias = "订单查询扩展VO")
public class AdvertOrderSearchVO extends AdvertOrderVO {

	private static final long serialVersionUID = -8821639549404795010L;

	@EntityVOAnnotation(alias = "广告主名称")
	private  String ado_AdvertName;
	
	@EntityVOAnnotation(alias = "代理商名称")
	private  String ado_AgentName;
	
	@EntityVOAnnotation(alias = "订单标签名称")
	private  String ado_LabelName;
	
	@EntityVOAnnotation(alias = "广告主电话")
	private  String ado_MobilePhone;

	public String getAdo_AdvertName() {
		return ado_AdvertName;
	}

	public void setAdo_AdvertName(String ado_AdvertName) {
		this.ado_AdvertName = ado_AdvertName;
	}

	public String getAdo_AgentName() {
		return ado_AgentName;
	}

	public void setAdo_AgentName(String ado_AgentName) {
		this.ado_AgentName = ado_AgentName;
	}

	public String getAdo_LabelName() {
		return ado_LabelName;
	}

	public void setAdo_LabelName(String ado_LabelName) {
		this.ado_LabelName = ado_LabelName;
	}

	public String getAdo_MobilePhone() {
		return ado_MobilePhone;
	}

	public void setAdo_MobilePhone(String ado_MobilePhone) {
		this.ado_MobilePhone = ado_MobilePhone;
	}
	

}
