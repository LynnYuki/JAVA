<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY>
<jsp:useBean    id="triangle"  class="mypack.Triangle" scope="page" >
<jsp:setProperty    name="triangle"  property="*" />
</jsp:useBean>
    <P>您输入的三角形边a的长度:<jsp:getProperty  name="triangle" property="a"/>
    <BR>
    <P>您输入的三角形边b的长度:<jsp:getProperty  name="triangle" property="b"/>
    <BR>
    <P>您输入的三角形边c的长度:<jsp:getProperty  name="triangle" property="c"/>
    <BR>

  <P>此三角形面积为:<%=triangle.getArea() %>
</BODY>
</HTML>
