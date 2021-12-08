package reference;

public class Student {
	int studentId;
	String studentName;
	
//	int koreanScore;
//	int mathScore;
//	String koreanSubject;
//	String mathSubject;
//	
//	int engScore;
//	String engSubject;
	// ������ ������ �л��� ������ �ִ� �����̱⵵ ������ ���� Ŭ������ �и��� ���� �� �� �� ����

	// ���� Ŭ���� �����پ��� 
	Subject korean;
	Subject math;
	// ����: �����Ѵٰ� Ŭ������ ����������. ���� student�� ������ �� �Բ� ������ִ°� ����
	
	public Student() {
		korean = new Subject();
		math = new Subject();
	}
	
	// �л� ��ü ���� �� id, name ���� �ʼ� 
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		//korean.subjectName = name; 
		korean.setSubjectName(name);
		korean.setScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		// total????
		//int total = korean.score + math.score;
		int total = korean.getScore() + math.getScore();
		System.out.println(studentName + "�л��� ������: " + total + "�� �Դϴ�");
	}
	
}











