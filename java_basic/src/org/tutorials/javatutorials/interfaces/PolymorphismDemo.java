package org.tutorials.javatutorials.interfaces;

class D{
    public void a(int param){
        System.out.println("�������");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("�������");
        System.out.println(param);
    }
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		D d = new D();
		d.a(1);
		d.a("one");

	}
}

// ��, �����ε��� �������� �� ����� �� �� �ִ� 
// �������̵��� ���������� �������� �� ����� �� �� �ִ�. 