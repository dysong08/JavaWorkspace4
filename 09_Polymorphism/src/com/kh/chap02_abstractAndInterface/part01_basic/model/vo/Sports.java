package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract  class Sports {

	
	private int people; 	//스포츠에 참여하는 선수 명 수
	
	public Sports() {
		
	}
	
	
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public String toString() {
		return "people : " + people;
	}
	
	
	
//	몸통부가 존재하지 않는 미완성 메서드 == 추상메서드
//	몸통부가 없는 미완성 메서드를 정의하고자 한다면 abstract 예약어를 사용해야 한다.
//	
//	미완성 메서드가 하나라도 현재 클래스에 포함되는 순간, 해당 클래스 또한 미완성 클래스가 된다.
//	따라서, 클래스명 앞에도 abstract 예약어를 명시해야 한다.
	
	
	
	
	@Override
	public abstract void rule() ;
	
	
//	미완성된 클래스인 추상클래스를 상속받게 되면, 
//	부모클래스에 있는 미완성된 메서드(추상메서드)를 강제러 오버라이딩 해줘서 완성시켜야 함
	
	
	
	
	
	
	
	
	
	
	
	
}
