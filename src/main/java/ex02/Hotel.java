package ex02;

public class Hotel {
	
	//호텔 객체는 멤버로 쉐프를 가지고있고 생성될때 chef를 매개변수로 받아 초기화한다.
	//의존성 주입 1번째 방법 - 생성자를 통한 의존성 주입
	
	//멤버변수
	private Chef chef;
	
	//생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
}
