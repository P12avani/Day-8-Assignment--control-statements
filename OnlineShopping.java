/* Online Shopping Cart Price Calculator (With Offers & Membership)
 Problem Statement:
 -------------------
Create a Java program to compute the total bill for a shopping cart. Conditions:
If total amount:
is ≥ ₹10,000, apply 20% discount
is ≥ ₹5000, apply 10% discount
else, no discount
If it’s a festival season, apply an extra 5% discount.
If the user has a premium membership, apply an additional ₹200 flat discount.
Show total price, all applied discounts, and final payable amount.*/
package com.codegnan.contolstatements;
import java.util.Scanner;
public class OnlineShopping {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the total bill for a shopping cart:");
		double totalAmount=scanner.nextDouble();
		System.out.print("Is it a festival season? (yes/no): ");
        String festival = scanner.next();
        System.out.print("Do you have a premium membership? (yes/no): ");
        String membership = scanner.next();
        double discount = 0;
        if (totalAmount >= 10000) {
            discount = totalAmount * 0.20;  // 20% discount
            System.out.println("Applied 20% discount: ₹" + discount);
        } else {
        	if (totalAmount >= 5000) {
        }
            discount = totalAmount * 0.10;  // 10% discount
            System.out.println("Applied 10% discount: ₹" + discount);
        } 
        {
         
            System.out.println("No discount applied on total amount.");
        }
        double finalAmount = totalAmount - discount;
        if (festival.equalsIgnoreCase("yes")) {
            double festivalDiscount = finalAmount * 0.05;
            finalAmount -= festivalDiscount;
            System.out.println("Extra 5% festival discount: ₹" + festivalDiscount);
        }
        if (membership.equalsIgnoreCase("yes")) {
            finalAmount -= 200;
            System.out.println("Premium membership discount: ₹200");
        }
        System.out.println("\n---------------------------");
        System.out.println("Original Total Amount: ₹" + totalAmount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
        System.out.println("---------------------------");

        scanner.close();

	}

}
