import java.util.Scanner;


public class Input {
	public static void main(String[] args) {
		
	/*	Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String input2 = scanner.next();
		String input3 = scanner.next();
		
		System.out.println(input);
		System.out.println(input2);
		System.out.println(input3); */
		
		// 숫자 입력받았을 경우
		
		
		System.out.println("숫자를 하나 입력해주세요");
		
		Scanner testScan = new Scanner(System.in);
		String intInput = testScan.nextLine();
		try {
			int intValue = Integer.parseInt(intInput);
			System.out.println(intValue+1);
		}catch(Exception e) {
			System.out.println("숫자를 입력해줘야 합니다.");
		}
		
		
		
		// 예외처리 try catch 
		
	}
}
