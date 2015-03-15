
public class Problem1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int counter3=3; counter3<1000; counter3+=3) {
			sum = sum + counter3;
		}
		for(int counter5=5; counter5<1000; counter5+=5) {
			sum = sum + counter5;
		}
		
		for(int counter15=0; counter15<1000; counter15+=15) {
			sum = sum - counter15;
		}
		
		System.out.println(sum);
	}
}
