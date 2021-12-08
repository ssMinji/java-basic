package classpart;

public class Student {
	// Ŭ������ Ǯ����: classpart.Student 
	
	// �л��� ������ �Ӽ� 
	// �Ӽ� -> Ŭ������ ���������� �� 
	int studentId;
	String studentName;
	int grade;
	String address;
	
	// ����Ʈ ������: constructor 
	// ����� ���� �����ڰ� ������ ����Ʈ �����ڴ� ��������� ���� 
	public Student() {
		
	}
	
	// �л� ��ü ���� �� ������ �̸��� ������ �����ؾ� �Ѵٴ� �䱸������ ���� �� 
	// ����� ���� ������ 
	public Student(String name) {
		// ��� ������ �־��� 
		studentName = name;
	}
	
	/*
	 * ������ �����ε�(Overloading) 
	 * �̸��� �����ص�, �Է¹޴� �Ķ������ ������ Ÿ���� �ٸ��� �ٸ� �޼���� �ν��� 
	 * �����ڴ� ��ȯ Ÿ���� ���� new Ű���带 ���ؼ��� ȣ�� �� 
	 * */
	
	// ���� -> �޼��� 
	// void : ����Ÿ�� ���� 
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	public static void main(String[] args) {

		// Student: ������ ������ Ÿ�� 
		// studentLee: �������� -> �޸𸮿� ������ �ν��Ͻ��� ����Ű�� ���� 
//		Student studentLee = new Student();
//		studentLee.studentName = "ȫ�浿";
//		studentLee.address = "�����";
//		
//		studentLee.showStudentInfo();
//		
//		Student studentKim = new Student();
//		studentKim.studentName = "��ö��";
//		studentKim.address = "��⵵";
//		
//		studentKim.showStudentInfo();
//		
//		System.out.println(studentLee);
//		System.out.println(studentKim);
		
		Student studentLee = new Student("ȫ�浿");
		// ��ü ���� ������ �̸� ���� ���� 
		
		Student studentKim = new Student();
		// ����Ʈ�����ڸ� ���� ������ָ� ��ü ���� ���� 
	}

}


