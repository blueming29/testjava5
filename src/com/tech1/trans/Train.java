package com.tech1.trans;

public class Train extends Trans {		// �θ�Ŭ������ ������ �����
	private int tDan;					// �ڽ�Ŭ�������� ������ �����ߵ�

	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis);
		this.tDan = tDan;
	}

	@Override
	public int getCharge() {
		return cusCnt * dis * tDan;
	}

}
