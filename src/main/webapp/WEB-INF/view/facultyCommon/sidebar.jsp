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
		href=""> <i class="fas fa-fw fa-tachometer-alt"></i>
			<span>Admin Panel</span></a></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading"></div>

	<li class="nav-item"><a class="nav-link collapsed" 
		data-toggle="collapse" data-target="#collapseUtilities"
		aria-expanded="true" aria-controls="collapseUtilities"> <i
			class="fa fa-user" aria-hidden="true"></i> <span>Faculty</span></a>
		<div id="collapseUtilities" class="collapse"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<h6 class="collapse-header">Faculty Activities:</h6>
				<a class="collapse-item" href="">Faculty Info</a> <a
					class="collapse-item" href="/student/viewf">Student</a> 
					<a class="collapse-item" href="/result/create">Result</a>
					<a class="collapse-item" href="/attendance/create"> Attendance</a>
					<a class="collapse-item" href="/notice/viewF"> Notice</a>
			</div>
		</div></li>

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>


</ul>
<!-- End of Sidebar -->