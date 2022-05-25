<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/libary/common.jsp" />

<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
	<div class="text-center mt-4 mb-4">
		<h4>Add Book</h4>
	</div>
	<form action="/libary/save" method="POST">
		<div class="form-row">
			<div class="form-group col-md-6">
				<input type="text" id="bcode" name="bookCode"
					placeholder="Book Code" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="bname" name="bookName"
					placeholder="Book Name" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="author" name="author"
					placeholder="Author Name" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="genre" name="genre" placeholder="Genre"
					class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="publisher" name="publisher"
					placeholder="Publisher Name" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="quantity" name="quantity"
					placeholder="Quantity" class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="edition" name="edition"
					placeholder="Edition " class="form-control">
			</div>
			<div class="form-group col-md-6">
				<input type="text" id="price" name="price"
					placeholder="price" class="form-control">
			</div>


		</div>
		<div class="form-group col-sm-6 offset-3">
			<button id="b" type="submit" class="btn btn-block btn-primary">Save
				Book</button>
		</div>
	</form>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />