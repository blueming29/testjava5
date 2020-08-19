package com.tech1.trans;

public class TransTest {
	public static void printCharge(Trans tran) {
		System.out.println("=======================");
		System.out.println("인원수\t:\t거리(km)");
		System.out.println(tran.toString());
		System.out.println("-----------------------");
		System.out.println("지불금액 : "+tran.getCharge());
		System.out.println("=======================");
	}
	
	public static void main(String[] args) {
		Trans[] trans = new Trans[4];
		trans[0] = new Train(5, 100, 200);				// 부모타입의 인스턴스에 자식의 인스턴스를 넣는다? -> 다형성 적용!
		trans[1] = new Express(10, 100, 100);
		trans[2] = new Taxi(2, 10, 500);
		trans[3] = new Train(1, 100, 200);
		
		Express ex = new Express(1, 10, 500);
		System.out.println("출발 : "+ex.getStartStation() + "\t도착 : "+ex.getEndStation());
		for (Trans tran : trans) {
			printCharge(tran);
			System.out.println();
		}
		

		
	}
}
