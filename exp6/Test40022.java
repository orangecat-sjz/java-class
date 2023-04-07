import java.util.Scanner;

public class Test40022 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, digit, m, n, number, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*------------------*/
            for (i = m; i <= n; i++) {
                sum = 0;
                number = i;
                while (number != 0) {
                    digit = number % 10;
                    sum += digit * digit * digit;
                    number /= 10;
                }
                if (sum == i) {
                    System.out.println(i);
                }
            }
        }
    }
}
