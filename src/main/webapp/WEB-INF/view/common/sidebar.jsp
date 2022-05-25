<!-- Sidebar -->
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="/admindashboard">
		<div class="sidebar-brand-text mx-3">University Management</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<li class="nav-item active"><a class="nav-link"
		href="/admindashboard"> <i class="fas fa-fw fa-tachometer-alt"></i>
			<span>Admin Panel</span></a></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading"></div>

	<!-- Nav Item - Pages Collapse Menu -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true"
		aria-controls="collapseTwo"> <i class="fa fa-h-square"
			aria-hidden="true"></i> <span>University Management</span>
	</a>
		<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<!-- <h6 class="collapse-header">Custom Components:</h6> -->
				<a class="collapse-item" href="/university/view">University</a> <a
					class="collapse-item" href="/department/view">Department</a> <a
					class="collapse-item" href="/semester/view">Semester</a> <a
					class="collapse-item" href="/course/view">Course</a>
			</div>
		</div></li>

	<!-- Student -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#studentM" aria-expanded="true"
		aria-controls="studentM"> <i class="fa fa-h-square"
			aria-hidden="true"></i> <span>Students Management</span>
	</a>
		<div id="studentM" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<!-- <h6 class="collapse-header">Custom Components:</h6> -->
				<a class="collapse-item" href="/student/view">Students Identify</a>
				<a class="collapse-item" href="/batch/view">Student Batch</a>
			</div>
		</div></li>

	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#facultyM"
		aria-expanded="true" aria-controls="facultyM"> <i
			class="fa fa-user" aria-hidden="true"></i> <span>Faculty
				Management</span>
	</a>
		<div id="facultyM" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Faculty Activities:</h6>
				<a class="collapse-item" href="/faculty/view">Faculty</a>
			</div>
		</div></li>

	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#staffM"
		aria-expanded="true" aria-controls="staffM"> <i
			class="fa fa-user" aria-hidden="true"></i> <span>Staff
				Management </span>
	</a>
		<div id="staffM" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Staff Activities:</h6>
				<a class="collapse-item" href="/staff/view">Staff</a>
			</div>
		</div></li>

	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#libaryM"
		aria-expanded="true" aria-controls="libaryM"> <i
			class="fa fa-user" aria-hidden="true"></i> <span>Libary
				Management</span>
	</a>
		<div id="libaryM" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Libary Activities:</h6>
				<a class="collapse-item" href="/libary/view">Libary</a>
			</div>
		</div></li>

	<!-- notice -->

	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#noticeM"
		aria-expanded="true" aria-controls="noticeM"> <i
			class="fa fa-th-list" aria-hidden="true"></i> <span>Notice </span></a>
		<div id="noticeM" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item" href="/notice/view">Notice</a>
			</div>
		</div></li>
	<!-- Assign Course -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#ascM"
		aria-expanded="true" aria-controls="ascM"> <i
			class="fa fa-th-list" aria-hidden="true"></i> <span>Assign
				Course</span></a>
		<div id="ascM" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item" href="/assignStudentCourse/create">Assign
					Student Course</a> <a class="collapse-item"
					href="/assignFacultyCourse/view">Assign Faculty Course</a>
			</div>
		</div></li>
	<!-- Payment -->

	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#paymentM"
		aria-expanded="true" aria-controls="paymentM"> <i
			class="fa fa-th-list" aria-hidden="true"></i> <span>Payment</span></a>
		<div id="paymentM" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item" href="#">Students Payment</a>
			</div>
		</div></li>

	<!-- Admit Card -->

	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#admitCard"
		aria-expanded="true" aria-controls="admitCard"> <i
			class="fa fa-th-list" aria-hidden="true"></i> <span>Take Admit
				Card </span></a>
		<div id="admitCard" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item" href="/admitCardSearch">Students Admit Card</a>
			</div>
		</div></li>

	<!-- Festivals -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapsePages"
		aria-expanded="true" aria-controls="collapsePages"> <i
			class="fa fa-flag" aria-hidden="true"></i> <span>Festivals</span></a>
		<div id="collapsePages" class="collapse"
			aria-labelledby="headingPages" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Login Screens:</h6>
				<a class="collapse-item" href="#">Cultural Function</a> <a
					class="collapse-item" href="#">Natonalism Function</a> <a
					class="collapse-item" href="#">University Function</a>
			</div>
		</div></li>

	<!-- Report -->
	<li class="nav-item"><a class="nav-link collapsed" href="#"
		data-toggle="collapse" data-target="#collapseThree"
		aria-expanded="true" aria-controls="collapseThree"> <i
			class="fa fa-th-list" aria-hidden="true"></i> <span>Report
				Show</span></a>
		<div id="collapseThree" class="collapse" aria-labelledby="headingTwo"
			data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<a class="collapse-item" href="#">Students</a> <a
					class="collapse-item" href="#">Gold Package</a>
			</div>
		</div></li>



	<!-- Nav Item - Charts -->
	<!-- <li class="nav-item"><a class="nav-link" href="charts.html">
					<i class="fas fa-fw fa-chart-area"></i> <span>Charts</span>
			</a></li> -->

	<!-- Nav Item - Tables -->
	<!-- <li class="nav-item"><a class="nav-link" href="tables.html">
					<i class="fas fa-fw fa-table"></i> <span>Tables</span>
			</a></li> -->

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>


</ul>
<!-- End of Sidebar -->