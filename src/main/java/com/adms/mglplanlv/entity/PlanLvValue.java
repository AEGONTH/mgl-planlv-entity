package com.adms.mglplanlv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import com.adms.common.domain.BaseDomain;

@Entity
@NamedNativeQueries({
//	<!-- MTL Kbank -->
	@NamedNativeQuery(
			name = "execPlanLvValueForMtlKbankMTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MTL_KBANK_MTD] ?, ? ",
			resultClass = PlanLvValue.class),
	@NamedNativeQuery(
			name = "execPlanLvValueForMtlKbankYTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MTL_KBANK_YTD] ?, ? ",
			resultClass = PlanLvValue.class),
			
//	<!-- MTL Broker -->
	@NamedNativeQuery(
			name = "execPlanLvValueForMTLBrokerMTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MTL_BROKER_MTD] ?, ? ",
			resultClass = PlanLvValue.class),
	@NamedNativeQuery(
			name = "execPlanLvValueForMTLBrokerYTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MTL_BROKER_YTD] ?, ? ",
			resultClass = PlanLvValue.class),
			
//	<!-- MTI KBank -->
	@NamedNativeQuery(
			name = "execPlanLvValueForMTIKBankMTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MTI_KBANK_MTD] ?, ? ",
			resultClass = PlanLvValue.class),
	@NamedNativeQuery(
			name = "execPlanLvValueForMTIKBankYTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MTI_KBANK_YTD] ?, ? ",
			resultClass = PlanLvValue.class),
			
//	<!-- MSIG UOB -->
	@NamedNativeQuery(
			name = "execPlanLvValueForMSIGUOBMTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MSIG_UOB_MTD] ?, ? ",
			resultClass = PlanLvValue.class),
	@NamedNativeQuery(
			name = "execPlanLvValueForMSIGUOBYTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MSIG_UOB_YTD] ?, ? ",
			resultClass = PlanLvValue.class),
			
//	<!-- MSIG Broker -->
	@NamedNativeQuery(
			name = "execPlanLvValueForMSIGBrokerMTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MSIG_BROKER_MTD] ?, ? ",
			resultClass = PlanLvValue.class),
	@NamedNativeQuery(
			name = "execPlanLvValueForMSIGBrokerYTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_MSIG_BROKER_YTD] ?, ? ",
			resultClass = PlanLvValue.class),
			
//	<!-- FWD TVD -->
	@NamedNativeQuery(
			name = "execPlanLvValueForFWDTVDMTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_FWD_TVD_MTD] ?, ? ",
			resultClass = PlanLvValue.class),
	@NamedNativeQuery(
			name = "execPlanLvValueForFWDTVDYTD",
			query = " EXEC [dbo].[MGL_PLAN_LV_DATA_FOR_FWD_TVD_YTD] ?, ? ",
			resultClass = PlanLvValue.class),
})
public class PlanLvValue extends BaseDomain {

	private static final long serialVersionUID = 6691695767644325655L;

	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="PRODUCT")
	private String product;
	
	@Column(name="PLAN_TYPE")
	private String planType;
	
	@Column(name="NUM_OF_FILE")
	private Integer numOfFile;
	
	@Column(name="TYP")
	private Double typ;
	
	@Column(name="AMP")
	private Double amp;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public Integer getNumOfFile() {
		return numOfFile;
	}

	public void setNumOfFile(Integer numOfFile) {
		this.numOfFile = numOfFile;
	}

	public Double getTyp() {
		return typ;
	}

	public void setTyp(Double typ) {
		this.typ = typ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmp() {
		return amp;
	}

	public void setAmp(Double amp) {
		this.amp = amp;
	}

	@Override
	public String toString() {
		return "PlanLvValue [product=" + product + ", planType=" + planType
				+ ", numOfFile=" + numOfFile + ", typ=" + typ + ", amp=" + amp
				+ "]";
	}
	
}
