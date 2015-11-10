
public class Problem12 {
	public static void main(String[] args) {
		int number = 0;
		int sum = 0;
		for(int i = 10000; i < 20000; i++) {
			sum = sum + i;
			if(factors(sum) >= 501){
				number = i;
				break;
			}
			int percentage = i/200;
			System.out.println(percentage + "% done");
		}
		
		System.out.println(number);
		System.out.println(sum);
	}

	public static long triangleNumber(int x) {
		long sum = 0l;
		for(int i = 1; i <= x; i++) {
			sum = sum + i;
		}

		return sum;
	}

	public static int factors(long n) {
		int counter = 1;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0)
				counter++;
		}
		System.out.println(counter);
		return counter;
	}
}
