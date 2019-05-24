<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%

String favouriteLang = request.getParameter("favouLang");

Cookie cookie = new Cookie("MyApplication.favouLang",favouriteLang);

cookie.setMaxAge(60*60*24*365);

response.addCookie(cookie);

%>

Thanks we have set your favourite programming language to: ${param.favouLang}
</body>
</html>