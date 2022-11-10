package week1.day2;

import java.util.Scanner;

public class NegativeToPositiveNumUsingScanner {

	public static void main(String[] args) {
		int i = -45;
		int positiveNumber;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Negative Number : ");
		i = sc.nextInt();
		
		if(i<0)
		{
			positiveNumber = i * (-1);
			System.out.println("PositiveNumber : " +positiveNumber);
		}
	}

}
