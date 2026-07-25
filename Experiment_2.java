import java.util.Scanner;

public class Experiment_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number of Students:");
		int n = sc.nextInt();
		System.out.println("-----------------------------------------");
		System.out.print("Enter a number of Subject:");
		int m = sc.nextInt();
		
		int[][] marks = new int[n][m];
		
		System.out.println("-----------------------------------------");
		System.out.println("Enter a Marks:");
		for(int i = 0; i < n; i++ ) {
			System.out.println("------------------Student:"+ (i + 1)+"-----------------");
			for(int j = 0; j < m; j++) {
				System.out.print("Subject"+ (j + 1) + "=");
				marks[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Avarage marks of Each Students:");
		for(int i = 0; i < n; i++  ) {
			int sum = 0;
			for(int j = 0; j < m; j++) {
				sum += marks[i][j];
			}
		double avg = (double) sum / n;
		System.out.println("Student "+(i + 1)+"="+avg);
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Highest Marks in Each Subject:");
		for (int j = 0; j < m; j++) {
            int highest = marks[0][j];
            for (int i = 1; i < n; i++) {
                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }
            }
			System.out.println("Subject "+(j + 1)+ " = " +highest);
		}
	}

}
