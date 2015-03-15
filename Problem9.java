public class Problem9 {
	public static void main(String[] args) {
		int sum = 1000;
		int product = 0;
		for(int a=1; a <= sum/3; a++) {
			for(int b = a+1; b <=500; b++) {
				
				int c = sum - a - b;
				
				if(c > 0 && (c*c == a*a + b*b)) {
					product = a*b*c;
					System.out.println(a + " " + b + " " + c);
				}
			}
		}
		
		System.out.println(product);
	}
}