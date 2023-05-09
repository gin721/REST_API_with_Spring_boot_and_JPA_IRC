package com.example.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdminModel {
	   @Id
		private String Email;
		private String password;
		private String MobileNumber;
		private String UserRole;
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getMobileNumber() {
			return MobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			MobileNumber = mobileNumber;
		}
		public String getUserRole() {
			return UserRole;
		}
		public void setUserRole(String userRole) {
			UserRole = userRole;
		}
	}