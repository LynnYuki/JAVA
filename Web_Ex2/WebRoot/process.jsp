<%@ page contentType="text/html;charset=gb2312" %>
<html>
<head>
<title>������Ϸ-����</title>
<head>
<% 
    String num=request.getParameter("number");
	 if(num.length()==0) 
       {
          response.sendRedirect("guess.jsp");
       }
       else{
          int gNum=Integer.parseInt(num);
          Integer i=(Integer)session.getAttribute("num");
          int rNum=i.intValue();
          if(gNum==rNum)
           { 
               int count=((Integer)session.getAttribute("count")).intValue();
               count++;
               session.setAttribute("count",new Integer(count));
               response.sendRedirect("ok.jsp");
           } 
          else if(gNum>rNum)
          {
                int count=((Integer)session.getAttribute("count")).intValue();
                count++;
                session.setAttribute("count",new Integer(count));
                response.sendRedirect("larger.jsp");
           }
         else if(gNum<rNum)
          { 
                    int count=((Integer)session.getAttribute("count")).intValue();
                    count++;
                     session.setAttribute("count",new Integer(count));
                     response.sendRedirect("smaller.jsp");
            }
        }
%>
</html>
