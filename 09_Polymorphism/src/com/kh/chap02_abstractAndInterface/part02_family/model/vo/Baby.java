package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person {

	public Baby() {

	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHealth()=" + getHealth()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public void eat() {
		// 몸무게 3증가 / 건강도 1증가
		
		super.setWeight(super.getWeight()+3);
		super.setHealth(super.getHealth()+1);
		
	}

	@Override
	public void sleep() {
		// 건강 3증가
		
		super.setHealth(super.getHealth()+3);
		
	}

}
