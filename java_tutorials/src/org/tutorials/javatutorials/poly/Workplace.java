package org.tutorials.javatutorials.poly;


interface tutor{
	public void tutoring();
}
interface youtuber{
	public void fliming();
}
interface programmer{
    public void coding();
}

class Jack implements programmer, tutor{
	public void tutoring() {
		System.out.println("teach kids");
	}
    public void coding(){
        System.out.println("take 2 days");
    }
}
class Jenny implements programmer, youtuber{
	public void fliming() {
		System.out.println("flim video");
	}
    public void coding(){
        System.out.println("take 3 days");
    }
}

public class Workplace {

	public static void main(String[] args) {
		// ���� ����.�̶�� ������ �� ����� ������ �ֱ� ������
		// ���α׷��� �̿��� ����� �ʿ䰡 ����. ���� �������̽� �� ���α׷��ӷ� ������ Ÿ����
		// �����ϸ� �ٸ� �������̽������� ����� ��� ����� ����. 
		programmer emp1 = new Jack();
		programmer emp2 = new Jenny();
		
		// coding�� ��û���� ��, �� ������ ��û�� ������
		// �ٸ� ������� ������. ��� ���� �������� �ٽ� 
		emp1.coding(); // take 2 days
		emp2.coding(); // take 3 days
	}

}
