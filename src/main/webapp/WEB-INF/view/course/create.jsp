<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/course/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Add Course</h4>
	</div>
	<form action="/course/save" method="POST">
		<div class="form-row">
			<div class="form-group col-md-6 offset-3">
				<select class="form-control" id="semesterCode" name="semesterCode">
					<c:forEach items="${map.semester}" var="c">
						<option value="${c.semesterCode}">${c.semesterName}</option>
					</c:forEach>
				</select> <input type="hidden" name="semesterName" id="semesterName">
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<input type="text" id="courseCode" name="courseCode"
					placeholder="Course Code" class="form-control">
			</div>

			<div class="form-group col-md-6">
				<input type="text" id="courseName" name="courseName"
					placeholder="Course Name" class="form-control">
			</div>
			<button type="submit" class="btn btn-block btn-primary">Save
				Course</button>
		</div>
</div>
</form>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />
<script>
	$("#semesterName").val($("#semesterCode").text());
	$("#semesterCode").on("change", function() {
		$("#semesterName").val($("#semesterCode :selected").text());
	})
</script>