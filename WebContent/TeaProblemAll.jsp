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
								<th>题目编号</th>
								<th>题目名</th>
								<th>描述</th>
								<th>输入</th>
								<th>输出</th>
								<th>样例输入</th>
								<th>样例输出</th>
								<th>难度</th>
								<th>答案</th>
								<th>知识点</th>
								<th>编辑题目</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<s:iterator var="p" value="#session.problem_all_s">
								<tr>
									<td><s:property value="#p.id" /></td>
									<td><s:property value="#p.name" /></td>
									<td><s:property value="#p.description" /></td>
									<td><s:property value="#p.input" /></td>
									<td><s:property value="#p.output" /></td>
									<td><s:property value="#p.sampleInput" /></td>
									<td><s:property value="#p.sampleOutput" /></td>
									<td><s:property value="#p.level" /></td>
									<td><s:property value="#p.answer" /></td>
									<td>
										<s:iterator var="k" value="#p.knowledge">
											<s:property value="#k.name"/>  
										</s:iterator>
									</td>
									<td><a href="${ctx}/problem_teadetail.action?problem.id=<s:property value="#p.id"/>">题目链接</a></td>
									<td><a href="${ctx}/stupro_acstu.action?stupro.problem.id=<s:property value="#p.id"/>">ac同学</a></td>
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