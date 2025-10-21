/*Write a Java program to calculate and classify a person’s Body Mass Index (BMI) using nested if–else statements.
 The program should:
Take weight (in kilograms) and height (in meters) as input.
Compute BMI = weight / (height × height).
Display the category based on the following table:
BMI Range           Category
< 18.5            Underweight
18.5 – 24.9        Normal
25.0 – 29.9       Overweight
≥ 30.0             Obese
Test Case 1:
------------
Input:
45 1.65
Output:
BMI: 16.53
Category: Underweight
Test Case 2:
------------
Input:
70 1.75
Output:
BMI: 22.86
Category: Normal
Test Case 3:
------------
Input:
85 1.70
Output:
BMI: 29.41
Category: Overweight
Test Case 4:
---------------
Input:
95 1.60
Output:
BMI: 37.11
Category: Obese
Test Case 5 (Edge case - BMI = 18.5):
--------------------------------------
Input:
56 1.75
Output:
BMI: 18.29
Category: Underweight
Test Case 6 (Edge case - BMI = 24.9):
----------------------------------------
Input:
76 1.75
Output:
BMI: 24.82
Category: Normal*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter weight in kilograms:");
		double weight=scanner.nextDouble();
		System.out.println("Enter height in kilograms:");
		double height=scanner.nextDouble();
		double bmi=weight / (height * height);
		String category;
		if(bmi<18.5) {
			category="Underweight";
		}else {
			if(bmi<2.50) {
				category="Normal";
			}else {
				if(bmi<30.0)
				 {
					category="overweight";
				}else {
					category="Obese";
				}
			}
			
		}
		System.out.printf("BMI: %.2f\n", bmi);
		System.out.println("Category: " + category);

	}

}
