<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html>
  <head>
    <title>ACM platform</title>
    <s:head theme="xhtml"/>
	<sx:head parseContent="true" extraLocales="UTF-8"/> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- jQuery UI -->
    <link href="https://code.jquery.com/ui/1.10.3/themes/redmond/jquery-ui.css" rel="stylesheet" media="screen">

    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- styles -->
    <link href="css/styles.css" rel="stylesheet">

    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link href="vendors/form-helpers/css/bootstrap-formhelpers.min.css" rel="stylesheet">
    <link href="vendors/select/bootstrap-select.min.css" rel="stylesheet">
    <link href="vendors/tags/css/bootstrap-tags.css" rel="stylesheet">

    <link href="css/forms.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="login-bg">
  	<div class="header">
	     <div class="container">
	        <div class="row">
	           <div class="col-md-12">
	              <!-- Logo -->
	              <div class="logo">
	                 <h1><a href="index.html">ACM platform</a></h1>
	              </div>
	           </div>
	        </div>
	     </div>
	</div>

	<div class="page-content container">		
			<div class="row">
					<div class="col-md-4 col-md-offset-4">
						<div class="content-box-large">
		  				<div class="panel-heading">
							<div class="panel-title">登录页面</div>
						</div>
		  				<div class="panel-body">
		  					<div id="rootwizard">
								<div class="navbar">
								  <div class="navbar-inner">
								    <div class="container">
								<ul class="nav nav-pills">
								  	<li class="active"><a href="#tab1" data-toggle="tab">学生</a></li>
									<li><a href="#tab2" data-toggle="tab">教师</a></li>
									<li><a href="#tab3" data-toggle="tab">管理员</a></li>
								</ul>
								 </div>
								  </div>
								</div>
								<div class="tab-content">
								    <div class="tab-pane active" id="tab1">
								      <form class="form-horizontal" role="form"
								      	action="stulogin" method="post" namespace="/">
										  <div class="form-group">										    
										    <div class="col-sm-10">
										      <input class="form-control" type="text" placeholder="学号" name="loginUser.account">
										    </div>
										  </div>
										  <div class="form-group">
										    <div class="col-sm-10">
										      <input class="form-control" type="password" placeholder="密码" name="loginUser.password">
										    </div>
										  </div>
										  <div class="form-group">
											  <div style="margin:0 auto;width:150px;"> 
											  	<div class="action">
								                  	<button type="submit" class="btn btn-primary">登录</button>
								                  	<button type="reset" class="btn btn-primary">重置</button>
					                		  	</div> 
											  </div>								                             
								          </div>										  
										</form>
								    </div>
								    <div class="tab-pane" id="tab2">
								      <form class="form-horizontal" role="form"
								      	action="tealogin" method="post" namespace="/">
										  <div class="form-group">										    
										    <div class="col-sm-10">
										      <input class="form-control" type="text" placeholder="教师号" name="loginUser.account">
										    </div>
										  </div>
										  <div class="form-group">
										    <div class="col-sm-10">
										      <input class="form-control" type="password" placeholder="密码" name="loginUser.password">
										    </div>
										  </div>
										  <div class="form-group">
											  <div style="margin:0 auto;width:150px;"> 
											  	<div class="action">
								                  	<button type="submit" class="btn btn-primary">登录</button>
								                  	<button type="reset" class="btn btn-primary">重置</button>
					                		  	</div> 
											  </div>								                             
								          </div>										  										  
										</form>
			            			</div>
									<div class="tab-pane" id="tab3">
										<form class="form-horizontal" role="form"
											action="adminlogin" method="post" namespace="/">
										  <div class="form-group">										    
										    <div class="col-sm-10">
										      <input class="form-control" type="text" placeholder="管理员号" name="loginUser.account">
										    </div>
										  </div>
										  <div class="form-group">
										    <div class="col-sm-10">
										      <input class="form-control" type="password" placeholder="密码" name="loginUser.password">
										    </div>
										  </div>
										  <div class="form-group">
											  <div style="margin:0 auto;width:150px;"> 
											  	<div class="action">
								                  	<button type="submit" class="btn btn-primary">登录</button>
								                  	<button type="reset" class="btn btn-primary">重置</button>
					                		  	</div> 
											  </div>								                             
								          </div>										  
										</form>
								    </div>								    
								</div>	
							</div>
		  				</div>
		  			</div>
			  		<div class="already">
			  			<div style="margin:0 auto;width:100px;">
							没有账号?<a href="register.jsp">注册</a>
						</div>
					</div>
				</div>				
		</div>		
	</div>
	
	



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery.js"></script>
    <!-- jQuery UI -->
    <script src="https://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap/js/bootstrap.min.js"></script>

    <script src="vendors/form-helpers/js/bootstrap-formhelpers.min.js"></script>

    <script src="vendors/select/bootstrap-select.min.js"></script>

    <script src="vendors/tags/js/bootstrap-tags.min.js"></script>

    <script src="vendors/mask/jquery.maskedinput.min.js"></script>

    <script src="vendors/moment/moment.min.js"></script>

    <script src="vendors/wizard/jquery.bootstrap.wizard.min.js"></script>

	<!-- bootstrap-datetimepicker -->
     <link href="vendors/bootstrap-datetimepicker/datetimepicker.css" rel="stylesheet">
     <script src="vendors/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script> 
    
    <link href="//cdnjs.cloudflare.com/ajax/libs/x-editable/1.5.0/bootstrap3-editable/css/bootstrap-editable.css" rel="stylesheet"/>
	<script src="//cdnjs.cloudflare.com/ajax/libs/x-editable/1.5.0/bootstrap3-editable/js/bootstrap-editable.min.js"></script>
    
    <script src="js/custom.js"></script>
    <script src="js/forms.js"></script>
  </body>
</html>