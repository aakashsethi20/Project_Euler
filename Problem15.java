
import java.util.Scanner;

public class Problem15 {
	public static void main(String[] args) {
		
		int n = 20;
		int[][] square = new int[n+1][n+1];
		
		square[0][0] = 0;
		square[0][n] = 1;
		
		for(int i = 1; i <= n-1; i++)
			square[0][i] = 0;
		
		for(int i = 1; i < n+1; i++) {
			square[i][n] = 0;
			square[i][n-1] = 1;
		}
		
		for(int column = n-2; column >= 0; column--) {
			for(int row = 1; row <= n; row++) {
				square[row][column] = 0;
				for(int i = row; i <= n; i++)
					square[row][column] += square[i][column+1]; 
			}
		}
		
		int sum = 0;
		for(int i = 0; i < square.length; i++) {
			for(int j = 0; j < square[i].length; j++)
				sum += square[i][j];
		}
		
		System.out.println(sum);
		
	}
}