/*Write a Java program to calculate the tax percentage based on income using nested if–else statements.
 The program should read an integer income and determine the tax percentage as per the rules below:
Income Range (₹)       Tax Percentage
≤ 10,000                0%
10,001 – 50,000         10%
50,001 – 100,000        20%
> 100,000               30%
Test Case 1:
Input:
5000
Output:
0%
Test Case 2:
------------
Input:
20000
Output:
10%

Test Case 3:
Input:
75000
Output:
20%

Test Case 4:
------------
Input:
120000
Output:
30%

Test Case 5:
-----------
Input:
10000
Output:
0%*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class TaxPercentage {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter income:");
		int income=scanner.nextInt();
		double percentage;
		if(income<=10000) {
			percentage=0;
		}else {
			if(income<=50000) {
				percentage=10;
			}else {
				if(income<=100000) {
					percentage=20;
				}else {
					percentage=30;
				}
			}
		}
         System.out.println("Tax Percenatage:"+percentage);
         scanner.close();
	}

}
