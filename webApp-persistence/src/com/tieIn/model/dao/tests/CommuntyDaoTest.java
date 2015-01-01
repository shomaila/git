package com.tieIn.model.dao.tests;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.tieIn.model.Tbl_Community;
import com.tieIn.model.dao.impl.CommunityDAOImpl;

public class CommuntyDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testUsersCommunity() {
		Long id = (long) 176;
		CommunityDAOImpl communityDAO = (CommunityDAOImpl) new CommunityDAOImpl();
		String test = null;

		Iterator<Tbl_Community> it = communityDAO.getUserCommunity(id)
				.iterator();
		while (it.hasNext()) {
			Tbl_Community com = it.next();
			System.out.println(com.getCommunity_id() + "-"
					+ com.getCommunity_name());
			test = "Ok";
		}

		assertTrue("Ok", test != null);
	}

	@Test
	public void testGetCommunityImage() {
		Long id = (long) 300;
		CommunityDAOImpl communityDAO = (CommunityDAOImpl) new CommunityDAOImpl();
	String url = null;

		
		url= communityDAO.getCommunity_image(id);
	
		
		assertTrue(url, url!=null);
	}
}
