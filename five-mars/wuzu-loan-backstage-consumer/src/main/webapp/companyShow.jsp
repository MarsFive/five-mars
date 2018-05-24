<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form id="tableformyg" >
    <div>
        <label for="name">企业账户:</label>
        <input class="easyui-textbox"   type="text" id="3name"/>&nbsp;&nbsp;
        <label for="name">企业名称:</label>
        <input class="easyui-textbox"   type="text" id="3companyName"/>&nbsp;&nbsp;
        <label for="name">联系人:</label>
        <input class="easyui-textbox"   type="text" id="3corporateContacts"/>&nbsp;&nbsp;
        <label for="name">联系电话:</label>
        <input class="easyui-textbox"   type="text" id="3ccPhone"/>&nbsp;&nbsp;
    </div></br>
    <div>
        <label for="name">注册时间:</label>
        <input class="easyui-datebox" id="3startCreatTime" style="width:150px">至
        <input class="easyui-datebox" id="3endCreatTime" style="width:150px">&nbsp;&nbsp;
        <label for="name">状态:</label>
        <select id="3type">
            <option value="">-请选择-</option>
            <option value="QY">启用</option>
            <option value="SD">锁定</option>
            <option value="HMD">黑名单</option>
        </select>&nbsp;&nbsp;
        <label for="name">是否允许投资:</label>
        <select id="3isInvestment">
            <option value="">-全部-</option>
            <option value="1">是</option>
            <option value="2">否</option>
        </select>&nbsp;&nbsp;
    </div><br>
</form>
<div id="update_company"></div>
<table  id="companyAll-table">
    <div id="company_accountNumber">
        <div  class="easyui-linkbutton" id="companyToSearch" data-options="iconCls:'icon-search',plain:true">搜索</div>
        <div  class="easyui-linkbutton" onclick="toExamineCompanyList()" data-options="iconCls:'icon-search',plain:true">审核列表</div>
        <div  class="easyui-linkbutton" onclick="toPoiCompany()" data-options="iconCls:'icon-save',plain:true">导出</div>
    </div><br>
</table>
<script>
    $(function(){
        toSearchCompany();
        $('#companyToSearch').bind('click', function(){
            toSearchCompany();
        });
    })
    function toSearchCompany(){
        $('#companyAll-table').datagrid({
            url:'<%=request.getContextPath()%>/member/queryCompanyListAll.do',
            queryParams:{name:$("#3name").val(),companyName:$("#3companyName").val(),corporateContacts:$("#3corporateContacts").val(),ccPhone:$("#3ccPhone").val(),type:$("#3type").val(),isInvestment:$("#3isInvestment").val()},
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
                {field:'name',title:'企业账号',width:100},
                {field:'companyName',title:'企业名称',width:100},
                {field:'corporateContacts',title:'联系人姓名',width:100},
                {field:'ccPhone',title:'联系人电话',width:100},
                {field:'email',title:'营业执照/社会信用代码',width:200},
                {field:'businessLicense',title:'创建时间',width:100},
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
                {field:'isInvestment',title:'是否允许投资',width:100,
                    formatter:function(value,row,index){
                        var flag = "";
                        if(row.isInvestment==1){
                            flag = "是";
                        }else if(row.isInvestment==2){
                            flag = "否";
                        }
                        return flag;
                    }
                },
                {field:'act',title:'操作',width:200,
                    formatter: function(value,row,index){
                        return "<a href='#' onclick='UpdateType3("+row.id+")'>查看</a>&nbsp;&nbsp;"
                            +"<a href='#' onclick='UpdateType3("+row.id+")'>修改</a>&nbsp;&nbsp;" +
                            "<a href='#' onclick='UpdateType3("+row.id+")'><font color='#a52a2a'>审核记录</font></a>";
                    }
                },
            ]]
        });
    }
    function toPoiCompany() {
        location.href="<%=request.getContextPath()%>/member/exceportExcelCompanyAll.do";
    }
</script>
</body>
</html>
