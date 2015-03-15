import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		double counter = s.nextDouble();
		double k = counter;
		boolean condition = false;
			
		while(!condition) {
			for(double i = 1; i <= k; i++) {
				if(counter % i != 0) {
					counter = counter + k;
					condition = false;
					i = 0;
				}else if(i == k && counter % i == 0) {
					condition = true;
				}
			}
		}
		System.out.println("The number divisible by every number from 1 to "+k+" is: ");
		System.out.println(counter);
		s.close();
	}

}