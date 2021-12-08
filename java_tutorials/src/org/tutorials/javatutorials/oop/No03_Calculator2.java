package org.tutorials.javatutorials.oop;


// Ŭ���� ����� �ν��Ͻ� ���
class Calculator2 {
	// static�� �ɹ�(����,�޼ҵ�) �տ� ���̸� Ŭ������ �ɹ��� �ȴ�.
	static int base = 10;
	int a, b;
	
	public void setNum(int a, int b) {
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
public class No03_Calculator2 {
	
	public static void main(String[] args) {
		// ���-> ����, �޼ҵ� 
		/*�ν��Ͻ����� ���� �ٸ� ���� ������ ������ �ν��Ͻ��� ��� 
		Ŭ���� ����� ��� �ν��Ͻ����� ���� ���� ����
		
		������ field�� �� 
		Ŭ���� ������? 
		�ν��Ͻ��� �������� �ʰ� Ŭ������ ���� �����ؼ� Ŭ������ �ҼӵǾ��ִ� ������ �����ؼ� ����� �� �ִ�. 
		 
		*/
		
		// base�� ���������� �˰����� �� �ν��Ͻ� �������� �� �� ���� 
		System.out.println(Calculator2.base);
		
		Calculator2 calc = new Calculator2();
		calc.setNum(3, 5);
		System.out.println(calc.sum()); // 18
		
		// Ŭ���� ������ ����
		Calculator2.base = 20;
		System.out.println(Calculator2.base); // 20 
		// ���� ������� ��� �ν��Ͻ��� ����
		System.out.println(calc.sum()); // 28
		
		/*Ŭ���� �޼ҵ��?
		 �޼ҵ尡 �ν��Ͻ� ������ �������� �ʴ´ٸ� Ŭ���� �޼ҵ带 ����ؼ� ���ʿ��� �ν��Ͻ��� ������ ���� �� �ִ�. 
		�ν��Ͻ� ����: non-static field / Ŭ���� ����: static field 
		
		*/
		
		// ���¸� ������ �ʿ���� Ŭ������ ���� ������ �޼ҵ� �̿� 
		// ��ȸ��ó�� �ѹ��� ����ϰ� ���� ��, ���� �ν��Ͻ� ������ �޸� ������� ���� ���� Ŭ���� ������ �޼ҵ� ��� 
		System.out.println(Calculator2.multiply(10, 30));
		System.out.println(Calculator2.multiply(40, 50));
		

	}

}
