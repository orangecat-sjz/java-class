import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, index, n, a[];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            /*---------*/
            index = 0;
            for (i = 0; i < n; i++) {
                if (a[i] > a[index]) {
                    index = i;
                }
            }
            System.out.println("max=" + a[index] + ",index=" + index);
        }
    }
}