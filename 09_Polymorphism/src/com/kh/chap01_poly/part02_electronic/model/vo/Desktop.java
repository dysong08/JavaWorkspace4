package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic {

	
	public static final String CPU = "intel";	// 상수필드는 getter/setter 메서드 생성XXXX
	private String graphic;
	
	
	public Desktop() {
		
	}


	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}


	public String getGraphic() {
		return graphic;
	}


	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}


	@Override
	public String toString() {
		return "Desktop [graphic=" + graphic + ", toString()=" + super.toString() + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
}
