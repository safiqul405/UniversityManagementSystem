<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/course/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Course</h4>
</div>
<table id="courseTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Course Code</th>
			<th>Course Name</th>
			<th>Semester Code</th>
			<th>Semester Name</th>
			<th>Department Code</th>
			<th>Department Name</th>
			<th>University Code</th>
			<th>University Name</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${cour}" var="c">
			<tr>
				<td>${c.courseCode}</td>
				<td>${c.courseName}</td>
				<td>${c.semesterCode}</td>
				<td>${c.semesterName}</td>
				<td>${c.deptCode}</td>
				<td>${c.deptName}</td>
				<td>${c.uniCode}</td>
				<td>${c.uniName}</td>
				<td><a class="btn btn-primary" role="button"
					href="/course/edit/${c.courseCode}">Edit</a> <a
					class="btn btn-primary" role="button"
					href="/course/delete/${c.courseCode}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
	$('#courseTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>