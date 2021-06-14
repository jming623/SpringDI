package ex05;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("collection-context.xml");
		
		Customer cus = (Customer)ctx.getBean("customer");
		
		/* 컬렉션 list */
		List<String> list = cus.getLists();
		
		for(String s : list) {
			System.out.println(s);
		}
		
		/* 컬렉션 list객체타입 */
		List<MemberVO> vo = cus.getVo();
		
		for(MemberVO i : vo) {
			System.out.println(i.getId());
			System.out.println(i.getName());
		}
		
		/* 컬렉션 Map객체타입 */
		Map<String, Object> map = cus.getMaps();
		Set<Entry<String, Object>> listMap =  map.entrySet();

		
		for(Entry<String, Object> i:listMap) {
			System.out.println(i.getKey());
						
			if(i.getValue() instanceof String) {
				String str = (String)i.getValue();
				System.out.println(str);
				
			}else if(i.getValue() instanceof MemberVO) {
				
				MemberVO VO = (MemberVO)i.getValue();
				System.out.println("아이디:"+VO.getId());
				System.out.println("이름:"+VO.getName());				
			}else {
				System.out.println("그럼뭐여");
			}
			
			
			/* 오류발생 (추후수정) */
		}
	}
}
