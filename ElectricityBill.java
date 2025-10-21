/*Electricity Bill Calculator (With Slabs & Surcharge)
 Problem Statement:
Write a Java program to calculate the monthly electricity bill based on the number of units consumed, applying the following slab rates:
Units Consumed
Rate per Unit
0 - 100
₹1.50
101 - 200
₹2.00
201 - 300
₹3.00
Above 300
₹5.00

If the total bill exceeds ₹1000, apply a 10% surcharge.
If the user is a senior citizen, apply an additional 5% discount on the total.*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no.of units consumed:");
		int units=scanner.nextInt();
		System.out.println("Are you a senior citizen?(yes/no):");
		String senior=scanner.next();
		double bill=0;
		if(units<=100) {
			bill=units*1.50;
		}else {
			if(units<=200) {
				bill=100 * 1.50 + (units - 100) * 2.00;
			}else {
				if(units<=300) {
					bill=100 * 1.50 + 100 * 2.00 + (units - 200) * 3.00;
				}else {
					bill=100 * 1.50 + 100 * 2.00 + 100 * 3.00 + (units - 300) * 5.00;
				}
			}
			
		}
		
		 bill = (bill > 1000) ? bill + (bill * 0.10) : bill;
		 bill = (senior.equals("yes")) ? bill - (bill * 0.05) : bill;
		 System.out.println("Total Electricity Bill: ₹" + bill);
		 scanner.close();
	}

}
