package com.itbank.javatutorials.interfaces;

// ��¥Ŭ����
// ���߿� ��ü���� ������ ��������� ����� �� ���� ���̶�� �����ϰ� 
// ������ ������ �����ϴ� ��
/*class CalculatorDummy {
	public void setOprands(int first, int second, int third) {}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}*/

// �������̽� ���� �� 
// ���߿� �� ���� Ŭ������ ���� �ϼ��� Ŭ������ ��ü�� �� 
// �����̳� ������ �޶����� �ʴ´ٴ� ���� ������� �� ���� 
class CalculatorDummy implements Calculatable{
	public void setOprands(int first, int second, int third) {}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}
}


public class CalculatorConsumer {

	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum());
		System.out.println(c.avg());
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20, 30);
		System.out.println(c1.sum());
		System.out.println(c1.avg());
		
		// ���������忡�� ���� �ٸ� ������ ������ �����ϰ� �Ǵ� ��Ȳ�� �������ִ� �� 
		
	}

}
