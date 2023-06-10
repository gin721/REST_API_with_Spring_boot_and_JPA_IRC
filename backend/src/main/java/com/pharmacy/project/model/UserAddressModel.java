package com.pharmacy.project.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class UserAddressModel {
	public UserAddressModel() {
		super();
	}
	
	public UserAddressModel(int pinCode, String address, String state, String country) {
		super();
		this.pinCode = pinCode;
		this.address = address;
		this.state = state;
		this.country = country;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false)
	private int pinCode;

	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String country;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPin_code(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
