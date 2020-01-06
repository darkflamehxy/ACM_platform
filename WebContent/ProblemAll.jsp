<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<%@ include file="HTML_for_include/head.html"%>
  </head>
  
  <body>
  	<h2><s:property value="#session.delteasuc"/></h2>
    <h2><s:property value="#session.delteafail"/></h2>
  	<div class="col-md-10">
		<div class="row">
			<div>
					<div class="content-box-large">
				  	<div class="panel-heading">
						<div class="panel-title"><b>查看教师</b></div>						
						<div class="panel-options">
							<a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
							<a href="#" data-rel="reload"><i class="glyphicon glyphicon-cog"></i></a>
						</div>
					</div>
				  	<div class="panel-body">
				  		<table class="table table-bordered">
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
									<th>proID</th>
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
										<td><s:property value="#p.proID" /></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
				  	</div>
				</div>
			</div>
		</div>
	</div>
  	<script src="https://code.jquery.com/jquery.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/custom.js"></script>
  </body>
</html>
