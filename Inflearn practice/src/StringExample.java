
public class StringExample {
	public static void main(String[] args) {
		System.out.println("나는 문자열~");
		System.out.println('나');
		
		System.out.println("안녕, 나는 \"자바\"야.");
		
		System.out.println("치킨은 살 안 쪄요, \n살은 내가 쪄요.");
		
		/*여러 줄의 주석을 표시해봅시다
		 아아아아~~~ 
		 */
		
		
		String chicken = "치킨은 살 안쪄요~ ";
		String me = "살은 내가 쪄요";
		
		String chickenAndMe= chicken + me;
		System.out.println(chickenAndMe);
		
		
		System.out.println(me.length()); //공백까지 세어준다
		int length = me.length();
		System.out.println(length);
		
		
		//replaceAll
		System.out.println(me.replaceAll("내가", "치킨이"));
		
		String replaced = me.replaceAll("내가", "다시 내가");
		System.out.println(replaced);
		
		
		//문자열 자르기, substring(시작점,끝점[끝점은 포함하지 않음])<--위치번호는 0부터 시작합니다
		
		String birthday = "1970/01/02";
		String year = birthday.substring(0,4);
		String day = birthday.substring(8);
		System.out.println(year+"/"+day);
		
}
}
