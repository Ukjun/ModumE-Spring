<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="mainMenu">
	<div class="leftMenu"></div>
	<div class="rightMenu">
		<div><a href="${pageContext.request.contextPath}/">Main</a></div>
		<div><a href="${pageContext.request.contextPath}/board/stream">Stream</a></div>
		<div><a href="${pageContext.request.contextPath}/board/search">Search</a></div>
		<div><a href="${pageContext.request.contextPath}/user/info">My info</a></div>
		<div>
		<c:if test="${loginUser == null }"><a href="${pageContext.request.contextPath}/user/login">login</a></c:if>
		<c:if test="${loginUser != null }"><a href="${pageContext.request.contextPath}/user/logout">logout</a></c:if>
		</div>
	</div>
</div>