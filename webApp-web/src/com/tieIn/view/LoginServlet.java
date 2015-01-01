package com.tieIn.view;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tieIn.model.Tbl_Community;
import com.tieIn.model.Tbl_Community_post;
import com.tieIn.model.Tbl_Post_comment;
import com.tieIn.model.Tbl_User;
import com.tieIn.model.dao.impl.CommunityDAOImpl;
import com.tieIn.model.dao.impl.PostDaoImpl;
import com.tieIn.model.dao.impl.UserInformationJPADao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = null;
		RequestDispatcher dispatcher = null;
		String email = request.getParameter("username");
		String password = request.getParameter("password");

		UserInformationJPADao userInformationJPADao = (UserInformationJPADao) new UserInformationJPADao();
		Tbl_User user = userInformationJPADao.getUserWitLoginInfo(email,
				password);
		if (user != null) {

			session = request.getSession();
			session.setAttribute("username", user.getUser_firstname());
			session.setAttribute("User", user);
			getCommunityInformation(session, user);
			dispatcher = request.getRequestDispatcher("welcome.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("failure.jsp");
		}

		dispatcher.forward(request, response);

	}

	/**
	 * Collects information about Communities and add that to the session
	 * 
	 * @param user
	 * @param session
	 */
//TODO: Fjern system.out
	private void getCommunityInformation(HttpSession session, Tbl_User user) {
		CommunityDAOImpl communityDAO = new CommunityDAOImpl();
		List<Tbl_Community> communities = communityDAO.getUserCommunity(user
				.getUser_id());
		if (communities != null && communities.size()>0) {
			System.out.println("Antall com er lik:" + communities.size());
			session.setAttribute("Communities", communities);
			if(communities.size()>0){
			Long community_id = communities.get(0).getCommunity_id();
			session.setAttribute("Chosen_community", communities.get(0));
			getPostAndCommentsForFirstCommunity(session, user,
					community_id);
			session.setAttribute("img_url", communityDAO.getCommunity_image(community_id));
			}
		}
	}

	/**
	 * Henter ut postene til community nr 1, samt kommentarer på disse postene.
	 * Dette søker bør avgrenses i dao til å ikke være med en et gitt antall
	 * dager tilbake i tid
	 * 
	 * @param session
	 * @param user
	 * @param community_id
	 */
	private void getPostAndCommentsForFirstCommunity(HttpSession session,
			Tbl_User user, Long community_id) {
		PostDaoImpl postDao = new PostDaoImpl();
		List<Tbl_Community_post> communityPosts = postDao
				.getCommunityPost(community_id);
		Iterator<Tbl_Community_post> it = communityPosts.iterator();

		while (it.hasNext()) {
			Tbl_Community_post post = it.next();
			Set<Tbl_Post_comment> comments = postDao.getPost((post
					.getCommunity_post_id()));
			post.setTblPostComments(comments);
		}
		session.setAttribute("Community_posts", communityPosts);
	
	}
}