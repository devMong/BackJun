package level2;

import java.util.Scanner;

public class leap_year_2753 {

	public static void main(String[] args) {

		int y;
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();

		// 1. 윤년은 4의 배수 거나, 400의 배수 일 때 1을 출력
		// 2. 100의 배수 일 경우, 0을 출력
		
		sc.close();
		
		if (y % 4 == 0) {
			if (y % 400 == 0) {
				System.out.println("1");
			} else if (y % 100 == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");				
			}
		} else {
			System.out.println("0");
		}

	}
}
