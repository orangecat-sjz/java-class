class School {
	int line;

	School(int l) {
		line = l;
	}

	public void setline(int l) {
		line = l;
	}

	public int getLine() {
		return line;
	}
}

class Student {
	String name;
	String id;
	int total;
	int sports;

	Student(String s1, String s2, int t, int s) {
		name = s1;
		id = s2;
		total = t;
		sports = s;
	}

	public int getTotal() {
		return total;
	}

	public int getSports() {
		return sports;
	}

	public String getMessage() {
		String s = id + " " + name + " " + Integer.toString(total) + " " + Integer.toString(sports);
		return s;
	}
}

public class Pass { // ע�⻮�߲���(1)��(2)��Ҫ��������
	private static void status(Student stu, School sch) {
		if ((stu.getTotal() > sch.getLine()) || (stu.getSports() > 96 && stu.getTotal() > 300))
			System.out.println(stu.getMessage() + "  ��¼ȡ");
		else
			System.out.println(stu.getMessage() + "  û�б�¼ȡ");
	}

	public static void main(String[] args) {
		School sch1 = new School(350);
		Student stu1 = new Student("���", "2009001", 320, 98);
		Student stu2 = new Student("����", "2009012", 386, 90);
		Student stu3 = new Student("��Ӱ", "2009322", 345, 95);
		status(stu1, sch1);
		status(stu2, sch1);
		status(stu3, sch1);
	}
}
