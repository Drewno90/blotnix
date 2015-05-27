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
  <img src="http://localhost:8080/blotnix/upload/${message}" alt="Download" border="0" align="center">

 </center>
</body>
</html>

