package com.im.success.adverttarget.form;

import com.im.success.entity.EntityVOAnnotation;
import com.opensymphony.xwork2.ActionSupport;

public class AdvertTargetForm extends ActionSupport{

	private static final long serialVersionUID = -7207027826418810770L;

	@EntityVOAnnotation(alias = "Form")
	protected String adt_ID;
	
	@EntityVOAnnotation(alias = "目标标签管理,目录层级,层级不设下限，叶子固定99",keys={"0","1","2","3"},values={"根","一级大类","二级分类","三级分类"})
	protected Byte adt_CatalogLevel;
	
	@EntityVOAnnotation(alias = "上级维度ID")
	protected String adt_Parent_ID;
	
	@EntityVOAnnotation(alias = "目标维度名称")
	protected String adt_Name;
	
	@EntityVOAnnotation(alias = "属性可圈定范围，也可以排除范围;例如：黑，白名单",entityType="0,包含,1,不包含")
	protected Byte adt_IsMatch;

	@EntityVOAnnotation(alias = "0  目录 1 属性标签")
	protected Byte adt_Type;
	
	@EntityVOAnnotation(alias = "1 新增   2 编辑   3 删除")
	private Byte adt_EditType;
	
	protected String jsonTree;
	
	private String expandTree;
	
	
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

	public Byte getAdt_Type() {
		return adt_Type;
	}

	public void setAdt_Type(Byte adt_Type) {
		this.adt_Type = adt_Type;
	}

	public Byte getAdt_EditType() {
		return adt_EditType;
	}

	public void setAdt_EditType(Byte adt_EditType) {
		this.adt_EditType = adt_EditType;
	}

	public String getJsonTree() {
		return jsonTree;
	}

	public void setJsonTree(String jsonTree) {
		this.jsonTree = jsonTree;
	}

	public String getExpandTree() {
		return expandTree;
	}

	public void setExpandTree(String expandTree) {
		this.expandTree = expandTree;
	}


	
//	@EntityVOAnnotation(alias = "目标人群标签List")
//	private List<AdvertTargetVO> adt_List;
	
	
}
