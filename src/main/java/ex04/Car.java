package ex04;

public class Car {
	
	private IBattery battery;
	
	public Car(IBattery battery) {
		this.battery = battery;
	}
	
	//getter (Car객체를 통해 battery객체를 호출하기 위해 getter메서드가 선언되어야 한다.)
	//getter메서드가 없다면? private으로 선언된 멤버변수 battery에 담긴 배터리 객체를 가져나올 방법이 없어지게 된다.  
	public IBattery getBattery() {
		return battery;
	}
}
