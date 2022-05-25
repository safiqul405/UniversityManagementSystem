<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/batch/common.jsp" />

<div class="text-center mt-4 mb-4"><h4> View Batch</h4></div>
<table id="batchTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
                <th>Batch Code</th>
                <th>Batch Name</th>
                <th>Batch Year</th>
                <th>Batch Type</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${batch}" var="u">
                <tr>
                    <td>${u.batchCode}</td>
                    <td>${u.batchName}</td>
                     <td>${u.batchYear}</td>
                      <td>${u.batchType}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/batch/edit/${u.batchCode}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/batch/delete/${u.batchCode}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#batchTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>