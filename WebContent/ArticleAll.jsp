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
					<div class="content-box-large">
		  				<div class="panel-heading">
							<div class="panel-title">所有文章</div>
						</div>
		  				<div class="panel-body">
		  					<table class="table table-striped">
				              <thead>
				                <tr>
				                  <th>#</th>
				                  <th>标题</th>
				                  <th>时间</th>
				                  <th>作者</th>
				                  <th>描述</th>
				                  <th>类型</th>
				                  <th></th>
				                </tr>
				              </thead>
				              
				              <tbody>
				              	<s:iterator value="#session.article_all_s" var="aas">
				                <tr>
				                  <td><s:property value="#aas.id"/></td>
				                  <td><s:property value="#aas.title"/></td>
				                  <td><s:property value="#aas.time"/></td>
				                  <td><s:property value="#aas.writer.name"/></td>
				                  <td><s:property value="#aas.description"/></td>
				                  <td><s:property value="#aas.type"/></td>
				                  <td><button class="btn btn-default btn-xs"><a href="${ctx}/article_detail.action?article.id=<s:property value="#aas.id"/>">阅读</a></button></td>
				                </tr>
				                </s:iterator>
				              </tbody>
				            </table>
		  				</div>
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