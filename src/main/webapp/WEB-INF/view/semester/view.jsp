<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/semester/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>View Semester</h4></div>
<table id="semesterTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
                <th>University Code</th>
                <th>University Name</th>
                <th>Department Code</th>
                <th>Department Name</th>
                 <th>Semester Code</th>
                <th>Semester Name</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${semester}" var="c">
                <tr>
                    <td>${c.uniCode}</td>
                    <td>${c.uniName}</td>
                    <td>${c.deptCode}</td>
                    <td>${c.deptName}</td>
                    <td>${c.semesterCode}</td>
                    <td>${c.semesterName}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/semester/edit/${c.semesterCode}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/semester/delete/${c.semesterCode}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#semesterTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>