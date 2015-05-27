<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
<title>${param.title}</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-2.0.3.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>

	<div class="navbar navbar-inverse " role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<c:url value="/" />">Blotnix</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="${param.page == 'index' ? 'active' : ''}"><a href="<c:url value="/" />">Home</a></li>
					<li class="${param.page == 'zasoby' ? 'active' : ''}"><a href="<c:url value="/zasoby.html" />">Zasoby</a></li>
					<li class="${param.page == 'harmonogram' ? 'active' : ''}"><a href="<c:url value="/harmonogram.html" />">Harmonogram</a></li>
					<li class="${param.page == 'kontakt' ? 'active' : ''}"><a href="<c:url value="/kontakt.html" />">Kontakt</a></li>
					<li class="${param.page == 'upload' ? 'active' : ''}"><a href="<c:url value="/upload.html" />">Upload</a></li>
					<li class="${param.page == 'download' ? 'active' : ''}"><a href="<c:url value="/download.html" />">Download</a></li>
					<li class="${param.page == 'raporty' ? 'active' : ''}"><a href="<c:url value="/raporty.html" />">Raporty</a></li>
					<li class="${param.page == 'emailForm' ? 'active' : ''}"><a href="<c:url value="/emailForm.html" />">SendEmail</a></li>
					<li class="${param.page == 'recvForm' ? 'active' : ''}"><a href="<c:url value="/recvForm.html" />">RecvEmail</a></li>
					<security:authorize access="hasRole('ROLE_ADMIN')">
						<li class="${param.page == 'chatroom' ? 'active' : ''}"><a href="<c:url value="/chatroom.html" />">New Chatroom</a></li>
						<li class="${param.page == 'task' ? 'active' : ''}"><a href="<c:url value="/task.html" />">New Task</a></li>
			
					</security:authorize>
					<li class="${param.page == 'list' ? 'active' : ''}"><a href="<c:url value="/chatroom/list.html" />">Chatroom List</a></li>
					<li class="${param.page == 'tasklist' ? 'active' : ''}"><a href="<c:url value="/task/tasklist.html" />">Task List</a></li>
			
			
					<security:authorize access="isAuthenticated()" var="loggedIn" />
					<c:choose>
						<c:when test="${loggedIn}">
						     <li><a href="<spring:url value="/logout" />">Logout</a></li>
						
							
						</c:when>
						<c:otherwise>
						
							<li class="${param.page == 'login' ? 'active' : ''}"><a href="<c:url value="/log.html" />">Login</a></li>
						</c:otherwise>
					</c:choose>
					<security:authorize access="hasRole('ROLE_ADMIN')">
						<li class="${param.page == 'users' ? 'active' : ''}"><a href="<c:url value="/users.html" />">Users</a></li>
					</security:authorize>
					<security:authorize access="hasRole('ROLE_ADMIN')">
							<li class="${param.page == 'usersAdd' ? 'active' : ''}"><a href="<c:url value="/users/add.html" />">Register new user</a></li>
					</security:authorize>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>

	<div class="container">
	
	<br><br><br>