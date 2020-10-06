<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/common.css?ver=1" />
<head>
<title>${title}</title>
</head>
<body>
	<div id="containerGird">
		<header id="header">
			<jsp:include page="/WEB-INF/views/menu/topMenu.jsp"></jsp:include>
		</header>
		<div id="container">
			<section id="main_container">
				<jsp:include page="/WEB-INF/views/${viewPort}.jsp"></jsp:include>
			</section>
			<section id="right_container">
				<jsp:include page="/WEB-INF/views/${board}.jsp"></jsp:include>
			</section>
		</div>
		<footer id="footer">
			<jsp:include page="/WEB-INF/views/menu/bottomMenu.jsp"></jsp:include>
		</footer>
	</div>
</body>
</html>