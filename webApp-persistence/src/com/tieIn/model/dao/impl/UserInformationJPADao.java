package com.tieIn.model.dao.impl;

import com.tieIn.model.Tbl_User;
import com.tieIn.model.dao.IUserDao;

public class UserInformationJPADao extends BaseJPADao implements IUserDao {

	public UserInformationJPADao() {
		// TODO Auto-generated constructor stub
	}

	public Tbl_User getUserWithId(Long id) {
		return getEntityManager().find(Tbl_User.class, id);
	}

	@Override
	public String getUser_email() {
		Tbl_User user = getEntityManager().find(Tbl_User.class, "");
		return user.getUser_email();
	}
	
	public Tbl_User getUserWitLoginInfo(String email, String password) {
		//TODO: User_firstname skal erstattes med User_pwd2
		String query ="select u FROM Tbl_User u  WHERE u.user_email='"+email+"' AND u.user_firstname='"+password+"'";
	return	(Tbl_User) getEntityManager().createQuery(query).getSingleResult();
	}

}
