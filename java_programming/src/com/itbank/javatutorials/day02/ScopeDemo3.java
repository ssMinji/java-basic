package com.itbank.javatutorials.day02;

public class ScopeDemo3 {
	static int i = 5;
	
	public static void a() {
		int i = 10;
		b();
	}
	
	public static void b() {
		//int i = 30;
		System.out.println(i);
	}

	public static void main(String[] args) {
		a(); // 5
		
		// �� 5�� ��µǾ�����?
		// 1. a()�� ȣ���� main�� ���������� ������ ���� ������ Ȯ�� 
		int i = 1;
		a(); // �Ȱ��� 5
		
		// 2. b()�޼ҵ� �����غ��� 
		a(); // 30
		// i�� b�� �������� ��������� �ǹ�. 
		// ���� �������� i�� ���ٸ�, �������� i�� ����. 
		
		// ���
		// b��� �޼ҵ带 ȣ���ϰ� �ִ� �޼ҵ��(a, main)�� ������ �ִ� ������������
		// b�� ������ �ִ� ������ ������ ��ġ�� ����.
		
		// b��� �޼ҵ带 ���� ȣ���ߴ����� �߿����� ����. 
		// �޼ҵ� �ڱ��ڽ�, Ȥ�� ������������ ������ �� �ִ� -> ������ ��ȿ����(static(lexical) scope) 
		// ����, b�� ȣ���� a �޼ҵ忡���� i���� ��µǾ��ٸ� -> ������ ��ȿ����(dynamic scope)
		
		

	}

}
