
package com.tnsif.lambdaexpression;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial:");
        int num = scan.nextInt();
        Factorial fact = (n)->{
			int f=1;
			for (int i =1;i<=num;i++) {
				f *= i;
			}
			return f;
		};
		
		System.out.println("Factorial of " + num + " is " + fact.cal(num));
    }
}
