package test;

import java.util.Scanner;

public class alarm_test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h, m;

		h = sc.nextInt();
		m = sc.nextInt();

		sc.close();

		if (h == 0) {
			if (m < 45) {
				System.out.println((h + 23) + " " + (m + 15));
			} else {
				System.out.println(h + " " + (m - 45));
			}
		} else {
			if (m < 45) {
				System.out.println((h - 1) + " " + (m + 15));
			} else {
				System.out.println(h + " " + (m - 45));
			}
		}
	}
}
