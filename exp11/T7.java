import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        int ri, repeat;
        int a[][], b[][], c[][], i, j, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n][n];
            b = new int[n][n];
            c = new int[n][n];
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    b[i][j] = in.nextInt();
            add(a, b, c);
            prt("A Matrix", a);
            prt("B Matrix", b);
            prt("A+B Matrix", c);
        }
    }

    /*----加法-----*/
    public static void add(int a[][], int b[][], int c[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    /*----输出-----*/
    public static void prt(String a, int c[][]) {
        System.out.println(a);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + "	");
            }
            System.out.println();
        }
    }
}