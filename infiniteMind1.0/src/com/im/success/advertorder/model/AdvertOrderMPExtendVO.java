package com.im.success.advertorder.model;

import com.im.success.entity.EntityVOAnnotation;

/**
 * MobilePhone 平台订单
 * @author zyh
 *
 */
@EntityVOAnnotation(alias = "MP移动平台订单")
public class AdvertOrderMPExtendVO extends AdvertOrderVO {


	private static final long serialVersionUID = -6674515672630521128L;

	@EntityVOAnnotation(alias = "移动操作系统类型")
	private String ado_OsType;
	
	@EntityVOAnnotation(alias = "移动网络类型")
	private String ado_NetType;
	
	@EntityVOAnnotation(alias = "DMP订单id")
	private String ado_DmpOrderId;
	
	@EntityVOAnnotation(alias = "DMP订单名称")
	private String ado_DmpOrderName;

	public String getAdo_OsType() {
		return ado_OsType;
	}

	public void setAdo_OsType(String ado_OsType) {
		this.ado_OsType = ado_OsType;
	}

	public String getAdo_NetType() {
		return ado_NetType;
	}

	public void setAdo_NetType(String ado_NetType) {
		this.ado_NetType = ado_NetType;
	}

	public String getAdo_DmpOrderId() {
		return ado_DmpOrderId;
	}

	public void setAdo_DmpOrderId(String ado_DmpOrderId) {
		this.ado_DmpOrderId = ado_DmpOrderId;
	}

	public String getAdo_DmpOrderName() {
		return ado_DmpOrderName;
	}

	public void setAdo_DmpOrderName(String ado_DmpOrderName) {
		this.ado_DmpOrderName = ado_DmpOrderName;
	}

}
