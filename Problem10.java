
public class Problem10 {
	public static void main(String[] args) {
		int n = 2000000;

		System.out.println(prime(n));
	}

	public static long prime(int x) {
		long sum = 0l;
		boolean[] prime = new boolean[x+1];
		for(int i = 0; i < prime.length; i++)
			prime[i] = true;

		for (int divisor = 2; divisor*divisor <= prime.length; divisor++) {
			if(prime[divisor]) {
				for(int i = 2*divisor; i < prime.length ; i = divisor + i) {
					prime[i] = false;
				}
			}
		}

		for(int i = 2; i < prime.length; i++) {
			if(prime[i]) {
				//long y = i;
				sum = sum + i;
			}
		}



		return sum;
	}
}