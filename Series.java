package Assignments;

import java.util.Scanner;

/*
 * 1,2,6,15,31,? Identify the number series and write a program to print the series. 
 */
public class Series {

	public static void main(String[] args) {
		int element = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of terms : "); 
		int terms = input.nextInt();
		
		for (int i = 0; i <= terms; i++) {
			element = element + (i * i);
			System.out.print(element + " ");
		}

	}

}
