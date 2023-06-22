<%@page import="com.yedam.board.vo.BoardVO"%>
<%@page import="com.yedam.board.persistence.BoardDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEB-INF/jsp/boardList.jsp</title>
</head>
<body>
	<%
	 List<BoardVO> list = (List<BoardVO>)request.getAttribute("list"); // list = dao.list();
	%>
	<h3>게시판</h3>
	<table>
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<% for(BoardVO vo : list){
			%>
			<tr>
				<td><%=vo.getBrdNo() %></td>
				<td><a href="getBoard.do?bno=<%=vo.getBrdNo() %>"><%=vo.getBrdTitle() %></td>
				<td><%=vo.getBrdWriter() %></td>
				<td><%=vo.getClickCnt() %></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<br>
	<a href="boardForm.do">등록화면으로</a>
</body>
</html>