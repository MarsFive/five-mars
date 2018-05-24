<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <style>
    
/*            body{
           
             background-color: #D6DAE6;
           } */
           
           
           
    
            html, body, div, p, h1, h2, h3, h4, h5, h6, blockquote, ol, ul, li, dl, dt, dd, form, fieldset, legend, button, input, textarea, pre, code, th, td{
            
              margin:0px;
              padding:0px;
            } 
            
            a:link,a:visited{
             text-decoration:none;  /*超链接无下划线*/
           }
            .main-head{
              
                background:#104d7f;
                height:50px;
                color:#FFF;
             }   
             
             
             .left-v5-box{
             
                font-size:16px;
                color:#ffffff;
             }
             
             .pl30{
             
                padding-left:30px;
                
             } 
             
             .ml40{
                margin-left:40px;  
             }
             
             .f14{
                font-size:15px;
             }
    
             .main-head-fr{
               
                position:absolute;
                right:0px;
                top:0px;
             
             }
             
             .main-head-fr ul{
                float:right;
                
             }
             
             .mr100{
                margin-right:100px;
             
             }
             
             ul, ol, li{
               list-style:none;
             }
             
             .main-head-fr ul li{
               float:left;
               margin-left:20px;
             
             }
             
             
             .user-icon{
                background-position:-30px 0px;
                
              }
              
              .icon-i{
              
              display:inline-block;
              background-image:url(images/icon-bg.png)
              
              }
              
              .va-middle{
               vertical-align:middle;
              }
              
              .ml10{
               margin-left:10px;
              }
              
              .h30{
                height:30px;
               }
               
               .w30{
                 width: 30px;
               }
               
               .main-head-fr ul li .span-txt{
                color:#58cbfc;
                font-size: 14px;
               }
               
               .f18{
                font-size:16px;
               }
               
               .xiugaimima-icon{
                background-position:-60px 0px;
               
               }
               .icon-i{
                display:inline-block;
                background-image:url(images/icon-bg.png);
                background-repeat:no-repeat;
               
                }
                
                .main-head-fr ul li a{
                
                 color:#fff;
                }
                
                .exit-icon{
                
                background-position:-90px 0px;
                }
                
                
                /* 导航栏开始了 老铁 */
                
                .main-nav {
				    width: auto;
				    background: #ffffff;
				    height: 82px;
				    position: relative;
				    box-shadow: 2px 4px 6px #B4B6C0;
				}
                
                .logo-containe {
				    position: absolute;
				    width: 230px;
				    height: 82px;
				    left: 0px;
				    top: 0px;
				}
				
				.logo-containe .logo {
				    padding: 10px;
				}
				
				.logo-containe .logo img {
				    max-width: 210px;
				    max-height: 60px;
				}

				.top-nav {
				    height: 82px;
				    left: 260px;
				    width: auto;
				    right: 0px;
				    top: 0px;
				    bottom: 0px;
				    overflow: hidden;
				    position: absolute;
				}
				
				.main-nav ul {
				    display: block;
				    width: 100%;
				    height: 82px;
				}
				
				.main-nav ul li {
				    float: left;
				    display: inline-block;
				    width: 9%;
				    max-width: 120px;
				}
				
				.main-nav ul li .select-a {
				    background: #008dc4;
				    color: #FFF;
				}
				.main-nav ul li a {
				    display: block;
				    font-size: 16px;
				    height: 82px;
				    line-height: 120px;
				    text-align: center;
				    position: relative;
				    overflow: hidden;
				}
				
				.main-nav ul li .select-a .nav-home-icon {
				    background-position: 0px -330px;
				}
				.main-nav ul li a .icon-i {
				    position: absolute;
				    left: 50%;
				    margin-left: -15px;
				    top: 16px;
				}
				.nav-home-icon {
				    background-position: 0px -300px;
				}
				.icon-i {
				    display: inline-block;
				    background-image: url(images/icon-bg.png);
				    background-repeat: no-repeat;
				}
				
				.main-nav ul li a {
				    display: block;
				    font-size: 16px;
				    height: 82px;
				    line-height: 120px;
				    text-align: center;
				    position: relative;
				    overflow: hidden;
				}
				
				.nav-yhgl-icon {
				    background-position: -30px -300px;
				}
				
				.nav-ywgl-icon {
				    background-position: -60px -300px;
				}
				.nav-xcgl-icon {
				    background-position: -90px -300px;
				}
				.nav-xtgl-icon {
				    background-position: -30px -360px;
				}
				.nav-cwgl-icon {
				    background-position: -120px -300px;
				}
				.nav-tjgl-icon {
				    background-position: -150px -300px;
				}
				.nav-tggl-icon {
				    background-position: -210px -300px;
				}
				.nav-jbsz-icon {
				    background-position: -240px -300px;
				}
				.nav-appgl-icon {
				    background-position: -270px -300px;
				}
				
				
				.main-nav-a{
				
				  color: #7F6666;
				  
				}
				
				a.main-nav-a:hover{
				
        			 color:#1295C8;
				
				}
    </style>

    <!-- 置顶的面板 -->
    <div class="main-head clearfix">
    
    
     
      <div class="left-v5-box pl30 clearfix">
      <br/>     
<span style="position: relative;top: -8px;">迪蒙网贷 V7.0标准版</span> <span style="position: relative;top: -8px;" class="time-containe ml40 f14">2018年05月23日 星期三</span>
     </div>

    
    </div>    
 
 
    <!-- 用户登录进来显示的 欢迎你/修改密码/退出等功能 --> 
    <div class="main-head-fr ww80 tr" style="position: relative;top: -37px;">
       <ul class="mr100">
       
        <!-- 登录用户 -->
          <li>
              <i class="icon-i w30 h30 ml10 va-middle user-icon"></i>
              <span class="span-txt">欢迎你 ,</span>
              <span class="f18" style="color: #FFFFFF">王杰</span>
          </li>
       
          <!-- 修改密码 -->
          <li>
            <a href="/console/common/updatePass.htm" target="mainFrame" data-title="index" class="update_pwd" style="font-size: 14px;">
               
                  <i class="icon-i w30 h30 ml10 va-middle xiugaimima-icon"></i>修改密码</a>
          
          </li>
          <!-- 退出登录 -->
          <li><a id="return_logout" href="/console/logout.htm" target="_parent" style="font-size: 14px;">
            
                 <i class="icon-i w30 h30 ml10 va-middle exit-icon"></i><a>安全退出</a></a></li>
       
       </ul>
    
    </div>
   
    <!-- nav导航栏 -->
     <div class="main-nav">
     
     <div class="logo-containe">
        <div class="logo"><img src="images/83.png"></div>
     </div>
     
     <div class="top-nav">
  <ul class="clearfix">
  	<li><a href="index.jsp" class="main-nav-a select-a" data-title="index" target="mainFrame"><i class="icon-i h30 w30 nav-home-icon"></i>首页</a></li>
    <li><a href="huiyuanguanli.jsp"  class="main-nav-a" data-title="user" target="mainFrame"><i class="icon-i h30 w30 nav-yhgl-icon"></i>会员管理</a></li>
    <li><a href="yewuguanli.jsp"   class="main-nav-a" data-title="business" target="mainFrame"><i class="icon-i h30 w30 nav-ywgl-icon"></i>业务管理</a></li>
    <li><a href="xuanchuanguanli.jsp"  class="main-nav-a" data-title="propaganda" target="mainFrame"><i class="icon-i h30 w30 nav-xcgl-icon"></i>宣传管理</a></li>
    <li><a href="xitongguanli.jsp"   class="main-nav-a" data-title="system" target="mainFrame"><i class="icon-i h30 w30 nav-xtgl-icon"></i>系统管理</a></li>
    <li><a href="caiwuguanli.jsp"  class="main-nav-a" data-title="finance" target="mainFrame"><i class="icon-i h30 w30 nav-cwgl-icon"></i>财务管理</a></li>
    <li><a href="tongjiguanli.jsp"  class="main-nav-a" data-title="statistics" target="mainFrame"><i class="icon-i h30 w30 nav-tjgl-icon"></i>统计管理</a></li>
    <li><a href="tuiguangguanli.jsp"  class="main-nav-a " data-title="extension" target="mainFrame"><i class="icon-i h30 w30 nav-tggl-icon"></i>推广管理</a></li>
    <li><a href="jibenshezhi.jsp"   class="main-nav-a" data-title="basics" target="mainFrame"><i class="icon-i h30 w30 nav-jbsz-icon"></i>基本设置</a></li>
    <li><a href="appguanli.jsp"  class="main-nav-a" data-title="app" target="mainFrame"><i class="icon-i h30 w30 nav-appgl-icon"></i>APP管理</a></li>
    </ul>
 </div>
     </div>


   
    