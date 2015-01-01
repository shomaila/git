package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the "Tbl_Post_comment" database table.
 * 
 */
@Entity
@Table(name="\"Tbl_Post_comment\"")
@NamedQuery(name="Tbl_Post_comment.findAll", query="SELECT t FROM Tbl_Post_comment t")
public class Tbl_Post_comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"Comment_id\"", unique=true, nullable=false)
	private Long comment_id;

	@Column(name="\"Active\"", nullable=false)
	private Boolean active;

	@Column(name="\"Comment\"", length=2147483647)
	private String comment;

	@Column(name="\"Comment_type\"", length=2147483647)
	private String comment_type;

	@Column(name="\"Community_post_id\"", nullable=false)
	private Long community_post_id;

	@Column(name="created_date", nullable=false)
	private Timestamp createdDate;

	@Column(name="modified_date", nullable=false)
	private Timestamp modifiedDate;

	@Column(name="\"User_id\"", nullable=false)
	private Long user_id;

	//bi-directional many-to-one association to Tbl_Activity
	@OneToMany(mappedBy="tblPostComment")
	private Set<Tbl_Activity> tblActivities;

	//bi-directional many-to-one association to Tbl_Community_post
	@ManyToOne
	@PrimaryKeyJoinColumn(name="\"Community_post_id\"")
	private Tbl_Community_post tblCommunityPost;

	//bi-directional many-to-one association to Tbl_User
	@ManyToOne
	@PrimaryKeyJoinColumn(name="\"User_id\"")
	private Tbl_User tblUser;

	public Tbl_Post_comment() {
	}

	public Long getComment_id() {
		return this.comment_id;
	}

	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getComment_type() {
		return this.comment_type;
	}

	public void setComment_type(String comment_type) {
		this.comment_type = comment_type;
	}

	public Long getCommunity_post_id() {
		return this.community_post_id;
	}

	public void setCommunity_post_id(Long community_post_id) {
		this.community_post_id = community_post_id;
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
		tblActivity.setTblPostComment(this);

		return tblActivity;
	}

	public Tbl_Activity removeTblActivity(Tbl_Activity tblActivity) {
		getTblActivities().remove(tblActivity);
		tblActivity.setTblPostComment(null);

		return tblActivity;
	}

	public Tbl_Community_post getTblCommunityPost() {
		return this.tblCommunityPost;
	}

	public void setTblCommunityPost(Tbl_Community_post tblCommunityPost) {
		this.tblCommunityPost = tblCommunityPost;
	}

	public Tbl_User getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(Tbl_User tblUser) {
		this.tblUser = tblUser;
	}

}