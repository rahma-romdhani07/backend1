package com.projet.stock.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Expert",
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"
				+ ""),
		@UniqueConstraint(columnNames = "email") 
	})
public class Expert {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  @NotBlank
		@Size(max = 100)
	  private String username;
	  @NotBlank
	  @Size(max = 100)
	  @Email
	  private String email;
	  private String password;
	  private Long telephone ; 
	  private String role;
	 
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", role=" + role + ", username=" + username + ", password="
				+ password + "]";
	}
	public Expert(String username, String email, String password, String role) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.telephone=telephone; 
		this.role = role;
	}
	public Expert() {
		super();
		// TODO Auto-generated constructor stub
	}

}