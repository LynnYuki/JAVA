<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>用户注册</title>
</head>
<body>

<form action="servlet/RegServlet" method="post">
	<table align="center" width="450">
		<tr>
			<td align="center" colspan="2">
				<h2>用户注册</h2>
				<hr>
			</td>
		</tr>
		<tr>
			<td align="right">用户名：</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td align="right">密码：</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td align="center" colspan="2">
				<input type="submit" value="注　册">
			</td>
		</tr>
	</table>
</form>
</body>
</html>