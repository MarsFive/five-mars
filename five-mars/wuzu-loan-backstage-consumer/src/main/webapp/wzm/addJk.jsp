<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--引入easyUI样式的jsp页面  -->
    <jsp:include page="../js/js.jsp"></jsp:include>

</head>
<body>${deptement}
<!--这是一个弹出窗口easyui-dialog，我在它里面放了一个datagrid-->


            <form id="add_form" method="post">
                <div>
                    <label for="productname1">产品名称:</label>
                    <input class="easyui-validatebox" type="text" name="productname1"  data-options="validType:'email'" />
                </div>
                </br>
                <div>
                    <label for="loanaccount1">借款账户:</label>
                    <input class="easyui-validatebox" type="text" name="loanaccount1" data-options="validType:'email'" />
                </div>
                <div>
                    <label for="borrowingtitle1">借款标题:</label>
                    <input class="easyui-validatebox" type="text" name="borrowingtitle1" data-options="validType:'email'" />
                </div>
                <div>
                    <label for="amountloan1">借款金额:</label>
                    <input class="easyui-validatebox" type="text" name="amountloan1" data-options="validType:'email'" />
                </div>
                <div>
                    <label for="attributesname1">标的属性:</label>
                    <input class="easyui-validatebox" type="text" name="attributesname1" data-options="validType:'email'" />
                </div>
                <div>
                     <label for="identifyingname1">新增标识:</label>
                     <input class="easyui-validatebox" type="text" name="identifyingname1" data-options="validType:'email'" />
                </div>
                <div>
                     <label for="repaymentname1">还款方式:</label>
                     <input class="easyui-validatebox" type="text" name="repaymentname1" data-options="validType:'email'" />
                </div>

                <div>
                      <label for="deadline1">借款期限:</label>
                      <input class="easyui-validatebox" type="text" name="deadline1" data-options="validType:'email'" />
                </div>
                <div>
                      <label for="payment1">付息方式:</label>
                      <input class="easyui-validatebox" type="text" name="payment1" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="dated1">起息日:</label>
                       <input class="easyui-validatebox" type="text" name="dated1" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="apr1">年化利率:</label>
                       <input class="easyui-validatebox" type="text" name="apr1" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="transactionrate1">成交服务费率:</label>
                       <input class="easyui-validatebox" type="text" name="transactionrate1" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="managementrate1">投资管理费率:</label>
                       <input class="easyui-validatebox" type="text" name="managementrate1" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="latepenalty1">逾期罚息利率:</label>
                       <input class="easyui-validatebox" type="text" name="latepenalty1" data-options="validType:'email'" />
                </div>
                <div>
                       <label for="fundraisingdeadline1">筹款期限:</label>
                       <input class="easyui-validatebox" type="text" name="fundraisingdeadline1" data-options="validType:'email'" />
                </div>
                <div>
                        <label for="investmentamount1">起投金额:</label>
                        <input class="easyui-validatebox" type="text" name="investmentamount1" data-options="validType:'email'" />
                </div>
                <div>
                        <label for="maxinvestmentamount1">最大投资金额:</label>
                        <input class="easyui-validatebox" type="text" name="maxinvestmentamount1" data-options="validType:'email'" />
                </div>
                <div>
                        <label for="activitymode1">活动使用方式:</label>
                        <input class="easyui-validatebox" type="text" name="activitymode1" data-options="validType:'email'" />
                </div>

                <div>
                        <label for="investmentside1">投资端:</label>
                        <input class="easyui-validatebox" type="text" name="investmentside1" data-options="validType:'email'" />
                </div>
                </br>
                <div>
                        <label for="describe1">借款描述:</label>
                        <textarea class="easyui-validatebox" type="text" name="describe1" data-options="validType:'email'"></textarea>
                </div>
            </form>


<script type="text/javascript">

$('#type_option').combobox({
    url:'<%=request.getContextPath()%>/wzmTzController/getyyname.do',
    valueField:'investortypeid',
    textField:'investortypename'
});

//副表查询
</script>
</body>
</html>