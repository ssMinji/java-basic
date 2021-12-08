package org.tutorials.javatutorials.day03;

// class Calculator extends Object
// ��� Ŭ�������� ����� ����
// �ƹ��͵� ��ӹ��� �ʴٸ� �Ͻ������� ObjectŬ������ ��ӹްԵ�
// https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
// �޼ҵ� ������ ���� ���� ���� �޼ҵ�鵵 �ְ� �ƴ� �͵鵵 �ִµ�, 
// �ᱹ Ŭ������ �����ϰ� �Ǹ� �̷��� �޼ҵ���� ��ӹ޾� �����ִٴ� �ǹ� 
class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class AddSubstractCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

class AddMultiplyCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

class AddDivisionCalculator extends AddMultiplyCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

// ������ ��ɰ�, substract����� �� �� �����鼭�� left���� right������ ���� �����������ϴ� �ִ� Ŭ���� ������ 
class AddRemainderCalculator extends AddSubstractCalculator{
	public void remainder() {
		System.out.println(this.left % this.right);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.setOprands(10,  20);
//		c1.sum();
//		c1.avg();
//		c1.substract();

		AddSubstractCalculator c1 = new AddSubstractCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        
        AddMultiplyCalculator c2 = new AddMultiplyCalculator();
        c2.setOprands(10, 20);
        c2.sum();
        c2.avg();
        c2.multiplication();
        
        AddDivisionCalculator c3 = new AddDivisionCalculator();
        c3.setOprands(10, 20);
        c3.sum();
        c3.avg();
        // c3.substract();
        c3.multiplication();
        c3.division();
	}

}
