<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<s:url value="/resources/img/index.jpg"
	var="index" />
<s:url value="/resources/img/index2.jpg"
	var="index2" />
<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="info-box bg-aqua">
                <span class="info-box-icon"><i class="ion-ios-chatbubble-outline"></i></span>

                <div class="info-box-content">
                    <span class="info-box-text"><h2> Welcome Doctor</h2></span>
                
                </div>
                <!-- /.info-box-content -->
            </div>
        </div>
        <div class="col-md-6">
            <div class="box box-info ">
                <image src="${index}" width="100%" height="350px" />
            </div>
        </div>
         <div class="col-md-6">
            <div class="box box-info ">
                <image src="${index2}" width="100%" height="350px" />
            </div>
        </div>
    </div>
</section>