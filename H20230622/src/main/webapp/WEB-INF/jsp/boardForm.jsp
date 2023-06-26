<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="header.jsp"></jsp:include>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
	<%
		String msg = (String)request.getAttribute("errorMsg");
		String logId = (String) session.getAttribute("loginId");
	%>
	
	
	
	<c:if test="${erroMsg eq null }">
		<p>메세지: <b><%=msg %></b></p>
	</c:if>
	
    <h3>게시글 등록</h3>
    <form action="addBoard.do" method="post">
        <table border="1" class = "table">
            <tr>
                <th>제목</th>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <th>작성자</th>
                <td>
                
                <c:choose>
                <c:when test="${loginId eq null}">
                	<input type="text" name="writer" readonly>
                </c:when>
               
                
                <c:otherwise>
                <input type="text" name="writer" value="<%=logId %>" readonly>
                </c:otherwise>
                
                </c:choose>
                
                </td>
            </tr>
            <tr>
                <th>내용</th>
                <td><textarea name="content" cols="30" rows="10"></textarea></td>
            </tr>
            <tr>
                <td colspan="2" align = "center">
                <c:choose>
                	<c:when test="${loginId eq null }">
                	 <input type="submit" value="저장" disabled>
                </c:when>
                <c:otherwise>
               
                    <input type="submit" value="저장">
               </c:otherwise>
               </c:choose>
               
                    <input type="reset" value="초기화">
                </td>
            </tr>
        </table>
    </form>
<br>
 <jsp:include page="footer.jsp"></jsp:include>