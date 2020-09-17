<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>
<P>  The time on the server is ${serverTime}. </P>
	<section id="container">
		<jsp:include page="/WEB-INF/views/${view}.jsp"></jsp:include>
	</section>
</body>
</html>