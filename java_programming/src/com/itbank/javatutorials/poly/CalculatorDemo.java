package com.itbank.javatutorials.poly;

abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public int _sum() {
		return this.left + this.right;
	}
	
	public int _avg() {
		return (this.left+this.right)/2;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class CalculatorKor extends Calculator{
	public void sum() {
		System.out.println("�� ���� ����: "+ _sum());
	}
	public void avg() {
		System.out.println("�� ���� �����: "+ _avg());
	}
}

class CalculatorEng extends Calculator{
	public void sum() {
		System.out.println("Sum of two numbers: " + _sum());
	}
	public void avg() {
		System.out.println("Avg of two numbers: " + _avg());
	}
}

public class CalculatorDemo {
	// cal�� run�� ȣ���ϰ� ����
	public static void execute(Calculator cal) {
		cal.run();
	}
	
	
	// �����ε��� �������� �������� �ؼ� 
	/*public static void execute(CalculatorKor cal) {
		cal.run();
	}
	
	public static void execute(CalculatorEng cal) {
		cal.run();
	}*/
	

	public static void main(String[] args) {
		Calculator c1 = new CalculatorKor();
		c1.setOprands(10, 20);
//		c1.run();
		
		Calculator c2 = new CalculatorEng();
		c2.setOprands(10, 20);
		//c2.run();
		// ���� ������Ÿ���� ������ �ְ�, ������ run�޼ҵ带 �����ϰ� ������
		// Ŭ������ ���� �����ϴ� ����� �޶���
		
		execute(c1);
		execute(c2);

	}

}
