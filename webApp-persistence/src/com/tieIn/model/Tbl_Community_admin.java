package com.tieIn.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-11T21:51:41.219+0100")
@StaticMetamodel(Tbl_Community_admin.class)
public class Tbl_Community_admin {
	public static volatile SingularAttribute<Tbl_Community_admin, Boolean> active;
	public static volatile SingularAttribute<Tbl_Community_admin, Long> community_admin_id;
	public static volatile SingularAttribute<Tbl_Community_admin, Long> community_id;
	public static volatile SingularAttribute<Tbl_Community_admin, Timestamp> createdDate;
	public static volatile SingularAttribute<Tbl_Community_admin, Timestamp> modifiedDate;
	public static volatile SingularAttribute<Tbl_Community_admin, Long> user_id;
	public static volatile SingularAttribute<Tbl_Community_admin, Tbl_Community> tblCommunity;
	public static volatile SingularAttribute<Tbl_Community_admin, Tbl_User> tblUser;
	public void setTblCommunity(Tbl_Community tbl_Community) {
		// TODO Auto-generated method stub
		
	}
}
