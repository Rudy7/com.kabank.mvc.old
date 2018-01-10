package com.kabank.mvc.util;

public class MainTest {
	public static void main(String[] args) {
		for(Enums.MemberColumn c: Enums.MemberColumn.values()) {  //힙에 저장
			System.out.println(c+",");
		}	
	}
}
