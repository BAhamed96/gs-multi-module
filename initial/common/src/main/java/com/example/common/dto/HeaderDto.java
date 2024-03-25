package com.example.common.dto;

import java.io.Serializable;

public class HeaderDto implements Serializable{
	private static final long serialVersionUID = 416515615456156165L;
	
	public static String PROFILE_MEMEBER;
	public static String PROFILE_PROVIDER;
	public static String PROFILE_ADMIN;
	
	private String userId; 
	private String password; 
	private String token; 
	private String profile; 
	private String roles;
	private Long sourceId; 
	//private CustomerSecurityDto customerDetails;
	private boolean allDetails = false;
	private boolean adminUser = false;
	
	public HeaderDto() {
		super();
	}
	
	public HeaderDto(String userId, boolean adminUser) {
		super();
		this.userId = userId;
		this.adminUser = adminUser;
	}
	
	public static HeaderDto getDefaultHeader() {
		return new HeaderDto("system", true);
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public Long getSourceId() {
		return sourceId;
	}
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	public boolean isAllDetails() {
		return allDetails;
	}
	public void setAllDetails(boolean allDetails) {
		this.allDetails = allDetails;
	}
	public boolean isAdminUser() {
		return adminUser;
	}
	public void setAdminUser(boolean adminUser) {
		this.adminUser = adminUser;
	}
	
}
