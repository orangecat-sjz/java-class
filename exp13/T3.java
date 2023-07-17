import java.util.Scanner;

public class T3 {
    public static void main(String args[]) {
        int ri, repeat;
        int count, i, m, n, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            /*---------*/ count = 0;
        sum = 0;
        for (i = m; i <= n; i++) {
            if (prime(i)) {
                count++;
                sum += i;
            }
        }
            System.out.println("count=" + count + ", sum=" + sum);
        }
    }
    /*------------*/
    public static boolean prime(int x)
    {
        boolean flag=true;
        if(x==1) flag=false;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
