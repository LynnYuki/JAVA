<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY>
<jsp:useBean    id="triangle"  class="mypack.Triangle" scope="page" >
<jsp:setProperty    name="triangle"  property="*" />
</jsp:useBean>
    <P>������������α�a�ĳ���:<jsp:getProperty  name="triangle" property="a"/>
    <BR>
    <P>������������α�b�ĳ���:<jsp:getProperty  name="triangle" property="b"/>
    <BR>
    <P>������������α�c�ĳ���:<jsp:getProperty  name="triangle" property="c"/>
    <BR>

  <P>�����������Ϊ:<%=triangle.getArea() %>
</BODY>
</HTML>
