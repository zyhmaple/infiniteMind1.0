<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/commonhead.jsp"%>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="tree" style="border: 0px solid">
    		<ul id="ul_tree">
   			 </ul>
		</div>
		</div>
	</div>
</div>
<input type="button" onclick="">创建</input>
<input type="hidden"  id="jsonTree" name="jsonTree" value="${jsonTree}"/>
 </body>
 
 
<script>
//保存adt
function saveAdt()
{
	$.ajax({url:$("#adt_Edit").val(),
			data:{
				adt_Type : $("input[type='radio']:checked").val(),
				adt_ID : $("#adt_ID").val(),
				adt_Name : $("#adt_Name").val(),
				adt_Parent_ID : $("#adt_Parent_ID").val(),
				expandTree : $("#expandTree").val(),
			},
			type: "post",
            dataType: 'json',
            success:function (data) {
            			treedata =$.parseJSON(data.jsonTree);
            	}
            });
}
//右键菜单
var menu = new BootstrapMenu('.parent_li', {
 	fetchElementData: function($rowElem) {
        var nodeId = $rowElem.attr('id').split('_')[1];
        var nodeName = $('#span_'+nodeId).text();
        var parent =$rowElem.parent('ul').parent('li');
        var nodeParentId = parent.length==0 ? 0 : parent.attr('id').split('_')[1];
        var nodeParentName = nodeParentId==0 ? '根' : $('#span_'+nodeParentId).text();
        var nodeType =$rowElem.find('>span>i.icon-leaf').length==0 ? 0 :99;
        var adtInfo = { id: nodeId, text: nodeName ,type:nodeType, 
			pid: nodeParentId , pname: nodeParentName};
        return adtInfo;
      }, 
  actions: [{
      name: '新增目录/属性',
      onClick: function(node) {
      $("#adt_Edit").val("adt/create");
      createFormVO(node);
      }
    }, {
      name: '编辑',
      onClick: function(node) {
      $("#adt_Edit").val("adt/edit");
      editFormVO(node);
      }
  }, {
      name: '删除',
      onClick: function(node) {
      $("#adt_Edit").val("adt/delete");
      $('#adt_ID').val(node.id);
      }
  }, {
      name: 'defalut',
      onClick: function(row) {
        toastr.info("'buckup action' clicked!");
      }
  }]
});

function editFormVO(node){
      $("input[name='adt_Type'][value='"+node.type+"']").attr('checked','true');
      $('#adt_ID').val(node.id);
      $('#adt_Name').val(node.text);
      $('#adt_Parent').val(node.pname);
      $('#adt_Parent_ID').val(node.pid);
      $('#adtEditModal').modal('show');
}

function createFormVO(node){
      //$("input[name='adt_Type'][value='"+node.type+"']").attr('checked','true');
      $('#adt_Parent').val(node.text);
      $('#adt_Parent_ID').val(node.id);
      $('#adtEditModal').modal('show');
}

var nodeStates =[];
var treedata = [];

$(function () {
	treedata =eval('(' + decodeURIComponent($('#jsonTree').val()) + ')');//($('#jsonTree').val());
    $("#ul_tree").jqtree({
        data: treedata,
        param: { },
        url:'adt/getAdtList',
        onBeforeLoad: function (param) {
        },
        onLoadSuccess: function (data) {  
        
			if($('#expandTree').val()!='')
			nodeStates = eval('(' + decodeURIComponent($('#expandTree').val()) + ')');
			
        },
        onClickNode: function (selector) {
					
					var breakState = 0;
					$.each(nodeStates, function(index, content) {
						if (content.id === $(selector).attr('id')) {
							if ($(selector).attr("expand") == 'off')
							{
								nodeStates.splice(index, 1);
								$('#expandTree').val(JSON.stringify(nodeStates));
							}
							breakState = 1;
							return false;
						}
					});

					if (breakState) return;
					if ($(selector).attr("expand") == 'off') return;

					var nodeState = '{"id":\"' + $(selector).attr("id") + '\","status":\"' + $(selector).attr("expand") + '\"}';
					var nobj = eval('(' + nodeState + ')');
					nodeStates.push(nobj);
					$('#expandTree').val(JSON.stringify(nodeStates));


				}
			});

    
    
});



 $('#adt_type').click(function(){return;
 	$('#adt_ID').attr("readonly",true);
 	$('#adt_CatalogLevel').attr("readonly",true);
 })
 
 function ajaxGetTarget()
 {
 	$.ajax({
 		type : 'post',
 		url : '',
 		dataType : 'json',
 		success : function(){
 		}
 	});
 }
function saveExpandNodes(){

	var jsTree = $('.tree.well');
}

</script>