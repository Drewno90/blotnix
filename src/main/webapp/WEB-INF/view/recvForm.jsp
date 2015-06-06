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
        <form method="post" action="checkEmail.do">
            <table  class="table table-bordered table-striped table-hover">
            <thead>
				<tr>
					<th>From</th>
					<th>Subject</th>
					<th>Message</th>
				</tr>
			</thead>
			<tbody>

                <tr> 
			<td> ${subject} </td>
			<td> ${senderAddress}</td>
              
			<td> ${tekst} </td>
              
                            </tr>              

                </tbody>
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