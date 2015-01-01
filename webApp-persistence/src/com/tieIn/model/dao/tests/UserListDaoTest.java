package com.tieIn.model.dao.tests;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.tieIn.model.Tbl_Community;
import com.tieIn.model.Tbl_User;
import com.tieIn.model.dao.impl.UserInformationJPADao;

public class UserListDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetUsersList() {
		Long id = (long) 176;
		UserInformationJPADao userInformationJPADao = (UserInformationJPADao) new UserInformationJPADao();
		Tbl_User user = userInformationJPADao.getUserWithId(id);

		String epost = user.getUser_email();
		System.out.println(epost);
		System.out.println(user.getUser_firstname() + " "
				+ user.getUser_lastname());
	
		assertTrue("Epost funnet", epost != null);
		assertFalse("Epost ikke funnet", epost == null);
	}

}
