<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/batch/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2"><h4>Edit Batch</h4></div>
		<form action="/batch/update" method="POST">
		  <div class="form-row mt-3">
		    <div class="form-group col-md-6">
		      <label>Batch Code</label> 
		      <input type="text" id="bcode" name="batchCode" placeholder="Batch Code" class="form-control" value="${b.batchCode}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Batch Name</label> 
	          <input type="text" id="bname" name="batchName" placeholder="Batch Name" class="form-control" value="${b.batchName}"> 
		    </div>
		     <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Batch Year</label> 
	          <input type="text" id="byear" name="batchYear" placeholder="Batch Year" class="form-control" value="${b.batchYear}"> 
		    </div>
		     <div class="form-group col-md-6">
		      <label class="form-control-label px-3">Batch Name</label> 
	          <input type="text" id="btype" name="batchType" placeholder="Batch Type" class="form-control" value="${b.batchType}"> 
		    </div>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button type="submit" class="btn btn-block btn-primary">Save Batch</button> 
           </div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />