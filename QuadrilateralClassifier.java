/*A geometry app classifies a quadrilateral based on four side lengths ($a, b, c, d$) and whether opposite sides are equal.
Output "Rectangle" if opposite sides are equal ($a=c$ and $b=d$).
Output "Square" if all sides are equal.
Output "Other" otherwise.
Input Format: Four integers a,b,c,d, separated by spaces.
Output Format: A string: "Square", "Rectangle", or "Other".
Example:
---------
Input: 4 4 4 4
Output: Square
Test Case 1:
-------------
Input:
4 4 4 4
Output:
Square
Test Case 2:
-------------
Input:
4 6 4 6
Output:
Rectangle
Test Case 3:
-----------
Input:
3 4 5 6
Output:
Other
Test Case 4:
------------
Input:
5 5 5 5
Output:
Square
Test Case 5:
------------
Input:
2 3 2 3
Output:
Rectangle*/

package com.codegnan.contolstatements;
import java.util.Scanner;
public class QuadrilateralClassifier {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter four sides:(a,b,c,d)");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=scanner.nextInt();
		String type;
		if(a==b && b==c && c==d) {
			type="Square";
		}else {
			if(a==c && b==d) {
				type="Rectangle";
			}else {
				type="Other";
			}
		}
          System.out.println(type);
          scanner.close();
	}

}
