<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/university/common.jsp" />

<style>
.center_div{
    margin: 0 auto;
    width:80% /* value of your choice which suits your alignment */
}
</style>

<div class="center_div">
		<div class="text-center mt-4 mb-4"><h4>Add University</h4></div>
		<form action="/university/save" method="POST">
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <input type="text" id="ucode" name="uniCode" placeholder="University Code" class="form-control"> 
		    </div>
		    <div class="form-group col-md-6">
	          <input type="text" id="uname" name="uniName" placeholder="University Name" class="form-control"> 
		    </div>
		  </div>
		  <div class="form-group col-sm-6 offset-3"> 
               <button id="b" type="submit" class="btn btn-block btn-primary">Save University</button> 
           </div>
		</form>
	</div>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />