<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<head>
<title>Authentification</title>
<s:url value="/resources/core/css/bootstrap.min.css" var="bootstrap" />
<s:url value="/resources/core/css/bootstrap-theme.min.css" var="bootstrapTheme" />
<s:url value="/resources/core/fonts/glyphicons-halflings-regular.svg" var="glyphicons" />
<s:url value="/resources/core/css/login.css" var="loginCss" />
<s:url value="/resources/core/img/logo.ico" var="logo" />
<link href="${bootstrap}" rel="stylesheet" />
<link href="${glyphicons}" rel="stylesheet" />
<link href="${loginCss}" rel="stylesheet" />
<link href="${logo}" rel="icon" />
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-body">
						<h5 class="text-center">SIGN UP</h5>
						<form class="form form-signup" role="form"
							action="<c:url value='/j_spring_security_check'/>" method="post">
							<div class="form-group">
								<div class="input-group">
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-user"></span></span> <input type="text"
										class="form-control" placeholder="username"  name="j_username"/>
								</div>
							</div>

							<div class="form-group">
								<div class="input-group">
									<span class="input-group-addon"><span
										class="glyphicon glyphicon-lock"></span></span> <input
										type="password" class="form-control"
										placeholder="password"  name="j_password"/>
								</div>
							</div>
							<div class="form-group">
								<div class="input-group">
									<input type="submit" class="btn btn-sm btn-primary btn-block"
										value="sign in" />
								</div>
							</div>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>