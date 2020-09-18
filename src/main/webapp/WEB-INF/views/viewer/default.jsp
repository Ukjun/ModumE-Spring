<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css"/>
<head>
<title>${title}</title>
</head>
<body>
<div id="containerGird">
		<header id="header">
			<jsp:include page="/WEB-INF/views/${topView}.jsp"></jsp:include>
		</header>
		<section id="container">
			<jsp:include page="/WEB-INF/views/${view}.jsp"></jsp:include>
		</section>
		<footer id="footer">
			<jsp:include page="/WEB-INF/views/${bottomView}.jsp"></jsp:include>
		</footer>
	</div>
</body>
</html>