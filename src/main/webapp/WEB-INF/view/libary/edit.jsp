<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/libary/common.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-12 mt-3">
	<div class="col-md-3"></div>
	<div class="col-md-9 offset-2" style="margin-top: 10px">
		<div class="text-center col-md-6 offset-2">
			<h4>Edit Libary</h4>
		</div>
		<form action="/libary/update" method="POST">
			<div class="form-row mt-3">
				<div class="form-group col-md-6">
					<label>Book Code</label> <input type="text" id="bcode"
						name="bookCode" placeholder="Book Code" class="form-control"
						value="${l.bookCode}">
				</div>
				<div class="form-group col-md-6">
					<label class="form-control-label px-3">Book Name</label> <input
						type="text" id="bname" name="bookName" placeholder="Book Name"
						class="form-control" value="${l.bookName}">
				</div>
				<div class="form-group col-md-6">
					<label class="form-control-label px-3">Author Name</label> <input
						type="text" id="author" name="author" placeholder="author"
						class="form-control" value="${l.author}">
				</div>
				<div class="form-group col-md-6">
					<label class="form-control-label px-3">Genre</label> <input
						type="text" id="genre" name="genre" placeholder="genre"
						class="form-control" value="${l.genre}">
				</div>
				<div class="form-group col-md-6">
					<label class="form-control-label px-3">Publisher Name</label> <input
						type="text" id="publisher" name="publisher" placeholder="publisher Name"
						class="form-control" value="${l.publisher}">
				</div>
				<div class="form-group col-md-6">
					<label class="form-control-label px-3">Quantity</label> <input
						type="text" id="quantity" name="quantity" placeholder="quantity"
						class="form-control" value="${l.quantity}">
				</div>
				<div class="form-group col-md-6">
					<label class="form-control-label px-3">Edition</label> <input
						type="text" id="edition" name="edition" placeholder="edition"
						class="form-control" value="${l.edition}">
				</div>
				<div class="form-group col-md-6">
					<label class="form-control-label px-3">Price</label> <input
						type="text" id="price" name="price" placeholder="price"
						class="form-control" value="${l.price}">
				</div>


			</div>
			<div class="form-group col-sm-6 offset-3">
				<button type="submit" class="btn btn-block btn-primary">Save</button>
			</div>
		</form>
	</div>
	<div class="col-md-3"></div>
</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />