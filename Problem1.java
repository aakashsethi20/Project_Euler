/*
 * PROBLEM 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		//Counts and adds all the multiples of 3 till 1000.
		for(int counter3=3; counter3<1000; counter3+=3) {
			sum = sum + counter3;
		}
		
		//Counts and adds all the multiples of 5 till 1000.
		//It doesn't sum the numbers if they are multiples of 3 as well.
		for(int counter5=5; counter5<1000; counter5+=5) {
			if(counter5%3 != 0)
				sum = sum + counter5;
		}
		
		//Prints out the final sum.
		System.out.println(sum);
	}
}
