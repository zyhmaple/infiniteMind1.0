package com.im.success.adverttarget.model;

import java.io.Serializable;

import com.im.success.entity.EntityVOAnnotation;
import com.im.success.entity.IEntityVO;

/**
 * 广告目标对象维度属性,即广告位面对人群属性
 * @author zyh
 *
 */
public class AdvertTargetVO implements IEntityVO,Cloneable, Serializable {

	private static final long serialVersionUID = 1752567177803923652L;

	@EntityVOAnnotation(alias = "广告目标维度ID,hashcode存放")
	private String adt_ID;
	
	@EntityVOAnnotation(alias = "目标标签管理,目录层级,层级不设下限，叶子固定99",keys={"0","1","2","3"},values={"根","一级大类","二级分类","三级分类"})
	private Byte adt_CatalogLevel;
	
	@EntityVOAnnotation(alias = "上级维度ID")
	private String adt_Parent_ID;
	
	@EntityVOAnnotation(alias = "目标维度名称")
	private String adt_Name;
	
	@EntityVOAnnotation(alias = "属性可圈定范围，也可以排除范围;例如：黑，白名单",entityType="0,包含,1,不包含")
	private Byte adt_IsMatch;

	public String getAdt_ID() {
		return adt_ID;
	}

	public void setAdt_ID(String adt_ID) {
		this.adt_ID = adt_ID;
	}

	public Byte getAdt_CatalogLevel() {
		return adt_CatalogLevel;
	}

	public void setAdt_CatalogLevel(Byte adt_CatalogLevel) {
		this.adt_CatalogLevel = adt_CatalogLevel;
	}

	public String getAdt_Parent_ID() {
		return adt_Parent_ID;
	}

	public void setAdt_Parent_ID(String adt_Parent_ID) {
		this.adt_Parent_ID = adt_Parent_ID;
	}

	public String getAdt_Name() {
		return adt_Name;
	}

	public void setAdt_Name(String adt_Name) {
		this.adt_Name = adt_Name;
	}

	public Byte getAdt_IsMatch() {
		return adt_IsMatch;
	}

	public void setAdt_IsMatch(Byte adt_IsMatch) {
		this.adt_IsMatch = adt_IsMatch;
	}
	
}
