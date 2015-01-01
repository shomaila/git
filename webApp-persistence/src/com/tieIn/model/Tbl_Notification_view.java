package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the "Tbl_Notification_view" database table.
 * 
 */
@Entity
@Table(name="\"Tbl_Notification_view\"")
@NamedQuery(name="Tbl_Notification_view.findAll", query="SELECT t FROM Tbl_Notification_view t")
public class Tbl_Notification_view implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"View_id\"", unique=true, nullable=false)
	private Long view_id;

	@Column(name="\"_View_status\"", length=2147483647)
	private String _View_status;

	@Column(name="\"Active\"", nullable=false)
	private Boolean active;

	@Column(name="\"Activity_id\"", nullable=false)
	private Long activity_id;

	@Column(name="created_date", nullable=false)
	private Timestamp createdDate;

	@Column(name="modified_date", nullable=false)
	private Timestamp modifiedDate;

	@Column(name="\"User_id\"", nullable=false)
	private Long user_id;

	@Column(name="\"View_status\"", nullable=false, length=2147483647)
	private String view_status;

	@Column(name="\"Viewed_date\"")
	private Timestamp viewed_date;

	//bi-directional many-to-one association to Tbl_Activity
	@ManyToOne
	@PrimaryKeyJoinColumn(name="\"Activity_id\"")
	private Tbl_Activity tblActivity;

	//bi-directional many-to-one association to Tbl_User
	@ManyToOne
	@PrimaryKeyJoinColumn(name="\"User_id\"")
	private Tbl_User tblUser;

	public Tbl_Notification_view() {
	}

	public Long getView_id() {
		return this.view_id;
	}

	public void setView_id(Long view_id) {
		this.view_id = view_id;
	}

	public String get_View_status() {
		return this._View_status;
	}

	public void set_View_status(String _View_status) {
		this._View_status = _View_status;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getActivity_id() {
		return this.activity_id;
	}

	public void setActivity_id(Long activity_id) {
		this.activity_id = activity_id;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getUser_id() {
		return this.user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getView_status() {
		return this.view_status;
	}

	public void setView_status(String view_status) {
		this.view_status = view_status;
	}

	public Timestamp getViewed_date() {
		return this.viewed_date;
	}

	public void setViewed_date(Timestamp viewed_date) {
		this.viewed_date = viewed_date;
	}

	public Tbl_Activity getTblActivity() {
		return this.tblActivity;
	}

	public void setTblActivity(Tbl_Activity tblActivity) {
		this.tblActivity = tblActivity;
	}

	public Tbl_User getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(Tbl_User tblUser) {
		this.tblUser = tblUser;
	}

}