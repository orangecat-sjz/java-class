import java.util.*;

public class T2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i;
        float r;
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            r = in.nextFloat();
            Circle cir = new Circle();
            cir.setR(r);
            System.out.println(Math.round(cir.area()));
            System.out.println(Math.round(cir.perimeter()));
        }
    }
}

/*--------------------------*/
class Circle {
    float r;
    double pi = 3.14;

    void setR(float x) {
        r = x;
    }

    double area() {
        return (double) (pi * r * r);
    }

    double perimeter() {
        return (double) (2 * pi * r);
    }
}
