
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
    <!--引入easyUI样式的jsp页面  -->
    <jsp:include page="js/js.jsp"></jsp:include>
</head>
<body class="easyui-layout">
<body>
<div id="login-dialog" align="center">
    <form id="login-form">
        <font size="5">账   号 : </font>
        <input class="easyui-textbox" name="name" data-options="iconCls:'icon-man'" style="width:200px;height: 30px;">
        <br>
        <font size="5">密    码 : </font>
        <input class="easyui-textbox" type="password" name="pwd" data-options="iconCls:'icon-lock'" style="width:200px;height: 30px;">
        <br>
    </form>
</div>

<script>
    $(function(){
        $('#login-dialog').dialog({
            title: '登录',
            width: 400,
            height: 200,
            closed: false,
            modal: true,
            buttons:[{
                text:'登录',
                handler:function(){
                    $.ajax({
                        type:'post',
                            url:'<%=request.getContextPath()%>/login/toLogin.do',
                        data:$("#login-form").serialize(),
                        dataType: "text",
                        success : function(data){
                            var str = "";
                            if(data != 1){
                                str = "用户名或者密码错误";
                            }else if(data == 1){
                                str = "登录成功";
                                location.replace("<%=request.getContextPath()%>" + '/index.jsp');
                            }
                            $.messager.show({
                                title:'我的消息',
                                msg:str,
                                showType:'show',
                                timeout:1000
                            });

                        }
                    })
                }
            }]
        });
    })
</script>
</body>
</html>
