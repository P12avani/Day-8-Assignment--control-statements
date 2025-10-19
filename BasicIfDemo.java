package com.codegnan.contolstatements;
import java.util.Scanner;
public class BasicIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter a number:");
       int number=scanner.nextInt();
       //if syntax
       if (number>0) {
    	   System.out.println("the Number " + number+ " is Positive");
       }else {
    	   System.out.println("the Number " + number+ " is Negative");
       }
       System.out.println("this statement always execute");
       scanner.close();
	}

}
