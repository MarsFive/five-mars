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
<form id = "add_form">
	借款标题： <input class="easyui-textbox"  name= "borrowingtitle"  style="width:200px"><br>
	投资人类型:<input id="type_option" name="investortypeid" value="--请选择--"> <br>
	投资人	： <input class="easyui-textbox"  name= "investor"  style="width:200px"><br>
	年化利率： <input class="easyui-textbox"  name= "apr"  style="width:200px"><br>
	期限： <input class="easyui-textbox"  name= "allottedtime"  style="width:200px"><br>
	持有债权金额(元)： <input class="easyui-textbox"  name= "amount"  style="width:200px"><br>
	投资时间： <input  id="dd"  type= "text" class= "easyui-datebox" required ="required" name="investmenttime" style="width:300px"> </input><br>
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