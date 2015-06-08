<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="layout/header.jsp">
	<jsp:param value="Download" name="title" />
	<jsp:param value="download" name="page" />
</jsp:include>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC download files</title>
</head>
<body>
	<div id="0" align="center">
		<font size='6'><strong>Download file</strong></font>
	</div>
	<ul class="navi-menu">
		<li><a href="#1"> Zdjęcia </a></li>
		<li><a href="#2"> Pliki pdf</a></li>
	</ul>

	<div id="1" align="center">
		<font size='6'><strong>Zdjęcia</strong></font>
	</div>
	<table>
		<tr>
			<td><a href="upload/01.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/01.jpg" width="250px">
			</a><br />
				<center>5_mid.jpg</center></td>
			<td><a href="upload/6_mid.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/6_mid.jpg" width="250px">
			</a><br />
				<center>6_mid.jpg</center></td>
			</td>
			<td><a href="upload/5_mid.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/5_mid.jpg" width="250px">
			</a><br />
				<center>5_mid.jpg</center></td>
			<td><a href="upload/6_mid.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/6_mid.jpg" width="250px">
			</a><br />
				<center>6_mid.jpg</center></td>
			</td>
		</tr>
		<tr>
			<td><a href="upload/3_mid.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/3_mid.jpg" width="250px">
			</a><br />
				<center>3_mid.jpg</center></td>
			</td>
			<td><a href="upload/4_mid.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/4_mid.jpg" width="250px">
			</a><br />
				<center>4_mid.jpg</center></td>
			</td>
			<td><a href="upload/3_mid.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/3_mid.jpg" width="250px">
			</a><br />
				<center>3_mid.jpg</center></td>
			</td>
			<td><a href="upload/4_mid.jpg" download> <img
					src="http://localhost:8080/blotnix/upload/4_mid.jpg" width="250px">
			</a><br />
				<center>4_mid.jpg</center></td>
			</td>
		</tr>
	</table>
	<br />
	<br />

	<div class="navi-menu">
		<a href="#0"> Cofnij </a>
	</div>



	<div id="2" align="center">
		<font size='6'><strong>Pliki pdf</strong></font>

		<table>
			<tr>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
				</td>
			</tr>
			<tr>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
				<td><a href="upload/Sprawozdanie_V.pdf" download> <img
						src="http://localhost:8080/blotnix/upload/pdf-icon.png"
						height="180px"></a> <br />
					<center>Sprawozdanie_V.pdf</center></td>
			</tr>
		</table>
		<br /> <br />
		</div>
		<div class="navi-menu">
			<a href="#0"> Cofnij </a>
		</div>
</body>
<br />
<br />
<br />
<br />
<br />
</html>