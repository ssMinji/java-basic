package org.tutorials.javatutorials.day06;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){ this.grade = grade; }
}
class StudentPerson{
	public StudentInfo info;
	StudentPerson(StudentInfo info){ this.info = info; }
}
class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank; }
}
class EmployeePerson{
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){ this.info = info; }
}

// step2
// StudentPerson�� EmployeePersonŬ���� ����������
class Person{
	// ������ ������Ÿ������ �����ؾ� �ϴµ� ����� ����ġ ������ 
	// ���Ŭ������ ������ ������ Object�� ���� 
	public Object info; 
	Person(Object info){ this.info = info; }
}


// step3
class Person<T>{
    public T info;
    Person(T info){ this.info = info; }
}

public class GenericDemo1 {

	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade); // 2
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.rank); // 1

		// ���پ����󰡸鼭 �ڵ� �帧 ���� ���� 

		// step2
		// grade�� rank���� �־���ϴµ� �ڵ忡 ���� ����� ���������ϰų� Ȥ�� �Ǽ���
		// ����� ���� �����ϱ�...�ϸ鼭 "����"�̶�� �־���� -> �ǵ��� ����� ��Ȳ
		// ������ �����߻����� ����
		// ���������δ� ���������� �ڵ尡 ����� �������� �������� ���� 
		// ���߿� ġ������ ������ �߱��� �� �ִ� ���� 
		Person p1 = new Person("����");
		// p1�� info�� Object��� Ÿ���ε� ei�� EmployeeInfo��� ������Ÿ���̱⶧����
		// ����ȯ ������� 

		EmployeeInfo ei = (EmployeeInfo)p1.info;
		System.out.println(ei.rank);

		// �����ϴ�ÿ��� �����߻����ϴٰ� �����Ҷ� �����߻���
		
		// step3
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); // ����
         
        Person<String> p2 = new Person<String>("����");
        String ei2 = p2.info;
        System.out.println(ei2.rank); // ������ ����
        // p2.info�� String�̰� String�� rank �ʵ尡 ���µ� �̸� ȣ���ϰ� �ֱ� ���� 



	}

}
