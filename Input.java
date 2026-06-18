import java.util.Scanner;
public class Input {
	public static void main1(String[] args) {
     int roll_no;
     String name;
     double marks;
     
     Scanner sc = new Scanner(System.in);
    		 
     System.out.println("Enter a Roll No:");
     roll_no = sc.nextInt();
     
     System.out.println("Enter a Name:");
     name = sc.next();
     
     System.out.println("Enter a Marks:");
     marks = sc.nextDouble();
     
     System.out.println("Roll NO:" +roll_no );
     System.out.println("Name:" +name);
     System.out.println("Marks:" +marks);
	}
	
	public static void main(String[] args) {
	     int roll_no;
	     String name;
	     double marks;
	     
	     Scanner sc = new Scanner(System.in);
	    		 
	     System.out.println("Enter a Roll No:");
	     roll_no = sc.nextInt();
	     
	     sc.nextLine();
	     
	     System.out.println("Enter a Name:");
	     name = sc.nextLine();
	     
	     System.out.println("Enter a Marks:");
	     marks = sc.nextDouble();
	     
	     System.out.println("Roll NO:" +roll_no );
	     System.out.println("Name:" +name);
	     System.out.println("Marks:" +marks);
		}
}
