package day02;

public class Student {
	
	int studentId;  //������� = �Ķ������� ��Ÿ��
	String studentName;
	int grade;
	String address;
 	
	/*
	 * Ŭ������ ��κ� �빮�ڷ� ����
	 * �ϳ��� java ���Ͽ� �ϳ��� Ŭ������ �δ� ���� ��Ģ�̳�, �������� ũ������ ���� �ִ� ���
	 * public Ŭ������ �� �ϳ��̸� publicŬ������ �ڹ� ������ �̸��� �����ؾ��� 
	 * 
	 * �ڹ��� ��� �ڵ�� Ŭ���� ���ο� �ۼ��ؾ� �� 
	 * */
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	// ���� �޼��尡 ����
	public static void main(String[] args){
		Student studentLee = new Student();
		studentLee.studentName = "ȫ�浿";
		studentLee.address = "�����";
		
		studentLee.showStudentInfo();
	}
	
	/*
	 * ��Ű�� - �ҽ��� ���� 
	 * ��Ű���� �ܼ���  Ŭ���� ������ �ƴ� ������Ʈ ��ü �ҽ� �ڵ带 �����ϴ� ���� ������ ��. ���� ��Ű���� ���� ���� ����� �۾��� �ҽ� �ڵ带 ��� ���� ������ ������ �� �����ϴ� ��
	 * */
	
	
	// �޼��� �����غ��� 
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name; 
	}

}
