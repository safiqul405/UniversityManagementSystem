<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/libary/common.jsp" />

<div class="text-center mt-4 mb-4">
	<h4>View Book</h4>
</div>
<table id="libaryTable" class="table table-striped table-bordered"
	style="width: 100%">
	<thead>
		<tr>
			<th>Book Code</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Genre</th>
			<th>Publisher</th>
			<th>Quantity</th>
			<th>edition</th>
			<th>price</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${libary}" var="u">
			<tr>
				<td>${u.bookCode}</td>
				<td>${u.bookName}</td>
				<td>${u.author}</td>
				<td>${u.genre}</td>
				<td>${u.publisher}</td>
				<td>${u.quantity}</td>
				<td>${u.edition}</td>
				<td>${u.price}</td>
				
				<td><a class="btn btn-primary" role="button"
					href="/libary/edit/${u.bookCode}">Edit</a> <a
					class="btn btn-primary" role="button"
					href="/libary/delete/${u.bookCode}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
	$('#libaryTable').DataTable({
		"paging" : true,
		"ordering" : true,
		"info" : true
	});
</script>