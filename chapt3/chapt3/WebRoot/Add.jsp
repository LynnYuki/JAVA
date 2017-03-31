<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
    int first = 0;
    int second = 0;
    if(request.getParameter("first")!=null&&request.getParameter("first").length()>0)
    {
        first = Integer.parseInt(request.getParameter("first"));
    }
     if(request.getParameter("second")!=null&&request.getParameter("second").length()>0)
    {
        second = Integer.parseInt(request.getParameter("second"));
    }
 %>
<html>
  <head>
    <title>求和JSP程序示例</title>
    <script type="text/javascript">
        function check()
        {
            if(this.document.forms[0].first.value.length==0)
                alert("请输入第一个整数!");
            else if(this.document.forms[0].second.value.length==0)
                alert("请输入第二个整数!");
            else if (isNaN(this.document.forms[0].first.value))
                alert("输入的第一个数字必须是整型数据");
            else if (isNaN(this.document.forms[0].second.value))
                alert("输入的第二个数字必须是整型数据");
            else
                this.document.forms[0].submit();       
        }
    </script>
 </head>
<body>
   <form action="Add.jsp" method="post">
   <font size="2">
    这个JSP页面的功能是求两个整数的和：<br>
    请输入第一个数：<input type="text" name="first"/><br>
    请输入第二个数：<input type="text" name="second"/><br>
    这两个数的和为：<%=(first+second) %><br>
    <input type="button" value="求和" onclick="check()"/><br>
    </font>
  </body>
</html>
