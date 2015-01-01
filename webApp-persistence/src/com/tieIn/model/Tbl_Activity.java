package com.tieIn.model;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

/**
 * The persistent class for the "Tbl_Activity" database table.
 * @author Shomaila
 * 
 */
@Entity
@Table(name = "\"Tbl_Activity\"")
@NamedQuery(name = "Tbl_Activity.findAll", query = "SELECT t FROM Tbl_Activity t")
public class Tbl_Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "\"Activity_id\"", unique = true, nullable = false)
	private Long activity_id;

	@Column(name = "\"Active\"", nullable = false)
	private Boolean active;

	@Column(name = "\"Activity_type\"", length = 2147483647)
	private String activity_type;

	@Column(name = "\"Comment_id\"")
	private Long comment_id;

	@Column(name = "\"Community_id\"")
	private Long community_id;

	@Column(name = "\"Community_post_id\"")
	private Long community_post_id;

	@Column(name = "created_date", nullable = false)
	private Timestamp createdDate;

	@Column(name = "\"Event_id\"")
	private Long event_id;

	@Column(name = "modified_date", nullable = false)
	private Timestamp modifiedDate;

	@Column(name = "\"User_id\"")
	private Long user_id;

	// bi-directional many-to-one association to Tbl_Community
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"Community_id\"")
	private Tbl_Community tblCommunity;

	// bi-directional many-to-one association to Tbl_Community_post
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"Community_post_id\"")
	private Tbl_Community_post tblCommunityPost;

	// bi-directional many-to-one association to Tbl_Event
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"Event_id\"")
	private Tbl_Event tblEvent;

	// bi-directional many-to-one association to Tbl_Post_comment
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"Community_post_id\"")
	private Tbl_Post_comment tblPostComment;

	// bi-directional many-to-one association to Tbl_User
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "\"User_id\"")
	private Tbl_User tblUser;

//	// bi-directional many-to-one association to Tbl_Notification_view
//	@OneToMany(mappedBy = "tblActivity")
//	private Set<Tbl_Notification_view> tblNotificationViews;

	public Tbl_Activity() {
	}

	public Long getActivity_id() {
		return this.activity_id;
	}

	public void setActivity_id(Long activity_id) {
		this.activity_id = activity_id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getActivity_type() {
		return this.activity_type;
	}

	public void setActivity_type(String activity_type) {
		this.activity_type = activity_type;
	}

	public Long getComment_id() {
		return this.comment_id;
	}

	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}

	public Long getCommunity_id() {
		return this.community_id;
	}

	public void setCommunity_id(Long community_id) {
		this.community_id = community_id;
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

	public Long getEvent_id() {
		return this.event_id;
	}

	public void setEvent_id(Long event_id) {
		this.event_id = event_id;
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

	public Tbl_Community_post getTblCommunityPost() {
		return this.tblCommunityPost;
	}

	public void setTblCommunityPost(Tbl_Community_post tblCommunityPost) {
		this.tblCommunityPost = tblCommunityPost;
	}

	public Tbl_Event getTblEvent() {
		return this.tblEvent;
	}

	public void setTblEvent(Tbl_Event tblEvent) {
		this.tblEvent = tblEvent;
	}

	public Tbl_Post_comment getTblPostComment() {
		return this.tblPostComment;
	}

	public void setTblPostComment(Tbl_Post_comment tblPostComment) {
		this.tblPostComment = tblPostComment;
	}

	public Tbl_User getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(Tbl_User tblUser) {
		this.tblUser = tblUser;
	}

//	public Set<Tbl_Notification_view> getTblNotificationViews() {
//		return this.tblNotificationViews;
//	}
//
//	public void setTblNotificationViews(
//			Set<Tbl_Notification_view> tblNotificationViews) {
//		this.tblNotificationViews = tblNotificationViews;
//	}

//	public Tbl_Notification_view addTblNotificationView(
//			Tbl_Notification_view tblNotificationView) {
//		getTblNotificationViews().add(tblNotificationView);
//		tblNotificationView.setTblActivity(this);
//
//		return tblNotificationView;
//	}
//
//	public Tbl_Notification_view removeTblNotificationView(
//			Tbl_Notification_view tblNotificationView) {
//		getTblNotificationViews().remove(tblNotificationView);
//		tblNotificationView.setTblActivity(null);
//
//		return tblNotificationView;
//	}

}