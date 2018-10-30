<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="co.jjh.DTO.memberDTO"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin 회원관리 입력, 수정</title>
</head>
<body>
	<h2>회원정보 입력 및 수정</h2>
	<form action="memberUP.jsp" method="post">
		<input type="hidden" name="id">
		<table width="500" cellpadding="0" cellspacing="0" border="1">

			<tr>
				<th>닉네임</th>
				<th>ID</th>
				<th>비밀번호</th>
				<th>성별</th>
				<th>나이</th>
				<th>폰번호</th>
				<th>메일주소</th>
				<th>가입날짜</th>
				<th>수정</th>
				<%
					ArrayList<memberDTO> list = new ArrayList<memberDTO>();
					for (memberDTO dto : list) {
				%>
			
			<tr>
				<td><%=dto.getuName()%></td>

				<td><%=dto.getuId()%></td>

				<td><%=dto.getuPw()%></td>

				<td><%=dto.getuGender()%></td>

				<td><%=dto.getuBirth()%></td>

				<td><%=dto.getuPhone()%></td>


				<td><%=dto.getuMail()%></td>

				<td><%=dto.getuReg()%></td>

				<td><a href=""></td>
			</tr>
			<%
				}
			%>

			<td colspan="2"><a href="update.do?uId=${dto.uId }">수정</a></td>

		</table>
	</form>
</body>
</html>