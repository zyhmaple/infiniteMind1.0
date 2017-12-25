//onload
$(function(){
		
		//代理下拉菜单
		if($('#agentList').length>0)
			adrDropdown($('#agentList'),1);
		
		//广告主下拉菜单
		if($('#advertList').length>0)
			adrDropdown($('#advertList'),0);
		
		//平台类型
		if($('#platTypeList').length>0)
			platTypeDropdown($('#platTypeList'));
		
})

//agent Or advertiser 下拉
function adrDropdown(dropId,type){
	$.ajax({url:"adr/getAgentOrAdr",
			type:"post",
			data:{adr_Type:type},
			datatype:"json",
			success:function(returnData,status){
				var map = returnData.agentDropListMap;
				if(type==0)
				 map = returnData.advertDropListMap;
				
				var html;
				if (map != null) {
					
					$.each(map, function(key, value) {
						var opt = '<option id="'+key+'" value="'+value+'">';
						if(type==0)
							opt = '<option id="'+key+'" value="'+value.split(',')[0]+'" label="'+value.split(',')[1]+'">';
						html += opt;
					});
				}
				
				dropId.html(html);
			}
	})
}

//平台类型下拉
function platTypeDropdown(dropId) {
		//PC 1 2
		//MOBILE 11，12，13
		//OTT 21，22

		var opt = '<option id="1" value="PC硬广">';
		opt += '<option id="2" value="PC视频">';
		opt += '<option id="11" value="移动硬广">';
		opt += '<option id="12" value="移动视频">';
		opt += '<option id="13" value="移动信息流">';
		opt += '<option id="21" value="OTT硬广">';
		opt += '<option id="22" value="OTT视频">';
		
		dropId.html(opt);
}