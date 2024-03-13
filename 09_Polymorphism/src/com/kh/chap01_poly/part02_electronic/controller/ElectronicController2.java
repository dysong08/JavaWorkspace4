package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

//다형성 적용후
public class ElectronicController2 {

//	private Electronic e;
//	private Electronic e2;
//	private Electronic e3;
	
	
	private Electronic[] elec = new Electronic[3];
	
	
	//for문 하나로 모든 insert문을 출력하기						
	public void insert(Electronic e) {	//Electronic e -> 데스크탑, 노트북, 태블릿을 담을수 있는 매개변수
		for(int i = 0 ; i < elec.length; i++) {					//업캐스팅(자동형변형)됨
			if(elec[i] == null){
				elec[i] = e;
				break;
			}
		}
	}
	
	
	//for문 하나로 모든 select문을 출력하기	
	public Electronic[] select() {
		return elec;
	}
	
	
	
	
	
	
}
