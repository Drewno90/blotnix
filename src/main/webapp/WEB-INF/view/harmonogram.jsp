<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="layout/header.jsp">
	<jsp:param value="Harmonogram" name="title" />
	<jsp:param value="harmonogram" name="page" />
</jsp:include>



<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Nowe Zadanie
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Nowe Zadanie</h4>
      </div>
      <div class="modal-body">
        	<div class="form-group">
				<label class="col-sm-2 control-label">Nazwa:</label>

	  		</div>
	  	 	<div class="form-group">
				<label class="col-sm-2 control-label">Zadanie:</label>

	  		</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <input type="submit" class="btn btn-primary" value="Save" />
      </div>
    </div>
  </div>
</div>

