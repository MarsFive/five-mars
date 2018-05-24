<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



</head>
<body>
<form id="tableformyg" >
	    <div>
	        <label for="name">投资人:</label>
	        <input class="easyui-textbox" id="investors"  type="text" name="investor" data-options="required:true" />
	    </div></br>
	    <div>
             <label for="name">借款标题:</label>
             <input class="easyui-textbox" id="usersName"  type="text" name="username" data-options="required:true" />
        </div></br>
        <div>
              <label for="name">投资时间:</label>
              <input class="easyui-datebox" name="birthday"
                  data-options="required:true,showSeconds:false" style="width:150px">至
                  <input class="easyui-datebox" name="birthday"
                                    data-options="required:true,showSeconds:false" style="width:150px">
        </div></br>
	    投资人类型:<select id="investortype_id" name="investortypeid">
	   
			</select><br/> 
	</form>  
    <div id="btn" href="#" class="easyui-linkbutton" onclick="whereSelect()" data-options="iconCls:'icon-search'">搜索</div>
<div id="dialog_add"></div>  
<div id="dialog_update"></div> 
<div id="dialog_addRole"></div>   
<table  id="dgus1">
	<div id="tbbus">
		<div  class="easyui-linkbutton" onclick="addTz()" data-options="iconCls:'icon-add',plain:true">新增</div>
		<div  class="easyui-linkbutton" onclick="deleteUser()" data-options="iconCls:'icon-remove',plain:true">删除</div>
		<div  class="easyui-linkbutton" onclick="updateUser()" data-options="iconCls:'icon-edit',plain:true">修改</div>
	</div>
	<button type="button" class="btn btn-info" onclick="daochu()">导出</button><br/>
	<button type="button" class="btn btn-info" onclick="search()">待转让</button>
	<button type="button" class="btn btn-info" onclick="search1()">转让中</button>
	<button type="button" class="btn btn-info" onclick="search2()">已转让</button>
	<button type="button" class="btn btn-info" onclick="search3()">转让失败</button>
</table>

<div id ="qdw"></div>

<script type="text/javascript">

$(function(){

search()
})





//副表查询
$.ajax({
   url:"<%=request.getContextPath()%>/wzmDzController/getyyname.do",
   type:"post",
   async:false,
   dataType:"json",
   success:function(aa){
	   var option = "<option value=''>-全部-</option>";
	   $.each($.parseJSON(aa),function(){
		   option += "<option value='"+this.investortypename+"'>"+this.investortypename+"</option>";
	   });
	   $("#investortype_id").html(option);
   },
   error:function(){
	   alert("程序出错");
   }
 });
 
function whereSelect(){
	  var useName=$("#investors").textbox('getValue');
	  var deptname =$("#investortype_id").val()
	  
	  $('#dgus1').datagrid('load',{
		    "investor":useName,
		    "investortypename": deptname
		  	
		})
	
		
		$.ajax({
		url:"<%=request.getContextPath()%>/wzmDzController/queryDzPage.do",
		data:$("#tableformyg").serialize(),
		type:"post",
		dataType:"json",
		async:false,
		success:function(result){
			tablehtml(result)
			},
		error:function(){
			/* alert("查询失败，请联系管理员！"); */
			}
		})
	   
}

function addTz(){
	 $("#dialog_add").dialog({
		    title: '新增用户',    
		    width: 600,
		    height: 400,
		    closed: false,    
		    cache: false,
		    href:"<%=request.getContextPath()%>/wzmTzController/toTz.do",
		    modal: true ,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					alert($("#add_form").serialize());
					$.ajax({
						url:"<%=request.getContextPath()%>/wzmTzController/addTz.do",
						data:$("#add_form").serialize(),
						dataType:"text",
						type:"post",
						success:function(data){
							$("#dialog_add").dialog("close");
							$("#dgus1").datagrid("reload");
							
						},error:function(){
							 $.messager.alert('警告','报错'); 
						}
					})
					
				}
			},{
				text:'取消',
				iconCls:'icon-cancel',
				handler:function(){
					$("#dialog_add").dialog("close");
				}
			}]
	 })
}

 
function search(){//转出
	$('#dgus1').datagrid({
	    url:'<%=request.getContextPath()%>/wzmDzController/queryDzPage.do',

	    fitColumns:true,
	    striped:true,
	    ctrlSelect:true,
	    method:"post",
	    loadMsg:"数据库加载中",
	    pagination:true,
	    pagePosition:"bottom",
	    pageNumber:1,
	    pageSize:3,
	    pageList:[1,3,5,7,10],

	    columns:[[
	              //field:尽可能对应实体类中的属性名，必须保证唯一性    title：列标题   width：每列宽度
	        {field:'che',checkbox:true},
	        {field:'id',title:'序号',width:100},
	        {field:'creditorid',title:'债权ID',width:100},
	        {field:'biaoid',title:'标的ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'债权转让者',width:100},
	        {field:'restperiods',title:'剩余期数	',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'amount',title:'债权价值(元)',width:100},
	        {field:'transferprice',title:'转让价格(元)',width:100},
	        {field:'transferrates',title:'转让费率',width:100},
	        {field:'investmenttime',title:'申请时间',width:100},
	        {field:'1',title:'操作',width:100,
                  formatter:function(value,row,index){
                     return "<div class='easyui-linkbutton' onclick=addrolea('"+row.userid+"') data-options='iconCls:'icon-add',plain:true'>更换人</div>";
                   }
            	 }

	    ]]
	})
}


</script>

<script type="text/javascript">
$(function(){

})





//副表查询
$.ajax({
   url:"<%=request.getContextPath()%>/wzmTzController/getyyname.do",
   type:"post",
   async:false,
   dataType:"json",
   success:function(aa){
	   var option = "<option value=''>-全部-</option>";
	   $.each($.parseJSON(aa),function(){
		   option += "<option value='"+this.investortypename+"'>"+this.investortypename+"</option>";
	   });
	   $("#investortype_id").html(option);
   },
   error:function(){
	   alert("程序出错");
   }
 });

function addTz(){
	 $("#dialog_add").dialog({
		    title: '新增用户',
		    width: 600,
		    height: 400,
		    closed: false,
		    cache: false,
		    href:"<%=request.getContextPath()%>/wzmTzController/toTz.do",
		    modal: true ,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					alert($("#add_form").serialize());
					$.ajax({
						url:"<%=request.getContextPath()%>/wzmTzController/addTz.do",
						data:$("#add_form").serialize(),
						dataType:"text",
						type:"post",
						success:function(data){
							$("#dialog_add").dialog("close");
							$("#dgus1").datagrid("reload");

						},error:function(){
							 $.messager.alert('警告','报错');
						}
					})

				}
			},{
				text:'取消',
				iconCls:'icon-cancel',
				handler:function(){
					$("#dialog_add").dialog("close");
				}
			}]
	 })
}

function search2(){//转出
	$('#dgus1').datagrid({
	    url:'<%=request.getContextPath()%>/wzmDzController/queryZcPage.do',

	    fitColumns:true,
	    striped:true,
	    ctrlSelect:true,
	    method:"post",
	    loadMsg:"数据库加载中",
	    pagination:true,
	    pagePosition:"bottom",
	    pageNumber:1,
	    pageSize:3,
	    pageList:[1,3,5,7,10],

	    columns:[[
	              //field:尽可能对应实体类中的属性名，必须保证唯一性    title：列标题   width：每列宽度
	        {field:'che',checkbox:true},
	        {field:'id',title:'序号',width:100},
	        {field:'creditorid',title:'债权ID',width:100},
	        {field:'biaoid',title:'标的ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'债权转让者',width:100},
	        {field:'restperiods',title:'剩余期数	',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'amount',title:'债权价值(元)',width:100},
	        {field:'transferprice',title:'转让价格(元)',width:100},
	        {field:'transferrates',title:'转让费率',width:100},
	        {field:'investmenttime',title:'申请时间',width:100},
	        {field:'1',title:'操作',width:100,
                      formatter:function(value,row,index){
                         return "<div class='easyui-linkbutton' onclick=addrolea('"+row.userid+"') data-options='iconCls:'icon-add',plain:true'>更换人</div>";
                      }
                   }

	    ]]
	})
}

</script>

<script type="text/javascript">
$(function(){

})





//副表查询
$.ajax({
   url:"<%=request.getContextPath()%>/wzmTzController/getyyname.do",
   type:"post",
   async:false,
   dataType:"json",
   success:function(aa){
	   var option = "<option value=''>-全部-</option>";
	   $.each($.parseJSON(aa),function(){
		   option += "<option value='"+this.investortypename+"'>"+this.investortypename+"</option>";
	   });
	   $("#investortype_id").html(option);
   },
   error:function(){
	   alert("程序出错");
   }
 });



function addTz(){
	 $("#dialog_add").dialog({
		    title: '新增用户',
		    width: 600,
		    height: 400,
		    closed: false,
		    cache: false,
		    href:"<%=request.getContextPath()%>/wzmTzController/toTz.do",
		    modal: true ,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					alert($("#add_form").serialize());
					$.ajax({
						url:"<%=request.getContextPath()%>/wzmTzController/addTz.do",
						data:$("#add_form").serialize(),
						dataType:"text",
						type:"post",
						success:function(data){
							$("#dialog_add").dialog("close");
							$("#dgus1").datagrid("reload");

						},error:function(){
							 $.messager.alert('警告','报错');
						}
					})

				}
			},{
				text:'取消',
				iconCls:'icon-cancel',
				handler:function(){
					$("#dialog_add").dialog("close");
				}
			}]
	 })
}


function search2(){//转出
	$('#dgus1').datagrid({
	    url:'<%=request.getContextPath()%>/wzmDzController/queryZcPage.do',

	    fitColumns:true,
	    striped:true,
	    ctrlSelect:true,
	    method:"post",
	    loadMsg:"数据库加载中",
	    pagination:true,
	    pagePosition:"bottom",
	    pageNumber:1,
	    pageSize:3,
	    pageList:[1,3,5,7,10],

	    columns:[[
	              //field:尽可能对应实体类中的属性名，必须保证唯一性    title：列标题   width：每列宽度
	        {field:'che',checkbox:true},
	        {field:'id',title:'序号',width:100},
	        {field:'creditorid',title:'债权ID',width:100},
	        {field:'biaoid',title:'标的ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'债权转让者',width:100},
	        {field:'restperiods',title:'剩余期数	',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'amount',title:'债权价值(元)',width:100},
	        {field:'transferprice',title:'转让价格(元)',width:100},
	        {field:'transferrates',title:'转让费率',width:100},
	        {field:'investmenttime',title:'申请时间',width:100},

	    ]]
	})
}

</script>


<script type="text/javascript">
$(function(){

})





//副表查询
$.ajax({
   url:"<%=request.getContextPath()%>/wzmTzController/getyyname.do",
   type:"post",
   async:false,
   dataType:"json",
   success:function(aa){
	   var option = "<option value=''>-全部-</option>";
	   $.each($.parseJSON(aa),function(){
		   option += "<option value='"+this.investortypename+"'>"+this.investortypename+"</option>";
	   });
	   $("#investortype_id").html(option);
   },
   error:function(){
	   alert("程序出错");
   }
 });

function whereSelect(){
	  var useName=$("#investors").textbox('getValue');
	  var deptname =$("#investortype_id").val()

	  $('#dgus1').datagrid('load',{
		    "investor":useName,
		    "investortypename": deptname

		})


		$.ajax({
		url:"<%=request.getContextPath()%>/wzmTzController/queryTzPage.do",
		data:$("#tableformyg").serialize(),
		type:"post",
		dataType:"json",
		async:false,
		success:function(result){
			tablehtml(result)
			},
		error:function(){
			/* alert("查询失败，请联系管理员！"); */
			}
		})

}

function addTz(){
	 $("#dialog_add").dialog({
		    title: '新增用户',
		    width: 600,
		    height: 400,
		    closed: false,
		    cache: false,
		    href:"<%=request.getContextPath()%>/wzmTzController/toTz.do",
		    modal: true ,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					alert($("#add_form").serialize());
					$.ajax({
						url:"<%=request.getContextPath()%>/wzmTzController/addTz.do",
						data:$("#add_form").serialize(),
						dataType:"text",
						type:"post",
						success:function(data){
							$("#dialog_add").dialog("close");
							$("#dgus1").datagrid("reload");

						},error:function(){
							 $.messager.alert('警告','报错');
						}
					})

				}
			},{
				text:'取消',
				iconCls:'icon-cancel',
				handler:function(){
					$("#dialog_add").dialog("close");
				}
			}]
	 })
}


function search3(){//转出
	$('#dgus1').datagrid({
	    url:'<%=request.getContextPath()%>/wzmTzController/queryZcPage.do',
	    fitColumns:true,
	    striped:true,
	    ctrlSelect:true,
	    method:"post",
	    loadMsg:"数据库加载中",
	    pagination:true,
	    pagePosition:"bottom",
	    pageNumber:1,
	    pageSize:3,
	    pageList:[1,3,5,7,10],

	    columns:[[
	              //field:尽可能对应实体类中的属性名，必须保证唯一性    title：列标题   width：每列宽度
	        {field:'che',checkbox:true},
	        {field:'id',title:'序号',width:100},
	        {field:'creditorid',title:'债权ID',width:100},
	        {field:'biaoid',title:'标的ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'债权转让者',width:100},
	        {field:'restperiods',title:'剩余期数	',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'amount',title:'债权价值(元)',width:100},
	        {field:'transferprice',title:'转让价格(元)',width:100},
	        {field:'transferrates',title:'转让费率',width:100},
	        {field:'investmenttime',title:'申请时间',width:100},

	    ]]
	})
}


</script>


</body>
</html>