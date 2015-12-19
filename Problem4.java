import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * PROBLEM 4
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

class Problem4 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = palins();
		System.out.println("\nLargest Palindrome is: " + nums.get(nums.size()-1));
	}
	
	// Returns a sorted list of all the palindrome numbers which are a product of 3-digit number.
	static ArrayList<Integer> palins() {
		ArrayList<Integer> palins = new ArrayList<Integer>();
		for(int ctr=100; ctr <= 999; ctr++) {
			int num = 0;
			for(int ctr2=ctr; ctr2 <= 999; ctr2++) {
				num = ctr*ctr2;
				if(isPalin(num)) {
					System.out.println(num);
					palins.add(num);
				}
			}
		}
		Collections.sort(palins);
		return palins;
	}
	
	// Returns whether a number is a palindrome number or not.
	static boolean isPalin(int n) {
		String s = "" + n;
		int l = s.length();
		for(int i=0; i <= l/2; i++) {
			if(s.charAt(i) != s.charAt((l-1) - i))
					return false;
		}
		return true;
	}
}