﻿package ex07;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//퀴즈입니다
		//1. autowiredQuiz-context.xml에 Monitor, Mouse, Keyboard, Computer 빈을 생성후, 
		//2. Computer 클래스에서 자동 주입하세요.
		//3. xml에서 빈을 얻은 후 computerInfo() 메서드를 실행하세요
	
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("autowired-context.xml");
				
		Computer com = (Computer)ctx.getBean("com");
		
		com.computerInfo();
		

		
	}
}
