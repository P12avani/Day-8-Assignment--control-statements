/*write a java program to simulate traffic light behaviour using  nested if-else statements:
The program should be:
A light state (green,yellow,or red )
the hour(0-23) in 24-hour format) and display the vehicles action based on thes rules:
consider daytime as between 6AM and 6PM(06:00-18:00).
Based on the inputs ,decide the action for the driver
1.If the light is green,the action is "Go".
2.If the light is red,the action is "Stop".
3.If the light is yellow:
During daytime,the action is"slow".
During nightTime,the action is "Stop".
4.If the user enters an invalid light state, display "Invalid light state".*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class TrafficSimulator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Light state(Green/yellow/Red:)");
		String lightState=scanner.next();
		System.out.println("Enter Hour(0-23)");
		int hour=scanner.nextInt();
		boolean isDaytime=(hour >=6 && hour<=18);
		String action;
		if(lightState.equalsIgnoreCase("green")) {
			action="Go";
		}else {
			if(lightState.equalsIgnoreCase("red")) {
				action="stop";
		}else {
			if(lightState.equalsIgnoreCase("yellow")) {
				if(isDaytime) {
					action="slow";
				}else {
					action="stop";
				}
			}else {
				action="Invalid Light state";
			}
			}
		}
		System.out.println(action);
		scanner.close();

	}

}
