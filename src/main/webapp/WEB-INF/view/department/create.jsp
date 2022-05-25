<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/department/common.jsp" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
		<div class="text-center mt-4 mb-4"><h4>Add Department</h4></div>
		<form action="/department/save" method="POST">
		<div class="form-row">
		    <div class="form-group col-md-6 offset-3">
		    	
		    	<select class="form-control" id="uniCode" name="uniCode">
		    		<c:forEach items="${map.univer}" var="c">
		    			<option value="${c.uniCode}">${c.uniName}</option>
		    		</c:forEach>
		    	</select>
		    	<input type="hidden" name="uniName" id="uniName">
		  	</div>
		  </div>
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <input type="text" id="deptCode" name="deptCode" placeholder="Department Code" class="form-control"> 
		    </div>

		    <div class="form-group col-md-6">
		      <input type="text" id="deptName" name="deptName" placeholder="Department Name" class="form-control"> 
		    </div>
               <button type="submit" class="btn btn-block btn-primary">Save Department</button> 
           </div>
		  </div>  
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
$("#uniName").val($("#uniCode").text());
$("#uniCode").on("change", function(){
	$("#uniName").val($("#uniCode :selected").text());
})

</script>