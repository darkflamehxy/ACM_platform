<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%
    String ctx = request.getContextPath();
    pageContext.setAttribute("ctx", ctx);
%>
<!DOCTYPE html>
<html>
  <head>
    <%@ include file="HTML_for_include/head.html"%>
  </head>
  <body>
	<%@ include file="HTML_for_include/header_for_student.html"%>

    <div class="page-content">
    	<div class="row">
		  	<%@ include file="HTML_for_include/sidebar_for_student.html"%>
		  	
			<div class="col-md-10">
				<div class="content-box-large">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>账号</th>
								<th>姓名</th>
								<th>电子邮件</th>
								<th>电话号</th>
								<th>学校</th>
								<th>专业</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator var="s" value="#session.acstu_s">
								<tr>
									<td><s:property value="#s.account" /></td>
									<td><s:property value="#s.name" /></td>
									<td><s:property value="#s.email" /></td>
									<td><s:property value="#s.phone" /></td>
									<td><s:property value="#s.school" /></td>
									<td><s:property value="#s.major" /></td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<footer class="navbar-fixed-bottom">
	     <div class="container">
			<div class="copy text-center">
				ACM platform
			</div>
		</div>
	</footer>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/custom.js"></script>
  </body>
</html>