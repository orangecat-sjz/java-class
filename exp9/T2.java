import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        int repeat = 0;
        int a[] = new int[6];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            boolean flag = true;
            for (int j = 0; j < 6; j++) {
                a[j] = in.nextInt();
                if (j == 4) {
                    if (a[4] < a[0]) {
                        flag = false;
                    }
                }
            }
            for (int j = 0; j < 6; j++) {
                for (int k = j + 1; k < 6; k++) {
                    if (a[j] > a[k]) {
                        int temp = a[j];
                        a[j] = a[k];
                        a[k] = temp;
                    }
                }
            }
            if (flag) {
                for (int j = 0; j < 6; j++)
                    System.out.print(a[j] + " ");
            } else {
                for (int j = 5; j >= 0; j--)
                    System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}