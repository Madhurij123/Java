package com.app.geometry;
import java.util.*;
import com.app.geometry.*;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x & y coordinators of Point 1:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter x & y coordinators of Point 2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
    
		
		System.out.println("\n Point 1:" +p1.getDetails());
		System.out.println("\n Point 2:" +p2.getDetails());
		
		if(p1.isEqucal(p2))
		{
			System.out.println("Both Pointer are Located at same position");
		}
		else
		{
			System.out.println("Pointer are Located at differnt position");
			
			double distance = p1.calDistance(p2);
			System.out.println("Distance between points:" +distance);
		}

	}

}
