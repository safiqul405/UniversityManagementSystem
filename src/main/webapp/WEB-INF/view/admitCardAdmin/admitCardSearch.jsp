<jsp:include page="/WEB-INF/view/common/header.jsp" />
<jsp:include page="/WEB-INF/view/admitCardAdmin/common.jsp" />

<style>
.center_div {
	margin: 0 auto;
	width: 80% /* value of your choice which suits your alignment */
}
</style>
<section>
	<div>
		<div class="d-flex justify-content-center">
			<h3>Generate Admit Card</h3>
		</div>
		<section>

			<div class="form-row p-0 m-0">

				<div class="col-lg-12 col-xl-12 p-0 m-0 p-3" id="formPersonal">
					<form action="/admitCardSearch" method="post">
						<div class="form-group d-flex justify-content-center">
							<input type="number" name="sid" class="form-control"
								placeholder="Enter Student Roll/Id No." />
						</div>
						<div class="d-flex justify-content-center">
							<!-- <input type="submit" class="btn btn-info" value="Generate"> -->
							<a class="btn btn-info" href="/admitCard">Generate</a>
						</div>
					</form>
				</div>
			</div>


		</section>

	</div>

</section>

<jsp:include page="/WEB-INF/view/common/footer.jsp" />