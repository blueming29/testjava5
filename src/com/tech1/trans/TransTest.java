package com.tech1.trans;

public class TransTest {
	public static void printCharge(Trans tran) {
		System.out.println("=======================");
		System.out.println("�ο���\t:\t�Ÿ�(km)");
		System.out.println(tran.toString());
		System.out.println("-----------------------");
		System.out.println("���ұݾ� : "+tran.getCharge());
		System.out.println("=======================");
	}
	
	public static void main(String[] args) {
		Trans[] trans = new Trans[4];
		trans[0] = new Train(5, 100, 200);				// �θ�Ÿ���� �ν��Ͻ��� �ڽ��� �ν��Ͻ��� �ִ´�? -> ������ ����!
		trans[1] = new Express(10, 100, 100);
		trans[2] = new Taxi(2, 10, 500);
		trans[3] = new Train(1, 100, 200);
		
		Express ex = new Express(1, 10, 500);
		System.out.println("��� : "+ex.getStartStation() + "\t���� : "+ex.getEndStation());
		for (Trans tran : trans) {
			printCharge(tran);
			System.out.println();
		}
		

		
	}
}
