
import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
		long[] array = new long[1000000];
		for(int i = 2; i < 1000000; i++){
			long j = i;
			long counter = 1;
			System.out.println(i);
			while(j != 1) {
				if(j % 2 == 0) {
					j = j/2;
					counter++;
				}else {
					j = 3*j + 1;
					counter++;
				}
			}
			array[i] = counter;
			System.out.println(i/10000 + "% done");
		}

		long max = 0l;
		int number = 0;
		for(int i = 2; i < array.length; i++) {
			if(array[i] >= max) {
				max = array[i];
				number = i;
			}
		}
		System.out.println("The number is: " + number);
		System.out.println("The number of terms is: " + max);
	}
}