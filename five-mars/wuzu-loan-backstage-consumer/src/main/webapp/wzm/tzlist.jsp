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
	        <input class="easyui-textbox" id="investor"  type="text" name="investor" data-options="required:true" />
	    </div></br>
	    <div>
             <label for="name">借款标题:</label>
             <input class="easyui-textbox" id="borrowingtitle"  type="text" name="borrowingtitle" data-options="required:true" />
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
<table  id="dgus">   
	<div id="tbbus">
		<div  class="easyui-linkbutton" onclick="addTz()" data-options="iconCls:'icon-add',plain:true">新增</div>
	</div>
	<button type="button" class="btn btn-info" onclick="daochu()">导出</button><br/>
	<button type="button" class="btn btn-info" onclick="search()">投资中</button>
	<button type="button" class="btn btn-info" onclick="search1()">回款中</button>
	<button type="button" class="btn btn-info" onclick="search2()">已结清</button>
	<button type="button" class="btn btn-info" onclick="search3()">已转出</button>
</table>

<div id ="qdw"></div>

<script type="text/javascript">
 function daochu(){
		 alert("aa");

			 location.href="<%=request.getContextPath()%>/wzmTzController/exceportExcel.do";


	}
$(function(){
search()
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
 
function whereSelect(){//条件查
	  var investor=$("#investor").val();
	  var borrowingtitle=$("#borrowingtitle").val();

	  var investortypename =$("#investortype_id").val();
	  alert(investortypename)

	  $('#dgus').datagrid('load',{
		    "investor":investor,
		    "borrowingtitle":borrowingtitle,
		    "investortypename": investortypename
		  	
		})

	   
}

function search(){//投资中
	$('#dgus').datagrid({
	    url:'<%=request.getContextPath()%>/wzmTzController/queryTzPage.do',
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
	        {field:'biaoid',title:'标的ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'投资人',width:100},
	        {field:'investortypename',title:'投资人类型',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'allottedtime',title:'期限',width:100},
	        {field:'amount',title:'持有债权金额(元)',width:100},
	        {field:'investmenttime',title:'投资时间',width:100},

	    ]]
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
							$("#dgus").datagrid("reload");

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


function search1(){//结清
	$('#dgus').datagrid({
	    url:'<%=request.getContextPath()%>/wzmTzController/queryHkPage.do',
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
	        {field:'biaoid',title:'债权ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'债权人',width:100},
	        {field:'investortypename',title:'债权人类型',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'allottedtime',title:'期限',width:100},
	        {field:'amount',title:'持有债权金额(元)',width:100},
	        {field:'investmenttime',title:'投资时间',width:100},

	    ]]
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
							$("#dgus").datagrid("reload");

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


function search2(){//结清
	$('#dgus').datagrid({
	    url:'<%=request.getContextPath()%>/wzmTzController/queryJqPage.do',
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
	        {field:'biaoid',title:'债权ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'债权人',width:100},
	        {field:'investortypename',title:'债权人类型',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'allottedtime',title:'期限',width:100},
	        {field:'amount',title:'持有债权金额(元)',width:100},
	        {field:'investmenttime',title:'投资时间',width:100},

	    ]]
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
							$("#dgus").datagrid("reload");

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

function search3(){//转出
	$('#dgus').datagrid({
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
	        {field:'biaoid',title:'债权ID',width:100},
	        {field:'borrowingtitle',title:'借款标题',width:100},
	        {field:'investor',title:'卖出者',width:100},
	        {field:'investortypename',title:'卖出者类型',width:100},
	        {field:'name',title:'买入者',width:100},
	        {field:'buyertypename',title:'买入者类型',width:100},
	        {field:'apr',title:'年化利率',width:100},
	        {field:'allottedtime',title:'期限',width:100},
	        {field:'amount',title:'持有债权金额(元)',width:100},
	        {field:'transferprice',title:'转让价格(元)',width:100},
	        {field:'investmenttime',title:'投资时间',width:100},

	    ]]
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
							$("#dgus").datagrid("reload");

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







</script>


</body>
</html>