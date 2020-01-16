<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<h1 style="color: red; text-align: center;">
	<u style="color: red">Rhode Island persion Deatils Form</u>
</h1>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<br>

${result}
${errorresult}
<form:form action="personSave" method="post" modelAttribute="details">

	<center>
		<table
			style="background-color: pink; text-align: center; border-color: black"
			border="1" rules="all" width="500" height="100">
			<tr style="color: red">
				<td style="color: black">firstName</td>
				<td style="color: green"><form:input path="fname" /></td>
			</tr>
			<tr>
				<td style="color: black">LastName</td>
				<td style="color: green"><form:input path="lname" /></td>
			</tr>
			<tr>
				<td style="color: black">Email</td>
				<td style="color: green"><form:input path="email" /></td>
			</tr>

			<tr>
				<td style="color: black">Dob</td>
				<td style="color: green"><form:input type="date" path="dob"
						value="" /></td>
			</tr>

			<tr>
				<td style="color: black">Gender</td>
				<td><form:radiobutton path="gender" value="m" />Male
					&nbsp;&nbsp; <form:radiobutton path="gender" value="f" />female</td>
			</tr>

			<tr>
				<td style="color: black">state</td>
				<td style="color: green"><form:select path="state">
						<form:option value="-select-" />
						 <form:options items="${allstates}" /> 
					</form:select></td>
			</tr>


			<tr>
				<td></td>
				<td style="color: red"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</center>
</form:form>
</body>
