package com.tieIn.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-11T20:45:38.052+0100")
@StaticMetamodel(Tbl_Community.class)
public class Tbl_Community_ {
	public static volatile SingularAttribute<Tbl_Community, Long> community_id;
	public static volatile SingularAttribute<Tbl_Community, Boolean> active;
	public static volatile SingularAttribute<Tbl_Community, String> community_desc;
	public static volatile SingularAttribute<Tbl_Community, String> community_latitude;
	public static volatile SingularAttribute<Tbl_Community, String> community_location;
	public static volatile SingularAttribute<Tbl_Community, String> community_longitude;
	public static volatile SingularAttribute<Tbl_Community, String> community_name;
	public static volatile SingularAttribute<Tbl_Community, String> community_status;
	public static volatile SingularAttribute<Tbl_Community, String> community_type;
	public static volatile SingularAttribute<Tbl_Community, String> community_url;
	public static volatile SingularAttribute<Tbl_Community, Timestamp> createdDate;
	public static volatile SingularAttribute<Tbl_Community, Timestamp> modifiedDate;
	public static volatile SingularAttribute<Tbl_Community, Long> user_id;
	public static volatile SetAttribute<Tbl_Community, Tbl_Activity> tblActivities;
	public static volatile SingularAttribute<Tbl_Community, Tbl_User> tblUser;
	public static volatile SetAttribute<Tbl_Community, Tbl_Community_admin> tblCommunityAdmins;
	public static volatile SetAttribute<Tbl_Community, Tbl_Community_post> tblCommunityPosts;
	public static volatile SetAttribute<Tbl_Community, Tbl_Communtiy_img> tblCommuntiyImgs;
	//public static volatile SetAttribute<Tbl_Community, Tbl_Event> tblEvents;
	public static volatile SetAttribute<Tbl_Community, Tbl_Userjoined_community> tblUserjoinedCommunities;
}
