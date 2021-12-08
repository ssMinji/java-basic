package org.tutorials.javatutorials.oop;


class C1{
	static int base = 10;
	int a, b;
	int c = 3;
	
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// �ν��Ͻ� �޼ҵ�� Ŭ���� ������ ���� ���� 
	public void sum() {
		System.out.println(this.a + this.b + base);
	}

	// Ŭ���� �޼ҵ�� Ŭ���� ������ ���� ����
	public static void static_multiply() {
		System.out.println(base*10);
	}
	
	// Ŭ���� �޼ҵ�� �ν��Ͻ� ������ ���� �Ұ� 
	public static void static_sum() {
		//System.out.println(c + base);
	}
}
public class No03_StaticDemo {
	

	public static void main(String[] args) {
		
		/*�ν��Ͻ� �޼ҵ�� Ŭ���� ����� ������ �� �ִ�. 
		Ŭ���� �޼ҵ�� �ν��Ͻ� ����� ������ �� ����. 
		�ν��Ͻ� ������ �ν��Ͻ��� ��������鼭 �����Ǵµ�, 
		Ŭ���� �޼ҵ�� �ν��Ͻ��� �����Ǳ� ���� ��������� ������ Ŭ���� �޼ҵ尡 �ν��Ͻ� ����� �����ϴ� ���� �������� �ʴ� �ν��Ͻ� ������ �����ϴ� �Ͱ� ����.*/
		C1 c = new C1();
		c.setNum(3,  4);
		
		// �ν��Ͻ� �޼ҵ� ȣ��
		c.sum(); // 17
		
		// Ŭ���� �޼ҵ� ȣ�� - Ŭ���� ������ ���� ���� 
		c.static_multiply(); // 100
		
		// �ν��Ͻ� �������� �ٷ� Ŭ���� �޼ҵ� ȣ��
		C1.static_multiply(); // 100 
		
	}

}
