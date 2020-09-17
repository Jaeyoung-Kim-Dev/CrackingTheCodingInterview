package q1;

import java.util.Scanner;

public class Q1_3_from_book {

	/*
	 * URLify: Write a method to replace all spaces in a string with '%2e: You may
	 * assume that the string has sufficient space at the end to hold the additional
	 * characters, and that you are given the "true" length of the string. (Note: if
	 * implementing in Java, please use a character array so that you can perform
	 * this operation in place.) EXAMPLE Input: "Mr John Smith JJ, 13 Output:
	 * "Mr%2eJohn%2eSmith"
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("String: ");
		String _str = in.nextLine();

		System.out.print("Length: ");
		int trueLength = in.nextInt();

		char str[] = new char[trueLength];

		for (int i = 0; i < trueLength; i++) {
			str[i] = _str.charAt(i);
		}

		char finalStr[] = replaceSpaces(str, trueLength);

		for (int i = 0; i < finalStr.length; i++) {
			System.out.print(finalStr[i]);
		}
	}

	public static char[] replaceSpaces(char[] str, int trueLength) {

		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;
		
		char[] expandedStr = new char[index];

		for (i = trueLength - 1; i > -1 ; i--) {
			if (str[i] == ' ') {
				expandedStr[index - 1] = 'e';
				expandedStr[index - 2] = '2';
				expandedStr[index - 3] = '%';
				index = index - 3;
			} else {
				expandedStr[index - 1] = str[i];
				index--;
			}
		}
		return expandedStr;

	}
}
