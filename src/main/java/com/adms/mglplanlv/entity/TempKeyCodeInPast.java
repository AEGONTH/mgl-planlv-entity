package com.adms.mglplanlv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.adms.common.domain.BaseDomain;

@Entity
@Table(name="TEMP_KEY_CODE_IN_PAST")
public class TempKeyCodeInPast extends BaseDomain {

	private static final long serialVersionUID = 3864669539897670114L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="KEY_CODE")
	private String keyCode;

	public TempKeyCodeInPast() {

	}
	
	public TempKeyCodeInPast(String keyCode) {
		this.keyCode = keyCode;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}
	
}
