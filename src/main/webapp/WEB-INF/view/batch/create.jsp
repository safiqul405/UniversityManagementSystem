<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/batch/common.jsp" />

<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Add Batch</h4>
	</div>
	<form action="/batch/save" method="POST">
		<div class="form-row">
			<div class="form-group col-md-6">
				<input type="text" id="bcode" name="batchCode"
					placeholder="Batch Code" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="bname" name="batchName"
					placeholder="Batch Name" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="byear" name="batchYear"
					placeholder="Batch Year" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="btype" name="batchType"
					placeholder="Batch Type" class="form-control">
			</div>
		</div>
		<div class="form-group col-sm-6 offset-3">
			<button id="b" type="submit" class="btn btn-block btn-primary">Save
				Batch</button>
		</div>
	</form>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />