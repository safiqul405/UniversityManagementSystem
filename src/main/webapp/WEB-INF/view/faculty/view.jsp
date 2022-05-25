<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/faculty/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Faculty</h4>
</div>
<table id="facultyTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Phone</th>
			<th>Date Of Birth</th>
			<th>Religion</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${fList}" var="fac">
			<tr>
				<td>${fac.fid}</td>
				<td>${fac.name}</td>
				<td>${fac.email}</td>
				<td>${fac.gender}</td>
				<td>${fac.phone}</td>
				<td>${fac.dob}</td>
				<td>${fac.religion}</td>
				<td><a class="btn btn-primary" role="button"
					href="/faculty/edit/${fac.fid}">Edit</a> <a
					class="btn btn-primary" role="button"
					href="/faculty/delete/${fac.fid}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
	$('#facultyTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>