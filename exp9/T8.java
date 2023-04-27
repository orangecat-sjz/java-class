import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            int a[][] = new int[3][3];
            int row = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    a[j][k] = in.nextInt();
                }
            }
            for (int j = 0; j < 3; j++) {
                row = a[0][j];
                a[0][j] = a[2][j];
                a[2][j] = row;
            }
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(a[j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
