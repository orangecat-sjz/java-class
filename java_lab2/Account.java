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
        System.out.println("���˻�ԭ����" + balance);
        System.out.println("�ִ��룺" + a);
        balance += a;
        System.out.println("��ǰ��" + balance);
    }

    public void withdraw(double a) {
        if (balance - a < min) {
            System.out.println("���������ٱ�����" + min);
        } else {
            balance -= a;
            System.out.println("��ǰ��" + balance);
        }
    }

    public void query() {
        System.out.println("���ĵ�ǰ��" + balance);
    }

    public static void main(String[] args) {
        Account jame = new Account("111111", "�Ž�", "�㽭��ѧ", 200);
        jame.deposit(350);
        jame.withdraw(300);
        jame.withdraw(300);
        jame.query();
    }
}
