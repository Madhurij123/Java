package clg.dkte;

import java.util.function.BinaryOperator;

public class Binary_Operator_Interface {

	public static void main(String[] args) {
        
		//Non-capturing lambda
		BinaryOperator<Integer> op1 = (x,y) -> x + y;
	   
		int z = 10;
		BinaryOperator<Integer> op2 = (x,y) -> x + y + z;
		
		int a = 10, b = 6;
		Integer res = op1.apply(a, b);
		System.out.println(res);
		
		Integer res1 = op2.apply(a, b);
		System.out.println(res1);
	
		calc(22, 4, (x,y) -> x + y);
	}
	public static void calc(int n1, int n2, BinaryOperator<Integer> op)
	{
		Integer res = op.apply(n1, n2);
	    System.out.println(res);
		
	}

}
