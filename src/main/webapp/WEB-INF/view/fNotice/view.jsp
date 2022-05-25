<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/facultyCommon/header.jsp" />
<jsp:include page="/WEB-INF/view/fNotice/common.jsp" />

<div class="text-center mt-4 mb-4"><h4> View Notice</h4></div>
<table id="noticeTable" class="table table-striped table-bordered" style="width:100%">
         <thead>
            <tr>    
                <th>Notice Advantage</th>
                <th>Notice Header</th>
                <th>Notice Body</th>
                <th>Notice Date</th>
          
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${nList}" var="u">
                <tr>
                    <td>${u.advantage}</td>
                    <td>${u.noticeHeader}</td>
                    <td>${u.noticeBody}</td>
                    <td>${u.noticeDate}</td>
                </tr>
            </c:forEach>
        </tbody>
</table>
<jsp:include page="/WEB-INF/view/facultyCommon/footer.jsp" />

<script>
    $('#noticeTable').DataTable( {
        "paging":   true,
        "ordering": true,
        "info":     true
    });

</script>