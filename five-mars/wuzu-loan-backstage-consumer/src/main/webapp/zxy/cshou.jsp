<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/21
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>




    <!-- jqeuy默认的css样式 -->
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/black/easyui.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/util-js.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
    <script type="text/javascript"  src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>

<form id="csform" >
    <div>
        <label  >借款者:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
        <input class="easyui-textbox" id="jname"  type="text" name="jname"/> &nbsp;&nbsp;
        <label  >催收方式:&nbsp;&nbsp;&nbsp;&nbsp;</label>
        <select id="cfan" name="cfan">
            <option value="">--请选择--</option>
            <option value="1">电话</option>
            <option value="2">法律</option>
            <option value="3">现场</option>
            <option value="4">短信</option>
            <option value="5">邮件</option>
        </select> &nbsp;&nbsp;
        <label  >催收时间:</label>
        <input class="easyui-datebox" id="startDate"  type="text" name="startDate"  /> 至&nbsp;&nbsp;
        <input class="easyui-datebox" id="endDate"  type="text" name="endDate" />

    </div>

</form>
<div id="btn" href="#" class="easyui-linkbutton" onclick="csSelect()" data-options="iconCls:'icon-search'">查询</div>

<div id="dialog_update"></div>

<table  id="querycshou"> </table>

<script type="text/javascript">


    //查询
    $(function(){
        $('#querycshou').datagrid({
            url:'<%=request.getContextPath()%>/dhkController/queryXCui.do',
            pagination:true,//开启分页
            pageNumber:1,//初始化页码
            pageSize:3,//每页条数
            pageList:[3,5,8,10],
            striped:true,
            columns:[[
                {field:'id',title:'序号',width:100},
                {field:'jid',title:'借款ID',width:100},
                {field:'jname',title:'借款者',width:100},
                {field:'cdate',title:'催收时间',width:100},
                {field:'cfan',title:'催收方式',width:100,


                    formatter:function(value,row,index){

                        if(row.cfan==1){
                            return "电话";
                        }
                        if(row.cfan==2){
                            return "法律";
                        }
                        if(row.cfan==3){
                            return "现场";
                        }
                        if(row.cfan==4){
                            return "短信";
                        }
                        if(row.cfan==5){
                            return "邮件";
                        }



                    }

                },
                {field:'cpeople',title:'催收人',width:100},
                {field:'jinfo',title:'结果概要',width:100},
                {field:'',title:'操作',width:100,align:'right',
                    formatter: function(value,row,index){
                        return "<div  class='easyui-linkbutton' onclick=aa() data-options='iconCls:'icon-add',plain:true'>个人资料</div><div  class='easyui-linkbutton' onclick=ck() data-options='iconCls:'icon-add',plain:true'>催款详情</div>";
                    }
                }


            ]]
        });

    })


    //条件查询
    function csSelect(){
        var jname=$("#jname").textbox('getValue');
        var cfan=$("#cfan").val();
        var startDate=$("#startDate").datebox('getValue');
        var endDate=$("#endDate").datebox('getValue');


        $('#querycshou').datagrid('load',{
            "jname":jname,
            "cfan": cfan,
            "startDate": startDate,
            "endDate": endDate,

        })

    }


    function ck(){

        var tids=$("#querycshou").datagrid("getSelections");
        if(tids.length!=1){
            $.messager.alert('警告','请选择一项');

        }else{
            $("#dialog_update").dialog({
                title:"用户",
                width: 400,
                height: 400,
                closed: false,
                cache: false,
                href:"<%=request.getContextPath()%>/dhkController/Cuixiang.do?id="+tids[0].id,
                toolbar:[{

                    iconCls:'icon-edit',
                    handler:function(){

                        $.ajax({
                            //url:"/dhkController/addCui.do",
                            data:$("#cuifrom").serialize(),
                            dataType:"text",
                            type:"post",
                            success:function(data){
                                alert(data)
                                $("#dialog_update").dialog("close");
                                $("#querycshou").datagrid("reload");

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

</body>
</html>
