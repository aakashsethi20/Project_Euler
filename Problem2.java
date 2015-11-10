
public class Problem2 {
	public static void main(String[] args) {
		System.out.println(sum());
	}
	
	public static long sum() {
		long first = 1l;
		long second = 2l;
		long sum = 0l;
		
		for(long last=2l; last<=4000000l;) {
			if(last%2 == 0) {
				sum = sum + last;
			}
			last = first + second;
			first = second;
			second = last;
		}
		
		return sum;
	}
}
