<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp" %>
<section id="board" class="list">
    <h3>글목록</h3>
    <article>
        <p>
        	${member.nick}님 반갑습니다.
           <a href="/farmstory/user/logout" class="logout">[로그아웃]</a>
       </p>
       <table border="0">
           <tr>
               <th>번호</th>
               <th>제목</th>
               <th>글쓴이</th>
               <th>날짜</th>
               <th>조회</th>
           </tr>
           <c:forEach var="article" items="${articles}">
            <tr>
                <td>${count=count-1}</td>
                <td><a href="/farmstory/view?seq=${article.seq}">${article.title}</a>&nbsp;[${article.comment}]</td>
                <td>${article.nick}</td>
                <td>${article.rdate.substring(2, 10)}</td>
                <td>${article.hit}</td>
            </tr>
           </c:forEach>
       </table>
   </article>

   <!-- 페이지 네비게이션 -->
   <div class="paging">
		<a href="#" class="prev">이전</a>
		<a href="/farmstory/list?pg=${i}" class="num ${currentPg == i ? 'current':''}">${i}</a>
		<a href="#" class="next">다음</a>
   </div>

   <!-- 글쓰기 버튼 -->
    <a href="./write.html" class="btnWrite">글쓰기</a>
</section>
<%@ include file="../_footer.jsp" %>