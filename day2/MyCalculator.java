package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int res=calc.add(10, 20, 30); // Arguments
		System.out.println(res);
		
		Calculator calc1 = new Calculator();
		int res1=calc1.sub(20, 10,50);
		System.out.println(res1);
		
		Calculator calc2 = new Calculator();
		int res2=calc2.multiply(10, 20, 30);
		System.out.println(res2);
		
		Calculator calc3 = new Calculator();
		int res3=calc.divide(20,10);
		System.out.println(res3);
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Calculator calc = new Calculator();
		//int add = calc.add(5, 10, 20);
		//System.out.println(add);
	}

}
