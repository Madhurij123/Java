package com.dkte;
import java.util.Scanner;

	public class CreditLimitCalculator {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        while (true) {
	            System.out.print("Enter account number: ");
	            int accountNumber = input.nextInt();

	            if (accountNumber == -1) {
	                break;
	            }

	            System.out.print("Enter beginning balance: ");
	            int beginningBalance = input.nextInt();

	            System.out.print("Enter total charges this month: ");
	            int charges = input.nextInt();

	            System.out.print("Enter total credits this month: ");
	            int credits = input.nextInt();

	            System.out.print("Enter allowed credit limit: ");
	            int creditLimit = input.nextInt();

	            int newBalance = beginningBalance + charges - credits;

	            System.out.println("\nAccount Number: " + accountNumber);
	            System.out.println("New Balance: " + newBalance);

	            if (newBalance > creditLimit) {
	                System.out.println("Credit limit exceeded");
	            }
	            else
	            {
	            	System.out.println("Creadit Limit not Exceed..!!!");
	            }

	            System.out.println();
	        }
	    }
	}

