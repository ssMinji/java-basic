package org.tutorials.javatutorials.oop;

public class No05_ScopeDemo {
	
	public static void a() {
		int i = 0; // i��� ������ a��� �޼ҵ� �ȿ��� ����ǰ������Ƿ� i�� a �޼ҵ� �ۿ��� ���� ��ġ�� ���� --> ������
	}

	public static void main(String[] args) {
		// ������� ������ 0�� �ɱ�?
		for (int i=0; i<5; i++) {
			a(); 
			System.out.println(i);
		}

	}

}
