import java.util.Scanner;

public class Test30002 {
    public static void main(String[] args) {
        int ri, repeat;
        int a, b, c, d, min;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            /*------------------*/
            int[] arr = { a, b, c, d };
            int j = 1;
            min = a;
            for (; j < 4; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
            }
            System.out.println("min is " + min);
        }
    }
}