package com.itbank.javatutorials.abstracts;

// �߻�ȭ 
abstract class Ex {
	// final: ���/������ �����ϴ� ���� -> ������� ���Ǵ� Ű���� 
	// public static Ű����� �������ִ� ���� �Ϲ���
	// static: Ŭ���� ����
	public static final int BASE = 10; // ���
	
	public abstract int b();
	// �߻�޼ҵ�� ��ü�� ���� �� ���� 
	
	// public abstract void c() {System.out.println("hello");};
	
	public void d() {
		System.out.println("hello");
	}
}

// b() �޼ҵ�� �߻�޼ҵ��̰�, �߻�޼ҵ��� Ư¡�� �߰�ȣ�� �����ϴ� ��ü�� �������� ����
// ��, ��ü���� ������ ����ִ� ��ü�� ����, �ñ״�ó���� �����ִ� �޼ҵ�
class B extends Ex {
	// �޼ҵ带 �ݵ�� '�������̵�'�ؼ� ��ü���� ������ ��������� �� 
	public int b() {
		return 1;
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		//Ex obj = new Ex();
		// ����
		// �߻�Ŭ������ �ݵ�� ����ؼ� ����ؾ� �� 
		
		B obj = new B();
		System.out.println(obj.b());
		
		//  �߻�Ŭ������ ����ϴ� ���� -> ����� �����ϱ� ����
		
		// Ex��� Ŭ������  abstract Ŭ������ ���� �����ߴٱ⺸�ٴ�
		// b��� �޼ҵ尡 �߻�޼ҵ��̱� ������ �̸� ������ �ִ� Ŭ���� Ex�� �ڵ����� �߻�Ŭ�������Ȱ�
		// �޼ҵ� �� �ϳ��� �߻�޼ҵ��̸� �� �޼ҵ带 ��� �ִ� Ŭ������ abstract Ŭ������ �� 

	}

}
