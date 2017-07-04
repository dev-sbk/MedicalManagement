<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Docteur | Dashboard</title>
<s:url value="/resources/bootstrap/css/bootstrap.min.css"
	var="bootstrap" />
<s:url value="/resources/dist/css/AdminLTE.min.css" var="AdminLTE" />
<s:url value="/resources/dist/css/skins/_all-skins.min.css"
	var="allskins" />
<s:url value="/resources/plugins/iCheck/flat/blue.css" var="blue" />
<s:url value="/resources/plugins/morris/morris.css" var="morris" />
<s:url value="/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css"
	var="jqueryjvectormap" />
<s:url value="/resources/plugins/datepicker/datepicker3.css"
	var="datepicker" />
<s:url value="/resources/plugins/daterangepicker/daterangepicker.css"
	var="daterangepicker" />
<s:url value="/resources/plugins/select2/select2.min.css"
	var="select" />
<s:url
	value="/resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css"
	var="bootstrapwysihtml" />
<s:url value="/resources/core/img/logo.ico" var="logo" />
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="${bootstrap}">
<!-- Font Awesome -->
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="${AdminLTE}">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="${allskins}">
<!-- iCheck -->
<link rel="stylesheet" href="${blue}">
<!-- Morris chart -->
<link rel="stylesheet" href="${morris}">
<!-- jvectormap -->
<link rel="stylesheet" href="${jqueryjvectormap}">
<!-- Date Picker -->
<link rel="stylesheet" href="${datepicker}">
<!-- Daterange picker -->
<link rel="stylesheet" href="${daterangepicker}">
<!-- Select -->
<link rel="stylesheet" href="${select}">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="${bootstrapwysihtml}">
<link href="${logo}" rel="icon" />
</head>
<body class="hold-transition skin-blue sidebar-mini">