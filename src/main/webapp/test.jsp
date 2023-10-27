<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test !</title>
</head>
<body>

test page<br/>

<!-- it is gemapped naar een instantie van nl.netage.Demo -->
<h1>${it.getText()}</h1>
<ul>
<!-- it.list is gemapped naar een lijst met instanties van nl.netage.DemoItem -->
 <c:forEach var="item" items="${it.list}">
        <li>${item.label}</li>
    </c:forEach>
    </ul>
 </body>
</html>