package com.itbank.javatutorials.day03;

// �����ε��� ���
public class OverloadingDemo3 extends OverloadingDemo2 {
	
	// �����ε� �޼ҵ�
	public void A(String arg1, String arg2) {
		System.out.println("sub class:void A(String arg1, String arg2) ");
	}
	
	// �θ�Ŭ������ �ִ� A() �޼ҵ� ��������
	// �������̵� �޼ҵ�
	@Override
	public void A() {
		System.out.println("sub class: void A()");
	}

	public static void main(String[] args) {
		OverloadingDemo3 o1 = new OverloadingDemo3();
		o1.A();
		o1.A("hello", "hello2");

	}

}
