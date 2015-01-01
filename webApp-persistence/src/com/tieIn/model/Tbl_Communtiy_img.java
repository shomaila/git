package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;

/**
 * The persistent class for the "Tbl_Communtiy_img" database table.
 * 
 */
@Entity
@Table(name = "\"Tbl_Communtiy_img\"")
@NamedQuery(name = "Tbl_Communtiy_img.findAll", query = "SELECT t FROM Tbl_Communtiy_img t")
public class Tbl_Communtiy_img implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "\"Active\"", nullable = false)
	private Boolean active;
	@Id
	@Column(name = "\"Community_id\"", nullable = false)
	private Long community_id;

	@Column(name = "\"Community_img_id\"", nullable = false)
	private Long community_img_id;

	@Column(name = "\"Community_img_url\"", length = 2147483647)
	private String community_img_url;

	@Id
	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;

	@Column(name = "modified_date", nullable = false)
	private Timestamp modifiedDate;

	public Tbl_Communtiy_img() {
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

	public Long getCommunity_img_id() {
		return this.community_img_id;
	}

	public void setCommunity_img_id(Long community_img_id) {
		this.community_img_id = community_img_id;
	}

	public String getCommunity_img_url() {
		return this.community_img_url;
	}

	public void setCommunity_img_url(String community_img_url) {
		this.community_img_url = community_img_url;
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

}