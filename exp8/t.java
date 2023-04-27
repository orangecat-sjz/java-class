import java.util.Scanner;

public class t {
	public static void main(String args[]) {
		int ri, repeat;
		int i, m, n;
		long f;
		Scanner in = new Scanner(System.in);
		repeat = in.nextInt();
		for (ri = 1; ri <= repeat; ri++) {
			m = in.nextInt();
			n = in.nextInt();
			/*---------*/
			// i=1;f=m;
			for (f = m; f <= n;) {
				i = 1;
				while (fib(i) <= f) {
					if (fib(i) == f) {
						System.out.print(f + " ");
					}
					i++;
				}
				f = fib(i);
			}
			System.out.println();
		}
	}

	/*------------*/
	static int fib(int n) {
		int x;
		if (n == 1 || n == 2)
			x = 1;
		else
			x = fib(n - 1) + fib(n - 2);
		return x;
	}
}