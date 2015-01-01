<%@page import="com.tieIn.model.Tbl_Community"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.tieIn.model.Tbl_User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<jsp:useBean id="community" class="com.tieIn.model.Tbl_Community"
	scope="session" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css">

</head>
<body>
</html>
<body>
	<%
		Tbl_User user = (Tbl_User)session.getAttribute("User");
	%>
	<table>
		<tr>
			<td><img src="<%out.print(user.getUser_picurl());%>" width="40"
				height="40"></td>
			<td>
				<%
					out.print(user.getUser_firstname()+" ");
				if (user.getUser_lastname()!= null){out.print(user.getUser_lastname());}
				%>
			</td>
		</tr>
	</table>
	<p>

		<b>Communities</b>
	<p><ul>
		<%
			List<Tbl_Community> coms =  (List<Tbl_Community>)session.getAttribute("Communities");
			Iterator it = coms.iterator();
			while (it.hasNext()){
			Tbl_Community com_printable =(Tbl_Community) it.next();
		%>
	
	<li>
		<%
			out.print(com_printable.getCommunity_name());
		%>
	</li>

	<%
		}
	%></ul>

<p>
Explorer
<p>
Suggest an idea <p> 

<b> Files</b>
<p> tbd
</body>
</html>
