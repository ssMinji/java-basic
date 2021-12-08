package org.tutorials.javatutorials.oop;

// �޼ҵ� ���� 
class Calculator{
	int a, b;
	
	// Quiz 
	// a, b�� �����ϴ� �Լ� ������ 
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 1. ����� �޼��� 
	public int sum(int num1, int num2) { // �����ڷ��� ��� 
		return num1+num2;
	}
	
	// 2. �Է°� ���� �޼ҵ�
	public int avg() {
		//return (this.a + this.b) / 2;
		return a+b;
	}
	
	// 3. return �� ���� �޼ҵ�
	public void sum2(int num1, int num2) { // �����ڷ��� ��� 
		System.out.println(num1+"�� "+num2+"�� ���� "+(num1+num2)+"�Դϴ�.");
	}
	
	// 4. void������ return ���
	// return ������ �̿��� �޼��� ���������� ����� void������ ���� 
	public void matchVersion(String version) {
		if ("V1".equals(version)) {
			return;
		}
		System.out.println("���� ������ " + version + " �Դϴ�.");
	}
	
}
public class No02_Calculator {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		Calculator calc = new Calculator();
		// 1
		System.out.println(calc.sum(a, b));
		
		// 2
		int c = calc.avg();
		System.out.println(c);
		
		// 3
		calc.sum2(3,  4);
		
		// 4
		calc.matchVersion("V1"); // ��������ʰ� �޼��� ��� �������� 
		calc.matchVersion("V2");
		
	}

}
