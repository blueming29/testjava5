package com.tech1.trans;

public abstract class Trans {
	// protected는 같은 패키지 안에서는 사용가능
	protected int cusCnt;	// 인원	
	protected int dis;		// 이동거리

	public Trans(int cusCnt, int dis) {
		this.cusCnt = cusCnt;
		this.dis = dis;
	}
	
	public abstract int getCharge();
	
	@Override
	public String toString() {
		return cusCnt + "\t:\t" + dis;
	}
	
}
