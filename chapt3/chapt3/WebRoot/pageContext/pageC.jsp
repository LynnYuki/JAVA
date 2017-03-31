<%@page contentType="text/html;charset=utf-8"%>

<html><head><title>pageContext对象_例1</title></head>

<body><br>

<%

//使用pageContext设置属性，该属性默认在page范围内

  pageContext.setAttribute("name","jason test");
  request.setAttribute("name","编程");
  session.setAttribute("name","计算机编程技术培训");
  application.setAttribute("name","培训");

%>

page设定的值:<%=pageContext.getAttribute("name")%><br>

request设定的值：<%=pageContext.getRequest().getAttribute("name")%><br>

session设定的值：<%=pageContext.getSession().getAttribute("name")%><br>

application设定的值：<%=pageContext.getServletContext().getAttribute("name")%><br>

范围1内的值：<%=pageContext.getAttribute("name",1)%><br>

范围2内的值：<%=pageContext.getAttribute("name",2)%><br>

范围3内的值：<%=pageContext.getAttribute("name",3)%><br>

范围4内的值：<%=pageContext.getAttribute("name",4)%><br>

<!--从最小的范围page开始，然后是reques、session以及application-->

<%pageContext.removeAttribute("name",3);%>

pageContext修改后的session设定的值：<%=session.getValue("name")%><br>

<%pageContext.setAttribute("name","应用技术培训",4);%>

pageContext修改后的application设定的值：<%=pageContext.getServletContext().getAttribute("name")%><br>

值的查找：<%=pageContext.findAttribute("name")%><br>

属性name的范围：<%=pageContext.getAttributesScope("name")%><br>

</body></html>