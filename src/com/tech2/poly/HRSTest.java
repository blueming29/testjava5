package com.tech2.poly;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}

	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}

	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
	}
}

abstract class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
	// calcBonus�� �ڵ����� default
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
	}
}

public class HRSTest {
	public static void calcTax(Employee e) { // Employee ��� �θ� Ŭ������ �޾� ���鼭 ������ ���� ����
		// System.out.println("�ҵ漼�� ����մϴ�.");
		System.out.println("Salesman �� : " + (e instanceof Salesman));
		if (e instanceof Salesman) {
			System.out.println("Salesman �Դϴ�.");
		} else if (e instanceof Manager) {
			System.out.println("Manager �Դϴ�.");
		} else if (e instanceof Consultant) {
			System.out.println("Consultant �Դϴ�.");
		}

	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();

		Object[] arr = new Object[3];

		arr[0] = s;
		arr[1] = c;
		arr[2] = d;

		// calcTax(arr[0]);
		// calcTax(arr[1]);
		// calcTax(arr[2]);
//		for (Object object : arr) {
//			calcTax((Employee) object);
//		}
		
		calcTax(d);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// s.calcSalary();
		// s.calcBonus();
		//
		// c.calcSalary();
		// c.calcBonus();
		//
		// d.calcSalary();
		// d.calcBonus();

		// calcTax(s); // ������ ����
		// calcTax(c); // ������ ����
		// calcTax(d); // ������ ����

		// System.out.println(s.toString());
		// System.out.println(c.toString());
		// System.out.println(d.toString()); // �ؽ��ڵ� ���!
		//
		// Salesman s2 = s;
		// System.out.println(s2.toString());

	}
}
