    package com.pharmacy.project.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="drug")
public class ProductsModel {
	public ProductsModel() {
		super();
	}
	
	public ProductsModel(float price, LocalDateTime modified_at, LocalDateTime expiry_date,
			LocalDateTime production_date, String company, String description, String name, String sku, String type,
			String image_url) {
		super();
		this.price = price;
		this.created_at = LocalDateTime.now();
		this.modified_at = modified_at;
		this.expiry_date = expiry_date;
		this.production_date = production_date;
		this.company = company;
		this.description = description;
		this.name = name;
		this.sku = sku;
		this.type = type;
		this.image_url = image_url;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false)
	private float price;
	
	@Column(nullable = false)
	private LocalDateTime created_at;

	@Column(nullable = false)
	private LocalDateTime modified_at;
	
	@Column(nullable = false)
	private LocalDateTime expiry_date;
	
	@Column(nullable = false)
	private LocalDateTime production_date;
	
	@Column(nullable = false)
	private String company;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String sku;
	
	@Column(nullable = false)
	private String type;
	
	@Column(nullable = false)
	private String image_url;

	public UUID getId() {
		return id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public LocalDateTime getModified_at() {
		return modified_at;
	}

	public void setModified_at() {
		this.modified_at = LocalDateTime.now();
	}

	public LocalDateTime getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(LocalDateTime expiry_date) {
		this.expiry_date = expiry_date;
	}

	public LocalDateTime getProduction_date() {
		return production_date;
	}

	public void setProduction_date(LocalDateTime production_date) {
		this.production_date = production_date;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
}
