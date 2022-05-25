<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/assignFacultyCourse/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Course</h4>
</div>
<table id="assignFacultyCourseTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Faculty Code</th>
			<th>Faculty Name</th>
			<th>Batch Code</th>
			<th>Batch Name</th>
			<th>Course Code</th>
			<th>Course Name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${afcList}" var="c">
			<tr>
				<td>${c.fid}</td>
				<td>${c.name}</td>
				<td>${c.batchCode}</td>
				<td>${c.batchName}</td>
				<td>${c.courseCode}</td>
				<td>${c.courseName}</td>
			</tr>
		</c:forEach>
	</tbody>
</table> 
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

 <script>
	$('#assignFacultyCourseTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script> 