<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/15
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


<%--

    <!-- jqeuy默认的css样式 -->
     <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/black/easyui.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/util-js.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
    <script type="text/javascript"  src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
--%>

</head>
<body>



<table border="1" cellspacing="0" width="1050px" height="50px">

    <th>

        <font >代还本金总金额&nbsp;<span id="dhuan"></span>元。。</font>&nbsp;&nbsp;&nbsp;
        <font >逾期待还款总金额&nbsp;<span id="yhuan"></span>元。。</font>&nbsp;&nbsp;&nbsp;
        <font>严重逾期待还款总金额&nbsp;<span id="yzhuan"></span>元。。</font>

    </th>
</table>
<br/>
</table>
<table border="1" cellspacing="0">
    <th>

<form id="tableform" >
    <div>
        <label  >用户名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
        <input class="easyui-textbox" id="name"  type="text" name="name"/> &nbsp;&nbsp;
        <label  >借款标题:&nbsp;&nbsp;&nbsp;&nbsp;</label>
        <input class="easyui-textbox" id="title"  type="text" name="title" /> &nbsp;&nbsp;
        <label  >下一还款日:</label>
        <input class="easyui-datebox" id="startDate"  type="text" name="startDate"  /> 至&nbsp;&nbsp;
        <input class="easyui-datebox" id="endDate"  type="text" name="endDate" />

    </div>

</form>
    <div id="btn" href="#" class="easyui-linkbutton" onclick="whereSelect()" data-options="iconCls:'icon-search'">查询</div>


    </th>
</table>
<br/>
 <div style="margin:10px" >
     <a href="<%=request.getContextPath()%>/zxy/dhkShow.jsp" class="easyui-linkbutton c1" style="width:220px;background-color:blue;height:30px"><font color="red"><h3>近三十天待还款</h3></font></a>
     <a href="<%=request.getContextPath()%>/zxy/yqShow.jsp" class="easyui-linkbutton c2" style="width:220px;background-color:blue;height:30px"><font color="red"><h3>逾期待还款</h3></font></a>
     <a href="<%=request.getContextPath()%>/zxy/yzShow.jsp" class="easyui-linkbutton c3" style="width:220px;background-color:blue;height:30px"><font color="red"><h3>严重逾期待还款</h3></font></a>

</div>


<div id="dialog_update"></div>
<div  class="easyui-linkbutton" onclick="daochu()" data-options="iconCls:'icon-redo'">导出</div>

<table  id="queryDhk"> </table>

    <script type="text/javascript">

        //查询
    $(function(){
        $('#queryDhk').datagrid({
            url:'<%=request.getContextPath()%>/dhkController/queryDhk.do',
            pagination:true,//开启分页
            pageNumber:1,//初始化页码
            pageSize:3,//每页条数
            pageList:[3,5,8,10],
            striped:true,
            columns:[[
                {field:'id',title:'编号',width:100},
                {field:'title',title:'借款标题',width:100},
                {field:'name',title:'用户名',width:100},
                {field:'jkuan',title:'借款金额(元)',width:100},
                {field:'qshu',title:'期数',width:100},
                {field:'bhuan',title:'本期应还总额(元)',width:100},
                {field:'shuan',title:'剩余还总额(元)',width:100},
                {field:'nextdate',title:'距下次还款(天)',width:100},
                {field:'nexthdate',title:'下一还款日',width:100},

                {field:'',title:'操作',width:100,align:'right',
                    formatter: function(value,row,index){
                        return "<div  class='easyui-linkbutton' onclick=aa() data-options='iconCls:'icon-add',plain:true'>个人资料</div><div  class='easyui-linkbutton' onclick=xc() data-options='iconCls:'icon-add',plain:true'>线下催收</div>";
                    }
                }

            ]]
        });



    })

   //条件查询
    function whereSelect(){
        var name=$("#name").textbox('getValue');
        var title=$("#title").textbox('getValue');
        var startDate=$("#startDate").datebox('getValue');
        var endDate=$("#endDate").datebox('getValue');


        $('#queryDhk').datagrid('load',{
            "name":name,
            "title": title,
            "startDate": startDate,
            "endDate": endDate,

        })

    }



    function xc(){

        var tids=$("#queryDhk").datagrid("getSelections");
        if(tids.length!=1){
            $.messager.alert('警告','请选择一项');

        }else{
            $("#dialog_update").dialog({
                title:"修改用户",
                width: 800,
                height: 400,
                closed: false,
                cache: false,
                href:"<%=request.getContextPath()%>/dhkController/queryById.do?id="+tids[0].id,
                toolbar:[{
                    text:'保存',
                    iconCls:'icon-edit',
                      handler:function(){

                      $.ajax({
                           url:"<%=request.getContextPath()%>/dhkController/addCui.do",
                            data:$("#cuifroms").serialize(),
                            dataType:"text",
                            type:"post",
                            success:function(data){
                                alert(data)
                                $("#dialog_update").dialog("close");
                                $("#queryCui").datagrid("reload");

                            },error:function(){
                                $.messager.alert('警告','报错');
                            }
                        })

                    }
                },{
                    text:'取消',
                    iconCls:'icon-cancel',
                    handler:function(){
                        $("#dialog_update").dialog("close");
                    }
                }]
            });
        }
    }



    $.ajax({
        url: "<%=request.getContextPath() %>/dhkController/querydh.do",
        type: "post",

        datatype:'json',
        success: function (data) {

            $("#dhuan").html(data);
            $("#dhuans").html(data);
        }
    });

    $.ajax({
        url: "<%=request.getContextPath() %>/dhkController/queryyh.do",
        type: "post",

        datatype:'json',
        success: function (data) {

            $("#yhuan").html(data);
        }
    });


    $.ajax({
        url: "<%=request.getContextPath() %>/dhkController/queryyzh.do",
        type: "post",
        /*data:{id:$("#successAllMoney")},*/
        datatype:'json',
        success: function (data) {
            /*alert(data)*/
            $("#yzhuan").html(data);
        }
    });


    $.ajax({
        url: "<%=request.getContextPath() %>/dhkController/queryyingh.do",
        type: "post",
        /*data:{id:$("#successAllMoney")},*/
        datatype:'json',
        success: function (data) {
            /*alert(data)*/
            $("#yinghuan").html(data);
        }
    });


    $.ajax({
        url: "<%=request.getContextPath() %>/dhkController/queryshengh.do",
        type: "post",
        /*data:{id:$("#successAllMoney")},*/
        datatype:'json',
        success: function (data) {
            /*alert(data)*/
            $("#shenghuan").html(data);
        }
    });

        function daochu(){

            location.href="<%=request.getContextPath()%>/dhkController/ExceportExcel.do";


        }


</script>

<font >借款总金额&nbsp;<span id="dhuans"></span>元。。</font>&nbsp;&nbsp;&nbsp;
<font >本期应还总金额&nbsp;<span id="yinghuan"></span>元。。</font>&nbsp;&nbsp;&nbsp;
<font >剩余应还总额&nbsp;<span id="shenghuan"></span>元。。</font>


</body>
</html>
