<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/jsp/common/commonhead.jsp"%>
  
<!-- Header starts -->
  <header>
    <div class="container-fluid">
      <div class="row">

        <!-- Logo section -->
        <div class="col-md-4">
          <!-- Logo. -->
          <div class="logo">
            <h1><a href="#">Mac<span class="bold"></span></a></h1>
            <p class="meta">后台管理系统</p>
          </div>
          <!-- Logo ends -->
        </div>

       

        </div> </div>

  </header>

<!-- Header ends -->
<input type="hidden" id="name" name="name"><input type="hidden" id="namespace" name="namespace">
<body>
<div class="container-fluid">
	<div class="row clearfix">
		<div class="col-md-2 column">
		
<%@include file="/WEB-INF/jsp/common/LeftSideMenu.jsp"%>
		</div>
		<div class="col-md-10 column">

            <!-- 右侧 上方 路径导航 link navigation info -->
            <ul id="breadcrumb">
			</ul>
  			<!-- 右侧页面 -->
  			<iframe id="list" name="list" width="100%" height="100%" align="left" frameborder="0" border="0" src="" style="margin:0px;"  scrolling="no" ></iframe>
  		</div>
	</div>
</div>
</body>

<!-- Footer starts -->
<footer>
  <div class="container-fluid">
    <div class="row">
      <div class="col-md-12">
            <!-- Copyright info -->
            <p class="copy">Copyright &copy; 2012 | <a href="#">Your Site</a> </p>
      </div>
    </div>
  </div>
</footer> 	

<!-- Footer ends -->

<script >

</script>