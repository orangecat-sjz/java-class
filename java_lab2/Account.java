public class Account {
    static double min = 10;
    String account;
    String name;
    String address;
    double balance;

    Account(String s1, String s2, String s3, double a) {
        account = s1;
        name = s2;
        address = s3;
        balance = a;
    }

    public void deposit(double a) {
        System.out.println("您账户原有余额：" + balance);
        System.out.println("现存入：" + a);
        balance += a;
        System.out.println("当前余额：" + balance);
    }

    public void withdraw(double a) {
        if (balance - a < min) {
            System.out.println("余额不够，至少保留余额：" + min);
        } else {
            balance -= a;
            System.out.println("当前余额：" + balance);
        }
    }

    public void query() {
        System.out.println("您的当前余额：" + balance);
    }

    public static void main(String[] args) {
        Account jame = new Account("111111", "张杰", "浙江大学", 200);
        jame.deposit(350);
        jame.withdraw(300);
        jame.withdraw(300);
        jame.query();
    }
}
