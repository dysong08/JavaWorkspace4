package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {

	
	
	private String babyBirth;	//아기의 탄생여부 : 출산 입양 없음
	
	
	public Mother() {
		
	}


	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}


	public String getBabyBirth() {
		return babyBirth;
	}


	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}


	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + ", toString()=" + super.toString() + "]";
	}


	@Override
	public void eat() {
		// 엄마가 밥을 먹으면 ? 
		// 몸무게 10 증가, 건강도 10 감소
	
		super.setWeight(super.getWeight()+10);	//수정할 몸무게는 기존몸무게 +10
		super.setHealth(super.getHealth()-10);	//수정할 건강은 기존건강 -10
		
		
	}


	@Override
	public void sleep() {
		// 잠을 자면?
		// 건강도 10 증가
		
		super.setHealth(super.getHealth()+10);
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
