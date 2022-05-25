<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/university/common.jsp" />

<div class="text-center mt-4 mb-4"><h4> View University</h4></div>
<table id="universityTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
                <th>University Code</th>
                <th>University Name</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${uList}" var="u">
                <tr>
                    <td>${u.uniCode}</td>
                    <td>${u.uniName}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/university/edit/${u.uniCode}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/university/delete/${u.uniCode}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#universityTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>