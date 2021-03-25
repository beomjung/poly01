package Codeup;

import java.util.Scanner;

public class Codeup1024 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		String a = scr.nextLine();
		char [] word = a.toCharArray();
		for(int i=0; i<word.length; i++) {
			System.out.println("'"+word[i]+"'" );
		}
		

	}

}
