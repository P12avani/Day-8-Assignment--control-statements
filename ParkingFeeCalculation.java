/*Problem: Parking Fee Calculation
A parking system calculates the fee based on the following conditions:
Vehicle Type:
Car: ₹50 per hour
Bike: ₹30 per hour
Truck: ₹100 per hour
Discounts:
-------------
If the vehicle stays for more than 5 hours, a 20% discount is applied to the total parking fee.
Surcharge:
----------
If the vehicle is parked between 6 PM and 8 AM, a 50% surcharge is applied to the total fee.
Input:
-------
The program should prompt the user to enter the vehicle type (Car, Bike, or Truck).
The user should enter the arrival time (24-hour format, e.g., 14 for 2 PM).
The user should also enter the departure time (24-hour format, e.g., 18 for 6 PM).
Output:
--------
The program should output the total parking fee based on the conditions above.
Constraints:
Assume that the parking times are in a 24-hour format.
Handle cases where parking times cross midnight (e.g., a vehicle parked from 10 PM to 2 AM).
For vehicles staying for more than 5 hours, apply the 20% discount.
For vehicles parked between 6 PM and 8 AM, apply the 50% surcharge.
Example:
---------
Input:
Enter the vehicle type (Car, Bike, Truck): car
Enter the time of arrival (24-hour format, e.g., 14 for 2 PM): 14
Enter the time of departure (24-hour format, e.g., 18 for 6 PM): 20
Output:
Total parking fee: ₹300.0*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class ParkingFeeCalculation {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Vehicle (car/bike/truck):");
	        String vehicleType = scanner.next();
	        System.out.println("Enter the arrival time (0-23):");
	        int arrivalTime = scanner.nextInt();
	        System.out.println("Enter the departure time (0-23):");
	        int departureTime = scanner.nextInt();
	        if (arrivalTime < 0 || arrivalTime > 23 || departureTime < 0 || departureTime > 23) {
	            System.out.println("Invalid hour! Please enter values between 0 and 23.");
	            scanner.close();
	            return;
	        }
	        int totalHours;
	        if (departureTime >= arrivalTime) {
	            totalHours = departureTime - arrivalTime;
	        } else {
	            totalHours = (24 - arrivalTime) + departureTime; 
	        }
	        double hourRate = 0;
	        if (vehicleType.equalsIgnoreCase("car")) {
	            hourRate = 50;
	        } else {
	            if (vehicleType.equalsIgnoreCase("bike")) {
	                hourRate = 30;
	            } else {
	                if (vehicleType.equalsIgnoreCase("truck")) {
	                    hourRate = 100;
	                } else {
	                    System.out.println("Invalid vehicle type!");
	                    scanner.close();
	                    return; 
	                }
	            }
	        }

	        double totalFee = totalHours * hourRate;
	        if (totalHours > 5) {
	            double discount = totalFee * 0.20;
	            totalFee -= discount;
	            System.out.println("20% discount applied: ₹" + discount);
	        }

	        if (arrivalTime >= 18 || departureTime <= 8) {
	            double surcharge = totalFee * 0.50;
	            totalFee += surcharge;
	            System.out.println("50% surcharge applied: ₹" + surcharge);
	        }

	        System.out.println("\n---------------------------");
	        System.out.println("Total parked hours: " + totalHours);
	        System.out.println("Rate per hour: ₹" + hourRate);
	        System.out.println("Total parking fee: ₹" + totalFee);
	        System.out.println("---------------------------");

	        scanner.close();
	    }
	}

	