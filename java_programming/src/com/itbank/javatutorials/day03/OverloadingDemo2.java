package com.itbank.javatutorials.day03;

// �����ε��� ��������
public class OverloadingDemo2 {
	public void A() {
		System.out.println("void A()");
	}

	public void A(int num) {
		System.out.println("void A(int num)");
	}
	
	public void A(String str) {
		System.out.println("void A (String str)");
	}
	
	// ���� �߻�
	// �޼ҵ� �̸��� �Ű����� ������ �����ϰ� ����Ÿ���� �޶����� �� �Ұ���
//	public String A(String str) {
//		return str;
//	}
	
	public void B() {
		System.out.println("int B()");
	}
	
	
	public static void main(String[] args) {
		OverloadingDemo2 o = new OverloadingDemo2();
		o.A(); 
		o.A(2);
		o.A("Hello");
		o.B();
//		o.B(1);

	}

}
