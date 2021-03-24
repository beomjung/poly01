package Codeup;

import java.util.Scanner;

public class Codeup1023 {

	public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
		
		String a = scr.nextLine();
		
		String[]arr= a.split("\\.");
		
		
		String A = arr[0];
		String b = arr[1];

		System.out.print(A + "\n" + b);
	}

}
