<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isErrorPage="true" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9kGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
     <h1>All Books</h1>
     
    <table>
      <tbody>
		  <tr>
		    <th>ID</th>
		    <th>Title</th>
		    <th>Language</th>
		    <th>#Pages</th>
		  </tr>
		  <c:forEach var="i" items="${books}" >
		  <tr>
		      <td> <c:out value="${i.id}"></c:out> </td>
		       <td> <c:out value="${i.title}"></c:out> </td>
		        <td> <c:out value="${i.language}"></c:out> </td>
		         <td> <c:out value="${i.page}"></c:out> </td>
		  </tr>
		  </c:forEach>
     </tbody>	    
     </table>
     
 </body>
 </html>