package com.sprint.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name ="adminid")
private int adminId;
@Column(name="adminusername")
private String adminUserName;
private String adminPassword;

public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminUserName() {
	return adminUserName;
}
public void setAdminUserName(String adminUserName) {
	this.adminUserName = adminUserName;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
	

}
