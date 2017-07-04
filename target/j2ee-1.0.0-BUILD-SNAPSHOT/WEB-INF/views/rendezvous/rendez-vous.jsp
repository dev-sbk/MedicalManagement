<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<s:url value="/admin/rendezvous/edit" var="edit" />
<s:url value="/admin/rendezvous/delete" var="delete" />
<section class="content">
    <div class="row">
        <div class="col-xs-12 margin-bottom">
            <div class="callout callout-info" style="margin-bottom: 0!important;">
                <h4><i class="fa fa-info"></i> Note:</h4>
                This is the page of the <b>Appointment</b> list. You can now make updates!

            </div>
        </div>
        <div class="col-xs-12">
            <!-- general form elements -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">ADD | Update</h3>
                </div>
                <!-- /.box-header -->
                <!-- form start -->
                <form action="saveOrUpdate" method="post">
                    <div class="box-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Patient</label>
                                    <select name="idPat" class="form-control select2 select2-hidden-accessible" multiple="" data-placeholder="Select a patient" style="width: 100%;" tabindex="-1" aria-hidden="true">
                                        <c:forEach var="p" items="${patients}">
                                            <option value="${p.idPat}">${p.nomPat} ${p.prenomPat}</option>
                                        </c:forEach>

                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Subject</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-y-combinator"></i>
                                        </div>
                                        <input type="text" class="form-control" name="sujetRDV"
                                               required="required" value="${rdv.sujetRDV}"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <input type="hidden" name="id" value="${rdv.idRDV}"/>
                                <div class="form-group">
                                    <label> RDV Date </label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa  fa-adn"></i>
                                        </div>
                                        <input type="date" class="form-control" name="dateRDV"
                                               required="required"  value="${rdv.dateRDV}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label> RDV Hour</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-clock-o"></i>
                                        </div>
                                        <input type="text" class="form-control timepicker" name="heureRDV"
                                               required="required" value="${rdv.heureRDV}"/>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary">Validate</button>
                    </div>
                </form>
            </div>
            <!-- /.box -->
        </div>
    </div>
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
                                            <th> RDV Date</th>
                                            <th> RDV Hour</th>
                                            <th>Subject</th>
                                            <th>Patient</th>
                                            <th>Status</th>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="r" items="${rdvs}">
                                            <tr>
                                                <td>${r.idRDV}</td>
                                                <td>${r.dateRDV}</td>
                                                <td>${r.heureRDV}</td>
                                                <td>${r.sujetRDV}</td>
                                                <td>${r.patient.nomPat} ${r.patient.prenomPat}</td>
                                                <td>${r.status}</td>
                                                <c:choose>
                                                    <c:when test='${r.status=="ATTENTE"}'>
                                                        <td colspan="2"><a href="${edit}/${r.idRDV}" type="button"
                                                                           class="btn btn-primary"> <span
                                                                    class="glyphicon glyphicon-"></span> Activate
                                                            </a>
                                                            <a href="${delete}/${r.idRDV}" type="button"
                                                               class="btn btn-danger" onclick="return confirm('Etes vous sure d\'annuler cette rdv?')"> <span
                                                                    class="glyphicon glyphicon-remove"></span> Delete
                                                            </a></td>
                                                        </c:when>
                                                        <c:when test='${r.status=="ACTIVER"}'>
                                                        <td>
                                                            <a href="${delete}/${r.idRDV}" type="button"
                                                               class="btn btn-danger" onclick="return confirm('Etes vous sure d\'annuler cette rdv?')"> <span
                                                                    class="glyphicon glyphicon-remove"></span> Delete
                                                            </a></td>
                                                        </c:when>
                                                    </c:choose> 

                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-5">
                                <div class="dataTables_info" id="example2_info" role="status"
                                     aria-live="polite">Showing 1 to 10 </div>
                            </div>
                            <div class="col-sm-7">
                                <div class="dataTables_paginate paging_simple_numbers"
                                     id="example2_paginate">
                                    <ul class="pagination">
                                        <li class="paginate_button previous disabled"
                                            id="example2_previous"><a href="#"
                                                                  aria-controls="example2" data-dt-idx="0" tabindex="0">Previous</a></li>
                                        <li class="paginate_button active"><a href="#"
                                                                              aria-controls="example2" data-dt-idx="1" tabindex="0">1</a></li>
                                        <li class="paginate_button "><a href="#"
                                                                        aria-controls="example2" data-dt-idx="2" tabindex="0">2</a></li>
                                        <li class="paginate_button "><a href="#"
                                                                        aria-controls="example2" data-dt-idx="3" tabindex="0">3</a></li>
                                        <li class="paginate_button "><a href="#"
                                                                        aria-controls="example2" data-dt-idx="4" tabindex="0">4</a></li>
                                        <li class="paginate_button "><a href="#"
                                                                        aria-controls="example2" data-dt-idx="5" tabindex="0">5</a></li>
                                        <li class="paginate_button "><a href="#"
                                                                        aria-controls="example2" data-dt-idx="6" tabindex="0">6</a></li>
                                        <li class="paginate_button next" id="example2_next"><a
                                                href="#" aria-controls="example2" data-dt-idx="7"
                                                tabindex="0">Next</a></li>
                                    </ul>
                                </div>
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