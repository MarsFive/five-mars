<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="tableformyg" >
    <div>
        <label >用户名:</label>
        <input class="easyui-textbox"   type="text" id="2name"/>&nbsp;&nbsp;
        <label >姓名:</label>
        <input class="easyui-textbox"   type="text" id="2userName"/>&nbsp;&nbsp;
        <label >联系电话:</label>
        <input class="easyui-textbox"   type="text" id="2phone"/>&nbsp;&nbsp;
        <label >邮箱:</label>
        <input class="easyui-textbox"   type="text" id="2email"/>&nbsp;&nbsp;
        <label >注册来源:</label>
        <select id="2go">
            <option value="">-请选择-</option>
            <option value="PCZC">PC注册</option>
            <option value="APPZC">APP注册</option>
            <option value="WXZC">微信注册</option>
            <option value="HTTJ">后台添加</option>
        </select>
    </div></br>
    <div>
        <label >注册时间:</label>
        <input class="easyui-datebox" id="2startCreatTime" style="width:150px">至
        <input class="easyui-datebox" id="2endCreatTime" style="width:150px">
        <label >用户类型:</label>
        <select id="2userType">
            <option value="">-请选择-</option>
            <option value="GR">个人</option>
            <option value="QY">企业</option>
            <option value="JG">机构</option>
        </select>&nbsp;&nbsp;
        <label >状态:</label>
        <select id="2type">
            <option value="">-请选择-</option>
            <option value="QY">启用</option>
            <option value="SD">锁定</option>
            <option value="HMD">黑名单</option>
        </select>&nbsp;&nbsp;
        <label>业务员工号:</label>
        <input class="easyui-textbox"   type="text" id="2empNumber"/>
    </div><br>
</form>
<div id="update_personal"></div>
<table  id="personalAll-table">
    <div id="personal_accountNumber">
        <div  class="easyui-linkbutton" id="personalToSearch" data-options="iconCls:'icon-search',plain:true">搜索</div>
        <div  class="easyui-linkbutton" onclick="toExamineList1()" data-options="iconCls:'icon-search',plain:true">审核列表</div>
        <div  class="easyui-linkbutton" onclick="toPoiPersonal()" data-options="iconCls:'icon-save',plain:true">导出</div>
    </div><br>
</table>
<script>
    $(function(){
        toSearchPersonal();
        $('#personalToSearch').bind('click', function(){
            toSearchPersonal();
        });
    })
    function toSearchPersonal(){
        $('#personalAll-table').datagrid({
            url:'<%=request.getContextPath()%>/member/queryPersonalListAll.do',
            queryParams:{name:$("#2name").val(),phone:$("#2phone").val(),userName:$("#2userName").val(),email:$("#2email").val(),go:$("#2go").val(),userType:$("#2userType").val(),empNumber:$("#2empNumber").val(),type:$("#2type").val()},
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
                {field:'userName',title:'姓名',width:100},
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
                {field:'cardID',title:'身份证',width:100},
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
                {field:'act',title:'操作',width:200,
                    formatter: function(value,row,index){
                        return "<a href='#' onclick='UpdateType2("+row.id+")'>查看</a>&nbsp;&nbsp;"
                            +"<a href='#' onclick='UpdateType2("+row.id+")'>修改</a>&nbsp;&nbsp;" +
                            "<a href='#' onclick='UpdateType2("+row.id+")'><font color='#a52a2a'>审核记录</font></a>";
                    }
                },
            ]]
        });
    }
function toPoiPersonal() {
    location.href="<%=request.getContextPath()%>/member/exceportExcelPersonalAll.do";
}
</script>
</body>
</html>
