<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/17
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


    <!--引入easyUI样式的jsp页面  -->
    <jsp:include page="../js/js.jsp"></jsp:include>


    <!-- jqeuy默认的css样式 -->
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/black/easyui.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/util-js.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
    <script type="text/javascript"  src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>

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

<table border="1" cellspacing="0" width="1050px" height="50px">
    <br/>
    <th>

<form id="tableFrom" >
    <div>
        <label  >用户名:&nbsp;&nbsp;&nbsp;&nbsp;</label>
        <input class="easyui-textbox" id="name"  type="text" name="name" data-options="required:true" />
        &nbsp;&nbsp;
        <label  >借款标题:</label>
        <input class="easyui-textbox" id="title"  type="text" name="title" data-options="required:true" />
        &nbsp;&nbsp;
        <label  >催款记录:</label>
        <select name="jilu">
            <option value="">--请选择--</option>
            <option value="1">--有--</option>
            <option value="2">--无--</option>
        </select>

    </div>

</form>
        <div id="btn" href="#" class="easyui-linkbutton" onclick=" Select()" data-options="iconCls:'icon-search'">查询</div>

    </th>
</table>


<div style="margin:10px" >
    <a href="<%=request.getContextPath()%>/zxy/dhkShow.jsp" class="easyui-linkbutton c1" style="width:220px;background-color:blue;height:30px"><font color="red"><h3>近三十天待还款</h3></font></a>
    <a href="<%=request.getContextPath()%>/zxy/yqShow.jsp" class="easyui-linkbutton c2" style="width:220px;background-color:blue;height:30px"><font color="red"><h3>逾期待还款</h3></font></a>
    <a href="<%=request.getContextPath()%>/zxy/yzShow.jsp" class="easyui-linkbutton c3" style="width:220px;background-color:blue;height:30px"><font color="red"><h3>严重逾期待还款</h3></font></a>

</div>

<div  class="easyui-linkbutton" onclick="daochu()" data-options="iconCls:'icon-redo'">导出</div>
<div id="dialog_update"></div>

<table  id="queryYq">

</table>


<script type="text/javascript">
    $(function(){
        $('#queryYq').datagrid({
            url:'<%=request.getContextPath()%>/dhkController/queryYq.do',
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
                {field:'yfei',title:'逾期费用',width:100},
                {field:'ydate',title:'逾期天数',width:100},
                {field:'cdate',title:'最近催收时间',width:100},
                {field:'',title:'操作',width:100,align:'right',
                    formatter: function(value,row,index){
                        return "<div  class='easyui-linkbutton' onclick=aa() >个人资料</div><div  class='easyui-linkbutton' onclick=qxc() >线下催收</div>";
                    }
                }



            ]]
        });



    })


    function Select(){
        var name=$("#name").textbox('getValue');
        var title=$("#title").textbox('getValue');
        var jilu =$("#jilu").val();



        $('#queryYq').datagrid('load',{
            "name":name,
            "title": title,
            "jilu": jilu,


        })

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
        alert("aa");

        location.href="<%=request.getContextPath()%>/dhkController/ExceportExcel.do";


    }



    function qxc(){

        var tids=$("#queryYq").datagrid("getSelections");
        if(tids.length!=1){
            $.messager.alert('警告','请选择一项');

        }else{
            $("#dialog_update").dialog({
                title:"用户",
                width: 800,
                height: 400,
                closed: false,
                cache: false,
                href:"<%=request.getContextPath()%>/dhkController/queryByYqId.do?id="+tids[0].id,
                toolbar:[{
                    text:'保存',
                    iconCls:'icon-edit',
                    handler:function(){

                        $.ajax({
                            url:"<%=request.getContextPath()%>/dhkController/addCui.do",
                            data:$("#qcuifrom").serialize(),
                            dataType:"text",
                            type:"post",
                            success:function(data){
                                alert(data)
                                $("#dialog_update").dialog("close");
                                $("#queryYq").datagrid("reload");

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


</script>

<font >借款总金额&nbsp;<span id="dhuans"></span>元。。</font>&nbsp;&nbsp;&nbsp;
<font >本期应还总金额&nbsp;<span id="yinghuan"></span>元。。</font>&nbsp;&nbsp;&nbsp;
<font >剩余应还总额&nbsp;<span id="shenghuan"></span>元。。</font>

</body>
</html>
