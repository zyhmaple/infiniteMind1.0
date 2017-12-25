<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/commonhead.jsp"%>
<style type="text/css">
/*受父框架样式嵌套影响，单独处理子页面样式*/
.mdd {
	position: relative;
	left: 15%;
	top: 20px;
	width: 32.5%;
	line-height: 5px;
}

.input-group-addon:first-child {
	width: 70px;
}
</style>
<div class="container-fluid">

	<a id="modal-612296" href="#modal-container-612296" role="button"
		class="btn  btn-default" data-toggle="modal">创建广告主/代理</a>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>广告主/代理</th>
				<th>类型</th>
				<th>公司名称</th>
				<th>公司网站</th>
				<th>联系电话</th>
				<th>服务费率</th>
				<th>所含订单</th>
				<th>广告主资质</th>
				<th>注册时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>

		</tbody>
	</table></div>
	
<div class="modal fade" id="modal-container-612296" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<form role="form" action="adr/create">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h4 class="modal-title" id="myModalLabel">新增广告主/代理</h4>
					</div>
					<div class="modal-body">
<div class="mdd">

	<div class="input-group input-group-sm">
		<span class="input-group-addon">广告主</span> <input
			class="form-control" placeholder="模糊查询" 
			name="Adr_AdvertID" list="advertList">
		<datalist id="advertList">

		</datalist>
	</div>
	<br>
	<div class="input-group input-group-sm">
		<span class="input-group-addon">订单名称</span> <input type="text"
			class="form-control" placeholder="Twitterhandle">
	</div>
	<br>
	<div class="input-group input-group-sm">
		<span class="input-group-addon">订单分组</span> <input type="text"
			class="form-control" placeholder="Twitterhandle">
	</div>
	<br>
	<div class="input-group input-group-sm">
		<span class="input-group-addon">平台类型</span> <input
			class="form-control" placeholder="点击查询" list="platTypeList">
		<datalist id="platTypeList">
		</datalist>
	</div>
	<br>
	<div class="input-group input-group-sm">
		<span class="input-group-addon">订单名称</span> <input type="text"
			class="form-control" placeholder="Twitterhandle">
	</div>
	<br>
	<div class="input-group input-group-sm">
		<span class="input-group-addon">订单分组</span> <input type="text"
			class="form-control" placeholder="Twitterhandle">
	</div>

</div>
</div>
<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="submit" class="btn btn-primary">保存</button>
			</div>
			</form>
		</div>
	</div>
</div>


