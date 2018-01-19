<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<section>
		<article>
<%@ include file= "../common/header.jsp" %>		
<%@ include file= "../common/nav.jsp" %>


	<div style="width: 300px; height: 200px; margin: 0 auto;">
		<form action="sktelecom/result.jsp">
			<button id="opening" name="opening">번호개통</button>
			<input type="submit" value="전송" />
		</form>
	</div>
		</article>
	</section>
		<aside>
		
		</aside>
<%@ include file= "../common/footer.jsp" %>	
</body>
	<script>
	
document.querySelector('#opening').addEventListener("click",
		function(){
		alert("skTelecom에서 skTelecom-C 으로 이동직전");
		location.href="${ctc}/skTelecom.do?cmd=opening&dir=user&page=mypage ";
}
		,false);
	
	</script>
</html>