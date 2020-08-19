package com.tech3.inter_di1;

public class Coffee {
	private HotAmericano ame;
//	private IceAmericano ame;
	public Coffee() {
//		System.out.println("기본생성자 호출");
		ame = new HotAmericano();
//		ame = new IceAmericano();
//		System.out.println(ame);
		
	}
	
	public void coffeeType() {
		System.out.println(ame.getName());

	}
}
