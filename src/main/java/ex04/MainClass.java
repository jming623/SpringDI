package ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		//1.	
		Battery1 bat1 = (Battery1)ctx.getBean("battery1");
		bat1.energy();
		
		//2.
		Car car = (Car)ctx.getBean("car");
		car.getBattery().energy();
		
		//3.
		Battery2 bat2 = (Battery2)ctx.getBean("battery2");
		bat2.energy();
		
		//4.
		AirPlane ap = (AirPlane)ctx.getBean("airplane");
		ap.getBattary().energy();
	}
}
