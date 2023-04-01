import java.util.Scanner;

public class Test20004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time1, time2, hours, mins;
        time1 = in.nextInt();
        time2 = in.nextInt();
        /*------------------*/
        int h1 = time1 / 100;
        int m1 = time1 % 100;
        int h2 = time2 / 100;
        int m2 = time2 % 100;
        if (m2 - m1 < 0) {
            hours = h2 - h1 - 1;
            mins = m2 - m1 + 60;
        } else {
            hours = h2 - h1;
            mins = m2 - m1;
        }
        System.out.println("The train journey time is " + hours + " hrs " + mins + " mins.");
    }
}
