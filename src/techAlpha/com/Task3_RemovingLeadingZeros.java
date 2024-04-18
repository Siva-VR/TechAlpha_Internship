package techAlpha.com;

import java.util.Scanner;

public class Task3_RemovingLeadingZeros {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String that contains leading zeros");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!='0') {
				System.out.println(s.substring(i));
				break;
			}
		}
		sc.close();
	}

}
