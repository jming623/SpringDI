package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {

	/*
	 * @Autowired -> 타입으로 자동주입명령 
	 * 
	 * -생성자, 세터, 멤버변수에 적용이가능
	 * 
	 * required = false는 
	 * 스피링이 주입할 빈이 없으면 에러를 발생시키는데,
	 * 이를 무시하고 지나가겠다는 속성입니다.(단 기본 생성자가 반드시 필요)
	 * 
	 * Qualifier("id값") - 빈 강제 연결
	 * 컨테이너에서 동일 객체가 여러개 있을 때, 어느 객체를 주입할지 선택해주는 어노테이션
	 */
	
	
	//@Au 에 ctrl+space하면 자동완성에 import까지해줌
	@Autowired(required = false)
	@Qualifier("doc1")
	private Document document;
	
	public Printer() {
		// @Autowired(required=false)를 사용하려면 기본생성자를 꼭 선언해주어야 합니다.
	}
		
	
	//@Autowired이곳도 사용가능 //이곳에서는 Qualifier을 사용할 수 없다.
	public Printer(Document document) {
		this.document = document;
	}

	public Document getDocument() {
		return document;
	}
	
	//@Autowired이곳도 사용가능 
	public void setDocument(Document document) {
		this.document = document;
	}
	
	
}
