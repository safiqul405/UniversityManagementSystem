<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/department/common.jsp" />

<div class="text-center mt-4 mb-4"><h4>View Department</h4></div>
<table id="departmentTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>
                <th>University Code</th>
                <th>University Name</th>
                <th>Department Code</th>
                <th>Department Name</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${depts}" var="c">
                <tr>
                    <td>${c.uniCode}</td>
                    <td>${c.uniName}</td>
                    <td>${c.deptCode}</td>
                    <td>${c.deptName}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/department/edit/${c.deptCode}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/department/delete/${c.deptCode}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#departmentTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>