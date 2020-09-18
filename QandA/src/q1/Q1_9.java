package q1;

import java.util.*;

public class Q1_9 {

	/*
	 * String Rotation: Assume you have a method isSubst ring which checks if one
	 * word is a substring of another. Given two strings, 51 and 52, write code to
	 * check if 52 is a rotation of 51 using only one call to isSubstring (e.g.,
	 * "waterbottle" is a rotation of"erbottlewat"). Hints: #34, #88, #104
	 */

	public static void main(String[] args) {
		
		String word = "waterbottle";
		String InputWord = "erbottlewat";
		int leng = word.length();
		boolean same = false;

		char[] _word = new char[leng];
		char[] _InputWord = new char[leng];
		char[] checkedWord = new char[leng];

		for (int i = 0; i < leng; i++) {
			_word[i] = word.charAt(i);
			_InputWord[i] = word.charAt(i);
		}

		for (int i = 0; i < leng; i++) {			
			checkedWord = isSubstring(_InputWord, leng, leng - i);			
			if (Arrays.equals(_word, checkedWord)) same=true;			
		}
		
		if (same) System.out.print("It's rotated.");
		else System.out.print("It's NOT rotated.");
	}

	public static char[] isSubstring(char[] _InputWord, int leng, int index) {

		char[] rotatedWord = new char[leng];
		
		char temp;
		
		temp = _InputWord[index];
		
		for (int i=0; i < leng; i++)
		{
			_InputWord[leng - i] = _InputWord[leng - i + 1];
		}
		
		_InputWord[index - 1] = temp;		
				
		return rotatedWord;
	}

}
