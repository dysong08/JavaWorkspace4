package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {

	private int z;
	
	public Child1() {}
	
	
	public Child1(int x, int y, int z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + ", z : " + z; 
	}
	
	public void printChild1() {
		System.out.println("첫번째 자식에서 호출됨");
	}

	
	@Override
	public void print() {
		System.out.println("첫번째자식 클래스에서호출");
		
	}
	
}
