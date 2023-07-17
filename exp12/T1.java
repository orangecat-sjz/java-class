import java.util.*;

public class T1 {
    /*---------*/
    public static void main(String[] args) {
        int ri, repeat, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            printTriangle(n);
        }
    }
    public static void printTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
