package org.epharmacy.app.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drugs")
public class DrugModel {
	public DrugModel() {
		super();
	}

	public DrugModel(UUID drugId, String drugName, String drugDesc, String drugComp, String drugType,
			long drugQty, LocalDate prodDate, LocalDate expDate, BigDecimal sellPrice, String imgUrl) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.drugDesc = drugDesc;
		this.drugComp = drugComp;
		this.drugType = drugType;
		this.drugQty = drugQty;
		this.prodDate = prodDate;
		this.expDate = expDate;
		this.sellPrice = sellPrice;
		this.imgUrl = imgUrl;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "drug_id")
	private UUID drugId;
	
	@Column(name = "drug_name", nullable = false)
	private String drugName;
	
	@Column(name = "drug_description", nullable = false)
	private String drugDesc;
	
	@Column(name = "drug_company", nullable = false)
	private String drugComp;
	
	@Column(name = "drug_type", nullable = false)
	private String drugType;
	
	@Column(name = "stock", nullable = false)
	private long drugQty;
	
	@Column(name = "production_date", nullable = false)
	private LocalDate prodDate;

	@Column(name = "expiry_date", nullable = false)
	private LocalDate expDate;
	
	@Column(name = "selling_price", nullable = false)
	private BigDecimal sellPrice;
	
	@Column(name = "image_url", nullable = false)
	private String imgUrl;

	public UUID getDrugId() {
		return drugId;
	}

	public void setDrugId(UUID drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugDesc() {
		return drugDesc;
	}

	public void setDrugDesc(String drugDesc) {
		this.drugDesc = drugDesc;
	}

	public String getDrugComp() {
		return drugComp;
	}

	public void setDrugComp(String drugComp) {
		this.drugComp = drugComp;
	}

	public String getDrugType() {
		return drugType;
	}

	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}

	public long getDrugQty() {
		return drugQty;
	}

	public void setDrugQty(long drugQty) {
		this.drugQty = drugQty;
	}

	public LocalDate getProdDate() {
		return prodDate;
	}

	public void setProdDate(LocalDate prodDate) {
		this.prodDate = prodDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "DrugModel [drugId=" + drugId + ", drugName=" + drugName + ", drugDesc=" + drugDesc + ", drugComp="
				+ drugComp + ", drugType=" + drugType + ", drugQty=" + drugQty + ", prodDate=" + prodDate + ", expDate="
				+ expDate + ", sellPrice=" + sellPrice + ", imgUrl=" + imgUrl + "]";
	}		
}
