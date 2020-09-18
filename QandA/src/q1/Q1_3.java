package q1;

import java.util.*;

public class Q1_3 {

	/*
	 * URLify: Write a method to replace all spaces in a string with '%2e: You may
	 * assume that the string has sufficient space at the end to hold the additional
	 * characters, and that you are given the "true" length of the string. (Note: if
	 * implementing in Java, please use a character array so that you can perform
	 * this operation in place.) EXAMPLE Input: "Mr John Smith JJ, 13 Output:
	 * "Mr%2eJohn%2eSmith"
	 */
	public static void main(String[] args) {

		int lengLocation = 0;
		
		Scanner in = new Scanner(System.in);

		System.out.print("Input: ");
		String str = in.nextLine();

		for (int i =0; i < str.length(); i++) {
			if (str.charAt(i) == ',') lengLocation = i + 2;
		}		
		
		int leng = Integer.parseInt(str.substring(lengLocation));
		
		char[] letter = new char[leng];

		for (int i = 0; i < leng; i++) {
			letter[i] = str.charAt(i);
		}

		for (int i = 0; i < leng; i++) {
			if (letter[i] == ' ')
				System.out.print("%2e");
			else
				System.out.print(letter[i]);
		}
	}
}
