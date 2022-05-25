<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/facultyCommon/header.jsp" />
<jsp:include page="/WEB-INF/view/attendance/common.jsp" />
<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Student Attendance</h4>
	</div>
	<div class="form-row">
		<div class="form-group col-md-6 offset-3">
			<select class="form-control" id="courseCode" name="courseCode">
				<c:forEach items="${map.course}" var="c">
					<option value="${c.courseCode}">${c.courseName}</option>
				</c:forEach>
			</select> <input type="hidden" name="courseName" id="courseName">
		</div>
	</div>
	<div class="form-row">
		<div class="form-group col-md-6 offset-3">
			<select class="form-control" id="batchCode" name="batchCode">
				<c:forEach items="${map.batch}" var="c">
					<option value="${c.batchCode}">${c.batchName}</option>
				</c:forEach>
			</select> <input type="hidden" name="batchName" id="batchName">
		</div>
	</div>
	<br>
	<button id="btnSearch">Search</button>

	<div id="initDiv">
		<form action="/attendance/save" method="POST">
			<table id="tblShow">
				<thead>
				</thead>
				<tbody>
				</tbody>
			</table>
			<input type="hidden" id="student_course_code"
				name="student_course_code" /> <input type="hidden"
				id="student_course_name" name="student_course_name" /> <input
				type="submit" value="Assign" />
		</form>
	</div>


</div>

<jsp:include page="/WEB-INF/view/facultyCommon/footer.jsp" />
<script>
	$("#initDiv").hide();
	$("#student_course_code").val($("#courseCode :selected").val());
	$("#student_course_name").val($("#courseCode :selected").text());
	$("#courseCode").on("change", function() {
		$("#student_course_code").val($("#courseCode :selected").val());
		$("#student_course_name").val($("#courseCode :selected").text());
	});
	$("#btnSearch")
			.on(
					"click",
					function() {
						$
								.ajax({
									type : "POST",
									url : "/student/getStudentByBatch",
									data : {
										batchCode : $("#batchCode :selected")
												.val()
									},
									success : function(data, status) {
										console.log(data)
										$("#tblShow tbody").html("");
										$("#tblShow thead").html("");
										var html = "";
										var htmlHeader = "";
										htmlHeader += "<tr>";
										htmlHeader += "<th><input type='checkbox'/></th>";
										htmlHeader += "<th>SID</th>";
										htmlHeader += "<th>Name</th>";
										htmlHeader += "<th>Batch name</th>";
										htmlHeader += "<th>Course Name</th>";
										htmlHeader += "</tr>";

										for (i = 0; i < data.length; i++) {
											html += "<tr>";
											html += "<td><input type='checkbox' name='attendance_status[]' value='"+data[i].sid+"'/><input name='student_id[]' type='hidden' value='"+data[i].sid+"'/></td>";
											html += "<td>" + data[i].sid
													+ "</td>";
											html += "<td>" + data[i].name
													+ "</td>";
											html += "<td>" + data[i].batchName
													+ "</td>";
											html += "<td>" + data[i].courseName
													+ "</td>";
											html += "</tr>";
										}
										$("#tblShow thead").html(htmlHeader);
										$("#tblShow tbody").html(html);
										$('#tblShow').DataTable();
										$("#initDiv").show();
									}
								});

					});
</script>