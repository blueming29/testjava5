package com.tech1.trans;

public class Express extends Trans implements Start, End {
	// ���ջ��(class,interface), ���߻��(�������̽� Start,End)
	private int eDan;

	public Express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis);
		this.eDan = eDan;
	}

	@Override
	public int getCharge() {
		return cusCnt * dis * eDan;
	}

	@Override
	public String getStartStation() {
		return "����";
	}

	@Override
	public String getEndStation() {
		return "�λ�";
	}

}
