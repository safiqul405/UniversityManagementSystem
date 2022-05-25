<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/semester/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2">
			<h4>Edit Semester</h4>
		</div>
		<form action="/semester/update" method="POST">
			<div class="form-row">
				<div class="form-group col-md-6 offset-3">

					<select class="form-control" id="deptCode" name="deptCode">
						<c:forEach items="${data.department}" var="c">
							<option value="${c.deptCode}">${c.deptName}</option>
						</c:forEach>
					</select> <input type="hidden" name="deptName" id="deptName">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<input type="text" id="semesterCode" name="semesterCode"
						value="${data.semester.semesterCode}" placeholder="Semester Code"
						class="form-control">
				</div>
				<input type="hidden" name="id" value="${data.semester.id}" />
				<div class="form-group col-md-6">
					<input type="text" id="semesterName" name="semesterName"
						value="${data.semester.semesterName}" placeholder="Semester Name"
						class="form-control">
				</div>
				<button type="submit" class="btn btn-block btn-primary">Update
					Semester</button>
			</div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />
