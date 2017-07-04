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
                <h4 class="modal-title" id="myModalLabel">PATIENT INFORMATION</h4>
            </div>
            <div class="modal-body">
                <div class="box box-primary">
                    <div class="box-body box-info">
                        <ul class="list-group list-group-unbordered">
                            <li class="list-group-item">
                                <b>Last Name</b> <a class="pull-right"><c:out value="${requestScope.patient.nomPat}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>First Name</b> <a class="pull-right"><c:out value="${requestScope.patient.prenomPat}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>Birth Date</b> <a class="pull-right"><c:out value="${requestScope.patient.dateNaissancePat}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>Matricule</b> <a class="pull-right"><c:out value="${requestScope.patient.matricule}"/></a>
                            </li>
                             <li class="list-group-item">
                                <b> Number-phone</b> <a class="pull-right"><c:out value="${requestScope.patient.telPat}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>Address</b> <a class="pull-right"><c:out value="${requestScope.patient.adressePat}"/></a>
                            </li>
                            <li class="list-group-item">
                                <b>Genre</b> <a class="pull-right"><c:out value="${requestScope.patient.genre}"/></a>
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