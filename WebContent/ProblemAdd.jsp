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
					<form class="form-horizontal" role="form" action="problem_save.action" method="post">
						<div class="form-group">
						    <label for="name" class="col-sm-2 control-label">题目名</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="name" 						      
						        name="problem.name"/>
						    </div>
						</div>
						<div class="form-group">
						    <label for="description" class="col-sm-2 control-label">描述</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="description" 
						        name="problem.description">
						    </div>
						</div>
						<div class="form-group">
						    <label for="input" class="col-sm-2 control-label">输入</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="input" 
						        name="problem.input">
						    </div>
						</div>
						<div class="form-group">
						    <label for="output" class="col-sm-2 control-label">输出</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="output" 
						        name="problem.output">
						    </div>
						</div>
						<div class="form-group">
						    <label for="sampleInput" class="col-sm-2 control-label">样例输入</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="sampleInput" 
						        name="problem.sampleInput">
						    </div>
						</div>
						<div class="form-group">
						    <label for="sampleOutput" class="col-sm-2 control-label">样例输出</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="sampleOutput" 
						        name="problem.sampleOutput">
						    </div>
						</div>
						<div class="form-group">
						    <label for="level" class="col-sm-2 control-label">难度</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="level" 
						        name="problem.level">
						    </div>
						</div>
						<div class="form-group">
						    <label for="answer" class="col-sm-2 control-label">答案</label>
						    <div class="col-sm-10">
						        <input class="form-control" id="answer" 
						        name="problem.answer">
						    </div>
						</div>
						<div class="action" style="text-align:right;">
					      	<button type="submit" class="btn btn-primary">添加题目</button>			              		  		
					  	</div>
					</form>
					<div style="text-align:right;">
						<br>
						<a href="${ctx}/problem_teadetail.action?problem.id=<s:property value="#session.problem_one_s.id"/>"><button class="btn btn-primary">重置</button></a>
						&emsp;&emsp;
						<a href="${ctx}/problem_delete.action?problem.id=<s:property value="#session.problem_one_s.id"/>"><button class="btn btn-primary">删除</button></a>
					</div>
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