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
	        <label for="name">标的ID:</label>
	        <input class="easyui-textbox" id="biaoid"  type="text" name="biaoid" data-options="required:true" />
	    </div></br>
	    产品名称:<select id="product_id" name="productname">

			</select><br/>
			<div>
                   <label for="name">借款标题:</label>
                   <input class="easyui-textbox" id="borrowingtitle"  type="text" name="borrowingtitle" data-options="required:true" />
            </div></br>
            <div>
                    <label for="name">借款账户:</label>
                    <input class="easyui-textbox" id="loanaccount"  type="text" name="loanaccount" data-options="required:true" />
            </div></br>
            <div>
                    <label for="name">处理时间:</label>
                    <input class="easyui-datebox" id="2startCreatTime" style="width:150px">至
                    <input class="easyui-datebox" id="2endCreatTime" style="width:150px">
            </div></br>
            状态:<select id="state_id" name="statename">

            	</select><br/>
            标识类型:<select id="identifying_id" name="identifyingname">

                 </select><br/>
	</form>
    <div id="btn" href="#" class="easyui-linkbutton" onclick="whereSelect()" data-options="iconCls:'icon-search'">搜索</div>
<div id="dialog_add"></div>
<div style="display:none">
<table id="datagrid" >

            </table>
</div>
    <!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->
        <div id="dlg" class="easyui-dialog" style="width: 600px; height: auto; padding: 10px 20px"
             data-options="closed:true,buttons:'#dlg-buttons'">

            <form id="ff" method="post">
                <div>
                    <label for="productname">产品名称:</label>
                    <input class="easyui-validatebox" type="text" name="productname"  data-options="validType:'email'" />
                </div>
                </br>
                <div>
                    <label for="loanaccount">借款账户:</label>
                    <input class="easyui-validatebox" type="text" name="loanaccount" data-options="validType:'email'" />
                </div>
                <div>
                    <label for="borrowingtitle">借款标题:</label>
                    <input class="easyui-validatebox" type="text" name="borrowingtitle" data-options="validType:'email'" />
                </div>
                <div>
                    <label for="amountloan">借款金额:</label>
                    <input class="easyui-validatebox" type="text" name="amountloan" data-options="validType:'email'" />
                </div>
                <div>
                    <label for="attributesname">标的属性:</label>
                    <input class="easyui-validatebox" type="text" name="attributesname" data-options="validType:'email'" />
                </div>
                <div>
                     <label for="identifyingname">新增标识:</label>
                     <input class="easyui-validatebox" type="text" name="identifyingname" data-options="validType:'email'" />
                </div>
                <div>
                     <label for="repaymentname">还款方式:</label>
                     <input class="easyui-validatebox" type="text" name="repaymentname" data-options="validType:'email'" />
                </div>

                <div>
                      <label for="deadline">借款期限:</label>
                      <input class="easyui-validatebox" type="text" name="deadline" data-options="validType:'email'" />
                </div>
                <div>
                      <label for="payment">付息方式:</label>
                      <input class="easyui-validatebox" type="text" name="payment" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="dated">起息日:</label>
                       <input class="easyui-validatebox" type="text" name="dated" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="apr">年化利率:</label>
                       <input class="easyui-validatebox" type="text" name="apr" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="transactionrate">成交服务费率:</label>
                       <input class="easyui-validatebox" type="text" name="transactionrate" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="managementrate">投资管理费率:</label>
                       <input class="easyui-validatebox" type="text" name="managementrate" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="latepenalty">逾期罚息利率:</label>
                       <input class="easyui-validatebox" type="text" name="latepenalty" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="fundraisingdeadline">筹款期限:</label>
                       <input class="easyui-validatebox" type="text" name="fundraisingdeadline" data-options="validType:'email'" />
                </div>
                <div>
                        <label for="investmentamount">起投金额:</label>
                        <input class="easyui-validatebox" type="text" name="investmentamount" data-options="validType:'email'" />
                </div>
                <div>
                        <label for="maxinvestmentamount">最大投资金额:</label>
                        <input class="easyui-validatebox" type="text" name="maxinvestmentamount" data-options="validType:'email'" />
                </div>
                <div>
                        <label for="activitymode">活动使用方式:</label>
                        <input class="easyui-validatebox" type="text" name="activitymode" data-options="validType:'email'" />
                </div>

                <div>
                        <label for="investmentside">投资端:</label>
                        <input class="easyui-validatebox" type="text" name="investmentside" data-options="validType:'email'" />
                </div>
                </br>
                <div>
                        <label for="describe">借款描述:</label>
                        <textarea class="easyui-validatebox" type="text" name="describe" data-options="validType:'email'"></textarea>
                </div>


            </form>
        </div>
        <div id="dlg-buttons">
            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick="saveUser()">保存</a>
            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
        </div>
<div id="dialog_add"></div>
<div id="dialog_update"></div>
<div id="dialog_addRole"></div>
<table  id="dgus2">
	<div id="tbbus">
		<div  class="easyui-linkbutton" onclick="addJk()" data-options="iconCls:'icon-add',plain:true">新增</div>
	</div>
</table>

<div id ="qdw"></div>

<script type="text/javascript">
 function daochu(){

			 location.href="<%=request.getContextPath()%>/wzmTzController/exceportExcel.do";


	}
$(function(){
searchJk()
})

function addJk(){
	 $("#dialog_add").dialog({
		    title: '新增用户',
		    width: 600,
		    height: 400,
		    closed: false,
		    cache: false,
		    href:"<%=request.getContextPath()%>/wzmJkController/toJk.do",
		    modal: true ,
		    toolbar:[{
				text:'保存',
				iconCls:'icon-edit',
				handler:function(){
					alert($("#add_form").serialize());
					$.ajax({
						url:"<%=request.getContextPath()%>/wzmJkController/addJk.do",
						data:$("#add_form").serialize(),
						dataType:"text",
						type:"post",
						success:function(data){
							$("#dialog_add").dialog("close");
							$("#dgus2").datagrid("reload");

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


//副表查询
$.ajax({
   url:"<%=request.getContextPath()%>/wzmJkController/getcpname.do",
   type:"post",
   async:false,
   dataType:"json",
   success:function(aa){
	   var option = "<option value=''>-全部-</option>";
	   $.each($.parseJSON(aa),function(){
		   option += "<option value='"+this.productname+"'>"+this.productname+"</option>";
	   });
	   $("#product_id").html(option);
   },
   error:function(){
	   alert("程序出错");
   }
 });

 //副表查询状态
 $.ajax({
    url:"<%=request.getContextPath()%>/wzmJkController/getztname.do",
    type:"post",
    async:false,
    dataType:"json",
    success:function(aa){
 	   var option = "<option value=''>-全部-</option>";
 	   $.each($.parseJSON(aa),function(){
 		   option += "<option value='"+this.statename+"'>"+this.statename+"</option>";
 	   });
 	   $("#state_id").html(option);
    },
    error:function(){
 	   alert("程序出错");
    }
  });

  //副表查询标识
   $.ajax({
      url:"<%=request.getContextPath()%>/wzmJkController/getbsname.do",
      type:"post",
      async:false,
      dataType:"json",
      success:function(aa){
   	   var option = "<option value=''>-全部-</option>";
   	   $.each($.parseJSON(aa),function(){
   		   option += "<option value='"+this.identifyingname+"'>"+this.identifyingname+"</option>";
   	   });
   	   $("#identifying_id").html(option);
      },
      error:function(){
   	   alert("程序出错");
      }
    });

function whereSelect(){//条件查
      var productname=$("#productname").val();
	  var biaoid=$("#biaoid").val();
	  var borrowingtitle=$("#borrowingtitle").val();
	  var loanaccount=$("#loanaccount").val();

	  $('#dgus2').datagrid('load',{
	        "productname":productname,
		    "biaoid":biaoid,
		    "borrowingtitle":borrowingtitle,
		    "loanaccount": loanaccount

		})


}

function searchJk(){//借款
	$('#dgus2').datagrid({
	    url:'<%=request.getContextPath()%>/wzmJkController/queryJkPage.do',
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
                                    {field:'xuhao',title:'序号',width:100},
                                    {field:'biaoid',title:'标的ID',width:100},
                                    {field:'productname',title:'产品名称',width:100},
                                    {field:'borrowingtitle',title:'借款标题',width:100},
                                    {field:'loanaccount',title:'借款账户',width:100},
                                    {field:'amountloan',title:'借款金额(元)',width:100},
                                    {field:'investmenta',title:'投资金额(元)',width:100},
                                    {field:'apr',title:'年化利率',width:100},
                                    {field:'deadline',title:'期限',width:100},
                                    {field:'processingtime',title:'处理时间',width:100},
                                    {field:'repaymentname',title:'还款方式',width:100},
                                    {field:'statename',title:'状态',width:100},
                                    {
                                                        field: 'opt', title: '操作', width: 100, align: 'center',
                                                        formatter: function (value, row,index) { //参数row表示当前行, 参数index表示当前行的索引值
                                                             var st= JSON.stringify(row);
                                                             var result = "";
                                                            //row.Id表示这个button按钮所在的那一行的Id这个字段的值
                                                            result += '<input type="button" id='+index+' value="查看"  onclick="LoadUserInfo('+row.xuhao+')"/>';
                                                            result += '<input type="button" id='+index+' value="修改"  onclick="LoadUserInfo('+row.xuhao+')"/>';
                                                            return result;
                                                        }
                                                    }

	    ]]
	})
}

function LoadUserInfo(rowid) {

        /*获取选中行
        $("#sddsd").val(rowid);
*/
$.ajax({
   url: '<%=request.getContextPath()%>/wzmJkController/getXmList.do?xuhao='+rowid,
   type:"get",
   async:false,
   dataType:"json",
   success:function(aa){
    console.info(aa[0]);
    $('[name="productname"]').val(aa[0].productname);
    $('[name="loanaccount"]').val(aa[0].loanaccount);
    $('[name="borrowingtitle"]').val(aa[0].borrowingtitle);
    $('[name="amountloan"]').val(aa[0].amountloan);
    $('[name="attributesname"]').val(aa[0].attributesname);
    $('[name="identifyingname"]').val(aa[0].identifyingname);
    $('[name="repaymentname"]').val(aa[0].repaymentname);
    $('[name="deadline"]').val(aa[0].deadline);
    var st = "固定日";
    if(aa[0].payment == 1){
        st = "自然月"
    }
    $('[name="payment"]').val(st);

    var tt = "T+0";
    if(aa[0].dated == 1){
        tt = "T+1"
    }
    if(aa[0].dated == 2){
            tt = "T+2"
        }
    if(aa[0].dated == 3){
            tt = "T+3"
        }
    if(aa[0].dated == 4){
            tt = "T+4"
         }
    $('[name="dated"]').val(tt);
    $('[name="apr"]').val(aa[0].apr);
    $('[name="transactionrate"]').val(aa[0].transactionrate);
    $('[name="managementrate"]').val(aa[0].managementrate);
    $('[name="latepenalty"]').val(aa[0].latepenalty);
    $('[name="fundraisingdeadline"]').val(aa[0].fundraisingdeadline);
    $('[name="investmentamount"]').val(aa[0].investmentamount);
    $('[name="maxinvestmentamount"]').val(aa[0].maxinvestmentamount);

     var ss = "组合使用";
        if(aa[0].activitymode == 1){
            ss = "单一使用"
        }
        if(aa[0].activitymode == 2){
            ss = "不使用"
        }
    $('[name="activitymode"]').val(ss);

     var sa = "PC+APP";
            if(aa[0].investmentside == 1){
                sa = "PC"
            }
            if(aa[0].investmentside == 2){
                sa = "APP"
            }
    $('[name="investmentside"]').val(sa);
    $('[name="describe"]').val(aa[0].describe);

   },
   error:function(){
	   alert("程序出错");
   }
 });
       //var getData = $("#datagrid").datagrid({
       //     url: '<%=request.getContextPath()%>/wzmJkController/getXmList.do?xuhao='+rowid,
      //  }).datagrid("getData");

        $('#dlg').window('open');  //弹出这个dialog框
    };
	
</script>
<input type="hidden" id="sddsd">
</body>
</html>