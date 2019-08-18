<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.org.KundenRepository" %>
<%@ page import="com.org.KundenService" %>
<%@ page import="com.org.Kunde" %>
<%@ page import="java.util.List" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
	<%
	String name= "Freshta";
	out.println(name);
	
	KundenService service = new KundenService();
	out.println(service.alleKunden().toString());
	
	List<Kunde> kunden = service.alleKunden();

	
	%>
	
	<jsp:useBean id="test" class="com.org.KundenService"></jsp:useBean>
	
<%-- <c:foreEach items=Kunden" var= "kunde"> </c:foreEach> --%>
	<%-- <c:out value = ${Kunde}></c:foreEach> --%>
<p>jkjjj</p>
<c:out value="${100*10}"></c:out>
	<p>jkjjj</p>
	<%= kunden %>
<c:out value="${kunden}" default="text"></c:out>

	${test.alleKunden()}
</body>
</html>