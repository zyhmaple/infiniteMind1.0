<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/commonhead.jsp"%>

<style type="text/css">
.mdd {
	position: relative;
	left: 15%;
	line-height: 5px;
}

.input-group-addon:first-child {
	width: 110px;
}

.input-group-radio {
	height: 30px;
	padding: 5px 10px;
	font-size: 12px;
	line-height: 1.5;
	border-radius: 3px;
	display: table-cell;
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
	</table>
</div>

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
				<div class="modal-body mdd">
					<div class="input-group input-group-sm">
						<span class="input-group-addon  muted">广告主/代理商</span> <input
							type="text" class="form-control" name="adr_Name"
							placeholder="50字符以内" required="required">
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">类型</span>
						<div class="input-group-radio">
							<label> <input type="radio" value="0" name="adr_Type"
								checked="checked">广告主 <input type="radio" value="1"
								name="adr_Type">代理商
							</label>
						</div>
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">公司名称</span> <input type="text"
							class="form-control" name="adr_CompanyName" placeholder="50字符以内"
							required="required">
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">公司网站</span> <input type="text"
							class="form-control" name="adr_CompanyUrl"
							placeholder="http://example.com.cn" required="required">
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">公司邮箱</span> <input type="text"
							class="form-control" name="Adr_Email"
							placeholder="exmpale@infinite.com" required="required">
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">联系手机</span> <input type="text"
							class="form-control" name="Adr_Mobile" placeholder="11位数字"
							required="required">
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">固定电话</span> <input type="text"
							class="form-control" name="Adr_Telephone"
							placeholder="010-8008102">
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">代理商服务费率</span> <input type="text"
							class="form-control" name="Adr_AgentServiceRates" placeholder="%"
							required="required">
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">阶梯费率ID</span> <input type="text"
							class="form-control" name="Adr_StepRateID" placeholder="3阶"
							list="browsers">
						<datalist id="browsers">
							<option id="" value="Internet Explorer">
							<option value="Firefox">
							<option value="Google Chrome">
							<option value="Opera">
							<option value="Safari">
						</datalist>
					</div>
					<div class="input-group input-group-sm">
						<span class="input-group-addon">所属代理商</span> <input
							class="form-control" placeholder="模糊查询" id="agentText"
							name="Adr_AgentID" list="agentList">
						<datalist id="agentList">

						</datalist>
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

<script type="text/javascript">
   $(function(){
   		loadAdvertiserList();
   		}
   	);
   	function loadAdvertiserList(){
   			
   			$.ajax({url:"adr/queryAll",
   					data:{},
   					type:"post",
   					success:function(returnData,status){
   					  var adrList = returnData.searchList;
   					  var html="";
   					  $.each(adrList,function(k,adr){
   					   var name = "<td>"+adr.adr_Name+"</td>";
					   var type = "<td>"+((adr.adr_Type==0)?"广告主":"代理商")+"</td>";
					   var cpyName = "<td>"+adr.adr_CompanyName+"</td>";
					   var cpyUrl = "<td>"+adr.adr_CompanyUrl+"</td>";
					   var cpytel = "<td>"+adr.adr_Mobile+"</td>";
					   var rete = "<td>"+adr.adr_AgentServiceRates+"</td>";
					   var order = "<td>"+""+"</td>";
					   var zizhi = "<td>"+""+"</td>";
					   var date = "<td>"+adr.adr_RegisterDate+"</td>";
					   var operition = "<td>"+""+"</td>";
					   var line ="<tr "+((k%2==0)?'':"class='success'")+">"+name+type+cpyName+cpyUrl+cpytel+rete+order+zizhi+date+operition+"</tr>";
					   html+=line;
   					  });
   					  $("table tbody").html(html);
   					}
   			});
   	}
</script>
