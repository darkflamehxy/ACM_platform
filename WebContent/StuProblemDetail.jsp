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
					<form class="form-horizontal" role="form" 
					action="stupro_save.action?
					problem.id=<s:property value="#session.problem.id"/>
					&&
					student.id=<s:property value="#session.student.id"/>" 
					method="post">
					  	<div class="form-group">
						    <label class="col-sm-2 control-label">题目编号</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.id" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">题目名</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.name" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">描述</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.description" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">输入</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.input" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">输出</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.output" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">样例输入</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.sampleInput" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">样例输出</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.sampleOutput" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">难度</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.level" /></span>
						    </div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label">答案</label>
						    <div class="col-sm-10">						    	
						        <span class="form-control"><s:property value="#session.problem_one_s.answer" /></span>
						    </div>
						</div>
						<div class="action" style="text-align:right;">
					      	<button type="submit" class="btn btn-primary">我AC了</button>			              		  		
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