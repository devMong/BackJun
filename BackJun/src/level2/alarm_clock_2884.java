package level2;

import java.util.Scanner;

public class alarm_clock_2884 {
	public static void main(String[] args) {
		int h, m;
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		sc.close();
		
		if(h > 0) {
			if(m < 45) {
				System.out.println((h-1) + " " + ((m-45)+60));

			} else if(m > 45){
				System.out.println(h + " " + (m-45));
			
			}
		} else {
			if(m < 45) {
				System.out.println((h+23) + " " + ((m-45)+60));
				
			} else if(m > 45) {
				System.out.println((h+23) + " " + (m-45));
				
			}
		}
	}
}
