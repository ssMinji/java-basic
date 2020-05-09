package com.itbank.javatutorials.day02;

class C1 {
	// static�� ���(����, �޼���)�տ� ���̸� Ŭ������ ����� ��. 
	static int base = 10;
	// �ν��Ͻ� ���� 
	int a, b;
	
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return a + b + base;
	}
	
	public int avg() {
		return (a+b)/2;
	}
	
	// Ŭ���� �޼��� ���� 
	public static int multiply(int c, int d) {
		return c*d;
	}
	
	// Ŭ���� �޼��尡 �ν��Ͻ� ������ ���� �����Ѱ�? 
	public static void static_multiply() {
		//System.out.println(b + base);
	}
	// ���:Ŭ���� �޼���� �ν��Ͻ� ����� ������ �� ����. 
	// ����? �ν��Ͻ� ������ �ν��Ͻ��� ��������鼭 �����Ǵµ�,
	// Ŭ�����޼���� �ν��Ͻ��� �����Ǳ� ���� ��������� ������ 
	// Ŭ���� �޼��尡 �ν��Ͻ� ����� �����Ѵٴ� ����
	// �������� �ʴ� �ν��Ͻ� ������ �����ϴ� �Ͱ� ����. 
}

public class StaticDemo {

	// public: ����������. ��� �������� �ش� ��ü�� ������ �� �ִ�. 
	// static: �ڹٰ� ������ �Ǵ� ���� ����
	// void: return�� �������� ���� 
	// main: ���α׷��� ����
	public static void main(String[] args) {
		
		C1 c = new C1();
		c.setNum(3, 4);
		System.out.println(c.sum()); //7 -> 17
		System.out.println(c.avg()); //3
		
		// ��� -> ����(field), �޼���(method)
		// Ŭ���� ���  vs �ν��Ͻ� ��� 
		// �ν��Ͻ����� ���� �ٸ� ���� ������ ������ �ν��Ͻ� ���
		// Ŭ���� ����� ��� �ν��Ͻ����� ���� ���� ���� 
		
		// Ŭ���� ����: �ν��Ͻ��� �������� �ʰ� Ŭ������ ���� �����ؼ� 
		// 			Ŭ������ �ҼӵǾ��ִ� ������ ���� ���� 
		// Ŭ���� ����(static field) / �ν��Ͻ� ����(non-static field)
		
		System.out.println(c.base); //10
		
		C1 c2 = new C1();
		System.out.println(c2.base); //10
		
		System.out.println(C1.base); //10
		C1.base = 20; //Ŭ���� ������ ���� 
		
		// ���� ��������� ��� �ν��Ͻ��� ����
		System.out.println(c.base); //20
		System.out.println(c2.base); //20
		
		
		// Ŭ���� �޼��带 Ŭ������ ���� �����ؼ� ȣ�� 
		// ��ȸ��ó�� �� ���� ����ϰ� ������ 
		System.out.println(C1.multiply(4, 2));  // 8
		System.out.println(C1.multiply(3, 5)); // 15
		
		// �޼ҵ尡 �ν��Ͻ� ������ �������� �ʴ´ٸ�, Ŭ���� �޼ҵ带 ���. 
		// ���� ���ʿ��� �ν��Ͻ��� ������ ���� �� �ִ�. 
		C1 calc = new C1();
		calc.multiply(4, 2);
		
		// Ŭ���� ���(����, �޼���)�� ȿ�밡ġ: ���ʿ��� �ν����� ������ ���� ���� 
		// ������ �Ǵ� ���� Ŭ���� ����� ���ǵ� 
	}

}
