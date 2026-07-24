class Calculator {
    public static void main(String args[]) {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        char op = args[1].charAt(0);
        double num2 = Double.parseDouble(args[2]);

        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case 'X':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero!");
                break;

            case '%':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 % num2));
                else
                    System.out.println("Error: Division by zero!");
                break;

            default:
                System.out.println("Invalid Operator!");
        }
    }
}