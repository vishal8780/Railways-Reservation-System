package com.cap.admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
@Document
public class Role implements GrantedAuthority {

	@Id
	private String rid;
	@Indexed(unique = true)
	private String role;
	@Override
	public String getAuthority() {
		
		return role;
	}
	public Role(String rid, String role) {
		super();
		this.rid = rid;
		this.role = role;
	}
	public Role() {
		// TODO Auto-generated constructor stub
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", role=" + role + "]";
	}
}
	
