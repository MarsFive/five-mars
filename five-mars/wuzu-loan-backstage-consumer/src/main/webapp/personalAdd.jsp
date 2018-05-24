<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="persnal_add_from">
    <table>
        <tr>
            <td>登录账户:</td>
            <td><input class="easyui-textbox"   type="text" name="name"/></td>
            <td><font id="personal_font_name" color="#a52a2a"></font></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input class="easyui-passwordbox"   type="text" name="pwd" id="personal_pwd"/></td>
            <td><font id="personal_font_pwd" color="#a52a2a"></font></td>
        </tr>
        <tr>
            <td>重复密码:</td>
            <td><input class="easyui-passwordbox"   type="text" id="personal_cfpwd"/></td>
            <td><font id="personal_font_cfpwd" color="#a52a2a"></font></td>
        </tr>
        <tr>
            <td>业务员工号:</td>
            <td><input class="easyui-textbox"   type="text" name="empNumber"/></td>
            <td><font id="personal_font_empNumber" color="#a52a2a"></font></td>
        </tr>
        <content>

        </content>
    </table>
</form>
</body>
</html>
