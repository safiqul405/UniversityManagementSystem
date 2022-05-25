<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/student/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Student</h4>
</div>
<table id="studentTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Phone</th>
			<th>Batch Code</th>
			<th>Batch Name</th>
			<th>Date Of Birth</th>
			<th>Religion</th>
	
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${sList}" var="stu">
			<tr>
				<td>${stu.sid}</td>
				<td>${stu.name}</td>
				<td>${stu.email}</td>
				<td>${stu.gender}</td>
				<td>${stu.phone}</td>
				<td>${stu.batchCode}</td>
				<td>${stu.batchName}</td>
				<td>${stu.dob}</td>
				<td>${stu.religion}</td>
			
				<td><a class="btn btn-primary" role="button"
					href="/student/edit/${stu.sid}">Edit</a> <a
					class="btn btn-primary" role="button"
					href="/student/delete/${stu.sid}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
	$('#studentTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>