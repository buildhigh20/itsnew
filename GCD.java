import java.util.Scanner;

class GCD {
	public static void main(String[] args) {
		Scanner abc =  new Scanner(System.in);
		int gcd = 1;
		int n1 = abc.nextInt();
		int n2 = abc.nextInt();
		for(int i = 2 ; i<=n1 && i <= n2; i++) {
			if(n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		System.out.print((long)gcd);
	}
}