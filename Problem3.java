import java.util.ArrayList;

/**
 * PROBLEM 3
 * Largest Prime Factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Aakash
 * created on 2015-11-08
 */

public class Problem3 {
	public static void main(String[] args) {
		long n = 600851475143l;			//taking the number as long
		prime(n);
	}
	
	// Using the Sieve of Eratosthenes to find the prime numbers
	// so as to find the smallest prime number of n and hence the largest
	public static void prime(long n) {
		int n2 = (int) Math.sqrt(n);
		boolean[] prime = new boolean[n2+1];
		
		//initializing the array as all true
		for(int i = 2; i <= n2; i++)
			prime[i] = true;
		
		for(int divisor = 2; divisor*divisor <= n2; divisor++) {
			if(prime[divisor]) {
				for(int i = 2*divisor; i <= n2; i = i + divisor)
					prime[i] = false;
			}
		}
		
		int check = 2;
		while(check <= n2) {
			if(prime[check]) {
				if(n%check == 0) {
					System.out.println("Factor: " + check);
					long answer = (long) n/check;
					System.out.println("factor of " + n + " is " + answer);
				}
			}
			check++;
		}
	}
}