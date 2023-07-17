import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int days=0;
        int ca=0;
        for (int i = 0; i < n; i++) {
            days = in.nextInt();
            days = days % 7;
            switch (days) {
                case 0:
                    ca = 5;
                    break;
                case 1:
                    ca = 6;
                    break;
                case 2:
                    ca = 0;
                    break;
                case 3:
                    ca = 1;
                    break;
                case 4:
                    ca = 2;
                    break;
                case 5:
                    ca = 3;
                    break;
                case 6:
                    ca = 4;
                    break;
            }
            System.out.println(ca);
        }
    }
}