<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<s:url value="/admin/consultation/delete" var="delete" />
<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box box-primary">
                <div class="box-header">
                    <h3 class="box-title">Table | List</h3>
                </div>
                <!-- /.box-header -->
                <div class="box-body">
                    <div id="example2_wrapper"
                         class="dataTables_wrapper form-inline dt-bootstrap">
                        <div class="row">
                            <div class="col-sm-6"></div>
                            <div class="col-sm-6"></div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <table id="example2"
                                       class="table table-bordered table-hover dataTable" role="grid"
                                       aria-describedby="example2_info">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Patient</th>
                                            <th>Date Consultation</th>
                                            <th>Houre</th>
                                            <th>Subject</th>
                                            <th>Action</th>

                                    </thead>
                                    <tbody>
                                        <c:forEach var="c" items="${consults}">
                                            <tr>

                                                <td>${c.idCons}</td>
                                                <td>${c.patient.nomPat} ${c.patient.prenomPat}</td>
                                                <td>${c.dateCons}</td>
                                                <td>${c.heureCons}</td>
                                                <td>${c.sujetCons}</td>
                                                <td>

                                                    <button  type="button" data-toggle="modal" data-target="#modalShow" 
                                                             class="btn btn-default " >
                                                        <c:set scope="request" value='${c}' var="c" />
                                                        <span
                                                            class="glyphicon glyphicon-list-alt"></span> Show

                                                    </button>
                                                        <a href="${delete}/${c.idCons}" onclick=" return confirm('You are sure to delete this consultation ?')"
                                                       class="btn btn-warning "> <span
                                                            class="glyphicon glyphicon-remove"></span> Delete
                                                    </a>

                                                </td>



                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                        

                    </div>
                </div>
                <!-- /.box-body -->
            </div>

        </div>
        <!-- /.col -->
    </div>
</section>
<jsp:include page="show.jsp"/>