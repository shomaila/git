/**
 * 26. des. 2014
* @suthor 
 */
package com.tieIn.model.dao.tests;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.tieIn.model.Tbl_Community_post;
import com.tieIn.model.Tbl_Post_comment;
import com.tieIn.model.dao.impl.PostDaoImpl;

/**
 * @author Shomaila
 *
 */
public class PostDaoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	//TODO: Fjern system.out.println
	public void testPostAndComment() {
		Long community_id = (long) 120;
		PostDaoImpl postDao = new PostDaoImpl();
		
		List<Tbl_Community_post> community_posts = postDao.getCommunityPost(community_id);
		Iterator<Tbl_Community_post> it = community_posts.iterator();
		
		while (it.hasNext()){
			Tbl_Community_post post = it.next();
			System.out.println("**********************************************");
			System.out.println("Hovedpost-:"+post.getCommunity_post());
			Set<Tbl_Post_comment> comments = postDao.getPost((post.getCommunity_post_id()));
		
			Iterator<Tbl_Post_comment> cIt = comments.iterator();
			while(cIt.hasNext()){
				Tbl_Post_comment  comment= cIt.next();
				System.out.println(comment.getTblUser().getUser_name()+": "+comment.getComment());
			}
			
		}
		assertTrue(community_posts!=null);
	}

}
