<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="loginstyle.css">

</head>
<body>


	<br>
	<form method="post" action="LogoutServlet">

		<img src="resources/logo.jpg" style="padding-left: 5%;" width="60"
			height="40"> <input type="text" name="Query" size="20">
		<input type="button" value="   "
			style="background-image: url('resources/searchButton.gif');"
			onclick="doSearch(this.form.Query);" /> Logget inn som:
		${sessionScope['username']} <input type="submit" value="Logout"
			id="styled-button" style="float: right; margin-right: 5%;" />

	</form>
</body>
<script type="text/javascript">
	function doSearch(s) {
		var regExp1 = /\bjævla\b/;
		var regExp2 = /[(,),<,>,\[,\]]/;
		var str = s.value;
		if (str == "") {
			alert("Søkefeltet er tomt!");
			s.focus();
		} else {
			if (typeof regExp1.source != 'undefined') //supports regular expression testing 
				if (regExp1.test(str) || regExp2.test(str)) {
					var alrt = "Please note that you can not include:";
					alrt += "\n\nThe reserved word 'field'\nthe characters [, ], (, ), < or >";
					alrt += "\n\nin your search query!\n\nIf you are confident that you know";
					alrt += "\nwhat you are doing, then you can\nmanually produce the URL required."
					s.focus();
					return alert(alrt);
				}
			openDbRelativeURL("All?SearchView&Query=" + escape(str)
					+ "&start=1&count=10");
		}
	}
</script>
</html>