package org.epharmacy.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", schema = "e_pharmacy")
public class UserModel {
	
	@Id
	@Column(name = "user_id")
	private long id;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "first_name", nullable = false)
	private String f_name;

	@Column(name = "last_name", nullable = false)
	private String l_name;
	
	@Column(name = "age", nullable = false)
	private int age;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "phone_number", nullable = false)
	private long p_no;
	
	@Column(name = "password", nullable = false)
	private String pass;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getP_no() {
		return p_no;
	}

	public void setP_no(long p_no) {
		this.p_no = p_no;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
