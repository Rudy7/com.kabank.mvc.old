<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<section>
		<article>
<%@ include file= "../common/header.jsp" %>		
<%@ include file= "../common/nav.jsp" %>
			<div id="kakao_div">
					<button id="openAccount" name="openAccount">통장개설</button> <br />
					<button id="payIn" name="payIn">입금</button> <br />
					<button id="payOut" name="payOut">출금</button> <br />
					<button id="payTransfer" name="payTransfer">송금</button> <br />
					<button id="closeAccount" name="closeAccount">통장해지</button> <br />
					<input type="submit" value="전송" />
				<!-- 	<input type="hidden" name="cmd" value="open-account" />
					<input type="hidden" name="dir" value="user"/>
					<input type="hidden" name="page" value="mypage" />  -->
			</div>
		</article>
	</section>
	<aside>	
	</aside>
<%@ include file= "../common/footer.jsp" %>	
</body>
	<script>
document.querySelector('#openAccount').addEventListener("click",
		function(){
		alert("카카오뱅크 통장개설 클릭1");
		location.href="${ctx}/kakao.do?cmd=open-account&dir=user&page=mypage";
		},false);
		
	</script>
</html>