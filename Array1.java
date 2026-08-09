package day1;


public class Array1 {

	public static void main(String[] args) {

    //	int[][] arr = new int[2][2];
		int[][] arr = new int[][] {{1,2,3},{6,4}};
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
