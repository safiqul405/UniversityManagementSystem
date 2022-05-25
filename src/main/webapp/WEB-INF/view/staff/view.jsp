<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/staff/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Faculty</h4>
</div>
<table id="staffTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Phone</th>
			<th>Address</th>
			<th>Date Of Birth</th>
			<th>Religion</th>
			<th>Blood Group</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${staff}" var="st">
			<tr>
				<td>${st.id}</td>
				<td>${st.name}</td>
				<td>${st.email}</td>
				<td>${st.gender}</td>
				<td>${st.phone}</td>
				<td>${st.address}</td>
				<td>${st.dob}</td>
				<td>${st.religion}</td>
				<td>${st.bloodGroup}</td>
				<td><a class="btn btn-primary" role="button"
					href="/staff/edit/${st.id}">Edit</a> <a
					class="btn btn-primary" role="button"
					href="/staff/delete/${st.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
	$('#staffTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>