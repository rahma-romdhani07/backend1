package com.projet.stock.request;


import javax.validation.constraints.*;
public class RegisterRequest {
	private String gender ;
	private String image ; 
	private long telephone ; 
	@NotBlank
    @Size(min = 3, max = 50)
    private String username;
    @NotBlank
    @Size(min=10 , max = 100)
    @Email
    private String email;
    @NotBlank
    private String role;
    @NotBlank
    @Size(min = 5, max = 50)
    private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	} 
	public String getImage() {
		return image;
	} 
	public long getTelephone() {
		return telephone;
	} 
	public void setGender(String gender) {
		this.gender = gender;
	}public void setImage(String image) {
		this.image = image;
	}public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
}
