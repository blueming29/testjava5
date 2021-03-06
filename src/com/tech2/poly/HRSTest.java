package com.tech2.poly;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	int num_project;
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Manager extends Employee {
	int num_team;
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
	// calcBonus는 자동으로 default
	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {
	public static void calcTax(Employee e) { // Employee 라는 부모 클래스를 받아 오면서 다형성 적용 가능
		// System.out.println("소득세를 계산합니다.");
//		System.out.println("Salesman 비교 : " + (e instanceof Salesman));
		if (e instanceof Salesman) {
			Salesman s = (Salesman) e;
			s.annual_sales = 6500000;
			System.out.println("Salesman 입니다. "+s.annual_sales);
		} else if (e instanceof Manager) {
			Manager m = (Manager) e;
			m.num_team = 5;
			System.out.println("Manager 입니다. "+m.num_team);
		} else if (e instanceof Consultant) {
			Consultant c = (Consultant) e;
			c.num_project = 35;
			System.out.println("Consultant 입니다. " + c.num_project);
		} else {
			System.out.println("Employee 입니다.");
		}

	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
//		Director d = new Director();

//		Object[] arr = new Object[3];

//		arr[0] = s;
//		arr[1] = c;
//		arr[2] = d;

		// calcTax(arr[0]);
		// calcTax(arr[1]);
		// calcTax(arr[2]);
//		for (Object object : arr) {
//			calcTax((Employee) object);
//		}
		
//		calcTax(d);

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		// s.calcSalary();
		// s.calcBonus();
		//
		// c.calcSalary();
		// c.calcBonus();
		//
		// d.calcSalary();
		// d.calcBonus();

		// calcTax(s); // 다형성 적용
		// calcTax(c); // 다형성 적용
		// calcTax(d); // 다형성 적용

		// System.out.println(s.toString());
		// System.out.println(c.toString());
		// System.out.println(d.toString()); // 해시코드 출력!
		//
		// Salesman s2 = s;
		// System.out.println(s2.toString());
		
		calcTax(s);
		calcTax(m);
		calcTax(c);

	}
}
