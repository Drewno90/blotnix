<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="layout/header.jsp">
	<jsp:param value="Task List" name="title" />
	<jsp:param value="tasklist" name="page" />
</jsp:include>

<h2>Tasks:</h2>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-bordered table-striped table-hover">
	<thead>
		<tr>
			<th>name</th>
			<th>description</th>
			<th>from</th>
			<th>to</th>
			<th>who</th>
			<th>remove</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${tasks}" var="task">
			<tr>
				<td><a href="detail.html?id=${task.id}"> ${task.name}</a></td>
				<td>${task.description}</td>
				<td>${task.fromDate}</td>
				<td>${task.toDate}</td>
				<td><c:forEach items="${task.selectedUser}" var="select">
        <c:out value="${select}" /> <br/>
</c:forEach></td>
				<td>
					<a href="remove.html?id=${task.id}" class="btn btn-primary btn-danger btn-remove">remove</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script type="text/javascript">

$(document).ready(function() {
	$(".btn-remove").click(function(e) {
		// do not remove just yet :-)
		e.preventDefault();
		// pass URL to dialog
		$("#myModal .btn-danger").attr("href", $(this).attr("href"));
		// show dialog
		$('#myModal').modal();
	});
});
	
</script>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">Really remove?</h4>
      </div>
      <div class="modal-body">
        Do you really want to remove this task? 
        There's no going back!
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <a type="button" class="btn btn-danger" href="">remove</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<jsp:include page="layout/footer.jsp" />
