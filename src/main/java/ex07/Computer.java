package ex07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	
	@Autowired
	private Mouse mouse;
	
	@Resource(name="kb")
	private Keyboard kb;
	
	@Autowired
	@Qualifier("mt")
	private Monitor monitor;
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
	
	
	
	
	
	
	
}
