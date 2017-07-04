<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<footer class="main-footer">
    <strong>Copyright &copy; 2014-2017 <a href="#"></a>.
    </strong> All rights reserved.
</footer>
</div>
<s:url value="/resources/plugins/jQuery/jquery-2.2.3.min.js"
       var="jquery" />
<s:url value="/resources/plugins/jQueryUI/jquery-ui.min.js"
       var="jqueryUI" />
<s:url value="/resources/bootstrap/js/bootstrap.min.js" var="bootstrap" />
<s:url value="/resources/plugins/select2/select2.full.min.js" var="selectFull" />
<s:url value="/resources/plugins/morris/morris.min.js" var="morris" />
<s:url value="/resources/plugins/sparkline/jquery.sparkline.min.js"
       var="jquerySparkline" />
<s:url
    value="/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"
    var="jqueryJvectormap" />
<s:url
    value="/resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"
    var="jqueryJvectormapWorldMillEn" />
<s:url value="/resources/plugins/knob/jquery.knob.js" var="jqueryKnob" />
<s:url value="/resources/plugins/moment/moment.min.js" var="moment" />
<s:url value="/resources/plugins/datepicker/bootstrap-datepicker.js"
       var="bootstrapDatepicker" />
<s:url value="/resources/plugins/colorpicker/bootstrap-colorpicker.min.js"
       var="bootstrapColorpicker" />

<s:url value="/resources/plugins/timepicker/bootstrap-timepicker.min.js"
       var="bootstrapTimepicker" />
<s:url value="/resources/plugins/daterangepicker/daterangepicker.js"
       var="daterangepicker" />

<s:url
    value="/resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"
    var="bootstrapWysihtmlAll" />
<s:url value="/resources/plugins/slimScroll/jquery.slimscroll.min.js"
       var="jquerySlimscroll" />
<s:url value="/resources/plugins/fastclick/fastclick.js" var="fastclick" />
<s:url value="/resources/dist/js/app.min.js" var="app" />
<s:url value="/resources/dist/js/pages/dashboard.js" var="dashboard" />
<s:url value="/resources/dist/js/demo.js" var="demo" />
<script src="${jquery}"></script>
<script src="${jqueryUI}"></script>
<script src="${bootstrap}"></script>
<script src="${selectFull}"></script>
<script>
    $(function () {
        //Initialize Select2 Elements
        $(".select2").select2();
    });
</script>
<script src="${morris}"></script>
<script src="${jquerySparkline}"></script>
<script src="${jqueryJvectormap}"></script>
<script src="${jqueryJvectormapWorldMillEn}"></script>
<script src="${jqueryKnob}"></script>
<script
src="${moment}"></script>
<script src="${daterangepicker}"></script>
<script src="${bootstrapDatepicker}"></script>
<script src="${bootstrapColorpicker}"></script>
<script src="${bootstrapTimepicker}"></script>
<script src="${bootstrapWysihtmlAll}"></script>
<script src="${jquerySlimscroll}"></script>
<script src="${fastclick}"></script>
<script src="${app}"></script>
<script src="${dashboard}"></script>
<script src="${demo}"></script>
</script>
</body>
</html>