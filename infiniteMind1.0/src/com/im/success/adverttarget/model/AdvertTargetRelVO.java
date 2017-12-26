package com.im.success.adverttarget.model;

import com.im.success.entity.EntityVOAnnotation;

public class AdvertTargetRelVO {

	@EntityVOAnnotation(alias = "广告目标维度ID,hashcode存放")
	private String adt_ID;
	
	@EntityVOAnnotation(alias = "上级维度ID")
	private String adt_Parent_ID;
	
	public String getAdt_ID() {
		return adt_ID;
	}


	public void setAdt_ID(String adt_ID) {
		this.adt_ID = adt_ID;
	}


	public String getAdt_Parent_ID() {
		return adt_Parent_ID;
	}


	public void setAdt_Parent_ID(String adt_Parent_ID) {
		this.adt_Parent_ID = adt_Parent_ID;
	}



	
	
	
}
