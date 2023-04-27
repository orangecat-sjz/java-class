import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        int ri, repeat;
        int a[][], b[][], i, j, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n][n];
            b = new int[n][n];
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    b[i][j] = in.nextInt();
            if (judge(a, b))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    /*--------------------*/
    public static boolean judge(int[][] a, int[][] b) {
        boolean flag = true;
        int ra = a.length;
        int ca = a[0].length;
        int rb = b.length;
        int cb = b[0].length;
        if (ra != rb || ca != cb) {
            flag = false;
        } else {
            for (int i = 0; i < ra; i++) {
                for (int j = 0; j < ca; j++) {
                    if (a[i][j] != b[i][j]) {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }
}
