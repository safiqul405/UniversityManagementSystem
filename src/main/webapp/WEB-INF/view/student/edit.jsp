<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/student/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2">
			<h4>Edit Student</h4>
		</div>
		<form action="/student/update" method="POST">

			<div class="form-row mt-2">

				<input type="hidden" name="id" value="${map.s.id}">
				<div class="form-group col-md-6">
					<input class="form-control" type="text" name="sid"
						value="${map.s.sid}">
				</div>
				<div class="form-group col-md-6">
					<input class="form-control" type="text" name="name"
						value="${map.s.name}">
				</div>
				<div class="form-group col-md-6">
					<input class="form-control" type="email" name="email"
						value="${map.s.email}">
				</div>
				<div class="form-group col-md-6">
					<input class="form-control" type="tel" name="phone"
						value="${map.s.phone}">
				</div>
				<div class="form-group col-md-6">
					<input class="form-control" type="date" name="dob"
						value="${map.s.dob}">
				</div>
				<div class="form-group col-md-6">
					<select class="form-control" name="religion"
						value="${map.s.religion}">

						<option value="Islam">Islam</option>
						<option value="Hindu">Hindu</option>
						<option value="Christian">Christian</option>
						<option value="Buddhist">Buddhist</option>
						<option value="Buddhist">Other</option>
					</select>
				</div>
				<div class="form-group col-md-6">
					<input class="form-control" type="text" name="bloodgroup"
						value="${map.s.bloodGroup}">
				</div>
				<div class="col-lg-12 col-xl-12 d-flex justify-content-center">

					<label style="color: #2B547E; font-size: 16px">Gender:</label>
					&nbsp; &nbsp; &nbsp;
					<div>
						<label for="male">Male</label> <input type="radio" id="male"
							name="gender" value="${map.s.gender}">
					</div>

					&nbsp; &nbsp; &nbsp; &nbsp;
					<div>
						<label for="male">Female</label> <input type="radio" id="female"
							name="gender" value="${map.s.gender}">
					</div>

				</div>

				<div class="form-group col-sm-6 offset-3">
					<button type="submit" class="btn btn-block btn-primary">Save</button>
				</div>
			</div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />