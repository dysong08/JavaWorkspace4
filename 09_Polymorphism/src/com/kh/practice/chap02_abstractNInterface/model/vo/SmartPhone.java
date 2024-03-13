package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements TouchDisplay, CellPhone {

	private String maker;

	public SmartPhone() {

	}

	public void setMaker(String maker) {

		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}

	public abstract String printInformation();

}
