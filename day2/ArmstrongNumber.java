package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 343;
		int sum = 0;
		int temp;
		int r;
		
		temp = 343;
		
		while(input>0)
		{
			r = input % 10;
			sum = sum + (r*r*r);
			input = input/10;
		}
		if (temp == sum) {
			System.out.println("It is a Armstrong Number");
		}
		else {
			System.out.println("It is not an Armstong Number");
		}
		
		
		
		

	}

}
