<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/facultyCommon/header.jsp" />
<jsp:include page="/WEB-INF/view/fStudent/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>All Student</h4>
</div>
<table id="fStudentTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Batch Code</th>
			<th>Batch Name</th>
			<th>Date Of Birth</th>
			<th>Religion</th>
			<th>Gender</th>

		</tr>
	</thead>
	<tbody>
		<c:forEach items="${sList}" var="u">
			<tr>
				<td>${u.sid}</td>
				<td>${u.name}</td>
				<td>${u.email}</td>
				<td>${u.phone}</td>
				<td>${u.batchCode}</td>
				<td>${u.batchName}</td>
				<td>${u.dob}</td>
				<td>${u.religion}</td>
				<td>${u.gender}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/facultyCommon/footer.jsp" />

<script>
	$('#fStudentTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>