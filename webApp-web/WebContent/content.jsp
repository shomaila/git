<%@page import="com.tieIn.model.Tbl_Post_comment"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.tieIn.model.Tbl_Community_post"%>
<%@page import="com.tieIn.model.Tbl_Community"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<script type="text/javascript" src="js/script.js"></script>
<jsp:useBean id="community_post"
	class="com.tieIn.model.Tbl_Community_post" scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.3.2.js" ></script>
<script type="text/javascript" src="js/jquery.quickflip.js" ></script>
<script type="text/javascript" >
	$('document').ready(function(){
		$('#flip-container').quickFlip();
		
		$('#flip-navigation li a').each(function(){
			$(this).click(function(){
				$('#flip-navigation li').each(function(){
					$(this).removeClass('selected');
				});
				$(this).parent().addClass('selected');
				var flipid=$(this).attr('id').substr(4);
				$('#flip-container').quickFlipper('', flipid, 1);
				
				return false;
			});
		});
	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="loginstyle.css">
</head>
<body>
	<%
		Tbl_Community chosen_community = (Tbl_Community)session.getAttribute("Chosen_community");
	%>
	<table width="90%">
		<tr>
			<td><center>
					<img src="<%out.print(session.getAttribute("img_url"));%>" width="70"
						height="70">
				</center></td>

			<td><table>
					<tr>
						<td width="70%"><b>							<%
								out.print(chosen_community.getCommunity_name());
							%></b>
							
						</td>
						<td width="30%">Setting(admin roller)</td>
					</tr>
					<tr>
						<td>
							<%
								out.print(chosen_community.getCommunity_status());
							%>
						</td>
						<td>
							<%
								out.println("Antall...");
							%>
						</td>
					</tr>
				</table></td>
		</tr>
	</table>

	<p>
	
	<div id="flip-tabs">
		<ul id="flip-navigation">
			<li class="selected"><a href="#" id="tab-0">Posts</a></li>
			<li><a href="#" id="tab-1">Events</a></li>
			<li><a href="#" id="tab-2">Files</a></li>
		</ul>
		<div id="flip-container">
			<div>
<p>
Share an update | Add a photo/file | Suggest an idea | 
<p>

			<TABLE BORDER=1>

					<%
						List<Tbl_Community_post> communityPosts =  (List<Tbl_Community_post>)session.getAttribute("Community_posts");
						Iterator it = communityPosts.iterator();
						while (it.hasNext()){
						Tbl_Community_post com_post_printable =(Tbl_Community_post) it.next();
					%>
					<TABLE>
						<tr>
							<td><img
								src="<%out.print(com_post_printable.getTblUser().getUser_picurl());%>"
								height="40" width="40"></td>
							<td><table>
									<tr>
										<td><b> <%
 	out.print(com_post_printable.getTblUser().getUser_name());
 %>
										</b>:</td>
									</tr>
									<tr>
										<td>
											<%
												out.print(com_post_printable.getCommunity_post());
											%>
										</td>
									</tr>
								</table>
						<tr>

							<%
								if(com_post_printable.getTblPostComments()!=null){
															Iterator comments = com_post_printable.getTblPostComments().iterator();
															while(comments.hasNext()){
											 					Tbl_Post_comment comment = (Tbl_Post_comment)comments.next();
							%>
							<td><img
								src="<%out.print(comment.getTblUser().getUser_picurl());%>"
								height="30" width="30"></td>
							<td>
								<%
									out.print((comment.getTblUser().getUser_name())+": "+comment.getComment());
								%>
							</td>
						</tr>
						<%
							}//slutt while
								}//sluff if
						%>

						<tr></tr>
					</table>
					<p>
						<%
							}
						%>
					
			</div>
			<div>Her kommer noe for events</div>
			<div>Her kommer filene...</div>
		</div>
	</div>




</body>
</html>