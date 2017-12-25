<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id='leftMenu' ></div>

<script type="text/javascript">
   $(function(){
   		leftSideMenu();
   		}
   	);
   
   function leftSideMenu(){
	$.ajax({url:"menu/getSystemMenuList",
				dataType:"json",
				type:"post",
				success:function(result) {
					var data = $.parseJSON(result.jsonMenu);
					var panel = '<div class="panel-group" id="panel-0">';
					var liArray = new Array();
					for (var i = 0; i < data.length; i++) {
						panel += '<div class="panel panel-default">';
						panel += '<div class="panel-heading">';
						
						var childArray = data[i].menu_nodes;
						liArray[data[i].menu_id]="<li class=\"active\">"+data[i].menu_name+"</li>";
						if (childArray && childArray.length > 0) {
							panel += "<a id="+data[i].menu_id+" class=\"panel-title\" data-toggle=\"collapse\" data-parent=\"panel-0\" href=\"#panel-element-" + childArray[0].menu_id + "\" >" + data[i].menu_name + "</a></div>";
							panel += '<div id="panel-element-' + childArray[0].menu_id + '\" class=\"panel-collapse collapse\">';
							for (var j = 0; j < childArray.length; j++) {
								
								liArray[childArray[j].menu_id]="<li class=\"active\">" +data[i].menu_name
								//"<li><a "+(data[i].menu_action == null ? 'class="active"': ('href='+ data[i].menu_action+ "' target=\"list\""))+" >"+data[i].menu_name +"</a>"
								+"</li><li class=\"active\">"+childArray[j].menu_name+"</li>";
								panel += "<div class=\"panel-body\"><a  id="+childArray[j].menu_id+" href='" + childArray[j].menu_action + "' target=\"list\" >";
								panel += childArray[j].menu_name + "</div>";
							}
							panel +='</div>';
						} else {
							panel += "<a  id="+data[i].menu_id+" href='" + data[i].menu_action + "' target=\"list\" >" + data[i].menu_name + "</a></div>";
						}
						panel += '</div>';
					}
					$("#leftMenu").html(panel);
					
					
					//路径导航展示
					$('#leftMenu a').click(function(){
						$('#breadcrumb').addClass('breadcrumb');
						$('#breadcrumb').html(liArray[this.id]);
			   		});
			
				}
				
			});
	};
	
	function gotoPage(righturl) { 

		//$("#CenterUrl").html(url);
		$.ajax({url:righturl,
				dataType:"html",
				type:"post",
				success:function(result) {
				$("#rightCenter").html(result);
				}
				});
		
  }
</script>
