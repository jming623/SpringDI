package ex06;

import javax.annotation.Resource;

public class Printer2 {

	/*
	 * 자바 1.8 어노테이션
	 * @Resource -> 이름으로 찾아서 주입 -> 타입으로 찾아서 주입
	 * 
	 * Resource의 빈객체 강제연결은 
	 * name속성을 사용하면 됩니다.
	*/
	
	//멤버변수
	@Resource(name="doc2")
	private Document document;
	
	//기본생성자	
	public Printer2() {
		
	}
	
	//생성자
	public Printer2(Document document) {
		this.document = document;
	}
	
	//getter,setter
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	
}
