package com.kabank.mvc.util;

import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.enums.TnameEnum;

public class MainTest {
	public static void main(String[] args) {
		for(Enums.MemberColumn c: Enums.MemberColumn.values()) {  //힙에 저장
		System.out.println(c+",");
		StringBuffer buff = new StringBuffer(DMLEnum.SELECT.toString());
		
		
		System.out.println("기본 버프:" +buff);
		buff.insert(6, " "+MemberEnum.PROFERTIES.toString());
		System.out.println("추가된 버프:" +buff);
		System.out.println(MemberEnum.PROFERTIES.toString());
		System.out.println("=============================================================");
		
		System.out.println(MemberEnum.ID.name());
	    /*System.out.println((DMLEnum.SELECT.toString()).insert(6, " *").append(TnameEnum.MEMBER));*/
		
		
		
		}	
	}
}
