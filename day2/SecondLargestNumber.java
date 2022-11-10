package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] data = {3,6,8,18,2,20,40,70};
		
		Arrays.sort(data);
		
		for(int i=0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("The Second Largest Number is : " +data[data.length-2]);
		
		

	}

}
