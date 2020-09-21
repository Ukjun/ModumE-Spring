<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="sectionContainerCenter">
	<div>
		<div class="err">${data.msg}</div>
		<form class="frm" id="frm" action="${pageContext.request.contextPath}/user/login" method="post">
			<div>
				<label>아이디</label><input type="text" name="user_id" placeholder="아이디" required>
			</div>
			<div>
				<label>비밀번호</label><input type="password" name="user_pw" placeholder="비밀번호" required>
			</div>
			<div>
				<button type="submit">로그인</button>
			</div>
		</form>
		<div>
			<a class="btn" href="${pageContext.request.contextPath}/user/join"><button>회원가입 화면으로</button></a>
		</div>
	</div>
</div>
