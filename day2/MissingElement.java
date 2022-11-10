package week1.day2;

public class MissingElement {

	public static void main(String[] args) {
		int sum =0;
		int[] number = {1,2,3,4,5,6,8,9,10};
		//The Missing Element is 7
		//Logic is: 
		// Sum the number: 1+2+3+4+5+6+8+9+10 => 48
		
		for(int i = 0;i<number.length;i++) {
			sum = sum + number[i]; //48
		}
		System.out.println(sum);
		
		//Add the number with missing element '7'
		int sum1=0;
		int[] number1 = {1,2,3,4,5,6,7,8,9,10};
		for(int j=0;j<number1.length;j++) {
			sum1 = sum1+number1[j]; //55
		}
		System.out.println(sum1);
		System.out.println("The Missing element in an array is: " +(sum1 - sum));
		

	}

}
