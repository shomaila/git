package com.tieIn.model.dao;

import java.util.List;
import java.util.Set;

import com.tieIn.model.*;
/**
 * da
 * @author Shomaila
 *
 */
public interface IPostDao {

	public List<Tbl_Community_post> getCommunityPost(Long community_id);
	public Set<Tbl_Post_comment> getPost(Long community_post_id);
	
	
}
