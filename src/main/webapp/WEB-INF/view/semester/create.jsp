<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/semester/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Add Semester</h4>
	</div>
	<form action="/semester/save" method="POST">
		<div class="form-row">
		
			<div class="form-group col-md-6 offset-3">

				<select class="form-control" id="deptCode" name="deptCode">
					<c:forEach items="${map.dept}" var="d">
						<option value="${d.deptCode}">${d.deptName}</option>
					</c:forEach>
				</select> <input type="hidden" name="deptName" id="deptName">
			</div>

		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<input class="form-control" type="text" name="semesterCode"
					placeholder="Semester Code">
			</div>
			<div class="form-group col-md-6">
				<input class="form-control" type="text" name="semesterName"
					placeholder="Semester Name">
			</div>
			<button type="submit" class="btn btn-block btn-primary">Save
				Semester</button>
		</div>
</div>
</form>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
	$("#deptName").val($("#deptCode").text());
	$("#deptCode").on("change", function() {
		$("#deptName").val($("#deptCode :selected").text());
	})
</script>