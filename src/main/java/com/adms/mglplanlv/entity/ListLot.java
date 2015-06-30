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
@Table(name="LIST_LOT")
public class ListLot extends BaseAuditDomain {

	private static final long serialVersionUID = -7907185378263197384L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CAMPAIGN_CODE", referencedColumnName="CAMPAIGN_CODE")
	private Campaign campaign;
	
	@Column(name="LIST_LOT_CODE")
	private String listLotCode;
	
	@Column(name="LIST_LOT_NAME")
	private String listLotName;
	
	@Column(name="LIST_LOT_NAME_COMM")
	private String listLotNameComm;
	
	@Column(name="LOT_EFFECTIVE_DATE")
	private String lotEffectiveDate;
	
	@Column(name="SCRIPT_ID")
	private String scriptId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public String getListLotCode() {
		return listLotCode;
	}

	public void setListLotCode(String listLotCode) {
		this.listLotCode = listLotCode;
	}

	public String getListLotName() {
		return listLotName;
	}

	public void setListLotName(String listLotName) {
		this.listLotName = listLotName;
	}

	public String getListLotNameComm() {
		return listLotNameComm;
	}

	public void setListLotNameComm(String listLotNameComm) {
		this.listLotNameComm = listLotNameComm;
	}

	public String getLotEffectiveDate() {
		return lotEffectiveDate;
	}

	public void setLotEffectiveDate(String lotEffectiveDate) {
		this.lotEffectiveDate = lotEffectiveDate;
	}

	public String getScriptId() {
		return scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	
}
