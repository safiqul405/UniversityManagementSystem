<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/student/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Add Student</h4>
	</div>
	<form action="/student/save" method="POST">
		<div class="form-row">
			<div class="form-group col-md-6">
				<input class="form-control" type="text" name="sid" placeholder="Id">
			</div>
			<div class="form-group col-md-6">
				<input class="form-control" type="text" name="name"
					placeholder="Name">
			</div>
			<div class="form-group col-md-6">
				<input class="form-control" type="email" name="email"
					placeholder="Email">
			</div>
			<div class="form-group col-md-6">
				<input class="form-control" type="tel" name="phone"
					placeholder="Phone">
			</div>
			
		    <div class="form-group col-md-6 ">
		    	<select class="form-control" id="batchCode" name="batchCode">
		    		<c:forEach items="${map.batch}" var="c">
		    			<option value="${c.batchCode}">${c.batchName}</option>
		    		</c:forEach>
		    	</select>
		    	<input type="hidden" name="batchName" id="batchName">
		  	</div>
		  	
			<div class="form-group col-md-6">
				<input class="form-control" type="date" name="dob"
					placeholder="Date of Birth">
			</div>
			<div class="form-group col-md-6">
				<select class="form-control" name="religion">

					<option value="Islam">Islam</option>
					<option value="Hindu">Hindu</option>
					<option value="Christian">Christian</option>
					<option value="Buddhist">Buddhist</option>
					<option value="Buddhist">Other</option>
				</select>
			</div>
			
		<!-- 	<div class="form-group col-md-6">
				<input class="form-control" type="text" name="bloodgroup"
					placeholder="Blood Group">
			</div> -->

			<div class="col-lg-12 col-xl-12 d-flex justify-content-center">

				<label style="color: #2B547E; font-size: 16px">Gender:</label>
				&nbsp; &nbsp; &nbsp;
				<div>
					<label for="male">Male</label> <input type="radio" id="male"
						name="gender" value="Male">
				</div>

				&nbsp; &nbsp; &nbsp; &nbsp;
				<div>
					<label for="male">Female</label> <input type="radio" id="female"
						name="gender" value="Female">
				</div>
			</div>

		</div>
		<div class="form-group col-sm-6 offset-3">
			<button id="b" type="submit" class="btn btn-block btn-primary">Save
				Student</button>
		</div>
	</form>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
$("#batchName").val($("#batchCode").text());
$("#batchCode").on("change", function(){
	$("#batchName").val($("#batchCode :selected").text());
})

</script>