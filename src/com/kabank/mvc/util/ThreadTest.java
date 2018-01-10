package com.kabank.mvc.util;

public class ThreadTest {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Runnable hong = new User(atm, "홍길동");
		Runnable kim = new User(atm, "김유신");    //두명이 atm을 사용하려고 줄서고 있다.
		Runnable lee = new User(atm, "이순신");
		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(lee);
		thr3.start();
	}
	
}
class Atm{
	public synchronized void inchul(String name) {
		System.out.println(name +" 님이 인출요청함");
		for(int i=0; i<=100000000; i++) {
			if(i==10000) {
				System.out.println(name + "님이 돈을 인출하는 중... ");
			}
		}
		System.out.println(name +"인출해 나감");
	}
}
class User implements Runnable{
	Atm atm;
	String name;
	public User(Atm atm,String name) {
		// TODO Auto-generated constructor stub
		super();
		this.atm = atm;
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		atm.inchul(name);
	}
	
}