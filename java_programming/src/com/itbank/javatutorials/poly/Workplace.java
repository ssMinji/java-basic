package com.itbank.javatutorials.poly;

interface programmer{
	public void coding();
}

interface tutor {
	public void tutoring();
}

interface youtuber{
	public void fliming();
}

class Jack implements programmer, tutor{
	public void coding() {
		System.out.println("takes 2 days");
	}
	public void tutoring() {
		System.out.println("teaches kids");
	}
}

class Jenny implements programmer, youtuber{
	public void coding() {
		System.out.println("takes 3 days");
	}
	public void fliming() {
		System.out.println("fliming video");
	}
}

public class Workplace {

	public static void main(String[] args) {
		// ���� Workplace, �� �����̶�� ������ �� ������ ����� ���� �ֱ� ������
		// ���α׷��� �̿��� ����� �ʿ䰡 ���� 
		// ���� �������̽� �� programmer�� ������Ÿ���� �����ϸ� �ٸ� �������̽������� ����� 
		// ��� ����� ������
		programmer emp1 = new Jack();
		programmer emp2 = new Jenny();
		
		// coding�� ��û��
		emp1.coding();
		emp2.coding();
		//emp1.tutoring();
		// emp2.fliming();
		
		// ����, ���̶�� ����
		Jack jack = new Jack(); // coding, tutoring
		Jenny jenny = new Jenny(); // coding, fliming 

	}

}
