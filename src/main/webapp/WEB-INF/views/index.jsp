<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<jsp:include page="core/header.jsp" />
<s:url value="/logout" var="logout" />
<div class="wrapper">
    <header class="main-header">
        <!-- Logo -->
        <a href="<c:url value='/admin/dashboard'/>" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
             <span class="logo-mini"><b>D</b>OC</span> <!-- logo for regular state and mobile devices -->
             <span class="logo-lg"> ${fn:toUpperCase(user.username)}</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <li><a href="${logout}">Sign out <i class="fa fa-sign-out"></i></a></li>
                </ul>
            </div>
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
               role="button"> <span class="sr-only">Toggle navigation</span>
            </a>
        </nav>
    </header>
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="<c:url value='/resources/dist/img/user2-160x160.jpg'/>"
                         class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>${user.prenom} ${user.nom}</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control"
                           placeholder="Search..."> <span class="input-group-btn">
                        <button type="submit" name="search" id="search-btn"
                                class="btn btn-flat">
                            <i class="fa fa-search"></i>
                        </button>
                    </span>
                </div>
            </form>
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">MAIN NAVIGATION</li>                                
                <li class="treeview"><a href="<c:url value='/admin/assistante/index'/>"> <i
                            class="fa fa-user-md"></i> <span>Assistante</span>
                    </a></li>
                <li class="active treeview"><a href="<c:url value='/admin/docteur/index'/>"> <i
                            class="fa fa-user-md"></i> <span>Doctor</span>
                    </a></li>
                <li class="treeview"><a href="<c:url value='/admin/patient/index'/>"> <i
                            class="fa fa-users"></i> <span>Patient</span>
                    </a></li>
                <li class="treeview"><a href="<c:url value='/admin/rendezvous/index'/> "><i
                            class="fa  fa-stethoscope"></i> <span> Appointment</span>
                    </a></li>
                <li class="treeview"><a href="<c:url value='/admin/consultation/index'/> "> <i
                            class="fa  fa-lastfm"></i> <span>History</span>
                    </a></li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
    <div class="content-wrapper">
        <c:choose>
            <c:when test='${menuActive=="dashboard-content"}'>
                <jsp:include page="dashboard/home.jsp" />
            </c:when>
            <c:when test='${menuActive=="docteur-content"}'>
                <jsp:include page="docteur/docteurs.jsp" />
            </c:when>
            <c:when test='${menuActive=="patient-content"}'>
                <jsp:include page="patient/patients.jsp" />
            </c:when>
            <c:when test='${menuActive=="assistante-content"}'>                
                <jsp:include page="assistante/assistantes.jsp"/>          
            </c:when>
            <c:when  test='${menuActive=="rendezvous-content"}'>
                <jsp:include page="rendezvous/rendez-vous.jsp"/>
            </c:when>
            <c:when  test='${menuActive=="consultation-content"}'>
                <jsp:include page="consultation/historiqueCons.jsp"/>
            </c:when>
             <c:when  test='${menuActive=="ordonnance-content"}'>
                 <jsp:include page="ordonnance/ordonnance.jsp"/>
            </c:when>
        </c:choose>
    </div>

    <jsp:include page="core/footer.jsp" />