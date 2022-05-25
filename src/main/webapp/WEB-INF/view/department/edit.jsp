<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/department/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2">
			<h4>Edit Department</h4>
		</div>
		<form action="/department/update" method="POST">
			<div class="form-row">
				<div class="form-group col-md-6 offset-3">

					<select class="form-control" id="uniCode" name="uniCode">
						<c:forEach items="${data.university}" var="c">
							<option value="${c.uniCode}">${c.uniName}</option>
						</c:forEach>
					</select> <input type="hidden" name="uniName" id="uniName">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<input type="text" id="deptCode" name="deptCode"
						value="${data.department.deptCode}" placeholder="Department Code"
						class="form-control">
				</div>
				<input type="hidden" name="id" value="${data.department.id}" />
				<div class="form-group col-md-6">
					<input type="text" id="deptName" name="deptName"
						value="${data.department.deptName}" placeholder="Department Name"
						class="form-control">
				</div>
				<button type="submit" class="btn btn-block btn-primary">Update
					Department</button>
			</div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />
