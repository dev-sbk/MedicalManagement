<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<s:url value="/admin/consultation/saveOrUpdate" var="saveConsultation"/>
<div class="modal fade" id="modalConsultation" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">CONSULTATION</h4>
            </div>
            <div class="modal-body">
                <!-- general form elements -->
                <div class="box box-primary">
                    <div class="box-header with-border">
                        <h3 class="box-title">ADD | UpDate</h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <form action="${saveConsultation}"  method="post">
                        <div class="box-body">
                            <input type="hidden" class="form-control" name="idPat" 
                                                   required="required"  value="<c:out value='${requestScope.patient.idPat}'/>" />
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="form-group">
                                        <label> Name </label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa  fa-adn"></i>
                                            </div>
                                            <input type="text" class="form-control" name="nomPat" 
                                                   required="required"  value="<c:out value='${requestScope.patient.nomPat}'/>" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label> First Name </label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa  fa-adn"></i>
                                            </div>
                                            <input type="text" class="form-control" name="prenomPat"
                                                   required="required"  value="<c:out value='${requestScope.patient.prenomPat}'/>" />
                                        </div>
                                    </div>

                                </div>
                            </div>    
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="form-group">
                                        <label> Date  </label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa  fa-adn"></i>
                                            </div>
                                            <input type="date" class="form-control" name="dateCons"
                                                   required="required"  />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label> Houre</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-y-combinator"></i>
                                            </div>
                                            <input type="text" class="form-control" name="heureCons"
                                                   required="required" />
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label>Subject</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-y-combinator"></i>
                                            </div>
                                            <textarea  class="form-control" name="sujetCons"
                                                       required="required" > </textarea>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>Diagnostic</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-y-combinator"></i>
                                            </div>
                                            <textarea class="form-control" rows="3" placeholder="Description ..."  name="diagCons"
                                                      required="required" ></textarea>
                                        </div>
                                    </div> 
                                </div>
                            </div>   
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="form-group">
                                        <label>Repos</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-y-combinator"></i>
                                            </div>
                                            <input type="text" class="form-control" name="repos"
                                                   required="required" />
                                        </div>
                                    </div> 
                                    <div class="form-group">
                                        <div class="input-group">
                                            <label for="exampleInputFile">Traitment</label>
                                            <input type="file" name=traitementCons" id="exampleInputFile"  />

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
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
