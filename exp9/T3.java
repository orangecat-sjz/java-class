import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int repeat = 0;
        int a[] = new int[6];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            boolean flag = false;
            int index = 0;
            for (int j = 0; j < 6; j++) {
                a[j] = in.nextInt();
            }
            int temp = in.nextInt();
            for (int j = 0; j < 6; j++) {
                if (a[j] == temp) {
                    flag = true;
                    index = j;
                    break;
                }
            }
            if (flag) {
                System.out.println(temp + ":a[" + index + "]");
            } else {
                System.out.println(temp + ":not found");
            }
        }
    }
}