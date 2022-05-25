<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/course/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2">
			<h4>Edit Course</h4>
		</div>
		<form action="/course/update" method="POST">
			<div class="form-row">
				<div class="form-group col-md-6 offset-3">
					<select class="form-control" id="uniCode" name="uniCode">
						<c:forEach items="${data.university}" var="c">
							<option value="${c.uniCode}">${c.uniName}</option>
						</c:forEach>
					</select> <input type="hidden" name="uniName" id="uniName">
				</div>
				<div class="form-group col-md-6 offset-3">
					<select class="form-control" id="deptCode" name="deptCode">
						<c:forEach items="${data.department}" var="c">
							<option value="${c.deptCode}">${c.deptName}</option>
						</c:forEach>
					</select> <input type="hidden" name="deptName" id="deptName">
				</div>

				<div class="form-group col-md-6 offset-3">
					<select class="form-control" id="semesterCode" name="semesterCode">
						<c:forEach items="${data.semester}" var="c">
							<option value="${c.semesterCode}">${c.semesterName}</option>
						</c:forEach>
					</select> <input type="hidden" name="semesterName" id="semesterName">
				</div>

			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<input type="text" id="courseCode" name="courseCode"
						value="${data.course.courseCode}" placeholder="Course Code"
						class="form-control">
				</div>
				<input type="hidden" name="id" value="${data.course.id}" />
				<div class="form-group col-md-6">
					<input type="text" id="courseName" name="courseName"
						value="${data.course.courseName}" placeholder="Course Name"
						class="form-control">
				</div>
				<button type="submit" class="btn btn-block btn-primary">Update
					Course</button>
			</div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />
