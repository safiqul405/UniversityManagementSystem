<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/notice/common.jsp" />

<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Make A Notice</h4>
	</div>
	<form action="/notice/save" method="POST">
		<div class="form-row">
			<div class="form-group col-md-6">
				<select class="form-control" name="advatage" >
					<option>Select Advantage</option>
					<option>Student</option>
					<option>Faculty</option>
					<option>All</option>
				</select>
			</div>
			<div class="form-group col-sm-6">
				<input class="form-control" type="text" name="noticeHeader"
					placeholder="Notice Header">
			</div>
			<div class="form-group col-sm-6">
				<textarea class="form-control" type="text" name="noticeBody"
					placeholder="Notice Body"></textarea>
			</div>
			<div class="form-group col-sm-6">
				<input class="form-control" type="date" name="noticeDate" />
			</div>
			<div class="form-group col-sm-6">
				<input class="form-control btn btn-block btn-primary" type="submit"
					value="Post Notice">
			</div>
		</div>
	</form>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />