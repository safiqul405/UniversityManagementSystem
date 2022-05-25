<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/facultyCommon/header.jsp" />
<jsp:include page="/WEB-INF/view/fResult/common.jsp" />
<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>
<div class="tab-content" id="myTabContent">
	<div class="tab-pane fade show active" id="home" role="tabpanel"
		aria-labelledby="home-tab">
		<div class="text-center mt-4 mb-4">
			<h4>Create Result</h4>
		</div>
		<div class="row">
			<section>
				<div class="form-row p-0 m-0">
					<div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">
						<form action="/fResult/save" method="post">

							<div class="form-group">
								<select class="ml-2 form-control" id="sid" name="sid">

									<option value="${map.student}">${map.student}</option>

								</select>
							</div>
							<div class="form-group">
								<input class="form-control" type="text" name="sid"
									placeholder="Student Id" id="sid">
							</div>
							<div class="form-group">
								<input class="form-control" type="text" name="name"
									placeholder="Student Name" id="name">
							</div>
							<div class="form-group">
								<input class="form-control" type="text" name="batchName"
									placeholder="Batch Name" id="batchName">
							</div>

							<div class="form-group">
								<input class="form-control" type="text" name="courseName"
									placeholder="Course Name" id="courseName">
							</div>
							<div class="form-group">
								<input class="form-control" type="number" name="ct1"
									placeholder="Class Test 1">
							</div>
							<div class="form-group">
								<input class="form-control" type="number" name="ct2"
									placeholder="Class Test 2">
							</div>
							<div class="form-group">
								<input class="form-control" type="number" name="midterm"
									placeholder="Mid Term">
							</div>
							<div class="form-group">
								<input class="form-control" type="number" name="final"
									placeholder="Final">
							</div>
							<div class="form-group">
								<input class="form-control btn-primary" type="submit"
									value="Submit">
							</div>
						</form>
					</div>
					
					<div class="col-lg-6 col-xl-6 p-0 m-0 p-3" id="formPersonal">

						<div class="form-row">
							<div class="form-group col-md-6 offset-3">
								<select class="form-control" id="fid" name="fid">
									<c:forEach items="${map.faculty}" var="c">
										<option value="${c.fid}">${c.name}</option>
									</c:forEach>
								</select> <input type="hidden" name="name" id="name">
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
						<button id="btnSearch" >Search</button>

						<table class="table table-striped table-bordered"
							id="tblShow">
							<thead>
								<tr>
									<th scope="col">Student ID</th>
									<th scope="col">Student Name</th>
									<th scope="col">Batch Name</th>
									<th scope="col">Course Name</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${map}" var="stu">
									<tr>
										<td>${stu.student.sid}</td>
										<td>${stu.student.name}</td>
										<td>${stu.student.batchName}</td>
										<td>${stu.course.courseName}</td>
										<td><button class="btn btn-primary"
												onclick="selectStudent('${stu.student.sid}', '${stu.student.name}','${stu.student.batchName}', '${stu.course.courseName}')">Select</button></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</section>
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/view/facultyCommon/footer.jsp" />
<script>
$("#btnSearch").on("click", function() {
	$.ajax({
		type : "POST",
		url : "/student/getStudentByBatch",
		data : {batchCode : $("#batchCode :selected").val()},
		success : function(data, status) {
			console.log(data)
			$("#tblShow tbody").html("");
			$("#tblShow thead").html("");
			var html = "";
			var htmlHeader = "";
			htmlHeader += "<tr>";
			htmlHeader += "<th></th>";
			htmlHeader += "<th>SID</th>";
			htmlHeader += "<th>Name</th>";
			htmlHeader += "<th>Batch Name</th>";
			htmlHeader += "<th>Course Name</th>";
			htmlHeader += "</tr>";

			for (i = 0; i < data.length; i++) {
				html += "<tr>";
				html += "<td><input name='student_id[]' type='hidden' value='"+data[i].sid+"'/></td>";
				html += "<td>" + data[i].sid + "</td>";
				html += "<td>" + data[i].name + "</td>";
				html += "<td>" + data[i].batchName + "</td>";
				html += "<td>" + data[i].courseName + "</td>";
				html += "</tr>";
			}
			$("#tblShow thead").html(htmlHeader);
			$("#tblShow tbody").html(html);
			$('#tblShow').DataTable();
			$("#initDiv").show();
		}
	});

});

/* 	$('#resultTablest').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	}); */
</script>
