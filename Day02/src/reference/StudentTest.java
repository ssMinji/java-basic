package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		// Lee �л��� ��������̸�: ����, ����: 80
		//          ���а����̸�: ���Ͽͺ���, ����: 92
		studentLee.setKorean("����", 80);
		studentLee.setMath("���Ͽͺ���", 92);
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(110, "Kim");
		studentKim.setKorean("��������", 88);
		studentKim.setMath("������", 72);
		
		studentKim.showStudentInfo();
	}

}
