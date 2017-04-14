<%@ page language="java" import="java.util.*"%>
<%@ page contentType="text/html; charset=utf-8" %>

<html>
  <head>    
    <title>猜蛋糕价格游戏</title>    
  </head>  
  <body>
   
	<jsp:useBean id="game" class="mypack.GuessGame" scope="session" />
	<jsp:setProperty name="game" property="*" />
	<%
    	if(game.getCounter()==0){
	%>
    <center>
    <font size="4" color="red">猜价格</font>
    <hr>
    <p align="center">
	</p>  
    <form method="get" name="form1">
         <b>请输入价格：</b>
         <input type="text" name="guess">
         <input type="submit" value="确定" name="submit">
    </form>
	</center>
	 <div align="center"><img  src="<%=game.getPicture()%>.jpg" alt="cake" width="242" height="242" ></div>
	<%
    	}
    	else if(game.getSuccess())
       	{     
	%>
    <center>
		<b>猜对了，它归你了。 你猜了 ${game.counter } 次.</b>
    	<br>
    	<a href="guessgame.jsp">再来一次？</a></center>
	<%
    		game.reset();
    	}
    	else{
	%>
    <center><b>继续努力，${game.info}
	<b>你已经猜了 ${game.counter } 次.</p>
    <br>
	输入你猜的价格：
    <form method="get" name="form2">
         <input type="text" name="guess"> 
         <input type="submit" value=确定 name="submit">
    </form>
    </b></center>
     <div align="center"><img  src="${game.picture}.jpg" alt="cake" width="242" height="242" ></div>
	<%
       }
	%>
  </body>
</html>
