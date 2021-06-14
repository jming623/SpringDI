package ex08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex01.SpringTest;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext("JavaConfig.class");
		
		SpringTest st = ctx.getBean("test1", SpringTest.class);
		st.method1();
		/*아직 미완성*/
	}
}
