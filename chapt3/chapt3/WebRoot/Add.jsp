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
    <title>���JSP����ʾ��</title>
    <script type="text/javascript">
        function check()
        {
            if(this.document.forms[0].first.value.length==0)
                alert("�������һ������!");
            else if(this.document.forms[0].second.value.length==0)
                alert("������ڶ�������!");
            else if (isNaN(this.document.forms[0].first.value))
                alert("����ĵ�һ�����ֱ�������������");
            else if (isNaN(this.document.forms[0].second.value))
                alert("����ĵڶ������ֱ�������������");
            else
                this.document.forms[0].submit();       
        }
    </script>
 </head>
<body>
   <form action="Add.jsp" method="post">
   <font size="2">
    ���JSPҳ��Ĺ����������������ĺͣ�<br>
    �������һ������<input type="text" name="first"/><br>
    ������ڶ�������<input type="text" name="second"/><br>
    ���������ĺ�Ϊ��<%=(first+second) %><br>
    <input type="button" value="���" onclick="check()"/><br>
    </font>
  </body>
</html>
