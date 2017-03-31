<%@ page contentType="text/html;charset=gb2312" %>
<jsp:useBean id="counter" class="com.bean.Counter" scope="request" />
你好!感谢你第<jsp:getProperty name="counter" property="count" />次的光临
