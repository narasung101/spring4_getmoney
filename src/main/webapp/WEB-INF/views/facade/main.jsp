<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../common/head.jsp"/>

<div class="container">

<div></div>
<div>로그인화면</div>
<div></div>
<div></div>
<div>

	<c:choose>
	
		<c:when test="${page eq 'login'}">
			<jsp:include page="login.jsp"/>
		</c:when>
		<c:when test="${page eq 'join'}">
			<jsp:include page="join.jsp"/>
		</c:when>
		<c:when test="${page eq 'mypage'}">
			<jsp:include page="mypage.jsp"/>
		</c:when>
		
	</c:choose>

</div>
<div></div>
<div></div>
<div></div>
<div></div>


<jsp:include page="../common/foot.jsp"/>


