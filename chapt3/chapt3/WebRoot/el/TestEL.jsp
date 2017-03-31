<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>
    <title>TestEL</title>
  </head>
  <body>
   <font size="6px">request param name is :</font><font color="red" size="6px">${param.name}</font><br>
   <font size="6px">request param empID is :</font><font color="red" size="6px">${param.empID}</font><br>
   <font size="6px">request param food is :</font><font color="red" size="6px">${param.food}</font><br>
   
   <font size="6px">First food request param:</font><font color="red" size="6px">${paramValues.food[0]}</font><br>
   <font size="6px">First food request param:</font><font color="red" size="6px">${paramValues.food[1]}</font><br>
   
  <font size="6px"> Request parm name:</font><font color="red" size="6px">${paramValues.name[0]}</font><br>
   
  </body>
</html>
