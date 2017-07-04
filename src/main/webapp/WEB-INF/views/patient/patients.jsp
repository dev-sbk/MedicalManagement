<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<s:url value="/admin/patient/delete" var="delete" />
<s:url value="/admin/patient/add" var="add" />
<s:url value="/admin/patient/edit" var="edit" />
<section class="content">
    <div class="row">
        <div class="col-xs-12 margin-bottom">
            <div class="callout callout-info" style="margin-bottom: 0!important;">
                <h4><i class="fa fa-info"></i> Note:</h4>
                This is the page of the list of <b> patients </b>. You can now make update!
            </div>
        </div>
        <div class="col-xs-12">
            <!-- general form elements -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">Add | Update</h3>
                </div>
                <!-- /.box-header -->
                <!-- form start -->
                <form action="saveOrUpdate" method="post">
                    <div class="box-body">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="form-group">
                                    <label>Genre</label>
                                    <div class="input-group">
                                        <input type="radio" name="genre" value="Male" checked> Male
                                        <input type="radio" name="genre" value="Female"> Female<br>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <input type="hidden" name="id" value="${patient.idPat}"/>

                                <div class="form-group">
                                    <label>Name </label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa  fa-adn"></i>
                                        </div>
                                        <input type="text" class="form-control" name="nom"
                                               required="required"  value="${patient.nomPat}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>First name</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-y-combinator"></i>
                                        </div>
                                        <input type="text" class="form-control" name="prenom"
                                               required="required" value="${patient.prenomPat}"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Birth date </label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa  fa-adn"></i>
                                        </div>
                                        <input type="date" class="form-control" name="dateNaissancePat"
                                               required="required"  value="${patient.dateNaissancePat}" />
                                    </div>
                                </div>


                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label>Address</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-university"></i>
                                        </div>
                                        <input type="text" class="form-control" name="adresse"
                                               required="required" value="${patient.adressePat}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Number phone</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-phone"></i>
                                        </div>
                                        <input type="number" class="form-control" name="tel"
                                               required="required"  value="${patient.telPat}"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Matricule</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-y-combinator"></i>
                                        </div>
                                        <input type="text" class="form-control" name="matricule"
                                               required="required" value="${patient.matricule}"/>
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
                                            <th>Name</th>
                                            <th>First-Name</th>
                                            <th>Number-phone</th>
                                            <th>Genre</th>
                                            <th>Actions</th>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="p" items="${patients}">
                                            <tr>

                                                <td>${p.idPat}</td>
                                                <td>${p.nomPat}</td>
                                                <td>${p.prenomPat}</td>
                                                <td>${p.telPat}</td>
                                                <td>${p.genre}</td>
                                                <td colspan="2"><a href="${edit}/${p.idPat}"
                                                                   type="button" class="btn btn-primary "> <span
                                                            class="glyphicon glyphicon-edit"></span> Edit
                                                    </a> <a href="${delete}/${p.idPat}" type="button"
                                                            class="btn btn-warning "> <span
                                                            class="glyphicon glyphicon-remove"></span> Delete
                                                    </a>


                                                    <button  type="button" data-toggle="modal" data-target="#modalShow" 
                                                             class="btn btn-default " >
                                                        <c:set scope="request" value='${p}' var="patient" />
                                                        <span
                                                            class="glyphicon glyphicon-list-alt"></span> Show

                                                    </button>
                                                    <button  type="button" data-toggle="modal" data-target="#modalConsultation" 
                                                             class="btn btn-success "> 
                                                        <c:set scope="request" value='${p}' var="patient" />
                                                        <span
                                                            class="glyphicon glyphicon-list"></span> Consult
                                                    </button>

                                                </td>
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
<jsp:include page="show.jsp"/>
<jsp:include page="../consultation/consultation.jsp"/>    