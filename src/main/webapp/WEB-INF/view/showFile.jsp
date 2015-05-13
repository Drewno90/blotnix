<html>
<head>

<jsp:include page="layout/header.jsp">
	<jsp:param value="Upload_success" name="title" />
	<jsp:param value="upload_success" name="page" />
</jsp:include>
</head>
<body>
 <center>

  
  <h3>
   File name : "<strong> ${message}</strong>" uploaded successfully !
  </h3>

 </center>
</body>
</html>

