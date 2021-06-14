package ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	
	
//	Chef c = new Chef();
//	Hotel h = new Hotel(c);
	
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
	
		//기존방법
		Chef chef1 = new Chef(); 
		System.out.println(chef1);
		
		//xml파일에 bean으로 생성 <bean id="chef" class="ex02.Chef"></bean>
		Chef chef2 = (Chef)ctx.getBean("chef");		
		System.out.println(chef2);
		
		//////////////////////////////////////////////
		
		//기존방법
		Hotel hotel1 = new Hotel(chef1);
		Chef chef3 = hotel1.getChef();
		chef3.cooking();
		
		/*bean으로 생성
		<bean id="hotel" class="ex02.Hotel">
			<constructor-arg ref="chef"/>
		</bean> */
		
		Hotel h = (Hotel)ctx.getBean("hotel");		
		Chef c = h.getChef();		
		c.cooking();
	
	}	
}
