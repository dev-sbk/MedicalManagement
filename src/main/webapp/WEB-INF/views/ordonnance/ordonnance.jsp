<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<s:url value="/admin/ordonnance/save" var="save" />
<section class="content">
    <div class="box-body">
        <form method="post" action="${save}">
            <div class="row">
                <div class="col-xs-12">
                    <div class="form-group">
                        <label> Name </label>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="fa  fa-adn"></i>
                            </div>
                            <input type="text" class="form-control" name="nomPat" 
                                   required="required"  value="${cons.patient.nomPat}" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label> First Name </label>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="fa  fa-adn"></i>
                            </div>
                            <input type="text" class="form-control" name="prenomPat"
                                   required="required"  value="${cons.patient.prenomPat}" />
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
                            <input type="date" class="form-control" name="dateOrd"
                                   required="required"  />
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="form-group">
                        <label>Description</label>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <i class="fa fa-y-combinator"></i>
                            </div>
                            <textarea  class="form-control" name="description"
                                       required="required" > </textarea>
                        </div>
                    </div>
                </div>
            </div>   
            <div class="row">
                <button  type="submit" 
                         class="btn btn-default " >
                    <span
                        class="glyphicon glyphicon-list-alt"></span> Imprimer

                </button>
                <button  type="reset"
                         class="btn btn-success "> 
                    <span
                        class="glyphicon glyphicon-list"></span> Annuler
                </button>
            </div>  
        </form>
    </div>
</section>
