package com.adms.mglplanlv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="CAMPAIGN")
public class Campaign extends BaseAuditDomain {

	private static final long serialVersionUID = 2693952646074459441L;
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CAMPAIGN_YEAR")
	private String campaignYear;
	
	@Column(name="CAMPAIGN_TYPE")
	private String campaignType;
	
	@Column(name="CAMPAIGN_CODE")
	private String campaignCode;
	
	@Column(name="CAMPAIGN_NAME")
	private String campaignName;
	
	@Column(name="CAMPAIGN_NAME_COMM")
	private String campaignNameComm;
	
	@Column(name="CAMPAIGN_NAME_MGL")
	private String campaignNameMgl;
	
	@ManyToOne
	@JoinColumn(name="CALL_CENTER", referencedColumnName="CALL_CENTER_ABBR")
	private CallCenter callCenter;
	
	@ManyToOne
	@JoinColumn(name = "LIST_SOURCE", referencedColumnName = "LIST_SOURCE_ABBR")
	private ListSource listSource;
	
	@ManyToOne
	@JoinColumn(name="INSURER", referencedColumnName="INSURER_ABBR")
	private Insurer insurer;
	
	@Column(name="PRODUCT_CODE")
	private String productCode;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="IS_ACTIVE")
	private String isActive;

	public Campaign() {
		// TODO Auto-generated constructor stub
	}
	
	public Campaign(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignNameComm() {
		return campaignNameComm;
	}

	public void setCampaignNameComm(String campaignNameComm) {
		this.campaignNameComm = campaignNameComm;
	}

	public CallCenter getCallCenter() {
		return callCenter;
	}

	public void setCallCenter(CallCenter callCenter) {
		this.callCenter = callCenter;
	}

	public ListSource getListSource() {
		return listSource;
	}

	public void setListSource(ListSource listSource) {
		this.listSource = listSource;
	}

	public Insurer getInsurer() {
		return insurer;
	}

	public void setInsurer(Insurer insurer) {
		this.insurer = insurer;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCampaignNameMgl() {
		return campaignNameMgl;
	}

	public void setCampaignNameMgl(String campaignNameMgl) {
		this.campaignNameMgl = campaignNameMgl;
	}

	public String getCampaignYear() {
		return campaignYear;
	}

	public void setCampaignYear(String campaignYear) {
		this.campaignYear = campaignYear;
	}

	public String getCampaignType() {
		return campaignType;
	}

	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
	}

}
