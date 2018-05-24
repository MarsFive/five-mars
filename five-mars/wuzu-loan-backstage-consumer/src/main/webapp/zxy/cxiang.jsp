<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/5/22
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <!--引入easyUI样式的jsp页面  -->
    <jsp:include page="../js/js.jsp"></jsp:include>


    <!-- jqeuy默认的css样式 -->
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/black/easyui.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/util-js.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
    <script type="text/javascript"  src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>


<form id="cuifrom" >

    <div>
        <label>ID：</label>
        <input class="easyui-textbox" id="id"  type="text" name="id"  value="${cui.id}" readonly/>
    </div>


    <div>
        <label>借款ID：</label>
        <input class="easyui-textbox" id="jid"  type="text" name="jid"  value="${cui.jid}" readonly/>
    </div>

    <div>
        <label>借款者：</label>
        <input class="easyui-textbox" id="jname"  type="text" name="jname"  value="${cui.jname}" readonly/>
    </div>

    <div>
        <label>催款方式：</label>
        <input class="easyui-textbox" id="cfan"  type="text" name="cfan"  value="${cui.cfan}" readonly />

    </div>


    <div>
        <label>  催收人：</label>
        <input class="easyui-textbox" id="cpeople"  type="text" name="cpeople"  value="${cui.cpeople}" readonly />

    </div>
    <div>
        <label>催收时间：</label>
        <input class="easyui-textbox" id="cdate"  type="text" name="cdate" value="${cui.cdate}" readonly />

    </div>
    <div>
        <label>结果概要：</label>
        <input class="easyui-textbox" id="jinfo"  type="text" name="jinfo" value="${cui.jinfo}" readonly  />

    </div>

    <div>
        <label>备注：</label>
        <input class="easyui-textbox" id="bzhu"  type="text" name="bzhu" value="${cui.bzhu}" readonly />
     </div>


</form>


</body>
</html>
