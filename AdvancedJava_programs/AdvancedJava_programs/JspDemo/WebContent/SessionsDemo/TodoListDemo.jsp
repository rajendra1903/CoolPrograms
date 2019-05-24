 <!DOCTYPE html>
 <%@page import="java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<form action="TodoListDemo.jsp">

add new item: <input type="text" name="item"/><br/>

<input type="submit" value="Submit"/><br/>

Item Entered: <%= request.getParameter("item")%>


</form>
<% 
List<String> items = (List<String>) session.getAttribute("myToDoList");

	// if the TO DO items doesn't exist, then create a new one
	if (items == null) {
		items = new ArrayList<String>();
		session.setAttribute("myToDoList", items);
	}
	
	// see if there is form data to add
	String theItem = request.getParameter("item");
	if (theItem != null) {
		items.add(theItem);
		}
	%>
	
	<b>To List Items:</b> <br/>

<ol>
<%
	for (String temp : items) {
		out.println("<li>" + temp + "</li>");
	}
%>
</ol>
</body>
</html>
