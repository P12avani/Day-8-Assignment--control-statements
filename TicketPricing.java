/*2.Write a Java program to calculate the final price of an airline ticket based on the following conditions:
The base price of the ticket is ₹5000.
The final price is affected by:
 Passenger Type:
 ----------------
 child → 50% discount
 senior → 20% discount
 adult → No discount
 Any other input → Show error and terminate the program
 Booking Time:
 ----------------
 early → 10% discount
 normal → No change
 last-minute → 20% extra charge
 Any other input → Show error and terminate the program.
 Membership Status:
 --------------------
If the passenger is a member, they get an additional 5% discount on the final price (after applying all previous discounts or surcharges).*/


package com.codegnan.contolstatements;
import java.util.Scanner;
public class TicketPricing {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter passengerType: (child/adult/Senior)");
		String passengerType= scanner.next();
		System.out.println("Enter bookingTime: (early/normal/last-minute)");
		String bookingTime=scanner.next();
		boolean isMember=true;
		double basePrice=5000;
	
		//passenger type  Discount.
		if(passengerType.equalsIgnoreCase("child")) {
			basePrice *=0.5;
		}
		else {
			if(passengerType.equalsIgnoreCase("senior")) {
				basePrice*=0.8;
		}
			else {
				if(passengerType.equalsIgnoreCase("adult")) {
				//no discount
			}else {
				System.out.println("Invalid passenger type");
				return;
			}
				
			}
		}
		//booking time adjustment
		if(bookingTime.equalsIgnoreCase("early")) {
			basePrice*=0.9;
		}else {
			if(bookingTime.equalsIgnoreCase("normal")) {
				//no discount
			}else {
				if(bookingTime.equalsIgnoreCase("last-minute")) {
					basePrice*=1.2;
				}
				else {
					System.out.println("Invalid booking time");
					return;
				}
			}
		}
		if(isMember) {
			basePrice*=0.95;
		}
		System.out.println("Final Ticket price:"+basePrice);
	}
	
}



				
			
		
		


