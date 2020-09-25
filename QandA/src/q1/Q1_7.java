package q1;

public class Q1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int _arr[][] = new int[3][3];
		
		for (int i=0; i< 3; i++) {
			for (int j =0; j< 3; j++) {				
				_arr[2-j][i] = arr[i][j];				
			}
		}
		
		for (int i=0; i< 3; i++) {
			for (int j =0; j< 3; j++) {
				System.out.print(_arr[i][j]);				
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}


/*
11 13
12 23
13 33

23 32
33 31

32 21
31 11

21 12
22 22
 */


