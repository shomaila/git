package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the "Tbl_Community_post" database table.
 * 
 */
@Entity
@Table(name="\"Tbl_Community_post\"")
@NamedQuery(name="Tbl_Community_post.findAll", query="SELECT t FROM Tbl_Community_post t")
public class Tbl_Community_post implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"Community_post_id\"", unique=true, nullable=false)
	private Long community_post_id;

	@Column(name="\"Active\"", nullable=false)
	private Boolean active;

	@Column(name="\"Community_id\"", nullable=false)
	private Long community_id;

	@Column(name="\"Community_post\"", length=2147483647)
	private String community_post;

	@Column(name="\"Community_post_type\"", length=2147483647)
	private String community_post_type;

	@Column(name="created_date", nullable=false)
	private Timestamp createdDate;

	@Column(name="modified_date", nullable=false)
	private Timestamp modifiedDate;

	@Column(name="\"Post_image\"", length=2147483647)
	private String post_image;

	@Column(name="\"Post_video\"", length=2147483647)
	private String post_video;

	@Column(name="\"Post_video_thumb\"", length=2147483647)
	private String post_video_thumb;

	@Column(name="\"User_id\"", nullable=false)
	private Long user_id;

	//bi-directional many-to-one association to Tbl_Activity
	@OneToMany(mappedBy="tblCommunityPost")
	private Set<Tbl_Activity> tblActivities;

	//bi-directional many-to-one association to Tbl_Community
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"Community_id\"")
	private Tbl_Community tblCommunity;

	//bi-directional many-to-one association to Tbl_User
	@ManyToOne
	@PrimaryKeyJoinColumn(name="\"User_id\"")
	private Tbl_User tblUser;

	//bi-directional many-to-one association to Tbl_Post_comment
	@OneToMany(mappedBy="tblCommunityPost")
	private Set<Tbl_Post_comment> tblPostComments;

	public Tbl_Community_post() {
	}

	public Long getCommunity_post_id() {
		return this.community_post_id;
	}

	public void setCommunity_post_id(Long community_post_id) {
		this.community_post_id = community_post_id;
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

	public String getCommunity_post() {
		return this.community_post;
	}

	public void setCommunity_post(String community_post) {
		this.community_post = community_post;
	}

	public String getCommunity_post_type() {
		return this.community_post_type;
	}

	public void setCommunity_post_type(String community_post_type) {
		this.community_post_type = community_post_type;
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

	public String getPost_image() {
		return this.post_image;
	}

	public void setPost_image(String post_image) {
		this.post_image = post_image;
	}

	public String getPost_video() {
		return this.post_video;
	}

	public void setPost_video(String post_video) {
		this.post_video = post_video;
	}

	public String getPost_video_thumb() {
		return this.post_video_thumb;
	}

	public void setPost_video_thumb(String post_video_thumb) {
		this.post_video_thumb = post_video_thumb;
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

//	public Tbl_Activity addTblActivity(Tbl_Activity tblActivity) {
//		getTblActivities().add(tblActivity);
//		tblActivity.setTblCommunityPost(this);
//
//		return tblActivity;
//	}
//
//	public Tbl_Activity removeTblActivity(Tbl_Activity tblActivity) {
//		getTblActivities().remove(tblActivity);
//		tblActivity.setTblCommunityPost(null);
//
//		return tblActivity;
//	}

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

	public Set<Tbl_Post_comment> getTblPostComments() {
		return this.tblPostComments;
	}

	public void setTblPostComments(Set<Tbl_Post_comment> tblPostComments) {
		this.tblPostComments = tblPostComments;
	}

//	public Tbl_Post_comment addTblPostComment(Tbl_Post_comment tblPostComment) {
//		getTblPostComments().add(tblPostComment);
//		tblPostComment.setTblCommunityPost(this);
//
//		return tblPostComment;
//	}
//
//	public Tbl_Post_comment removeTblPostComment(Tbl_Post_comment tblPostComment) {
//		getTblPostComments().remove(tblPostComment);
//		tblPostComment.setTblCommunityPost(null);
//
//		return tblPostComment;
//	}

}