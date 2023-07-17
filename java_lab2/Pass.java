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

public class Pass { // 注意划线部分(1)和(2)需要补充完整
	private static void status(Student stu, School sch) {
		if ((stu.getTotal() > sch.getLine()) || (stu.getSports() > 96 && stu.getTotal() > 300))
			System.out.println(stu.getMessage() + "  被录取");
		else
			System.out.println(stu.getMessage() + "  没有被录取");
	}

	public static void main(String[] args) {
		School sch1 = new School(350);
		Student stu1 = new Student("李成", "2009001", 320, 98);
		Student stu2 = new Student("张名", "2009012", 386, 90);
		Student stu3 = new Student("黄影", "2009322", 345, 95);
		status(stu1, sch1);
		status(stu2, sch1);
		status(stu3, sch1);
	}
}
