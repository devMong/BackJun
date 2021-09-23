package level3_for;

import java.util.Scanner;

public class sec_10950 {
	public static void main(String[] args) {
		/**
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. A + B - 3 | A+B를 여러 번 출력하는 문제
		 */

		Scanner sc = new Scanner(System.in);

		int t, a, b;

		t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println(a + b);
		}
		
		sc.close();

	}
}
