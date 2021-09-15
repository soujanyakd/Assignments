package Assignments;

import java.util.Scanner;

/* 
 * Program to add elements in array. 
 * Create an array of integer and add few user inputs (marks). 
 * Print the Grand Total of marks.
 */
public class AddElements {
	
	public int add(int array[]) {
		int sum = 0;
		for (int element : array) {
			sum = sum + element;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of subjects : "); 
		int n = input.nextInt();
		int[] arrayElements = new int[n];
		System.out.println("Enter the marks of " + n + " Subjects  :");
		for (int i = 0; i < n; i++) {
			arrayElements[i] = input.nextInt();							
		}
		
		
		AddElements obj = new AddElements();
		int result = obj.add(arrayElements);
		System.out.println("Grand Total of marks : " + result);

	}

}
