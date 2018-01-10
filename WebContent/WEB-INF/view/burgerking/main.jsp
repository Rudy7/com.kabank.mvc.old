<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>	
<%@ include file= "../common/header.jsp" %>	
<%@ include file= "../common/nav.jsp" %>
<section>
	<article>
		<header>
			<hgroup>
				<h1><mark>버거킹 주문 화면</mark></h1>
				<h6>상품을 수량을 선택해 주세요</h6>
			</hgroup>
		</header>
	</article>
	<article>
<div id="wrapper2">
	<form id="order_form" action="result.jsp">
		<table border = "1">
		<tr>
			<td>
				<figure>
					<figcaption>
					<img src="../../img/hamburger.jpg;"style="width:200px; height:170px;" />
					<input type="checkbox" name="menu" value="coffee"/> check 햄버거 : ￦5500 <br />
					<input type="number" name="hamburger-count" style="width:30px" min="1" max="10" />개
					</figcaption>
					</figure>
					</td>
					<td >
					<figure>
					<figcaption>
					<img src="../../img/coke.jpg;"style="width:200px; height:170px;" />
					<input type="checkbox" name="menu" value="coke"/> check 콜라 : ￦1000 <br />
					<input type="number" name="coke-count" style="width:30px" min="1" max="10" />개
					</figcaption>
					</figure>
					</td>
					<td>
					<figure>
					<figcaption>
					<img src="../../img/chip.jpg;"style="width:200px; height:170px;" />
					<input type="checkbox" name="menu" value="chip"/> check 감자튀김 : ￦1000 <br />
					<input type="number" name="chip-count" style="width:30px" min="1" max="10" />개
					</figcaption>
					</figure>
					</td>
					</tr>
					<tr>
					<td>
					<figure>
					<figcaption>
					<img src="../../img/coffee.jpg;" style="width:200px; height:170px;" />
					<input type="checkbox" name="menu" value="coffee"/> check 커피 : ￦900 <br />
					<input type="number" name="coffee-count" style="width:30px" min="1" max="10" />개
					</figcaption>
					</figure>
					</td>
					<td>
					<figure>
					<figcaption>
					<img src="../../img/salad.jpg;" style="width:200px; height:170px;" />
					<input type="checkbox" name="menu" value="salad"/> check 샐러드 : ￦3,000 <br />
					<input type="number" name="salad-count" style="width:30px" min="1" max="10" />개
					</figcaption>
					</figure>
					</td>
					<td>
					<figure>
					<figcaption>
					<img src="../../img/bagle.jpg;" style="width:200px; height:170px;" />
					<input type="checkbox" name="menu" value="bagle"/> check 베이글 : ￦3,500 <br />
					<input type="number" name="bagle-count" style="width:30px" min="1" max="10" />개
					</figcaption>
					</figure>
					</td>
					</tr>
					<tr>
					<td colspan="3">
					<input type="radio" name="place" value="매장식사" checked="checked"/>매장식사<br />
					<input type="radio" name="place" value="테이크아웃" />테이크아웃
					</td>
					</tr>
					<tr>
					<td colspan="3">
					<input type="hidden" name="hamburger" value="5500" /> 
					<input type="hidden" name="coke" value="1000" />
					<input type="hidden" name="chip" value="1000" />
					 <input type="hidden" name="coffee" value="900" />
					  <input type="hidden" name="salad" value="3000" />  
					   <input type="hidden" name="bagle" value="3500" /> 
					     <input id="burgerking_order_btn" type="button" value="전  송"  style="width:100px;"/>
					     </td>
					     </tr>
					     </table>	
	</form>
</div>	
	</article>
</section>
<%@ include file= "../common/footer.jsp" %>		
</body>
<script src="../../js/burgerking/burgerking.js"></script>
</html>
