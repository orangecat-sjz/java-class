import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n, temp;
        float sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*--------------------*/
            sum = 0;
            for (i = 1; i <= n; i++) {
                sum += 1.0f / (2 * i - 1);
            }
            System.out.println(sum);
        }
    }
}
