package com.tech1.trans;

public class Express extends Trans implements Start, End {
	// 복합상속(class,interface), 다중상속(인터페이스 Start,End)
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
		return "서울";
	}

	@Override
	public String getEndStation() {
		return "부산";
	}

}
