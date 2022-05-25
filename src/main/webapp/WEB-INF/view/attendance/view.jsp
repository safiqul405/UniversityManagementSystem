<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/facultyCommon/header.jsp" />
<jsp:include page="/WEB-INF/view/attendance/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Faculty</h4>
</div>
<table id="attendanceTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Date</th>
			<th>Status</th>
			<th>Batch name</th>
			<th>Course name</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${aList}" var="fac">
			<tr>
				<td>${fac.sid}</td>
				<td>${fac.name}</td>
				<td>${fac.date}</td>
				<td>${fac.status}</td>
				<td>${fac.batchName}</td>
				<td>${fac.courseName}</td>
				<td><a class="btn btn-primary" role="button"
					href="/attendance/edit/${fac.sid}">Edit</a> <a
					class="btn btn-primary" role="button"
					href="/attendance/delete/${fac.sid}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/facultyCommon/footer.jsp" />

<script>
	$('#attendanceTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>