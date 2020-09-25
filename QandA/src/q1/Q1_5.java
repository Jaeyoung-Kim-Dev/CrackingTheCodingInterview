package q1;

public class Q1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "pale";
		String newWord = "ple";		
		int leng =word.length();
		int newLeng = newWord.length();
		
		int errorCounter = 0;
		
		char[] _word = new char[leng];
		char[] _newWord = new char[newLeng];
		
		if (leng != newLeng) errorCounter++;		
		
		for (int i =0; i < leng; i++) {			
			for (int j = 0; j < newLeng; j++) {
				if (_word[i] == _newWord[j]) {
					
				}
				
			}
		}
		
		if (errorCounter > 2) {
			System.out.println("False");			
		} else {
			System.out.println("True");
		}		
	}
}
