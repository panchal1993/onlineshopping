<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%><!-- Spring tag library from the net -->
<!-- Three variable for loading the static resources from the file residing on the server -->
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>PaNcHaL's CaRt -${title}</title>
<!-- Small script to change the color of selected page in nav bar -->
<script type="text/javascript">
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap other theme to make it look funky, downloaded from Bootswatch -->
<link href="${css}/othertheme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/mycss.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./sharedsection/navbar.jsp"%>

	<!-- Page Content Main Content part-->
	<c:if test="${userClickHome == true }">
		<%@include file="./mainContent.jsp"%>
	</c:if>

	<!-- Only when user Clicks about -->
	<c:if test="${userClickAbout == true }">
		<%@include file="./about.jsp"%>
	</c:if>

	<!-- Only when user Clicks contact -->
	<c:if test="${userClickContact == true }">
		<%@include file="./contact.jsp"%>
	</c:if>

	<!-- Footer -->
	<%@include file="./sharedsection/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>

	<!-- myjs for the active menu fix on the nav bar -->
	<script src="${js}/myjs.js"></script>
</body>

</html>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping</title>
</head>
<body>${contextRoot} says - ${greeting}
</body>
</html>
-->