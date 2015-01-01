package com.tieIn.model.dao;

import com.tieIn.model.Tbl_User;


public interface IUserDao {

	/**
	 * A DAO for providing list of user information
	 */

	public String getUser_email();
	public Tbl_User getUserWithId(Long id);
	public Tbl_User getUserWitLoginInfo(String email, String password);
}
