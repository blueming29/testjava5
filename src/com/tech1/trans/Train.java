package com.tech1.trans;

public class Train extends Trans {		// 부모클래스에 생성자 만들면
	private int tDan;					// 자식클래스에도 생성자 만들어야됨

	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis);
		this.tDan = tDan;
	}

	@Override
	public int getCharge() {
		return cusCnt * dis * tDan;
	}

}
