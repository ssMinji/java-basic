package com.itbank.javatutorials.day03;

class Calculator2 {
	int left, right;
	
	public Calculator2() {}
//	
	public Calculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
//	public void setOprands(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
	
	public void sum() {
		System.out.println("���� ����?"+(this.left + this.right));
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class AddSubstractCalculator2 extends Calculator2{
	public AddSubstractCalculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo2 {

	public static void main(String[] args) {
		AddSubstractCalculator2 c = new AddSubstractCalculator2(10, 20);
		// setOprands �޼ҵ� ����
		c.sum();
		c.avg();
		c.substract();
		
		// �����޽���
		// Implicit super constructor Calculator2() is undefined.
		// �Ͻ������� �θ�Ŭ������  Calculator2() ��� �����ڰ� ���ǵǾ����� �ʴ�.
		// Must explicitly invoke another constructor
		// ��������� �����ڸ� �������־�߸� �Ѵ�.
		
		// �ڽ�Ŭ������ �ν��Ͻ�ȭ��Ű��, �ڽ�Ŭ������ �����ڸ� ȣ���ϱ� ����
		// �θ�Ŭ������ �����ڸ� �ڵ����� ȣ����
		// �θ�Ŭ������ �⺻�����ڰ� �ƴ� �����ڸ� ��������� �����صξ��ٸ� 
		// �⺻�����ڰ� �������� �ʱ⶧���� ������ �߻�
		
		// ������ �ذ�?
		// �θ�Ŭ������ �⺻������ ���� ����

	}

}
