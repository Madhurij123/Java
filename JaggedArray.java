
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][] = new int[3][];
		
		num[0] = new int[3];
		num[1] = new int[4];
		num[2] = new int[2];
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length;j++) {
				num[i][j]= (int)(Math.random() * 100);
			}
		}
		
		//traversing using for loop
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		//Traversing using for - each loop
		
		for(int n[] : num) {
			for(int a : n) {
				System.out.print(a+" ");
			}
			System.out.println( );
		}


	}

}
