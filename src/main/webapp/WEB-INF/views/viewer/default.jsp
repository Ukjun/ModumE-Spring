<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/common.css?ver=1">
<title>${title}</title>
</head>
<body>
<div id="containerGird">
		<header id="header">
			<div  class="delimiter">
				<span>Header</span>
			</div>
		</header>
		<div id="menubar">
			<div class="delimiter">
				<span>Menu-bar</span>
			</div>
		</div>
		<section id="container">
			<div class="delimiter">
				<span>container</span>
			</div>
			<jsp:include page="/WEB-INF/views/${view}.jsp"></jsp:include>
		</section>
		<footer id="footer">
			<div class="delimiter">
				<span>footer</span>
			</div>
		</footer>
	</div>
</body>
</html>