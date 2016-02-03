package com.adms.mglplanlv.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name = "PRODUCTION_BY_LOT")
@NamedNativeQueries({
	@NamedNativeQuery(name = "findProductionByLotByListLotCodeAndProductionDate"
		, query = "select * from PRODUCTION_BY_LOT where LIST_LOT_CODE = ? and PRODUCTION_DATE = ?"
			, resultClass = ProductionByLot.class)
	
	, @NamedNativeQuery(name = "sumByLotPerMonth"
		, query = " EXEC MGL_PRODUCTION_SUMMARY 'SUM_BY_LOT_PER_MONTH', ?, ?, ? "
			, resultClass = ProductionByLot.class)
	
	, @NamedNativeQuery(name = "sumByCampaignPerMonth"
		, query = " EXEC MGL_PRODUCTION_SUMMARY 'SUM_BY_CAMPAIGN_PER_MONTH', ?, ?, ? "
			, resultClass = ProductionByLot.class)
	
	, @NamedNativeQuery(name = "sumByCampaignYearToDate"
		, query = " EXEC MGL_PRODUCTION_SUMMARY 'SUM_BY_CAMPAIGN_YEAR_TO_DATE', ?, ?, ? "
			, resultClass = ProductionByLot.class)
	})
public class ProductionByLot extends BaseAuditDomain {

	private static final long serialVersionUID = -7856197620962672618L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "IMPORT_ID")
	private Long importId;

	@ManyToOne
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "LIST_LOT_CODE", referencedColumnName = "LIST_LOT_CODE")
	private ListLot listLot;

	@Column(name = "PRODUCTION_DATE", nullable= true)
	@Temporal(TemporalType.DATE)
	private Date productionDate;

	@Column(name = "TOTAL_LEAD")
	private Long totalLead;

	@Column(name = "REMAINING_LEAD")
	private Long remainingLead;

	@Column(name = "HOUR")
	private Long hour;

	@Column(name = "MINUTE")
	private Long minute;

	@Column(name = "SECOND")
	private Long second;

	@Column(name = "DIALING")
	private Long dialing;

	@Column(name = "COMPLETED")
	private Long completed;

	@Column(name = "CONTACT")
	private Long contact;

	@Column(name = "SALES")
	private Long sales;

	@Column(name = "ABANDONS")
	private Long abandons;

	@Column(name = "UW_RELEASE_SALES")
	private Long uwReleaseSales;

	@Column(name = "RELEASE_SALES")
	private Long releaseSales;

	@Column(name = "DECLINES")
	private Long declines;

	@Column(name = "TYP")
	private BigDecimal typ;

	@Column(name = "AMP_POST_UW")
	private BigDecimal ampPostUw;

	@Column(name = "TOTAL_COST")
	private BigDecimal totalCost;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getImportId() {
		return importId;
	}

	public void setImportId(Long importId) {
		this.importId = importId;
	}

	public ListLot getListLot() {
		return listLot;
	}

	public void setListLot(ListLot listLot) {
		this.listLot = listLot;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Long getTotalLead() {
		return totalLead;
	}

	public void setTotalLead(Long totalLead) {
		this.totalLead = totalLead;
	}

	public Long getRemainingLead() {
		return remainingLead;
	}

	public void setRemainingLead(Long remainingLead) {
		this.remainingLead = remainingLead;
	}

	public Long getHour() {
		return hour;
	}

	public void setHour(Long hour) {
		this.hour = hour;
	}

	public Long getMinute() {
		return minute;
	}

	public void setMinute(Long minute) {
		this.minute = minute;
	}

	public Long getSecond() {
		return second;
	}

	public void setSecond(Long second) {
		this.second = second;
	}

	public Long getDialing() {
		return dialing;
	}

	public void setDialing(Long dialing) {
		this.dialing = dialing;
	}

	public Long getCompleted() {
		return completed;
	}

	public void setCompleted(Long completed) {
		this.completed = completed;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Long getSales() {
		return sales;
	}

	public void setSales(Long sales) {
		this.sales = sales;
	}

	public Long getAbandons() {
		return abandons;
	}

	public void setAbandons(Long abandons) {
		this.abandons = abandons;
	}

	public Long getUwReleaseSales() {
		return uwReleaseSales;
	}

	public void setUwReleaseSales(Long uwReleaseSales) {
		this.uwReleaseSales = uwReleaseSales;
	}

	public Long getReleaseSales() {
		return releaseSales;
	}

	public void setReleaseSales(Long releaseSales) {
		this.releaseSales = releaseSales;
	}

	public Long getDeclines() {
		return declines;
	}

	public void setDeclines(Long declines) {
		this.declines = declines;
	}

	public BigDecimal getTyp() {
		return typ;
	}

	public void setTyp(BigDecimal typ) {
		this.typ = typ;
	}

	public BigDecimal getAmpPostUw() {
		return ampPostUw;
	}

	public void setAmpPostUw(BigDecimal ampPostUw) {
		this.ampPostUw = ampPostUw;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "ProductionByLot [id=" + id + ", importId=" + importId
				+ ", listLot=" + listLot + ", productionDate=" + productionDate
				+ ", totalLead=" + totalLead + ", remainingLead="
				+ remainingLead + ", hour=" + hour + ", minute=" + minute
				+ ", second=" + second + ", dialing=" + dialing
				+ ", completed=" + completed + ", contact=" + contact
				+ ", sales=" + sales + ", abandons=" + abandons
				+ ", uwReleaseSales=" + uwReleaseSales + ", releaseSales="
				+ releaseSales + ", declines=" + declines + ", typ=" + typ
				+ ", ampPostUw=" + ampPostUw + ", totalCost=" + totalCost + "]";
	}

}
