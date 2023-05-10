import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            int sum = 0;
            int num = 0;
            int cnt = 0;
            int temp = in.nextInt();
            while (temp >= 0) {
                sum += temp;
                num++;
                if (temp < 60) {
                    cnt++;
                }
                temp = in.nextInt();
            }
            Float ave = sum * 1.0f / num;
            System.out.println("average=" + Math.round(ave * 100) / 100.);
            System.out.println("count=" + cnt);
        }
    }
}
