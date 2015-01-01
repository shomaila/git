package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

/**
 * The persistent class for the "Tbl_Community" database table.
 * 
 */
@Entity
@Table(name = "\"Tbl_Community\"")
@NamedQuery(name = "Tbl_Community.findAll", query = "SELECT t FROM Tbl_Community t")
public class Tbl_Community implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "\"Community_id\"", unique = true, nullable = false)
	private Long community_id;

	@Column(name = "\"Active\"", nullable = false)
	private Boolean active;

	@Column(name = "\"Community_desc\"", length = 2147483647)
	private String community_desc;

	@Column(name = "\"Community_latitude\"", length = 2147483647)
	private String community_latitude;

	@Column(name = "\"Community_location\"", length = 2147483647)
	private String community_location;

	@Column(name = "\"Community_longitude\"", length = 2147483647)
	private String community_longitude;

	@Column(name = "\"Community_name\"", length = 2147483647)
	private String community_name;

	@Column(name = "\"Community_status\"", length = 2147483647)
	private String community_status;

	@Column(name = "\"Community_type\"", length = 2147483647)
	private String community_type;

	@Column(name = "\"Community_url\"", length = 2147483647)
	private String community_url;

	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;

	@Column(name = "modified_date", nullable = false)
	private Timestamp modifiedDate;

	@Column(name = "\"User_id\"", nullable = false, updatable = false)
	private Long user_id;

	// bi-directional many-to-one association to Tbl_Activity
	@OneToMany(mappedBy = "tblCommunity")
	private Set<Tbl_Activity> tblActivities;

	// bi-directional many-to-one association to Tbl_User
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"User_id\"")
	private Tbl_User tblUser;

//	// bi-directional many-to-one association to Tbl_Community_admin
//	@OneToMany(mappedBy = "tblCommunity")
//	private Set<Tbl_Community_admin> tblCommunityAdmins;

//	// bi-directional many-to-one association to Tbl_Community_post
//	@OneToMany(mappedBy = "tblCommunity")
//	private Set<Tbl_Community_post> tblCommunityPosts;

//	// bi-directional many-to-one association to Tbl_Communtiy_img
//	@OneToMany(mappedBy = "tblCommunity")
//	private Set<Tbl_Communtiy_img> tblCommuntiyImgs;

//	// bi-directional many-to-one association to Tbl_Event
//	@OneToMany(mappedBy = "tblCommunity")
//	private Set<Tbl_Event> tblEvents;

	// bi-directional many-to-one association to Tbl_Userjoined_community
	@OneToMany(mappedBy = "tblCommunity")
	private Set<Tbl_Userjoined_community> tblUserjoinedCommunities;

	public Tbl_Community() {
	}

	public Long getCommunity_id() {
		return this.community_id;
	}

	public void setCommunity_id(Long community_id) {
		this.community_id = community_id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCommunity_desc() {
		return this.community_desc;
	}

	public void setCommunity_desc(String community_desc) {
		this.community_desc = community_desc;
	}

	public String getCommunity_latitude() {
		return this.community_latitude;
	}

	public void setCommunity_latitude(String community_latitude) {
		this.community_latitude = community_latitude;
	}

	public String getCommunity_location() {
		return this.community_location;
	}

	public void setCommunity_location(String community_location) {
		this.community_location = community_location;
	}

	public String getCommunity_longitude() {
		return this.community_longitude;
	}

	public void setCommunity_longitude(String community_longitude) {
		this.community_longitude = community_longitude;
	}

	public String getCommunity_name() {
		return this.community_name;
	}

	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
	}

	public String getCommunity_status() {
		return this.community_status;
	}

	public void setCommunity_status(String community_status) {
		this.community_status = community_status;
	}

	public String getCommunity_type() {
		return this.community_type;
	}

	public void setCommunity_type(String community_type) {
		this.community_type = community_type;
	}

	public String getCommunity_url() {
		return this.community_url;
	}

	public void setCommunity_url(String community_url) {
		this.community_url = community_url;
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

	public Set<Tbl_Activity> getTblActivities() {
		return this.tblActivities;
	}

	public void setTblActivities(Set<Tbl_Activity> tblActivities) {
		this.tblActivities = tblActivities;
	}

	public Tbl_Activity addTblActivity(Tbl_Activity tblActivity) {
		getTblActivities().add(tblActivity);
		tblActivity.setTblCommunity(this);

		return tblActivity;
	}

	public Tbl_Activity removeTblActivity(Tbl_Activity tblActivity) {
		getTblActivities().remove(tblActivity);
		tblActivity.setTblCommunity(null);

		return tblActivity;
	}

	public Tbl_User getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(Tbl_User tblUser) {
		this.tblUser = tblUser;
	}

//	public Set<Tbl_Community_admin> getTblCommunityAdmins() {
//		return this.tblCommunityAdmins;
//	}
//
//	public void setTblCommunityAdmins(
//			Set<Tbl_Community_admin> tblCommunityAdmins) {
//		this.tblCommunityAdmins = tblCommunityAdmins;
//	}

//	public Tbl_Community_admin addTblCommunityAdmin(
//			Tbl_Community_admin tblCommunityAdmin) {
//		getTblCommunityAdmins().add(tblCommunityAdmin);
//		tblCommunityAdmin.setTblCommunity(this);
//
//		return tblCommunityAdmin;
//	}
//
//	public Tbl_Community_admin removeTblCommunityAdmin(
//			Tbl_Community_admin tblCommunityAdmin) {
//		getTblCommunityAdmins().remove(tblCommunityAdmin);
//		tblCommunityAdmin.setTblCommunity(null);
//
//		return tblCommunityAdmin;
//	}

//	public Set<Tbl_Community_post> getTblCommunityPosts() {
//		return this.tblCommunityPosts;
//	}
//
//	public void setTblCommunityPosts(Set<Tbl_Community_post> tblCommunityPosts) {
//		this.tblCommunityPosts = tblCommunityPosts;
//	}
//
//	public Tbl_Community_post addTblCommunityPost(
//			Tbl_Community_post tblCommunityPost) {
//		getTblCommunityPosts().add(tblCommunityPost);
//		tblCommunityPost.setTblCommunity(this);
//
//		return tblCommunityPost;
//	}
//
//	public Tbl_Community_post removeTblCommunityPost(
//			Tbl_Community_post tblCommunityPost) {
//		getTblCommunityPosts().remove(tblCommunityPost);
//		tblCommunityPost.setTblCommunity(null);
//
//		return tblCommunityPost;
//	}

//	public Set<Tbl_Communtiy_img> getTblCommuntiyImgs() {
//		return this.tblCommuntiyImgs;
//	}
//
//	public void setTblCommuntiyImgs(Set<Tbl_Communtiy_img> tblCommuntiyImgs) {
//		this.tblCommuntiyImgs = tblCommuntiyImgs;
//	}
//
//	public Tbl_Communtiy_img addTblCommuntiyImg(
//			Tbl_Communtiy_img tblCommuntiyImg) {
//		getTblCommuntiyImgs().add(tblCommuntiyImg);
//		tblCommuntiyImg.setTblCommunity(this);
//
//		return tblCommuntiyImg;
//	}
//
//	public Tbl_Communtiy_img removeTblCommuntiyImg(
//			Tbl_Communtiy_img tblCommuntiyImg) {
//		getTblCommuntiyImgs().remove(tblCommuntiyImg);
//		tblCommuntiyImg.setTblCommunity(null);
//
//		return tblCommuntiyImg;
//	}

//	public Set<Tbl_Event> getTblEvents() {
//		return this.tblEvents;
//	}
//
//	public void setTblEvents(Set<Tbl_Event> tblEvents) {
//		this.tblEvents = tblEvents;
//	}
//
//	public Tbl_Event addTblEvent(Tbl_Event tblEvent) {
//		getTblEvents().add(tblEvent);
//		tblEvent.setTblCommunity(this);
//
//		return tblEvent;
//	}
//
//	public Tbl_Event removeTblEvent(Tbl_Event tblEvent) {
//		getTblEvents().remove(tblEvent);
//		tblEvent.setTblCommunity(null);
//
//		return tblEvent;
//	}

	public Set<Tbl_Userjoined_community> getTblUserjoinedCommunities() {
		return this.tblUserjoinedCommunities;
	}

	public void setTblUserjoinedCommunities(
			Set<Tbl_Userjoined_community> tblUserjoinedCommunities) {
		this.tblUserjoinedCommunities = tblUserjoinedCommunities;
	}

	public Tbl_Userjoined_community addTblUserjoinedCommunity(
			Tbl_Userjoined_community tblUserjoinedCommunity) {
		getTblUserjoinedCommunities().add(tblUserjoinedCommunity);
		tblUserjoinedCommunity.setTblCommunity(this);

		return tblUserjoinedCommunity;
	}

	public Tbl_Userjoined_community removeTblUserjoinedCommunity(
			Tbl_Userjoined_community tblUserjoinedCommunity) {
		getTblUserjoinedCommunities().remove(tblUserjoinedCommunity);
		tblUserjoinedCommunity.setTblCommunity(null);

		return tblUserjoinedCommunity;
	}

}