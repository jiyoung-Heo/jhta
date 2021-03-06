package day03;

import java.util.Scanner;

/*
 * <for문의 여러형태>
 * 
 * - 무한루프 ->반목문을 무한반복한다.
 *  for(;;){
 *  	반복수행할문장;
 *  	...
 *  }
 *  
 *  - 레이블 지정하기
 *  AA:for(;;){
 *  	for(;;){
 *  		...
 *  		break AA;
 *  	}
 *  }
 */
public class Test12_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for (;;) { // 무한루프
//			System.out.print("아이디 입력: ");
//			String id = sc.next();
//			System.out.print("비밀번호 입력: ");
//			String pw = sc.next();
//			if (id.equals("user") && pw.equals("1234")) {
//				System.out.println(id + "회원님 환영합니다");
//				break;
//			} else {
//				System.out.println("아이디 또는 비밀번호가 맞지 않아요.");
//			}
//		}
		for (;;) {
			System.out.println("단입력(종료하려면 0을 입력하세요)");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println("<" + n + "단>");
			for (int i = 1; i <= 9; i++) {
				System.out.println(n + "*" + i + "=" + (n * i));
			}
		}
	}
}
