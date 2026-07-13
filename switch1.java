import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = 0;
        
        
        while(ch != 0)
        {
        	
        	
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Sum of digits");
        System.out.println("2. Reverse the number");
        System.out.println("3. Check Numeric Palindrome");
        System.out.println("4. Check Armstrong Number");
        
        System.out.println("Enter a choice:");
        ch = sc.nextInt();
      
        switch (ch) {

            case 1:
                int temp1 = num;
                int sum = 0;

                System.out.print("Output: ");
                while (temp1 > 0) {
                    int digit = temp1 % 10;
                    sum += digit;
                    temp1 /= 10;
                }

                String str = String.valueOf(num);
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(str.charAt(i));
                    if (i < str.length() - 1)
                        System.out.print(" + ");
                }
                System.out.println(" = " + sum);
                break;

            case 2:
                int temp2 = num;
                int reverse = 0;

                while (temp2 > 0) {
                    int digit = temp2 % 10;
                    reverse = reverse * 10 + digit;
                    temp2 /= 10;
                }

                System.out.println("Output: " + reverse);
                break;

            case 3:
                int temp3 = num;
                int rev = 0;

                while (temp3 > 0) {
                    int digit = temp3 % 10;
                    rev = rev * 10 + digit;
                    temp3 /= 10;
                }

                if (num == rev)
                    System.out.println(num + " is a numeric palindrome");
                else
                    System.out.println(num + " is not a numeric palindrome");
                break;

            case 4:
                int temp4 = num;
                int armstrongSum = 0;

                while (temp4 > 0) {
                    int digit = temp4 % 10;
                    armstrongSum += digit * digit * digit;
                    temp4 /= 10;
                }

                if (armstrongSum == num)
                    System.out.println(num + " is an Armstrong number");
                else
                    System.out.println(num + " is not an Armstrong number");
                break;
                
            case 5:
            	 break;

            default:
                System.out.println("Invalid choice!");
        }
        }
    }
}
