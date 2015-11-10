import java.lang.Math;

public class Problem6 {
	public static void main(String[] args) {
		int x = 100;
		
		int answer = Math.abs(squareOfSum(x) - sumOfSquare(100));
		
		System.out.println(answer);		
		
	}
	
	public static int squareOfSum(int x) {
		int sum = 0;
		for(int i = 0; i <= x; i++) {
			sum = sum + i;
		}
		
		int square = sum*sum;
		
		return square;
	}
	
	public static int sumOfSquare(int x) {
		int sum = 0;
		for(int i = 0; i <= x; i++) {
			sum = sum + (i*i);
		}
		
		return sum;
	}
	
	
}
