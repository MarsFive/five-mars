<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/18
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<div>

    用户名：<input class="easyui-textbox" id="ccccname"  type="text" name="ccccname" value="${dhk.name}" readonly="true" />

</div>

<form id="cuifroms" >



      <div>
        <label>借款ID：</label>
        <input class="easyui-textbox" id="jid"  type="text" name="jid"  value="${dhk.id}" readonly/>
      </div>

        <input type="hidden" id="jname"  type="text" name="jname"  value="${dhk.name}" />

     <div>
      催款方式：<select id="cfan" name="cfan" >

                      <option value="">--请选择--</option>
                      <option value="1">电话</option>
                      <option value="2">法律</option>
                      <option value="3">现场</option>
                      <option value="4">短信</option>
                      <option value="5">邮件</option>

                </select><br/>

    </div>
    <div>
        <label>  催收人：</label>
        <input class="easyui-textbox" id="cpeople"  type="text" name="cpeople"  data-options="required:true" />

    </div>
    <div>
    <label>催收时间：</label>
    <input class="easyui-datebox" id="cdate"  type="text" name="cdate" data-options="required:true" />

    </div>
    <div>
        <label>结果概要：</label>

       <textarea id="jinfo"  name="jinfo" class="easyui-textbox"  rows="60px" cols="30px"></textarea>

    </div>
    <div>
        <label>备注：</label>

        <textarea id="bzhu"  name="bzhu"  class="easyui-textbox"  rows="40px" cols="30px"></textarea>
    </div>


</form>



<br/><br/>
<div id="dialog_update"></div>
<font>最近催收记录(所有借款)：</font>
<table  id="queryCui"> </table>

<script type="text/javascript">


    //查询
    $(function(){
        $('#queryCui').datagrid({
            url:'<%=request.getContextPath()%>/dhkController/queryXCui.do',
            pagination:true,//开启分页
            pageNumber:1,//初始化页码
            pageSize:3,//每页条数
            pageList:[3,5,8,10],
            striped:true,
            columns:[[
                {field:'id',title:'序号',width:100},
                {field:'cdate',title:'催收时间',width:100},
                {field:'cfan',title:'催收方式',width:100},
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



    function ck(){

        var tids=$("#queryCui").datagrid("getSelections");
        if(tids.length!=1){
            $.messager.alert('警告','请选择一项');

        }else{
            $("#querycshou").dialog({

                url:"<%=request.getContextPath()%>/dhkController/Cuixiang.do",
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

            });
        }
    }





</script>
<h2>
<a href="cshou.jsp"
   class="link-blue link_url" showObj="CSJL" data-title="business">查看全部&gt;&gt;</a>
</h2>
</body>
</html>
