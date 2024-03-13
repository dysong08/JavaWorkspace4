package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	public GalaxyNote9() {
		// 기본 생성자 부모에게 상속받은 maker 필드를 “삼성”으로 초기화

		super.setMaker("삼성");
	}

	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	public String takeCall() {
		return "수신 버튼을 누름";
	}

	public String picture() {
		return "1200만 듀얼 카메라";
	}

	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}

	public String touch() {
		return "정전식, 와콤펜 지원";
	}

	public boolean bluetoothPen() {
		return true;
	}

	public String printInformation() {
		// 실행 화면을 참조하여 오버라이딩

		String result = "갤럭시 노트9는 " + super.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n";
		result += makeCall() + "\n";
		result += takeCall() + "\n";
		result += picture() + "\n";
		result += charge() + "\n";
		result += touch() + "\n";
		result += "블루투스 펜 탑재 여부 : " + bluetoothPen();

		return result;
	}

}
