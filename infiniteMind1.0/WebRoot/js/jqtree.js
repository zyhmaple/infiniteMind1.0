(function ($) {
    //使用js的严格模式
    'use strict';

    $.fn.jqtree = function (options) {
        //合并默认参数和用户传过来的参数
        options = $.extend({}, $.fn.jqtree.defaults, options || {});

        var that = $(this);
        var strHtml = "";
        //如果用户传了data的值，则直接使用data，否则发送ajax请求去取data
        if (options.data.length) {
            strHtml = initPTree(options.data);
            that.html(strHtml);
            initClickNode();
            //请求完成之后执行事件
			options.onLoadSuccess.call(that, options.data);
        }
        else {
            //在发送请求之前执行事件
            options.onBeforeLoad.call(that, options.param);
            if (!options.url)
                return;
            //发送远程请求获得data
            $.ajax({url:options.url,
            		//data:options.param,
            		type: "post",
            		dataType: 'json',
//            		async: false,
            		success:function (data) {
            			var jsTree =$.parseJSON(data.jsonTree);
            			strHtml = initPTree(jsTree);
            			that.html(strHtml);
            			initClickNode();
            			//请求完成之后执行事件
            			options.onLoadSuccess.call(that, data);
            	}
            });
        }

        function initExpand(data){
        	//style=\"display: none;\" expand='off'
        }
        
        //注册节点的点击事件
        function initClickNode() {
        	$('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse this branch');
        	$('.icon-leaf').parent('span').parent('li').addClass('parent_li');
        	
            $('.tree li.parent_li > span').on('click', function (e) {

                var children = $(this).parent('li.parent_li').find(' > ul > li');
                
                if(children.length)
                {	
	                if (children.is(":visible")) {
	
	                    children.hide('fast');
	                    $(this).attr('expand', 'off');
	                    $(this).attr('title', 'Expand this branch').find(' > i').addClass('icon-plus-sign').removeClass('icon-minus-sign');
	                } else {
	                    children.show('fast');
	                    $(this).attr('expand', 'on');
	                    $(this).attr('title', 'Collapse this branch').find(' > i').addClass('icon-minus-sign').removeClass('icon-plus-sign');
	                }
            	}

                e.stopPropagation();
                options.onClickNode.call($(this), $(this));
        });
        };

        //根节点，递归拼接html构造树形子节点
        function initPTree(data) {
            var strHtml = "";
            for (var i = 0; i < data.length; i++) {
                var arrChild = data[i].nodes;
                var strHtmlUL = "";
                var strIconStyle = "icon-folder-open";
                if (arrChild && arrChild.length > 0) {
                    strHtmlUL = "<ul>";
                    strHtmlUL += initTree(arrChild,data[i].expand) + "</ul>";
                }
                strHtml += "<li id=\"li_" + data[i].id + "\" ><span id=\"span_" + data[i].id + "\"><i class=\"" + strIconStyle + "\"></i>"+ data[i].text +"</span>"+ strHtmlUL+"</li>" ;
            }
            return strHtml;
        };
        //递归拼接html构造树形子节点
        function initTree(data,pStatus) {
            var strHtml = "";
            for (var i = 0; i < data.length; i++) {
                var arrChild = data[i].nodes;
                var strHtmlUL = "";
                var strIconStyle = "icon-leaf";
                if (arrChild && arrChild.length > 0) {
                    strHtmlUL = "<ul >";
                    strHtmlUL += initTree(arrChild,data[i].expand) + "</ul>";
                    strIconStyle = data[i].expand=="on"?"icon-minus-sign":"icon-plus-sign";
                }
                var display= pStatus=="on"?"style=\"display: list-item;\"":"style=\"display: none;\"";
                //var display='';
                //if(data[i].expand=="on") 
                strHtml += "<li "+ display +" id=\"li_" + data[i].id + "\" ><span  expand=\""+data[i].expand+"\" id=\"span_" + data[i].id + "\"><i class=\"" + strIconStyle + "\"></i>"+ data[i].text +"</span>"+ strHtmlUL+"</li>" ;
                //<a href=\"\">"+ data[i].text + "</a>
            }
            return strHtml;
        };
        
    };

    //默认参数
    $.fn.jqtree.defaults = {
        url: null,
        param: null,
        data: null,
        onBeforeLoad: function (param) { },
        onLoadSuccess: function (data) { },
        onClickNode: function (selector) { }
    };

})(jQuery);

