package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

/**
 * The persistent class for the "Tbl_Event" database table.
 * 
 */
@Entity
@Table(name = "\"Tbl_Event\"")
@NamedQuery(name = "Tbl_Event.findAll", query = "SELECT t FROM Tbl_Event t")
public class Tbl_Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "\"Event_id\"", unique = true, nullable = false)
	private Long event_id;

	@Column(name = "\"Active\"", nullable = false)
	private Boolean active;

	@Column(name = "\"Community_id\"", nullable = false)
	private Long community_id;

	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;

	@Column(name = "\"Event_date\"")
	private Timestamp event_date;

	@Column(name = "\"Event_desc\"", length = 2147483647)
	private String event_desc;

	@Column(name = "\"Event_img_url\"", length = 2147483647)
	private String event_img_url;

	@Column(name = "\"Event_location\"", length = 2147483647)
	private String event_location;

	@Column(name = "\"Event_name\"", length = 2147483647)
	private String event_name;

	@Column(name = "\"Event_place\"", length = 2147483647)
	private String event_place;

	@Column(name = "modified_date", nullable = false)
	private Timestamp modifiedDate;

	// bi-directional many-to-one association to Tbl_Activity
	@OneToMany(mappedBy = "tblEvent" )
	private Set<Tbl_Activity> tblActivities;

	// bi-directional many-to-one association to Tbl_Community
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"Community_id\"")
	private Tbl_Community tblCommunity;

	public Tbl_Event() {
	}

	public Long getEvent_id() {
		return this.event_id;
	}

	public void setEvent_id(Long event_id) {
		this.event_id = event_id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getCommunity_id() {
		return this.community_id;
	}

	public void setCommunity_id(Long community_id) {
		this.community_id = community_id;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getEvent_date() {
		return this.event_date;
	}

	public void setEvent_date(Timestamp event_date) {
		this.event_date = event_date;
	}

	public String getEvent_desc() {
		return this.event_desc;
	}

	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}

	public String getEvent_img_url() {
		return this.event_img_url;
	}

	public void setEvent_img_url(String event_img_url) {
		this.event_img_url = event_img_url;
	}

	public String getEvent_location() {
		return this.event_location;
	}

	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}

	public String getEvent_name() {
		return this.event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_place() {
		return this.event_place;
	}

	public void setEvent_place(String event_place) {
		this.event_place = event_place;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Set<Tbl_Activity> getTblActivities() {
		return this.tblActivities;
	}

	public void setTblActivities(Set<Tbl_Activity> tblActivities) {
		this.tblActivities = tblActivities;
	}

	public Tbl_Activity addTblActivity(Tbl_Activity tblActivity) {
		getTblActivities().add(tblActivity);
		tblActivity.setTblEvent(this);

		return tblActivity;
	}

	public Tbl_Activity removeTblActivity(Tbl_Activity tblActivity) {
		getTblActivities().remove(tblActivity);
		tblActivity.setTblEvent(null);

		return tblActivity;
	}

	public Tbl_Community getTblCommunity() {
		return this.tblCommunity;
	}

	public void setTblCommunity(Tbl_Community tblCommunity) {
		this.tblCommunity = tblCommunity;
	}

}