<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/studentCommon/header.jsp" />
<jsp:include page="/WEB-INF/view/attendanceStudent/common.jsp" />
<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Student Attendance Check</h4>
	</div>
<table id="studentAtendanceTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Status</th>
			<th>Date</th>
			<th>Batch Name</th>
			<th>Course Name</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${aList}" var="st">
			<tr>
				<td>${st.id}</td>
				<td>${st.name}</td>
				<td>${st.status}</td>
				<td>${st.date}</td>
				<td>${st.batchName}</td>
				<td>${st.courseName}</td>
				
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
<jsp:include page="/WEB-INF/view/studentCommon/footer.jsp" />
<script>
$('#studentAtendanceTable').DataTable({
	"paging" : true,
	"ordering" : true,
	"info" : true
});
</script>