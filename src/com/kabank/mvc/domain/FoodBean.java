package com.kabank.mvc.domain;

public class FoodBean {
	private	String menu, price, count;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "메뉴[상품명:"+ menu + ", 가격:" + price + "원, 수량: " +count+"]";
}
}
