<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/assignFacultyCourse/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>
<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Assign Faculty Course</h4>
	</div>
	<form action="/assignFacultyCourse/save" method="POST">
	 	<div class="form-row">
			<div class="form-group col-md-6 offset-3">
				<select class="form-control" id="facultyCode" name="facultyCode">
					<c:forEach items="${map.faculty}" var="c">
						<option value="${c.fid}">${c.name}</option>
					</c:forEach>
				</select> <input type="hidden" name="facultyName" id="facultyName">
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6 offset-3">
				<select class="form-control" id="batchCode" name="batchCode">
					<c:forEach items="${map.batch}" var="c">
						<option value="${c.batchCode}">${c.batchName}</option>
					</c:forEach>
				</select> <input type="hidden" name="batchName" id="batchName">
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col-md-6 offset-3">
				<select class="form-control" id="courseCode" name="courseCode">
					<c:forEach items="${map.course}" var="c">
						<option value="${c.courseCode}">${c.courseName}</option>
					</c:forEach>
				</select> <input type="hidden" name="courseName" id="courseName">
			</div>
		</div>
		<div class="form-group col-sm-6 offset-3">
			<button type="submit" class="btn btn-block btn-primary">Save
			</button>
		</div>
	</form>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />