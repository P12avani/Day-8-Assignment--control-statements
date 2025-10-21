/*Write a Java program to check whether a given number is a Perfect Square using nested if–else statements.
 A number n is said to be a Perfect Square if there exists an integer x such that x × x = n.
Test Case 1:
-------------
Input:
16
Output:
Perfect Square
Test Case 2:
------------
Input:
12
Output:
Not Perfect Square
Test Case 3:
------------
Input:
0
Output:
Perfect Square
Test Case 4:
Input:
25
Output:
Perfect Square
Test Case 5:
--------------
Input:
-9
Output:
Not Perfect Square*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scanner.nextInt();
		if(num>=0) {
			 int sqrt = (int) Math.sqrt(num); 
			 if (sqrt * sqrt == num) {
	                System.out.println("Perfect Square");
	            } else {
	                System.out.println("Not Perfect Square");
	            }
	        } else {
	            // Negative numbers can't be perfect squares
	            System.out.println("Not Perfect Square");
	            scanner.close();
	        }
		}

	}


