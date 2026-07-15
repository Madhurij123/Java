package com.app.geometry;

import java.util.Scanner;

	class Invoice1
	{
		private String partNumber;
		private String partDescription;
		private int quantityOfItem;
		private double pricePerItem;
		
		Scanner sc = new Scanner(System.in);
		
		public void acceptInvoice()
		{
			System.out.print("Enter part number: ");
			partNumber = sc.next();
			
			System.out.print("Enter part description: ");
			partDescription = sc.next();
			
			System.out.print("Enter quantity of Item: ");
			quantityOfItem = sc.nextInt();
			
			System.out.print("Enter price per Item: ");
			pricePerItem = sc.nextDouble();
		}
		
		public void displayInvoice()
		{
			System.out.print("----------Invoice---------\n");
			System.out.println("Part Number: " + partNumber);
			System.out.println("Part Description: " + partDescription);
			System.out.println("Quantity of Item: " + quantityOfItem);
			setQuantityOfItem(quantityOfItem);

			System.out.println("Price per Item: " + pricePerItem);
			setPricePerItem(pricePerItem);
			
			calculateInvoice();

		}
		
		public void calculateInvoice()
		{
			double amount = quantityOfItem * pricePerItem;
			System.out.println("Invoice Amount: " + amount);
		}
		public Invoice1(String partNumber, String partDescription, int quantityOfItem, double pricePerItem)
		{
			this.partNumber = partNumber;
			this.partDescription = partDescription;
			this.quantityOfItem = quantityOfItem;
			this.pricePerItem = pricePerItem;
			System.out.println("Paramerized Constructor called...");
		}
		
		public void setPartNumber(String partNumber)
		{
			this.partNumber = partNumber;
		}
		
		public String getPartNumber()
		{
			return partNumber;
		}
		public void setPartDescription(String partDescription)
		{
			this.partDescription = partDescription;
		}
		
		public String getPartDescription()
		{
			return partDescription;
		}
		
		public void setQuantityOfItem(int quantityOfItem)
		{
			if(quantityOfItem < 0)
			{
				this.quantityOfItem = 0;
			}
		}
		
		public int getQuantityOfItem()
		{
			return quantityOfItem;
		}
		
		public void setPricePerItem(double pricePerItem)
		{
			if(pricePerItem < 0)
			{
				this.pricePerItem = 0.0;
			}
		}
		
		public double getPricePerItem()
		{
			return pricePerItem;
		}
		
	}
	public class Invoice
	{
		public static void main(String args[])
		{
			Invoice1 i = new Invoice1("12AB4","Gear Box", 10, 12500.50);
			i.displayInvoice();
			System.out.println("-------------------------");
			
			i.acceptInvoice();
			i.displayInvoice();
			
			System.out.println();
			i.displayInvoice();
		}

	}


