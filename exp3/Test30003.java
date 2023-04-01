import java.util.Scanner;

public class Test30003 {
    public static void main(String[] args) {
        int ri, repeat;
        float a, b, c, area, perimeter, s;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextFloat();
            b = in.nextFloat();
            c = in.nextFloat();
            s = (a + b + c) / 2;
            /*------------------*/
            if (a >= b + c || b >= a + c || c >= a + b) {
                System.out.println("These sides do not correspond to a valid triangle");
            } else {
                area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
                perimeter = s * 2;
                System.out.println(
                        "area=" + (int) (area * 100 + 0.5) / 100. + ";perimeter="
                                + (int) (perimeter * 100 + 0.5) / 100.);
            }
        }
    }
}
