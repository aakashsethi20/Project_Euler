
public class Problem7 {
	public static void main(String[] args) {
		int n = 1000000;
		int answer = prime10001(n);
		
		System.out.println(answer);
		//printPrime(n);
	}
	
	public static int prime10001(int n) {
		boolean[] prime = new boolean[n+1];
		for(int i = 2; i <= n; i++) {
			prime[i] = true;
		}
		for(int i = 2; i*i <= n; i++) {
			if(prime[i]) {
				for(int j = 2*i; j <= n; j = j + i) {
					prime[j] = false;
				}
			}
		}
		int kuch = 0;
		int counter = 0;
		for(int i = 2; i <= n; i++) {
			if(prime[i]) {
				counter++;
			}
			if(counter == 10001){
				kuch = i;
				break;
			}
		}
		return kuch;
	}
	
//	public static void printPrime (int n) {
//		boolean[] prime = new boolean[n+1];
//		for(int i = 2; i <= n; i++) {
//			prime[i] = true;
//		}
//		for(int i = 2; i*i <= n; i++) {
//			if(prime[i]) {
//				for(int j = 2*i; j <= n; j = j + i) {
//					prime[j] = false;
//				}
//			}
//		}
//		
//		for(int i = 2; i <= n; i++) {
//			if(prime[i]) {
//				System.out.println(i);
//			}
//		}
//	}
}