<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/notice/common.jsp" />

<div class="text-center mt-4 mb-4"><h4> View Notice</h4></div>
<table id="noticeTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>    
                <th>Notice Advantage</th>
                <th>Notice Header</th>
                <th>Notice Body</th>
                <th>Notice Date</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${nList}" var="u">
                <tr>
                    <td>${u.advantage}</td>
                    <td>${u.noticeHeader}</td>
                    <td>${u.noticeBody}</td>
                    <td>${u.noticeDate}</td>
                    <td>
                        <a class="btn btn-primary" role="button" href="/notice/edit/${u.id}">Edit</a>
                        <a class="btn btn-primary" role="button" href="/notice/delete/${u.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/common/footer.jsp" />

<script>
    $('#noticeTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>