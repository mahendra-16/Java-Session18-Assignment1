<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	.error{
		color:#ff0000;
	}
</style>

</head>
<body>

	<form:form commandName="User">
		<table>
			<tr>
				<td>Student Name :</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error"></form:errors>
			</tr>
			
			<tr>
				<td>Student ID : </td>
				<td><form:input path="id"/></td>
				<td><form:errors path="id" cssClass="error"/></td>
			</tr>
				
			<tr>
				<td>Student Subject : </td>
				<td><form:select path="subject">
					<form:option value="" label="Select Subject"/>	
					<form:option value="Math" label="Math"/>
					<form:option value="History" label="History"/>
					<form:option value="Science" label="Science"/>
					<form:option value="English" label="English"/>
				</form:select></td>	
				<td><form:errors path="subject" cssClass="error" /></td>
			</tr>		
				
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
