
package org.tutorials.javatutorials.oop;


//Ŭ���� ����� �ν��Ͻ� ���
class Calculator6 {
	// static�� �ɹ�(����,�޼ҵ�) �տ� ���̸� Ŭ������ �ɹ��� �ȴ�.
	static int base = 10;
	int a, b;
	
	// � �޼ҵ庸�ٵ� ���� ����� 
	// ��ü�� ���� ���� �ؾ��� ��, �� �ʱ�ȭ�� �����ϰ� �� 
	// �������� �̸��� Ŭ������ �̸��� �����ϴ�. �ſ� �߿�!!! 
	public Calculator6(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int sum() {
		return this.a + this.b + base;
	}
	
	public int avg() {
		return (this.a + this.b)/2 ;
	}
	
	// Ŭ���� �޼ҵ� ���� 
	public static int multiply(int c, int d) {
		return c * d;
	}
		
}
public class No06_ConstructorDemo {
	
	public static void main(String[] args) {
		
		// before 
		Calculator2 calc = new Calculator2();
		calc.setNum(3, 5);
		System.out.println(calc.sum()); // 18
		
		// �̷��� ���� �ʱⰪ ������ ��ü ���� ��ÿ� ������ 
		// ��ü�� ����� �� �ݵ�� �ؾ��ϴ� ���� ��ġ�� ���� �� �ֵ��� �� 
		// �Ǽ��� setNum�� ���� �ʴ� ������ ���� 
		Calculator6 calc2 = new Calculator6(3, 5);
		
		// ���
		// Ŭ���� ������ ��, ������ ������ �ڵ� ��������. 
		// ��ü ������ ��, new �ڿ� ���� ���� Ŭ������ �����ڿ���. 
		

	}

}
