
/*
 * PROBLEM 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be: 
 * 						1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class Problem2 {
	public static void main(String[] args) {
		System.out.println(sum());
	}
	
	/*
	 * Method to compute the sum of even Fibonacci Numbers
	 */
	public static long sum() {
		// First variable for series
		long first = 1l;
		// Second variable for series
		long second = 1l;
		// Variable to hold the sum
		long sum = 0l;
		
		long last = 0l;
		
		// Loop iterates through Fibonacci series till 4 million and adds up even numbers.
		while(last <= 4000000) {
			last = first + second;
			first = second;
			second = last;
			if(last % 2 == 0) {
				sum = sum + last;
			}
		}
		
		return sum;
	}
}