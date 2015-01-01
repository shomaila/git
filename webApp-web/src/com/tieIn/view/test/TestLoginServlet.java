package com.tieIn.view.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tieIn.view.LoginServlet;

public class TestLoginServlet {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDoPost() throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);
		RequestDispatcher dispatcher = new RequestDispatcher() {

			@Override
			public void include(ServletRequest arg0, ServletResponse arg1)
					throws ServletException, IOException {
				// TODO Auto-generated method stub

			}

			@Override
			public void forward(ServletRequest arg0, ServletResponse arg1)
					throws ServletException, IOException {
				// TODO Auto-generated method stub

			}
		};
		when(request.getRequestDispatcher("welcome.jsp"))
				.thenReturn(dispatcher);
		when(request.getSession()).thenReturn(session);
		when(request.getParameter("username")).thenReturn(
				"hakonmushom@gmail.com");
		when(request.getParameter("password")).thenReturn("haakonmushom");
		PrintWriter writer = new PrintWriter("somefile.txt");
		when(response.getWriter()).thenReturn(writer);

		new LoginServlet().doPost(request, response);

	}

	@After
	public void tearDown() {

	}

}
