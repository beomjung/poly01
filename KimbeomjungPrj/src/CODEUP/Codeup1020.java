package CODEUP;

import java.util.Scanner;

public class Codeup1020 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		String a = scr.nextLine();
		
		String[]arr= a.split("-");
		
		String A = arr[0];
		String b = arr[1];
		// ¼öÁ¤    
		System.out.println(A+b);
	}

}
