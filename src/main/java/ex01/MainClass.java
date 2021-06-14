package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
		SpringTest t = (SpringTest)ctx.getBean("test01");
		
		t.method1();
		
		SpringTest t2 = ctx.getBean("test01" ,SpringTest.class); //이렇게 해주면 클래스 캐스팅이 일어나지 않아도 된다
		
		t2.method1();
		
//		//xml파일에서 bean을 만들때 scope를 prototype으로 넣어주게되면 기존에 싱글톤방식에서 벗어나 다른속성을 가진 객체를 생성해낸다. 
				
		System.out.println(t == t2); // 아무속성을 적지 않으면(프로토타입으로 적을 수도 있음)자동으로 싱글톤 형식으로 생성됩니다. 
	}
}
