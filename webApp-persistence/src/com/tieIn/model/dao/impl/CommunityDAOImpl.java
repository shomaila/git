/**
 * 25. des. 2014
 * @suthor 
 */
package com.tieIn.model.dao.impl;

import java.util.List;

import com.tieIn.model.Tbl_Community;
import com.tieIn.model.Tbl_Community_post;
import com.tieIn.model.Tbl_Communtiy_img;
import com.tieIn.model.dao.ICommunityDao;

/**
 * @author Shomaila
 * 
 */
public class CommunityDAOImpl extends BaseJPADao implements ICommunityDao {

	/**
	 * 
	 */
	public CommunityDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tieIn.model.dao.ICommunityDao#getCommunityPost(java.lang.Long)
	 */
	@Override
	public List<Tbl_Community_post> getCommunityPost(Long communityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tbl_Community> getUserCommunity(Long userId) {
		String query = "select c FROM Tbl_Community c, Tbl_Userjoined_community uc  WHERE uc.user_id='"
				+ userId
				+ "' AND uc.community_id = c.community_id ORDER BY c.community_name ASC";
		return (List<Tbl_Community>) getEntityManager().createQuery(query)
				.getResultList();
	}
	
	@Override
	public String getCommunity_image(Long community_id) {
		String query = "SELECT tc FROM Tbl_Communtiy_img tc WHERE tc.community_id = '"+community_id+"'";
		return (String)( (Tbl_Communtiy_img) getEntityManager().createQuery(query)
				.getSingleResult()).getCommunity_img_url();
	}

}
