<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<base href="<%=basePath%>">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<%-- <script src="<%=basePath%>js/jquery.min.js"></script> --%>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<%-- <script src="<%=basePath%>js/bootstrap.min.js"></script> --%>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- 引入 Bootstrap -->
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">

<script type="text/javascript" src="<%=basePath%>js/jqtree.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css" />
<script src="<%=basePath%>js/toastr.js"></script>
<script src="<%=basePath%>js/BootstrapMenu.min.js"></script>
<script src="<%=basePath%>js/native/dropdown.js"></script>
<%@taglib prefix="s" uri="/struts-tags" %>

<!-- 模态框（Modal） -->
<div class="modal fade" id="adtEditModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
        <form id="adt_Edit" role="form" >
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">编辑</h4>
            
            </div>
            <div class="modal-body">
				<div class="radio">
					 <label><input id="adt_Type" name="adt_Type" type="radio" value="0" />目录</label><label><input id="adt_Type" name="adt_Type" type="radio" value="99" />属性</label>
				</div>
				<div class="form-group">
					 <label for="adt_ID">标签标识</label>
					 <input type="text" class="form-control" id="adt_ID" name="adt_ID" />
				</div>
				<div class="form-group">
					 <label for="adt_Name">标签名称</label>
					 <input type="text" class="form-control" id="adt_Name" name="adt_Name"/>
				</div>
				<div class="form-group" style="display:none">
					 <label for="adt_CatalogLevel">层级</label>
					 <input type="text" class="form-control" id="adt_CatalogLevel" name="adt_CatalogLevel" disabled/>
				</div>
				<div class="form-group">
					 <label for="adt_Parent_ID">父级</label>
					 <input type="text" class="form-control" id="adt_Parent"  disabled/>
				</div>
				<!-- <div class="form-group">
					 <label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />
					<p class="help-block">
						Example block-level help text here.
					</p>
				</div> -->

				<div class="checkbox">
					 <label><input id="adt_IsMatch" name="adt_IsMatch" type="checkbox" value="0"/>是否包含</label>
                </div>
			
			</div>
            <div class="modal-footer">
            	<input type="hidden"  id="adt_Parent_ID" name="adt_Parent_ID" />
            	<input type="hidden"  id="adt_EdtiType" name="adt_EdtiType" />
            	<input type="hidden"  id="expandTree" name="expandTree" value="${expandTree}"/>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="submit" class="btn btn-primary" onclick='saveAdt()'>提交更改</button>
            </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div>
<!-- /.modal -->