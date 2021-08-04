package test;

import java.util.Scanner;

public class tsest {
	public static void main(String[] args) {
		int a;
		String b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.next();
		sc.close();
		
		System.out.println(a * (b.charAt(2) - '0'));
		System.out.println(a * (b.charAt(1) - '0'));
		System.out.println(a * (b.charAt(0) - '0'));
		System.out.println(a * Integer.parseInt(b));
		
	}
}
