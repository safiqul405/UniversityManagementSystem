<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/university/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2"><h4>Edit University</h4></div>
		<form action="/university/update" method="POST">
		  <div class="form-row mt-3">
		    <div class="form-group col-md-6">
		      <label>University Code<span class="text-danger"> *</span></label> 
		      <input type="text" id="ucode" name="uniCode" placeholder="University Code" class="form-control" value="${u.uniCode}"> 
		    </div>
		    <div class="form-group col-md-6">
		      <label class="form-control-label px-3">University Name<span class="text-danger"> *</span></label> 
	          <input type="text" id="uname" name="uniName" placeholder="University Name" class="form-control" value="${u.uniName}"> 
		    </div>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button type="submit" class="btn btn-block btn-primary">Save</button> 
           </div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />