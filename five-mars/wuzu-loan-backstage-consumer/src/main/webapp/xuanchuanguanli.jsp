<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <script type="text/javascript" src="<%=request.getContextPath()%>/jquery/jquery.min.js"></script>

    <!-- 这是easyui的核心包  -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/util-js.js"></script>
    <!-- 这是把分页改成中文的插件 -->
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/locale/easyui-lang-zh_CN.js"></script>


    <!-- jqeuy默认的css样式 -->
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/default/easyui.css">

    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
    <title>Insert title here</title>
</head>
<body>

<%@include file="/daohang.jsp" %>


<div id="cc" class="easyui-layout" style="width:100%;height:543px;">
    <%--
        <div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>
    --%>
    <%--
        <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
    --%>
    <%--
        <div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:100px;"></div>
    --%>
    <div data-options="region:'west',title:'菜单栏',split:true" style="width:215px;">

        <div title="第一个手风琴" data-options="iconCls:'icon-save',selected:true" style="overflow:auto;padding:10px;">
            <div id="tt" class="easyui-tree">
            </div>
        </div>


    </div>

    <div data-options="region:'center',title:'内容显示页'" style="background:#eee;">


        <div id="tabs" class="easyui-tabs" data-options="fit:true">
            <div title="首页" style="padding:20px;">
                首页
            </div>
        </div>

    </div>
</div>

<script type="text/javascript">


    $("#tt").tree({

        <%-- 	  url:"<%=request.getContextPath()%>/user/selectTreeList.do", //普通查树--%>
        url:"<%=request.getContextPath()%>/tree/selectYewuList.do",  //根据权限查树
        method:"post",
        checkbox:true,
        parentField:'pid',//实体类定义的pid一致
        onSelect: function(node){
            console.info(node);
            /* alert(node.text);  // 在用户点击的时候提示 */
            if(node.url != null && node.url != ""){

                var falg=$("#tabs").tabs('exists',node.text);
                if(falg){

                    $("#tabs").tabs('select',node.text);
                }else {

                    $('#tabs').tabs('add',{
                        title:node.text,
                        href:"<%=request.getContextPath()%>/"+node.url,
                        closable:true,
                        tools:[{
                            iconCls:'icon-mini-refresh',
                            handler:function(){
                                alert('refresh');
                            }
                        }]
                    });
                }

            }

        }

    })



    function changeTabs(strtitle,url){
        //alert(strtitle);
        //alert(url);
        var flag = $('#tabs-dd').tabs('exists',strtitle);
        //alert(flag);
        if(flag){
            $('#tabs-dd').tabs('select',strtitle);
        }else{
            $('#tabs-dd').tabs('add',{
                title:strtitle,
                href:"<%=request.getContextPath()%>/"+url,
                closable:true,
            });
        }
    }






</script>

</body>
</html>