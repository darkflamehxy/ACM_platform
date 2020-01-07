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
					<form action="${ctx}/problem_addKno.action?problem.id=<s:property value="#session.problem_one_s.id"/>"
					method="post">
						<table class="table table-striped">
							<div>
		  						<h4>选择知识点</h4>
		  						<p>
		  							<select class="selectpicker" name="knowledge.id">
		  								<s:iterator var="k" value="#session.knowledge_not_in_s">
		  									<option value="<s:property value="#k.id" />"><s:property value="#k.name" /></option>
		  								</s:iterator>
									</select>
		  						</p>
		  					</div>
						</table>
						<div class="action" style="text-align:right;">
					      	<button type="submit" class="btn btn-primary">添加知识点</button>			              		  		
					  	</div>
					</form>
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