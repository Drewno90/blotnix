<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="layout/header.jsp">
	<jsp:param value="Kontakt" name="title" />
	<jsp:param value="kotnakt" name="page" />
</jsp:include>


<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<style>
.rwd-table {
	position: relative;
}

@media screen and (max-width:960px) {
	.rwd-table {
		overflow-x: scroll;
		padding-top: 45px;
	}
}

table {
	border: 1px solid #e1e1e1;
	border-collapse: collapse;
}

@media screen and (min-width:960px) {
	table {
		width: 70%;
		table-layout: fixed;
	}
}

td {
	padding: 20px;
	border: 1px solid #e1e1e1;
}

::-webkit-scrollbar {
	-webkit-appearance: none;
	width: 7px;
}

::-webkit-scrollbar-thumb {
	border-radius: 4px;
	background-color: rgba(0, 0, 0, .5);
	box-shadow: 0 0 1px rgba(255, 255, 255, .5);
}

.scroll-this {
	position: absolute;
	top: 0;
	right: 5px;
	z-index: 999;
	font-size: 25px;
	padding: 5px;
	background: #e1e1e1;
	display: none;
}

@media screen and (max-width:960px) {
	.scroll-this {
		display: block;
	}
}
</style>

</head>
<body>

	<div>

		<div class="rwd-table">

			<table align="center">
				<thead>
					<tr>
					
					</tr>
				</thead>
				
			</table>

			<div class="scroll-this">Scroll &raquo;</div>

		</div>

	</div>


</body>
</html>