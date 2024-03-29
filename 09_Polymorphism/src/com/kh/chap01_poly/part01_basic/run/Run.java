package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.*;

public class Run {

	public static void main(String[] args) {

		
		
		System.out.println("1. 부모타입 레퍼런스 변수로 부모타입 객체 다루기");
		
		Parent p1 = new Parent();
		
		p1.printParent();  		//p1참조형 변수로 Parent에 접근가능
		
		
		System.out.println("2. 자식타입 레퍼런스 변수로 자식타입 객체 다루기");
		Child1 c1 = new Child1();	//생성자에 슈퍼클래스 생성자 호출하는 구문이 항상 자동으로 들어가있음.
		c1.printChild1();		//첫번째 자식에서 호출됨
		c1.printParent();		//부모클래스에서 호출됨(부모클래스에서 상속받음)
		// ||
		// == ((Parent)c1).printParent();  <- 부모클래스의 메서드에 접근할때는 부모클래스 참조자료형 변수로 자동형변환됨
		
		
//		Child1 레퍼런스변수로 Parent, Child1에 있는 필드 및 메서드 둘다 접근 가능
//		Child1 레퍼런스변수가 Parent에 있는 메서드에 접근시 자동으로 "형변환"이 진행됨
//		
//		자식에서 부모클래스로는 자동형변환(업캐스팅) ->작은것에서 큰것으로 형변환 된 것과 같은 이치
		
		
		
		System.out.println("3. 부모타입 레퍼런스 변수로 자식타입 객체 다루기(다형성 적용)");
		
		
		Parent p2 = new Child1();
		
//	*** 다형성
//		= 연산자 기준으로 왼쪽과 오른쪽 자료형이 다름.
//		오른쪽의 자식클래스가 Parent 자료형으로 자동형변환이 되고있기 때문에 오류가 없음
//		즉, 상속구조에서는 클래스간의 형변환이 가능하다.
//		***
		
//		p2.printParent();	//부모클래스 참조형 변수로 Parent클래스 내부 메서드 참조(이상없음)
//	//	p2.printChild1(); 	// 
//		((Child1)p2).printChild1();  //자식개체로 접근하고 싶을때는 Child자료형으로 강제형변환해야 함.
		
		
//		클래스 간에도 형변환 가능(단, 상속구조일 경우에만)
//		
//		1. UpCasting
//			자식타입 -> 부모타입으로 형변환
//			생략가능(자동형변환 개념)
//			ex)
//			부모변수 = new 자식객체;
//		2. DawnCasting
//			부모타입 -> 자식타입으로 형변환
//			생략불가능(강제형변환 해야 함)
//			ex)
//			((자식)부모)객체.자식메서드();
//			
//			
//		다형성을 사용하는 이유
//		- 부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모클래스 하나로 다룰 수 있음
//		*유지보수, 개발, 편의성을 위함*
		
		
//		다형성의 장점
//		다형성을 배우기 전 Child1 객체 2개를
//		다형성을 배우기 전 Child2 객체 2개를 다룬다
//		객체배열로 관리한다
//		Child1[] arr1 = new Child1[2];
//		arr1[0] = new Child1(1,2,3);
//		arr1[1] = new Child1(4,5,6);
//		
//		Child2[] arr2 = new Child1[2];
//		arr2[0] = new Child1(5,5,5);
//		arr2[1] = new Child1(6,6,6);
		
			
//		다형성이 적용되면 부모타입 레퍼런스 변수 "하나"로 모든 자식객체를 다 받아줄 수 있다.
//		다형성을 접목한 객체배열
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,3);
		arr[1] = new Child1(4,5,6);
		arr[2] = new Child2(5,5,5);
		arr[3] = new Child2(6,6,6);
		//하나의 부모타입으로 모든 자식객체들을 다 받을 수 있다 =>코드수 감소, 생산성 증대, 유지보수 편리
		
		
//		((Child1)arr[0]).printChild1();
//		((Child1)arr[1]).printChild1();
//		((Child2)arr[2]).printChild2();
//		((Child2)arr[3]).printChild2();
		
		
		
		System.out.println("반복문을 활용해서 출력해보기...");
		for(int i = 0; i < arr.length; i++) {
			//현재 참조하고 있는 레퍼런스 변수(Parent)가 실제로 어떤 객체타입(Child1, Child2)을 참조하고 있는지 확인할 수 있는 연산자
			//instanceof 자료형
//			if(arr[i] instanceof Child1) {
//				//arr[i]가 실제로 참조하고 있는 객체타입이 Child1이라면 true, 아니면 false
//				((Child1)arr[i]).printChild1();
//			}else {
//				((Child2)arr[i]).printChild2();
//			}
//		}
		
		System.out.println("=========");
		arr[i].print();
		
//		동적 바인딩 : 프로그램이 실행되기 전에 자동으로 컴파일되면서 정적으로는 현재 레퍼런스변수(Parent)에 메서드를 가리키게 된다
//		 => ctrl+좌클릭 확인
//		 	단, 참조하고 있는 자식클래스에 해당 메서드가 "오버라이딩"되어 있다면 프로그램을 시작할 때는 동적으로 
//		 	자식클래스의 오버라이딩된 메서드를 찾아서 실행하게 됨.
//		 	(실제로 실행시 자식클래스에 재정의된 메서드가 실행 -> 동적바인딩
//		 	 컴파일 단계에서 참조하고 있는 레퍼런스변수의 메서드를 실행한다고 가리키는 것 -> 정적바인딩)
		
		
		 	
		 	
	}

	}
}