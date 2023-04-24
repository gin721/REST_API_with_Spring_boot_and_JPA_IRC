package org.epharmacy.app.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drugs", schema = "e_pharmacy")
public class DrugModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "drug_id")
	private long id;
	
	//Barcode
	//@Column(name = "stock_keeping_unit", nullable = false, unique = true)
	//private String sku;
	
	@Column(name = "drug_name", nullable = false)
	private String name;
	
	@Column(name = "drug_description", nullable = false)
	private String desc;
	
	@Column(name = "drug_company", nullable = false)
	private String comp;
	
	@Column(name = "drug_type", nullable = false)
	private String type;
	
	@Column(name = "stock", nullable = false)
	private long qty;
	
	@Column(name = "production_date", nullable = false)
	private LocalDate prod_date;

	@Column(name = "expiry_date", nullable = false)
	private LocalDate exp_date;
	
	@Column(name = "selling_price", nullable = false)
	private BigDecimal sell_price;
	
	@Column(name = "image_url", nullable = false)
	private String img_url;
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	public LocalDate getProd_date() {
		return prod_date;
	}

	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}

	public LocalDate getExp_date() {
		return exp_date;
	}

	public void setExp_date(LocalDate exp_date) {
		this.exp_date = exp_date;
	}

	public BigDecimal getSell_price() {
		return sell_price;
	}

	public void setSell_price(BigDecimal sell_price) {
		this.sell_price = sell_price;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public void setId(long id) {
		this.id = id;
	}

}
