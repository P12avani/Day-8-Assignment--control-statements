/*Write a Java program to simulate traffic light behavior using nested if–else statements.
 The program should take:
 ------------------------------
A light state (Green, Yellow, or Red)
The hour (0–23 in 24-hour format)
 and display the vehicle’s action based on these rules:
If the light is Green, the action is “Go”.
If the light is Red, the action is “Stop”.
If the light is Yellow:
During daytime (6 AM to 6 PM) → “Slow”
During nighttime → “Stop”
Test Case 1:
-------------
Input:
Green 10
Output:
Go
Test Case 2:
------------
Input:
Red 15
Output:
Stop
Test Case 3:
----------------
Input:
Yellow 9
Output:
Slow
Test Case 4:
-------------
Input:
Yellow 20
Output:
Stop
Test Case 5:
------------
Input:
Green 23
Output:
Go*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class SimulateTrafficLight {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a light state(Green/yellow/red):");
		String lightState=scanner.next();
		System.out.println("enter hours(0-23);");
		int hours=scanner.nextInt();
		boolean isDaytime=(hours >=6 && hours<=18);
		String action;
		if (lightState.equalsIgnoreCase("Green")) {
            action = "Go";
        } else {
            if (lightState.equalsIgnoreCase("Red")) {
                action = "Stop";
            } else {
                if (lightState.equalsIgnoreCase("Yellow")) {
                    if (isDaytime) {
                        action = "Slow";
                    } else {
                        action = "Stop";
                    }
                } else {
                    action = "Invalid Light State";
                }
            }
        }
		System.out.println(action);
        scanner.close();
    }
}


	
	
	



