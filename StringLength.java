package Assignments;

import java.util.Scanner;

/*
 * Program to create a string of length ‘n’. 
 * The value of ‘n’ is the sum of the user input which will be an integer.
 */
public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String user = input.nextLine();
		
		int count = user.length();
		
		System.out.println("The Number of Character in \"" + user + "\" is: " + count);
		
		
	}

}
