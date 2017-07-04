<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<s:url value="/admin/assistante/delete" var="delete" />
<s:url value="/admin/assistante/add" var="add" />
<s:url value="/admin/assistante/edit" var="edit" />
<section class="content">
    <div class="row">
        <div class="col-xs-12 margin-bottom">
            <div class="callout callout-success" style="margin-bottom: 0!important;">
                <h4><i class="fa fa-info"></i> Note:</h4>
               This is the page of the <b> Assistants </b> list. You can now upgrade.
            </div>
        </div>
        <div class="col-xs-12">
            <!-- general form elements -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">ADD | UpDate</h3>
                </div>
                <!-- /.box-header -->
                <!-- form start -->
                <form action="saveOrUpdate" method="post">
                    <div class="box-body">
                        <div class="row">
                            <div class="col-xs-4">
                                <div class="form-group">
                                    <label>Pseudo  </label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa  fa-adn"></i>
                                        </div>
                                        <c:choose>
                                            <c:when test='${assistante.username==null}'>
                                                <input type="text" class="form-control" name="username"
                                                       required="required"  value="${assistante.username}"/>
                                            </c:when>
                                            <c:when test='${assistante.username!=null}'>
                                                <input type="text" class="form-control" name="username"
                                                       required="required"  value="${assistante.username}" disabled/>
                                            </c:when>

                                        </c:choose>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Password </label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-y-combinator"></i>
                                        </div>
                                        <input type="password" class="form-control" name="password"
                                               required="required" value="${assistante.password}"/>
                                    </div>
                                </div>

                            </div>
                            <div class="col-xs-4">
                                <div class="form-group">
                                    <label>Name </label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa  fa-adn"></i>
                                        </div>
                                        <input type="text" class="form-control" name="nom"
                                               required="required"  value="${assistante.nom}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>First-Name</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-y-combinator"></i>
                                        </div>
                                        <input type="text" class="form-control" name="prenom"
                                               required="required" value="${assistante.prenom}"/>
                                    </div>
                                </div>

                            </div>
                            <div class="col-xs-4">

                                <div class="form-group">
                                    <label>Address</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-university"></i>
                                        </div>
                                        <input type="text" class="form-control" name="adresse"
                                               required="required" value="${assistante.adresse}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Phone Number</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">
                                            <i class="fa fa-phone"></i>
                                        </div>
                                        <input type="text" class="form-control" name="tel"
                                               required="required"  value="${assistante.tel}"/>
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
                                            <th>Pseudo</th>
                                            <th>Name</th>
                                            <th>First-Name</th>
                                            <th>Address</th>
                                            <th>Phone Number</th>
                                            <th>Actions</th>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="assistante" items="${assistantes}">
                                            <tr>
                                                <td>${assistante.username}</td>
                                                <td>${assistante.nom}</td>
                                                <td>${assistante.prenom}</td>
                                                <td>${assistante.adresse}</td>
                                                <td>${assistante.tel}</td>
                                                <td colspan="2"><a href="${edit}/${assistante.username}"
                                                                   type="button" class="btn btn-default "> <span
                                                            class="glyphicon glyphicon-edit"></span> Edit
                                                    </a> <a href="${delete}/${assistante.username}" type="button"
                                                            class="btn btn-warning "> <span
                                                            class="glyphicon glyphicon-remove"></span> Remove
                                                    </a></td>
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