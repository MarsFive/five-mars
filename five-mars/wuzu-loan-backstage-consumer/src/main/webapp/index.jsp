<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="<%=request.getContextPath()%>/jquery/jquery.min.js" type="text/javascript"></script>

<title>Insert title here</title>
<style type="text/css">

				.p20 {
				    padding: 20px;
				}
				.index-top-container ul li {
				    display: inline-block;
				    float: left;
				}
				
				body{
				
				      height: 1000px;
				
				}
				
				.ww25 {
				    width: 25%;
				}
				ul, ol, li {
				    list-style: none;
				}
				.index-top-container ul li .item-container {
				    margin: 20px;
				}
				.item-container-by1 {
				    background: #479cc2;
				}
				.tc {
				    text-align: center;
				}
				.pt50 {
				    padding-top: 50px;
				}
				.mh120 {
				    min-height: 120px;
				}
				.index-pic1-icon {
				    background-position: -0px -60px;
				}
				.icon-i {
				    display: inline-block;
				    background-image: url(../images/icon-bg.png);
				    background-repeat: no-repeat;
				}
				.va-middle {
				    vertical-align: middle;
				}
				.p3 {
				    padding: 3px;
				}
				.h60 {
				    height: 60px;
				}
				.w60 {
				    width: 60px;
				}
				.va-middle {
				    vertical-align: middle;
				}
				.display-ib {
				    display: inline-block;
				}
				.white {
				    color: #fff!important;
				}
				.item-container-by2 {
				    background: #785b99;
				}
				.index-pic2-icon {
				    background-position: -77px -60px;
				}
				
				.item-container-by3 {
				    background: #37a776;
				}
				
				.index-pic3-icon {
				    background-position: -154px -60px;
				}
				.item-container-by4 {
				    background: #595b9b;
				}
				.index-pic4-icon {
				    background-position: -230px -60px;
				}

.agency-ul-box {
    margin-right: -1px;
}
.pt40 {
    padding-top: 40px;
}
.ml80 {
    margin-left: 80px;
}
.clearfix {
}
ul, ol, li {
    list-style: none;
}
.agency-ul-box li {
    width: 25%;
    float: left; 
}
ul, ol, li {
    list-style: none;
}

overflow:hidden{height:0;overflow:hidden;clear:both;}

.gray3 {
      color: #666!important;
}
.f36 {
    font-size: 36px;
}
h1, h2, h3, h4, h5, h6 {
    font-size: 100%;
    font-weight: normal;
}

/* .link_url{
color: #666!important;
} */

.agency-li-box {
    height: 126px;
    text-align: center;
}

.f16 {
    font-size: 18px;
}
 .gray6 {
    color: #666!important;
} 

.link_urll{
color: #666!important;
}
</style>
</head>
<body>
<%@include file="/daohang.jsp" %>


<br/>
<div style="width: 1626;height:780px;background-color: #FFFFFF;border; box-shadow: 2px 4px 6px #B4B6C0;">

<div class="p20">
                    <div class="index-top-container">
                        <ul class="clearfix">
                            <li class="ww25">
                                <div class="item-container mh120 tc pt50 item-container-by1">
                                    <div class="icon-i h60 w60 p3 index-pic1-icon va-middle"></div>
                                    <div class="display-ib white va-middle">
                                        <h2 class="f36 tc">
                                            <a class="white link_url" href="/console/accountipmanage/zhgl/zhList.htm?startTime=2018-05-16&amp;endTime=2018-05-16&amp;zcType=ZC" showobj="ZHGL" data-title="user">0</a>
                                            </h2>

                                        <p>今日新增用户数(人)</p>
                                    </div>
                                </div>
                            
                            <li class="ww25">
                                <div class="item-container mh120 tc pt50 item-container-by2">
                                    <div class="icon-i h60 w60 p3 index-pic2-icon va-middle"></div>
                                    <div class="display-ib white va-middle">
                                        <h2 class="f36 tc">
                                            <span>2</span>
                                        </h2>

                                        <p>今日登录用户数(人)</p>
                                    </div>
                                </div>
                            </li>
                            <li class="ww25">
                                <div class="item-container mh120 tc pt50 item-container-by3">
                                    <div class="icon-i h60 w60 p3 index-pic3-icon va-middle"></div>
                                    <div class="display-ib white va-middle">
                                        <h2 class="f36 tc">
                                            <a class="white link_url"   style="color: #FFFFFF" href="/console/accountipmanage/zhgl/zhList.htm" showobj="ZHGL" data-title="user" id="yonghu"></a>
                                            </h2>

                                        <p>网站总用户数(人)</p>
                                    </div>
                                </div>
                            </li>
                            <li class="ww25">
                                <div class="item-container mh120 tc pt50 item-container-by4">
                                    <div class="icon-i h60 w60 p3 index-pic4-icon va-middle"></div>
                                    <div class="display-ib white va-middle">
                                        <h2 class="f36 tc">
                                            <a class="white link_url" style="color: #FFFFFF" href="/console/statistics/yhtj/ptzxyhtj/userOnline.htm" showobj="PTZXYHTJ" data-title="statistics">1</a>
                                            </h2>

                                        <p>当前在线用户数(人)</p>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
<!-- 待办事项 -->

       <div style="width: 1270px;height:400px;background-color: #F8F8F8;position: relative;top: 70px;left: 40px;overflow:hidden">
   
    <div style="position: relative;bottom:0px;"><img src="images/daiban.png"> </div>
  <ul class="clearfix agency-ul-box pt40 ml80" style="position: relative;bottom: 400px;left: 20px;">
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36"><a href="/console/bid/loanmanage/jkgl/loanList.htm?status=DSH" class="link_urll" showobj="BDGL" data-title="business">0</a>
                                    </h3>
                                    <p class="gray6 f16">待审核借款项目（个）</p>
                                </div>
                            </li> 
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <a href="/console/bid/loanmanage/grjkyx/grjkyxList.htm?loanIntentionState=WCL" class="link_urll" showobj="GRJKYX" data-title="business">0</a>
                                        </h3>

                                    <p class="gray6 f16">待处理的个人借款意向（个）</p>
                                </div>
                            </li>
                          <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <a href="/console/bid/loanmanage/jkgl/loanList.htm?status=DFB" class="link_urll" showobj="BDGL" data-title="business">0</a>
                                        </h3>

                                    <p class="gray6 f16">待发布的借款项目（个）</p>
                                </div>
                            </li>
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <a href="/console/bid/loanmanage/qyjkyx/qyjkyxList.htm?loanIntentionState=WCL" class="link_urll" showobj="QYJKYX" data-title="business">0</a>
                                        </h3>

                                    <p class="gray6 f16">待处理的企业借款意向（个）</p>
                                </div>
                            </li>
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <a href="/console/finance/zjgl/fksh/fkshList.htm?fundStatus=1" class="link_urll" showobj="FKGL" data-title="finance">0</a>
                                        </h3>

                                    <p class="gray6 f16">待放款的借款项目（个）</p>
                                </div>
                            </li>
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <a href="/console/account/vipmanage/grxx/grList.htm?dshFlg=DSH" class="link_urll" showobj="GRXX" data-title="user">1</a>
                                        </h3>

                                    <p class="gray6 f16">待审核的认证信息（个）</p>
                                </div>
                            </li>
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <span>5</span>
                                        </h3>

                                    <p class="gray6 f16">提现初审（笔）</p>
                                </div>
                            </li>
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <span>0</span>
                                        </h3>

                                    <p class="gray6 f16">提现复审（笔）</p>
                                </div>
                            </li>
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <a href="/console/finance/czgl/xxczgl/xxczglList.htm?status=DSH" class="link_urll" showobj="XXCZGL" data-title="finance">12</a>
                                        </h3>

                                    <p class="gray6 f16">线下充值审核（笔）</p>
                                </div>
                            </li>
                            <li>
                                <div class="agency-li-box">
                                    <h3 class="gray3 f36">
                                        <a href="/console/bid/lcgl/zqzrgl/transferDshList.htm" class="link_urll" showobj="ZQZRGL" data-title="business">0</a>
                                        </h3>

                                    <p class="gray6 f16">债权转让审核（笔）</p>
                                </div>
                            </li> 
                        </ul>
   
    </div> 

  
    
</div>

<%--查询历史总用户人数--%>
<script type="text/javascript">

     $(function() {
/*
        alert("哈哈");
*/
         $.ajax({

             url:"<%=request.getContextPath()%>/index/user.do",
             type:"post",
             dataType:"json",
             success:function(result){
              /* alert(result)*/

                  $("#yonghu").html(result);
             }
         })


     })


    
</script>
</body>
</html>