/*1.write a java program to simulate an ATM withdrawal PROCESS.
the program should:
Ask the user to enter the withdrawal amount.
check if the entered amount is less than or equal to the account balance (initially Rs1000)
if the balance is sufficient ,deduct the withdrawal amount and display the remaining balance.
otherwise ,display the message"Insufficient funds."*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class AtmWithdrawal {

	public static void main(String[] args) {
		double balance=10000;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the withdrawal amount:");
		double withdrawAmount=scanner.nextDouble();
		if(withdrawAmount<=balance) {
			balance -=withdrawAmount;
			System.out.println("Sufficient amount");
		}else {
			
			System.out.println("Insufficient amount");	
		}   
	}

}
