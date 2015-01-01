package com.tieIn.model.dao.impl;

/**
 * @author Shomaila
 */
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tieIn.model.Tbl_Community;
import com.tieIn.model.Tbl_Community_post;
import com.tieIn.model.Tbl_Post_comment;
import com.tieIn.model.dao.IPostDao;

public class PostDaoImpl extends BaseJPADao implements IPostDao {

	public PostDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	//TODO: Sett tidsbegrensning på søk på poster og kommentarer!!!

	@Override
	public Set<Tbl_Post_comment> getPost(Long community_post_id) {
		String query = "select pc FROM Tbl_Post_comment pc  WHERE pc.community_post_id='"
				+ community_post_id + "' ORDER BY pc.createdDate desc";
		return new HashSet<Tbl_Post_comment>(getEntityManager().createQuery(query)
				.getResultList());
	}

	@Override
	public List<Tbl_Community_post> getCommunityPost(Long community_id) {
		String query = "select cp FROM Tbl_Community_post cp  WHERE cp.community_id='"
				+ community_id + "'  ORDER BY cp.createdDate desc";
		return (List<Tbl_Community_post>) getEntityManager().createQuery(query)
				.getResultList();
	}

}
