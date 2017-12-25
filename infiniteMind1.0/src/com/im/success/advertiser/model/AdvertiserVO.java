package com.im.success.advertiser.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

import com.im.success.entity.IEntityVO;

public class AdvertiserVO implements Serializable,IEntityVO {


	private static final long serialVersionUID = 3971411386220107440L;
	
	private String adr_ID;
	
	private String adr_Name;
	
	private Byte adr_Type;
	
	private String adr_LoginAccountID;
	
	private String adr_CompanyName;
	
	private String adr_CompanyUrl;
	
	private String adr_Email;
	
	private String adr_Mobile;
	
	private String adr_Telephone;
	
	private Byte adr_AuditStatus;
	
	private String adr_AuditResult;
	
	private Date adr_AuditDate;
	
	private String adr_AgentID;
	
	private Double adr_AgentServiceRates;
	
	private String adr_StepRateID;
	
	private Date adr_RegisterDate;
	
	private Date adr_UpdateDate;
	
	private Date adr_LastLoginDate;

	public String getAdr_ID() {
		return adr_ID;
	}

	public void setAdr_ID(String adr_ID) {
		this.adr_ID = adr_ID;
	}

	public String getAdr_Name() {
		return adr_Name;
	}

	public void setAdr_Name(String adr_Name) {
		this.adr_Name = adr_Name;
	}

	public Byte getAdr_Type() {
		return adr_Type;
	}

	public void setAdr_Type(Byte adr_Type) {
		this.adr_Type = adr_Type;
	}

	public String getAdr_LoginAccountID() {
		return adr_LoginAccountID;
	}

	public void setAdr_LoginAccountID(String adr_LoginAccountID) {
		this.adr_LoginAccountID = adr_LoginAccountID;
	}

	public String getAdr_CompanyName() {
		return adr_CompanyName;
	}

	public void setAdr_CompanyName(String adr_CompanyName) {
		this.adr_CompanyName = adr_CompanyName;
	}

	public String getAdr_CompanyUrl() {
		return adr_CompanyUrl;
	}

	public void setAdr_CompanyUrl(String adr_CompanyUrl) {
		this.adr_CompanyUrl = adr_CompanyUrl;
	}

	public String getAdr_Email() {
		return adr_Email;
	}

	public void setAdr_Email(String adr_Email) {
		this.adr_Email = adr_Email;
	}

	public String getAdr_Mobile() {
		return adr_Mobile;
	}

	public void setAdr_Mobile(String adr_Mobile) {
		this.adr_Mobile = adr_Mobile;
	}

	public String getAdr_Telephone() {
		return adr_Telephone;
	}

	public void setAdr_Telephone(String adr_Telephone) {
		this.adr_Telephone = adr_Telephone;
	}

	public Byte getAdr_AuditStatus() {
		return adr_AuditStatus;
	}

	public void setAdr_AuditStatus(Byte adr_AuditStatus) {
		this.adr_AuditStatus = adr_AuditStatus;
	}

	public String getAdr_AuditResult() {
		return adr_AuditResult;
	}

	public void setAdr_AuditResult(String adr_AuditResult) {
		this.adr_AuditResult = adr_AuditResult;
	}

	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public Date getAdr_AuditDate() {
		return adr_AuditDate;
	}

	public void setAdr_AuditDate(Date adr_AuditDate) {
		this.adr_AuditDate = adr_AuditDate;
	}

	public String getAdr_AgentID() {
		return adr_AgentID;
	}

	public void setAdr_AgentID(String adr_AgentID) {
		this.adr_AgentID = adr_AgentID;
	}

	public Double getAdr_AgentServiceRates() {
		return adr_AgentServiceRates;
	}

	public void setAdr_AgentServiceRates(Double adr_AgentServiceRates) {
		this.adr_AgentServiceRates = adr_AgentServiceRates;
	}

	public String getAdr_StepRateID() {
		return adr_StepRateID;
	}

	public void setAdr_StepRateID(String adr_StepRateID) {
		this.adr_StepRateID = adr_StepRateID;
	}

	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public Date getAdr_RegisterDate() {
		return adr_RegisterDate;
	}

	public void setAdr_RegisterDate(Date adr_RegisterDate) {
		this.adr_RegisterDate = adr_RegisterDate;
	}

	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public Date getAdr_UpdateDate() {
		return adr_UpdateDate;
	}

	public void setAdr_UpdateDate(Date adr_UpdateDate) {
		this.adr_UpdateDate = adr_UpdateDate;
	}

	@JSON(format="yyyy-MM-dd HH:mm:ss")
	public Date getAdr_LastLoginDate() {
		return adr_LastLoginDate;
	}

	public void setAdr_LastLoginDate(Date adr_LastLoginDate) {
		this.adr_LastLoginDate = adr_LastLoginDate;
	}
	




}
