<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>666</title>
    <!--引入easyUI样式的jsp页面  -->
</head>
<body>
<form id="tableformyg" >
    <div>
        <label >用户名:</label>
        <input class="easyui-textbox"   type="text" id="1name"/>&nbsp;&nbsp;
        <label>联系电话:</label>
        <input class="easyui-textbox"   type="text" id="1phone"/>&nbsp;&nbsp;
        <label>邮箱:</label>
        <input class="easyui-textbox"   type="text" id="1email"/>
    </div></br>
    <div>
        <label>注册时间:</label>
        <input class="easyui-datebox" id="1startCreatTime" style="width:150px">至
        <input class="easyui-datebox" id="1endCreatTime" style="width:150px">
        <label>注册来源:</label>
        <select id="1go">
            <option value="">-请选择-</option>
            <option value="PCZC">PC注册</option>
            <option value="APPZC">APP注册</option>
            <option value="WXZC">微信注册</option>
            <option value="HTTJ">后台添加</option>
        </select>
    </div></br>
    <div>
        <label>用户类型:</label>
        <select id="1userType">
            <option value="">-请选择-</option>
            <option value="GR">个人</option>
            <option value="QY">企业</option>
            <option value="JG">机构</option>
        </select>&nbsp;&nbsp;
        <label>状态:</label>
        <select id="1type">
            <option value="">-请选择-</option>
            <option value="QY">启用</option>
            <option value="SD">锁定</option>
            <option value="HMD">黑名单</option>
        </select>&nbsp;&nbsp;
        <label>业务员工号:</label>
        <input class="easyui-textbox"   type="text" id="1empNumber"/>
    </div><br>
</form>
<div id="add_personal"></div>
<div id="add_business"></div>
<div id="add_mechanism"></div>
<table  id="accountNumberAll-table">
    <div id="tbbus_accountNumber">
        <div  class="easyui-linkbutton" id="accountNumberToSearch" data-options="iconCls:'icon-search',plain:true">搜索</div>
        <div  class="easyui-linkbutton" onclick="add_personal()" data-options="iconCls:'icon-add',plain:true">新增个人账号</div>
        <div  class="easyui-linkbutton" onclick="add_business()" data-options="iconCls:'icon-add',plain:true">新增企业账号</div>
        <div  class="easyui-linkbutton" onclick="add_mechanism()" data-options="iconCls:'icon-add',plain:true">新增机构账号</div>
        <div  class="easyui-linkbutton" onclick="toPoiAccountNumber()" data-options="iconCls:'icon-save',plain:true">导出</div>
    </div><br>
</table>
<script type="text/javascript">
    $(function(){
        toSearchAccountNumber();
        $('#accountNumberToSearch').bind('click', function(){
            toSearchAccountNumber();
        });
    })
    function toSearchAccountNumber(){
        $('#accountNumberAll-table').datagrid({
            url:'<%=request.getContextPath()%>/member/queryMemberListAll.do',
            queryParams:{name:$("#1name").val(),phone:$("#1phone").val(),email:$("#1email").val(),go:$("#1go").val(),userType:$("#1userType").val(),empNumber:$("#1empNumber").val(),type:$("#1type").val()},
            pagination:true,//开启分页
            pageNumber:1,//初始化页码
            pageSize:5,//每页条数
            pageList:[5,10,15,20,25],
            checkOnSelect:false,
            selectOnCheck:false,
            singleSelect:true,
            striped:true,
            columns:[[
                {field:'id',title:'序号',width:100},
                {field:'name',title:'用户名',width:100},
                {field:'phone',title:'联系电话',width:100},
                {field:'email',title:'邮箱',width:100},
                {field:'type',title:'状态',width:100,
                    formatter:function(value,row,index){
                        var flag = "";
                        if(row.type=="QY"){
                            flag = "启用";
                        }else if(row.type=="SD"){
                            flag = "锁定";
                        }else if(row.type=="HMD"){
                            flag = "黑名单";
                        }
                        return flag;
                    }
                },
                {field:'go',title:'来源',width:100,
                    formatter:function(value,row,index){
                        var flag = "";
                        if(row.go=="HTTJ"){
                            flag = "后台添加";
                        }else if(row.go=="WXZC"){
                            flag = "微信注册";
                        }else if(row.go=="APPZC"){
                            flag = "APP注册";
                        }else if(row.go=="PCZC"){
                            flag = "PC注册";
                        }
                        return flag;
                    }
                },
                {field:'creatTime',title:'创建时间',width:100},
                {field:'userType',title:'用户类型',width:100,
                    formatter:function(value,row,index){
                        var flag = "";
                        if(row.userType=="GR"){
                            flag = "个人";
                        }else if(row.userType=="QY"){
                            flag = "企业";
                        }else if(row.userType=="JG"){
                            flag = "机构";
                        }
                        return flag;
                    }
                },
                {field:'empNumber',title:'业务员工号',width:100},
                {field:'act',title:'操作',width:300,
                    formatter: function(value,row,index){
                        if(row.type=="QY"){
                            return "<a href='#' onclick='UpdateType("+row.id+",1)'>锁定</a>&nbsp;&nbsp;"
                                +"<a href='#' onclick='UpdateType("+row.id+",2)'>拉黑</a>";
                        }else if(row.type=="HMD"){
                            return "<a href='#' onclick='UpdateType("+row.id+",3)'>取消拉黑</a>";
                        }
                        else if(row.type=="SD"){
                            return "<a href='#' onclick='UpdateType("+row.id+",3)'>解锁</a>&nbsp;&nbsp;拉黑";
                        }else {
                            return "";
                        }
                    }
                },
            ]]
        });
    }
function UpdateType(id,flag) {
    $.ajax({
        url:"<%=request.getContextPath()%>/member/updateMemberType.do",
        data:{id:id,flag:flag},
        type:"post",
        async:false,
        dataType:"text",
        success:function(data){
            toSearchAccountNumber();
        },
        error:function(){
            toSearchAccountNumber();
            alert("网络出错");
        }
    });
}
function toPoiAccountNumber() {
    location.href="<%=request.getContextPath()%>/member/exceportExcelMemberAll.do"
}
function add_personal(){
            $("#add_personal").dialog({
                title: '個人新增',
                width: 400,
                height: 200,
                closed: false,
                cache: false,
                href:"<%=request.getContextPath()%>/personalAdd.jsp",
                modal: true ,
                toolbar:[{
                    text:'保存',
                    iconCls:'icon-edit',
                    handler:function(){
                        $.ajax({
                            url:"<%=request.getContextPath()%>/member/savePersonal.do",
                            data:$("#persnal_add_from").serialize(),
                            type:"post",
                            success:function(){
                                $("#add_personal").dialog("close");
                                $("#accountNumberAll-table").datagrid("reload");

                            },error:function(){
                                $.messager.alert('警告','报错');
                            }
                        })

                    }
                },{
                    text:'取消',
                    iconCls:'icon-cancel',
                    handler:function(){
                        $("#add_personal").dialog("close");
                    }
                }]
            })
    }
</script>
</body>
</html>
