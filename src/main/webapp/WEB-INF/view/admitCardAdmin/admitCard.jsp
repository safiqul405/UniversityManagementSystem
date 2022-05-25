<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/admitCardAdmin/common.jsp" />
<style>
    .txt-center {
        text-align: center;
    }

    .border- {
        border: 1px solid #000 !important;
    }

    .padding {
        padding: 15px;
    }

    .mar-bot {
        margin-bottom: 15px;
    }

    .admit-card {
        border: 2px solid #000;
        padding: 15px;
        margin: 20px 0;
    }

    .BoxA h5,
    .BoxA p {
        margin: 0;
    }

    h5 {
        text-transform: uppercase;
    }

    table img {
        width: 100%;
        margin: 0 auto;
    }

    .table-bordered td,
    .table-bordered th,
    .table thead th {
        border: 1px solid #000000 !important;
    }
</style>

<section>
    <div class="container">
        <div class="admit-card">
            <div class="BoxA border- padding mar-bot">
                <div class="row">
                    <div class="col-sm-4">
                        <h5>Dania University College</h5>
                        <p>Dania,Jattrabhari,Dhaka1236 <br>Jattrabari

                            Dhaka 1236</p>
                    </div>
                    <div class="col-sm-4 txt-center">
                        <img src="/resources/vendor2/duc.jpg" width="100px;" />
                    </div>
                    <div class="col-sm-4">
                        <h5>Admit Card</h5>
                        <p>JEE2 - 2021-2022</p>
                    </div>
                </div>
            </div>
            <div class="BoxC border- padding mar-bot">
                <div class="row">
                    <div class="col-sm-6">
                        <h5>Enrollment No : 1265304</h5>
                    </div>
                </div>
            </div>
            <div class="BoxD border- padding mar-bot">
                <div class="row">
                    <div class="col-sm-10">
                        <table class="table table-bordered">
                            <tbody>
                                <tr>
                                    <td><b>ENROLLMENT NO : 1265304</b></td>
                                    <td><b>DOB: </b> 05/04/1996</td>
                                </tr>
                                <tr>
                                    <td><b>Student Name: </b>Md.Safiqul Islam</td>
                                    <td><b>Sex: </b> Male</td>
                                </tr>
                                <tr>
                                    <td><b>Father/Husband Name: </b>Md.Amir Hossain</td>
                                    <td><b>Religion: </b>Islam</td>
                                </tr>
                                <tr>
                                    <td colspan="2" style="    height: 125px;"><b>Address: </b>Narayanganj,Bangladesh
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-sm-2 txt-center">
                        <table class="table table-bordered">
                            <tbody>
                                <tr>
                                    <th scope="row txt-center"><img
                                            src="/resources/safiq1.jpeg"
                                            width="123px" height="165px" /></th>
                                </tr>
                                <tr>
                                    <th scope="row txt-center"><img
                                            src="http://peoplehelp.in/mewaruni/images/hj.png"  alt="Your Signature Here"/></th>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="BoxE border- padding mar-bot txt-center">
                <div class="row">
                    <div class="col-sm-12">
                        <h5>EXAMINATION VENUE</h5>
                        <p>Dania University College<br>Dania Jattrabari,

                            Dhaka 1236</p>
                    </div>
                </div>
            </div>
            <div class="BoxF border- padding mar-bot txt-center">
                <div class="row">
                    <div class="col-sm-12">
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th>Sr. No.</th>
                                    <th>Subject/Paper</th>
                                    <th>Exam Date</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${map.courses}" var="asc">
                                    <tr>
                                        <td>48</td>
                                        <td>JEE2</td>

                                        <td>14 April 2022</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <footer class="txt-center">
                <p>*** Dania University College ***</p>
            </footer>

        </div>
    </div>
    <div class="d-flex justify-content-center"><button class="btn btn-warning" onclick="print()">Print</button></div>             
</section>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />
<script>
    print(){
        window.print();
    }
</script>