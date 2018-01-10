<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<section>
		<article>
<%@ include file= "../common/header.jsp" %>		
<%@ include file= "../common/nav.jsp" %>

	
	<div style="width: 300px; height: 200px; margin: 0 auto;">
		<form action="result.jsp">
			구매 금액 : <input type="text" name="money" placeholder="게임당 1000원 최대 5게임" />
			<input type="submit" value="전송" />
		</form>
	</div>
		</article>
	</section>
	<aside>
	
	</aside>
<%@ include file= "../common/footer.jsp" %>	
</body>
	<script src="../../js/lotto/lotto.js"></script>
</html>