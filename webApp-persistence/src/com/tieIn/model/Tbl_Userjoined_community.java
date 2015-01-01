package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;

/**
 * The persistent class for the "Tbl_Userjoined_community" database table.
 * 
 */
@Entity
@Table(name = "\"Tbl_Userjoined_community\"")
@NamedQuery(name = "Tbl_Userjoined_community.findAll", query = "SELECT t FROM Tbl_Userjoined_community t")
public class Tbl_Userjoined_community implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "\"Active\"", nullable = false)
	private Boolean active;
	@Id
	@Column(name = "\"Community_id\"", nullable = false)
	private Long community_id;

	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;

	@Column(name = "\"isJoin\"")
	private Boolean isJoin;

	@Column(name = "joined_comm_id", nullable = false)
	private Long joinedCommId;

	@Column(name = "modified_date", nullable = false)
	private Timestamp modifiedDate;

	@Column(name = "\"User_id\"", nullable = false)
	private Long user_id;

	// bi-directional many-to-one association to Tbl_Community
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"Community_id\"")
	private Tbl_Community tblCommunity;

	// bi-directional many-to-one association to Tbl_User
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"User_id\"")
	private Tbl_User tblUser;

	public Tbl_Userjoined_community() {
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

	public Boolean getIsJoin() {
		return this.isJoin;
	}

	public void setIsJoin(Boolean isJoin) {
		this.isJoin = isJoin;
	}

	public Long getJoinedCommId() {
		return this.joinedCommId;
	}

	public void setJoinedCommId(Long joinedCommId) {
		this.joinedCommId = joinedCommId;
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

	public Tbl_Community getTblCommunity() {
		return this.tblCommunity;
	}

	public void setTblCommunity(Tbl_Community tblCommunity) {
		this.tblCommunity = tblCommunity;
	}

	public Tbl_User getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(Tbl_User tblUser) {
		this.tblUser = tblUser;
	}

}