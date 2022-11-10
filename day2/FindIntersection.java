package week1.day2;

public class FindIntersection {
	

	public static void main(String[] args) {
		int[] a = {1,2,4,6,8,10};
		int[] b = {2,4,8,10,14,16};
		 for(int i=0;i<a.length;i++) {
			 //System.out.println(a[i]);
			 for(int j=0;j<b.length;j++) {
				 //System.out.println(b[j]);
				 if (a[i] == b[j]) {
					 System.out.println("The Intersection Numbers are : " +a[i]);
				 }
			 }
		 }

	}

}
