package com.adms.mglplanlv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="SALES_MGL_PLAN_LV")
public class SalesMglPlanLv extends BaseAuditDomain {

	private static final long serialVersionUID = 945016916894858265L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="X_REFERENCE")
	private String xReference;

	@Column(name="MGL_PROCESSED_CYCLE")
	private String mglProcessedCycle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getxReference() {
		return xReference;
	}

	public void setxReference(String xReference) {
		this.xReference = xReference;
	}

	public String getMglProcessedCycle() {
		return mglProcessedCycle;
	}

	public void setMglProcessedCycle(String mglProcessedCycle) {
		this.mglProcessedCycle = mglProcessedCycle;
	}
	
}
