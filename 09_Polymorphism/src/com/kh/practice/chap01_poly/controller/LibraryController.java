package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {

	
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	
	{	 //초기화블럭
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		}

	
	
	
	public void insertMember(Member mem) {
		//전달받은 mem 주소값을 통해 LibraryController의 mem에 대입
		this.mem = mem;
	}
	
	
	public Member myInfo() {
		//회원 레퍼런스(mem) 주소값 리턴
		return mem;
	}
	
	
	public Book[] selectAll()  {
		// 도서 전체 목록 (bList) 주소값 리턴
		return bList;
	}
	
	
	public Book[] searchBook(String keyword) {
//		전달받은 키워드가 포함된 도서가 여러 개가 존재할 수 있으니 
//		검색된 도서를 담아줄 Book 객체 배열을 새로이 생성하고
//		for문을 통해 bList 안의 도서들과 전달받은 키워드를 비교하여 포함하고 있는 경우 
//		새로운 배열에 차곡차곡 담기
//		→ 그 배열 주소 값 리턴

//		검색 결과를 담아줄 새로운 Book 객체 배열 생성
//		검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
//		for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
//		문자열 내부에서 비교문자열과 비교했을때 비교문자열이 포함되어 있다면 true / false 반환
//		전달받은 keyword를 포함하고 있으면 -> HINT : String 클래스의 contains() 참고
//		검색결과의 도서목록에 담기 HINT : count 이용
//		해당 검색결과의 도서목록 주소 값 리턴
//		keyword.equals("a") // contains() 포함 "문자열".contains("비교문자열")
		
		
		Book[] arr = new Book[5];
		int count = 0;
		
		for(int i = 0; i < bList.length; i++) {
			// 책의 제목 -> CookBoook 혹은 AniBook의 title필드
			// title.contains(keyword)
			
			// 원피스 원
			if(bList[i].getTitle().contains(keyword)) {
				arr[count++] = bList[i];
			}

		}
		
		return arr;
		
	}
	
	
	
	
	public int rentBook(int index) {
//		result를 0으로 초기화 한 후 
//		전달받은 인덱스의 도서가 만화책인 경우	회원의 나이와 해당 만화책의 제한	나이를 비교하여 
//		회원 나이가 더 적은 경우 result를 1로 초기화
//		아니면 전달받은 인덱스의 도서가 요리책인 경우 해당 요리책의 쿠폰 유무가 유일 경우 
//		회원의 couponCount를 1증가 시킨 후 result 2로 초기화
//		→ result 리턴
		
		int result = 0;

		if (bList[index] instanceof AniBook) {
		//현재 참조하고 있는 레퍼런스 변수가 어떤 	AniBook이 맞는지 확인

			if (mem.getAge() < ((AniBook) bList[index]).getAccessAge()) {

				result = 1;
			}

		} else if (((CookBook) bList[index]).isCoupon()) {

			mem.setCouponCount(mem.getCouponCount() + 1);
			result = 2;
		}
				
		return result;

		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

