package com.tieIn.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the "Tbl_User" database table.
 * @author Shomaila
 * 
 */
@Entity
@Table(name="\"Tbl_User\"")
@NamedQuery(name="Tbl_User.findAll", query="SELECT t FROM Tbl_User t")
public class Tbl_User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"User_id\"", unique=true, nullable=false)
	private Long user_id;

	@Column(name="\"Active\"")
	private Boolean active;

	@Column(name="created_date", nullable=false)
	private Timestamp createdDate;

	@Column(name="device_id_for_notification", length=2147483647)
	private String deviceIdForNotification;

	@Column(name="device_platform", length=2147483647)
	private String devicePlatform;

	@Column(name="device_status", nullable=false, length=2147483647)
	private String deviceStatus;

	@Column(name="modified_date", nullable=false)
	private Timestamp modifiedDate;

	@Column(name="\"Online\"")
	private Boolean online;

	@Column(name="\"User_email\"", nullable=false, length=2147483647)
	private String user_email;

	@Column(name="\"User_firstname\"", length=2147483647)
	private String user_firstname;

	@Column(name="\"User_lastname\"", length=2147483647)
	private String user_lastname;

	@Column(name="\"User_lat\"", length=2147483647)
	private String user_lat;

	@Column(name="\"User_loc\"", length=2147483647)
	private String user_loc;

	@Column(name="\"User_long\"", length=2147483647)
	private String user_long;

	@Column(name="\"User_name\"", nullable=false, length=2147483647)
	private String user_name;

	@Column(name="\"User_picurl\"", length=2147483647)
	private String user_picurl;

	@Column(name="\"User_pwd\"", nullable=false, length=2147483647)
	private String user_pwd;
	

	public Tbl_User() {
	}

	public Long getUser_id() {
		return this.user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDeviceIdForNotification() {
		return this.deviceIdForNotification;
	}

	public void setDeviceIdForNotification(String deviceIdForNotification) {
		this.deviceIdForNotification = deviceIdForNotification;
	}

	public String getDevicePlatform() {
		return this.devicePlatform;
	}

	public void setDevicePlatform(String devicePlatform) {
		this.devicePlatform = devicePlatform;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Boolean getOnline() {
		return this.online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public String getUser_email() {
		return this.user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_firstname() {
		return this.user_firstname;
	}

	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}

	public String getUser_lastname() {
		return this.user_lastname;
	}

	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}

	public String getUser_lat() {
		return this.user_lat;
	}

	public void setUser_lat(String user_lat) {
		this.user_lat = user_lat;
	}

	public String getUser_loc() {
		return this.user_loc;
	}

	public void setUser_loc(String user_loc) {
		this.user_loc = user_loc;
	}

	public String getUser_long() {
		return this.user_long;
	}

	public void setUser_long(String user_long) {
		this.user_long = user_long;
	}

	public String getUser_name() {
		return this.user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_picurl() {
		return this.user_picurl;
	}

	public void setUser_picurl(String user_picurl) {
		this.user_picurl = user_picurl;
	}

	public String getUser_pwd() {
		return this.user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	

}