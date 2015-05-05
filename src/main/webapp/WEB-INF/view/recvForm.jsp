<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
   <html>  
 <jsp:include page="layout/header.jsp">
	<jsp:param value="RecvForm" name="title" />
	<jsp:param value="recvForm" name="page" />
</jsp:include>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Email with Spring MVC</title>
</head>
<body>
    <center>
        <h1>Receving e-mail</h1>
        <form method="get" action="checkEmail.do">
            <table border="0" width="80%">
                <tr>
                    <td>From:</td>
                    <td><% out.println(request.getAttribute("senderAddress")); %></td>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><% out.println(request.getAttribute("subject")); %></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><% out.println(request.getAttribute("tekst")); %></textarea></td>
                </tr>               
                
                
                
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Recv E-mail" />
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>