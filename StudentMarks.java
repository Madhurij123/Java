import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students and subjects
        System.out.print("Enter the number of students: ");
        int N = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int M = sc.nextInt();

        int[][] marks = new int[N][M];

        // Input marks
        System.out.println("\nEnter the marks:");
        for (int i = 0; i < N; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < M; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculate and display average marks for each student
        System.out.println("\nAverage Marks of Each Student:");
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += marks[i][j];
            }
            double average = (double) sum / M;
            System.out.printf("Student %d = %.2f%n", (i + 1), average);
        }

        // Find and display highest marks in each subject
        System.out.println("\nHighest Marks in Each Subject:");
        for (int j = 0; j < M; j++) {
            int highest = marks[0][j];
            for (int i = 1; i < N; i++) {
                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }
            }
            System.out.println("Subject " + (j + 1) + " = " + highest);
        }

        sc.close();
    }
}