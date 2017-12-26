package com.im.success.adverttarget.model;

import java.io.Serializable;

import com.im.success.entity.EntityVOAnnotation;
import com.im.success.entity.IEntityVO;

/**
 * 广告目标对象维度属性,即广告位面对人群属性
 * @author zyh
 *
 */
public class AdvertTargetVO2 implements IEntityVO,Cloneable, Serializable {

	private static final long serialVersionUID = 1752567177803923652L;

	@EntityVOAnnotation(alias = "广告目标维度ID,hashcode存放")
	private String adt_ID;
	
	@EntityVOAnnotation(alias = "目标标签管理,目录层级,层级不设下限，叶子固定99",keys={"0","1","2","3"},values={"根","一级大类","二级分类","三级分类"})
	private Byte adt_CatalogLevel;
	
	@EntityVOAnnotation(alias = "目标维度名称")
	private String adt_Name;
	
	
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


	public String getAdt_Name() {
		return adt_Name;
	}

	public void setAdt_Name(String adt_Name) {
		this.adt_Name = adt_Name;
	}

	
}
