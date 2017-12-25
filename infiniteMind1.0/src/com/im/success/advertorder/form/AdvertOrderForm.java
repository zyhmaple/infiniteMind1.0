package com.im.success.advertorder.form;

import java.util.Date;
import java.util.List;

import com.im.success.advertplan.model.AdvertPlanVO;
import com.im.success.entity.EntityVOAnnotation;
import com.im.success.pub.enumtype.PlatTypeEnumType;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 订单基础信息
 * @author zyh
 *
 */
@EntityVOAnnotation(alias = "基础订单") 
public class AdvertOrderForm  extends ActionSupport  {

	
	private static final long serialVersionUID = -1127108287833726635L;

	@EntityVOAnnotation(alias = "订单ID")
	private String ado_ID;
	
	@EntityVOAnnotation(alias = "订单名称")
	private String ado_Name;
	
	@EntityVOAnnotation(alias = "广告主ID")
    private String ado_Adr_ID;
	
	@EntityVOAnnotation(alias = "订单.平台类型",type=PlatTypeEnumType.class)
	private Integer ado_PlatType;
	
	@EntityVOAnnotation(alias = "订单下计划")
	private List<AdvertPlanVO> ado_Adp_List;
	
	@EntityVOAnnotation(alias = "广告位目标标签,即投放人群标签",splitChar=";")
	private String ado_Adt_IDs;

	@EntityVOAnnotation(alias = "订单开始时间")
	private Date ado_BeginDate;
	
	@EntityVOAnnotation(alias = "订单结束时间")
    private Date ado_EndDate;
	
	@EntityVOAnnotation(alias = "订单分组ID")
	private String ado_Adg_ID;
	
	@EntityVOAnnotation(alias = "订单频次控制目标")
	private String ado_FreqTarget;
	
	@EntityVOAnnotation(alias = "频次周期")
	private String ado_FreqCyc;
	
	@EntityVOAnnotation(alias = "频次次数")
	private Integer ado_Frequency;
	
	@EntityVOAnnotation(alias = "是否追投订单")
	private Integer ado_IsAdd;
	
	@EntityVOAnnotation(alias = "追投订单ID")
	private String ado_AddAdo_ID;
	
	@EntityVOAnnotation(alias = "追投日期")
	private Date ado_AddDate;
	
	@EntityVOAnnotation(alias = "订单优先级",EnumDesc="0-9级,数小级别高")
	private Integer ado_Priority;
	
	@EntityVOAnnotation(alias = "状态描述语言,审核意见等信息")
	private String ado_Status_Desc;
	
	@EntityVOAnnotation(alias = "订单开关状态")
	private Integer ado_Switch;
	
	@EntityVOAnnotation(alias = "订单状态",keys={"0","1","2","3"},values={"草稿","待审核","已审核","已拒绝"})
	private Integer ado_Status;
	
	@EntityVOAnnotation(alias = "创建时间")
	private Date ado_CreateTime;
	
	@EntityVOAnnotation(alias = "修改时间")
	private Date ado_UpdateTime;
	
	@EntityVOAnnotation(alias = "审核时间")
	private Date ado_AuditTime;
	
	@EntityVOAnnotation(alias = "删除标记",EnumDesc="0,默认;1,删除")
	private Integer ado_IsDele;

	
	//移动属性
	@EntityVOAnnotation(alias = "移动操作系统类型")
	private String ado_OsType;
	
	@EntityVOAnnotation(alias = "移动网络类型")
	private String ado_NetType;
	
	@EntityVOAnnotation(alias = "DMP订单id")
	private String ado_DmpOrderId;
	
	@EntityVOAnnotation(alias = "DMP订单名称")
	private String ado_DmpOrderName;
	
	
	public String getAdo_ID() {
		return ado_ID;
	}

	public void setAdo_ID(String ado_ID) {
		this.ado_ID = ado_ID;
	}

	public String getAdo_Name() {
		return ado_Name;
	}

	public void setAdo_Name(String ado_Name) {
		this.ado_Name = ado_Name;
	}

	public String getAdo_Adr_ID() {
		return ado_Adr_ID;
	}

	public void setAdo_Ad_ID(String ado_Adr_ID) {
		this.ado_Adr_ID = ado_Adr_ID;
	}

	public Integer getAdo_PlatType() {
		return ado_PlatType;
	}

	public void setAdo_PlatType(Integer ado_PlatType) {
		this.ado_PlatType = ado_PlatType;
	}

	public List<AdvertPlanVO> getAdo_Adp_List() {
		return ado_Adp_List;
	}

	public void setAdo_Adp_List(List<AdvertPlanVO> ado_Adp_List) {
		this.ado_Adp_List = ado_Adp_List;
	}

	public String getAdo_Adt_IDs() {
		return ado_Adt_IDs;
	}

	public void setAdo_Adt_IDs(String ado_Adt_IDs) {
		this.ado_Adt_IDs = ado_Adt_IDs;
	}

	public Date getAdo_BeginDate() {
		return ado_BeginDate;
	}

	public void setAdo_BeginDate(Date ado_BeginDate) {
		this.ado_BeginDate = ado_BeginDate;
	}

	public Date getAdo_EndDate() {
		return ado_EndDate;
	}

	public void setAdo_EndDate(Date ado_EndDate) {
		this.ado_EndDate = ado_EndDate;
	}

	public String getAdo_Adg_ID() {
		return ado_Adg_ID;
	}

	public void setAdo_Adg_ID(String ado_Adg_ID) {
		this.ado_Adg_ID = ado_Adg_ID;
	}

	public String getAdo_FreqTarget() {
		return ado_FreqTarget;
	}

	public void setAdo_FreqTarget(String ado_FreqTarget) {
		this.ado_FreqTarget = ado_FreqTarget;
	}

	public String getAdo_FreqCyc() {
		return ado_FreqCyc;
	}

	public void setAdo_FreqCyc(String ado_FreqCyc) {
		this.ado_FreqCyc = ado_FreqCyc;
	}

	public Integer getAdo_Frequency() {
		return ado_Frequency;
	}

	public void setAdo_Frequency(Integer ado_Frequency) {
		this.ado_Frequency = ado_Frequency;
	}

	public Integer getAdo_IsAdd() {
		return ado_IsAdd;
	}

	public void setAdo_IsAdd(Integer ado_IsAdd) {
		this.ado_IsAdd = ado_IsAdd;
	}

	public String getAdo_AddAdo_ID() {
		return ado_AddAdo_ID;
	}

	public void setAdo_AddAdo_ID(String ado_AddAdo_ID) {
		this.ado_AddAdo_ID = ado_AddAdo_ID;
	}

	public Date getAdo_AddDate() {
		return ado_AddDate;
	}

	public void setAdo_AddDate(Date ado_AddDate) {
		this.ado_AddDate = ado_AddDate;
	}

	public Integer getAdo_Priority() {
		return ado_Priority;
	}

	public void setAdo_Priority(Integer ado_Priority) {
		this.ado_Priority = ado_Priority;
	}

	public String getAdo_Status_Desc() {
		return ado_Status_Desc;
	}

	public void setAdo_Status_Desc(String ado_Status_Desc) {
		this.ado_Status_Desc = ado_Status_Desc;
	}

	public Integer getAdo_Switch() {
		return ado_Switch;
	}

	public void setAdo_Switch(Integer ado_Switch) {
		this.ado_Switch = ado_Switch;
	}

	public Integer getAdo_Status() {
		return ado_Status;
	}

	public void setAdo_Status(Integer ado_Status) {
		this.ado_Status = ado_Status;
	}

	public Date getAdo_CreateTime() {
		return ado_CreateTime;
	}

	public void setAdo_CreateTime(Date ado_CreateTime) {
		this.ado_CreateTime = ado_CreateTime;
	}

	public Date getAdo_UpdateTime() {
		return ado_UpdateTime;
	}

	public void setAdo_UpdateTime(Date ado_UpdateTime) {
		this.ado_UpdateTime = ado_UpdateTime;
	}

	public Date getAdo_AuditTime() {
		return ado_AuditTime;
	}

	public void setAdo_AuditTime(Date ado_AuditTime) {
		this.ado_AuditTime = ado_AuditTime;
	}

	public Integer getAdo_IsDele() {
		return ado_IsDele;
	}

	public void setAdo_IsDele(Integer ado_IsDele) {
		this.ado_IsDele = ado_IsDele;
	}

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
