<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<base href="<%=basePath%>">
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>My JSP 'advertTargetList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<%--  <script type="text/javascript" src="<%=basePath%>js/jquery-1.7.2.min.js"></script> --%>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->

<!--图标样式-->

<link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.min.lit.css" />

<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!--主要样式-->

<link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css" />



<script type="text/javascript" src="<%=basePath%>js/jquery-1.7.2.min.js"></script>

<script type="text/javascript">

$(function(){

    $('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse this branch');

    $('.tree li.parent_li > span').on('click', function (e) {

        var children = $(this).parent('li.parent_li').find(' > ul > li');

        if (children.is(":visible")) {

            children.hide('fast');

            $(this).attr('title', 'Expand this branch').find(' > i').addClass('icon-plus-sign').removeClass('icon-minus-sign');

        } else {

            children.show('fast');

            $(this).attr('title', 'Collapse this branch').find(' > i').addClass('icon-minus-sign').removeClass('icon-plus-sign');

        }

        e.stopPropagation();

    });

});

</script>
  </head>
  
  <body>
 <div class="container">
	<div class="row clearfix">
		<div class="col-md-3 column">
		<div class="tree well">

<ul>

	<li>

		<span><i class="icon-folder-open"></i> Parent</span> <a href="">Goes somewhere</a>

		<ul>

			<li id="li1" style="display: none;">

				<span>
				<i class="icon-minus-sign"></i>
				 Child</span>
				<a href="">Goes somewhere</a>

				<ul>	

					<li style="display: none;">

						<span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>

					</li>

				</ul>

			</li>

			<li style="display: none;">

				<span><i class="icon-minus-sign"></i> Child</span> <a href="">Goes somewhere</a>

				<ul>

					<li>

						<span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>

					</li>

					<li>

						<span><i class="icon-minus-sign"></i> Grand Child</span> <a href="">Goes somewhere</a>

						<ul>

							<li>

								<span><i class="icon-minus-sign"></i> Great Grand Child</span> <a href="">Goes somewhere</a>

								<ul>

									<li>

										<span><i class="icon-leaf"></i> Great great Grand Child</span> <a href="">Goes somewhere</a>

									</li>

									<li>

										<span><i class="icon-leaf"></i> Great great Grand Child</span> <a href="">Goes somewhere</a>

									</li>

								 </ul>

							</li>

							<li>

								<span><i class="icon-leaf"></i> Great Grand Child</span> <a href="">Goes somewhere</a>

							</li>

							<li>

								<span><i class="icon-leaf"></i> Great Grand Child</span> <a href="">Goes somewhere</a>

							</li>

						</ul>

					</li>

					<li>

						<span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>

					</li>

				</ul>

			</li>

		</ul>

	</li>

	<li>

		<span><i class="icon-folder-open"></i> Parent2</span> <a href="">Goes somewhere</a>

		<ul>

			<li>

				<span><i class="icon-leaf"></i> Child</span> <a href="">Goes somewhere</a>

			</li>

		</ul>

	</li>

</ul>

</div>
		</div>
		<div class="col-md-9 column">
		<div class="tree">

    <ul>

        <li>

            <span><i class="icon-calendar"></i> 2013, Week 2</span>

            <ul>

                <li>

                	<span class="badge badge-success"><i class="icon-minus-sign"></i> Monday, January 7: 8.00 hours</span>

                    <ul>

                        <li>

	                        <a href=""><span><i class="icon-time"></i> 8.00</span> &ndash; Changed CSS to accomodate...</a>

                        </li>

                    </ul>

                </li>

                <li>

                	<span class="badge badge-success"><i class="icon-minus-sign"></i> Tuesday, January 8: 8.00 hours</span>

                    <ul>

                        <li>

	                        <span><i class="icon-time"></i> 6.00</span> &ndash; <a href="">Altered code...</a>

                        </li>

                        <li>

	                        <span><i class="icon-time"></i> 2.00</span> &ndash; <a href="">Simplified our approach to...</a>

                        </li>

                    </ul>

                </li>

                <li>

                	<span class="badge badge-warning"><i class="icon-minus-sign"></i> Wednesday, January 9: 6.00 hours</span>

                    <ul>

                        <li>

	                        <a href=""><span><i class="icon-time"></i> 3.00</span> &ndash; Fixed bug caused by...</a>

                        </li>

                        <li>

	                        <a href=""><span><i class="icon-time"></i> 3.00</span> &ndash; Comitting latest code to Git...</a>

                        </li>

                    </ul>

                </li>

                <li>

                	<span class="badge badge-important"><i class="icon-minus-sign"></i> Wednesday, January 9: 4.00 hours</span>

                    <ul>

                        <li>

	                        <a href=""><span><i class="icon-time"></i> 2.00</span> &ndash; Create component that...</a>

                        </li>

                    </ul>

                </li>

            </ul>

        </li>

        <li>

            <span><i class="icon-calendar"></i> 2013, Week 3</span>

            <ul>

                <li>

                	<span class="badge badge-success"><i class="icon-minus-sign"></i> Monday, January 14: 8.00 hours</span>

                    <ul>

                        <li>

	                        <span><i class="icon-time"></i> 7.75</span> &ndash; <a href="">Writing documentation...</a>

                        </li>

                        <li>

	                        <span><i class="icon-time"></i> 0.25</span> &ndash; <a href="">Reverting code back to...</a>

                        </li>

                    </ul>

                </li>

		    </ul>

        </li>

    </ul>

</div>
		</div>
	</div>
</div>
  </body>
</html>
