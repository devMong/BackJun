package level1;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 방법
		int a = sc.nextInt();
		String b = sc.next();
		sc.close();
		
		/**
		 * nextInt() : int 값을 읽는다.
		 * next() : String 값을 읽는다.
		 * close() : 사용한 시스템 자원을 반납하고, 출력 스트림을 닫는다.
		 */
		
		System.out.println(a * (b.charAt(2) - '0'));
		System.out.println(a * (b.charAt(1) - '0'));
		System.out.println(a * (b.charAt(0) - '0'));
		System.out.println(a * Integer.parseInt(b));
		
	}
}
