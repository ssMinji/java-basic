package com.itbank.javatutorials.interfaces;

// ������(Polymorphism)
// �ϳ��� �޼ҵ尡 Ŭ������ ���� �� �̰͵��� �پ��� ������� �����ϴ� �� 
// �޼ҵ�� ���������� �� ��û�� �޴� ���� Ŭ������ ���� ���۹���� �޶����� ��

class D{
	// �����ε�(Overloading)
	public void a(int param) {
		System.out.println("�������"+param);
	}
	public void a(String param) {
		System.out.println("�������"+param);
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		D d = new D();
		d.a(1);
		d.a("one");
		
		// �������� ���彬�� ������ �����ε�
		// ���� �޼ҵ������� �Ű������� ���Ŀ� ���� �ٸ� ���� ���� ����

	}

}
