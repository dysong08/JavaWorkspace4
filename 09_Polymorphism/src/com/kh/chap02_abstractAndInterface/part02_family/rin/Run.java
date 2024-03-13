package com.kh.chap02_abstractAndInterface.part02_family.rin;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.*;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public class Run {

	public static void main(String[] args) {

//		//인터페이스 적용 전
//		
//		//Person p = new Person(); 		// error
//		
//		Person p1 = new Mother("정선이", 50, 50, "출산");
//		Person p2 = new Baby("박애기", 3.5, 60);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.eat();		// 60 40
//		p1.sleep();		// 60 50
//		
//		p2.sleep();		// 6.5 61
//		p2.eat();		// 6.5 64
//		
//		
//		System.out.println("다음날");
//		
//		System.out.println(p1);	-> toString() 호출
//		System.out.println(p2);	-> toString() 호출
		
		
		
		
		//인터페이스 적용 후
		
	//	Basic b1 = new Basic();		//error
		
		Basic b1 = new Mother("정선이", 50, 50, "출산");
		Basic b2 = new Baby("박애기", 3.5, 60);
		
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		
//		클래스에서 클래스를 상속 받을때 : extends 클래스(단일상속만 가능) : 화살표 실선
//		클래스에서 인터페이스를 구현할때 : implements 인터페이스, 인터페이스(다중구현가능) : 화살표 점선
//		인터페이스에서 인터페이스를 상속 : extends 인터페이스, 인터페이스(다중상속가능) : 화살표 실선
//		
//		
//				|		추상클래스		|		인터페이스
//		====================================================================
//		상속개수	|		단일상속		|		다중상속
//		---------------------------------------------------------
//		키워드	|		extends		|		implements
//		---------------------------------------------------------
//		추상메서드	|	추상메서드 0개 이상	|		모든메서드가 추상메서드
//		표현법/개수	|	명시적 abstract기술	|		묵시적으로 abstract기술
//		---------------------------------------------------------
//		일반메서드	|		O			|			X
//		---------------------------------------------------------
//		필	드	|	일반필드 가질수 있음	|	상수필드만 가질수 있음(묵시적 static final)
//		=====================================================================
//		
//		배운순서
//		
//		extends 일반클래스 -> extends 추상클래스 -> implements 인터페이스
//		---------------------------------------------------------
//			뒤로 갈수록 기능구현의 강제성이 더 짙어진다.
		
		
		
		
		
		
		
		
		
		
	}

}
