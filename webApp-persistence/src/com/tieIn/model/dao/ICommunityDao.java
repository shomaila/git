package com.tieIn.model.dao;

import java.util.List;

import com.tieIn.model.Tbl_Community;
import com.tieIn.model.Tbl_Community_post;

/**
 * 
 * @author Shomaila
 *
 */
public interface ICommunityDao {

	public List<Tbl_Community_post> getCommunityPost(Long communityId);
	public List<Tbl_Community> getUserCommunity(Long userId);
	public String getCommunity_image(Long community_id);
}
