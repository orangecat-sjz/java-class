import java.util.*;

public class T1 {
    public static void main(String[] args) {
        int ri, repeat, n, i;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            /*---------*/
            if (isprime(n)) {
                System.out.println(n + "是素数");
            } else {
                System.out.print(n + "=");
                if (n == 1) {
                    System.out.println(n);
                } else {
                    boolean flag = true;
                    int temp = n;
                    for (i = 2; i <= n / 2 && temp > 1;) {
                        if (temp % i == 0) {
                            if (flag) {
                                System.out.print(i);
                                flag = false;
                            } else {
                                System.out.print("*" + i);
                            }
                            temp = temp / i;
                        } else {
                            i++;
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

    public static boolean isprime(int n) {
        boolean flag = true;
        if (n < 2) {
            flag = false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}