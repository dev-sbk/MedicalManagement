<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!-- Modal -->
<div class="modal fade" id="modalShow" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">CONSULTATION INFORMATION</h4>
            </div>
            <div class="modal-body">
                <div class="box box-primary">
                    <div class="box-body box-info">
                        <ul class="list-group list-group-unbordered">
                            <li class="list-group-item">
                                <b>Last Name</b> <a class="pull-right"><c:out value="${requestScope.c.patient.nomPat}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>First Name</b> <a class="pull-right"><c:out value="${requestScope.c.patient.prenomPat}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>Date Consultation</b> <a class="pull-right"><c:out value="${requestScope.c.dateCons}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>Houre</b> <a class="pull-right"><c:out value="${requestScope.c.heureCons}"/></a>
                            </li>
                             <li class="list-group-item">
                                <b> Subject</b> <a class="pull-right"><c:out value="${requestScope.c.sujetCons}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>repos</b> <a class="pull-right"><c:out value="${requestScope.c.repos}"/></a>
                            </li>
                        </ul>
                    </div>
                    <!-- /.box-body -->
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>