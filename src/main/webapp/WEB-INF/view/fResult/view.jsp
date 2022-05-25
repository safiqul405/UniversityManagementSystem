
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/facultyCommon/header.jsp" />
<jsp:include page="/WEB-INF/view/fResult/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Result</h4>
</div>
<table id="resultTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Batch Name</th>
			<th>Course Name</th>
			<th>Class Test1(50*10%)</th>
			<th>Class Test2(50*10%)</th>
			<th>Mid Term (100*20%)</th>
			<th>Final Marks(100*60%)</th>
			<th>Total Average</th>
			<th>CGPA</th>
			<th>Grade</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${rList}" var="c">
			<tr>
				<td>${c.sid}</td>
				<td>${c.name}</td>
				<td>${c.batchName}</td>
				<td>${c.courseName}</td>
				<td>${c.classTest1}</td>
				<td>${c.classTest2}</td>
				<td>${c.midTerm}</td>
				<td>${c.finalMarks}</td>
				<td>${c.totalMarks}</td>
				<td>${c.cgpa}</td>
				<td>${c.grade}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/facultyCommon/footer.jsp" />

<script>
	$('#resultTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>

