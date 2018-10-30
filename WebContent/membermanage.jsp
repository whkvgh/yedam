<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="co.khj.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%  request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지-회원 리스트</title>

</head>																													
<body>

	<table board="1" cellspacing="1">

		<tr>
			<th>아이디</th>
			<td><input name="uid" value="${bean.Uid}" readonly="readonly"></td>
			<th> 비밀번호</th>
			<td><input type="password" name="upw"></td>
			<th>닉네임</th>
			<td><input name="uname" value="${bean.Uname}"></td>
			<th>성별</th>
			<td><input name="ugender" value="${bean.Ugender}"></td>
			<th>생일</th>
			<td><input name="ubirth"  value="${bean.Ubirth}" /></td>
			<th>메일</th>
			<td><input name="mail" value="${bean.Umail }" ></td>
			<th>연락처</th>
			<td><input name="uphone" value="${bean.Uphone }" ></td>
			<th>가입일</th>
			<td><input name="ureg" fmt:formatDate value="${bean.Ureg}" pattern="yyyy-mm-dd"/></td>
		</tr>

	
	</table>

	
	<button onclic="loaction"="insert.jsp">등록</button>
	</form>

</body>

</html>

