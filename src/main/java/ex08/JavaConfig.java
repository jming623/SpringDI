package ex08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

/*
 * xml설정파일을 자바파일로 사용하기. 
 * Configuration이 붙은 클래스를 스프링 설정파일로 사용함.
 */
@Configuration
public class JavaConfig {
	
	//@Bean 을 이용해서 메서드를 스프링컨테이너의 bean처럼 사용합니다.
	//<bean id="test01" class="ex01.SpringTest"/> 아래구문은 현재구문을 자바에서 표현한 방법이다.
	
	@Bean
	public SpringTest test1() {
		return new SpringTest();
	}
	
	//=====================================================================
	
	/*<bean id="chef" class="ex02.Chef"></bean>
	
	<bean id="hotel" class="ex02.Hotel">
		<constructor-arg ref="chef"/>
	</bean>*/
	
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Hotel hotel() {
		return new Hotel(chef()); //chef()는 위에서 선언된 new Chef()와 같다.
	}
	
	//=====================================================================
	
	/*<bean id="dev" class="ex03.DatabaseDev">
	<property name="url" value="데이터베이스주소"/>
	<property name="uid" value="데이터베이스아이디"/>
	<property name="upw" value="데이터베이스비밀번호"/>		
	</bean>*/
	
	@Bean
	public DatabaseDev dev() {
		
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("DB주소");
		dev.setUid("DB아이디");
		dev.setUpw("DB비밀번호");
	
		return dev;
	}
	
	//=====================================================================
	/*<bean id="memberDAO" class="ex03.MemberDAO">
	<property name="dev" ref="dev"></property>
	</bean>*/
	
	@Bean
	public MemberDAO memberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDev(dev());
		
		return dao;
	}
	
}
