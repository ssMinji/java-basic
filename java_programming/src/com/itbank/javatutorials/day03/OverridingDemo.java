package com.itbank.javatutorials.day03;

// Overriding(�������̵�) : �޼ҵ� ������
// �θ� ������ �޼ҵ� �߿��� �ڽ�Ŭ�������� �� ����� ����������ν�
// �ڽ�Ŭ������ �������� �޼ҵ带 �����ؾ��ϴ� ��� 
// cf) ��ӵ� �޼ҵ���� ������: ���-> �׳� �����پ���. �ű⿡ ����� �߰��Ѵ�

class Calculator5 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("���� ����?"+this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class SubstractClass extends Calculator5{
	@Override // ������̼�
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		SubstractClass c1 = new SubstractClass();
		c1.setOprands(10, 20);
		c1.sum();
		
		// �������̵�
		// �޼ҵ带 �������̵����ְ�, �� �޼ҵ带 ȣ���ϰ� �Ǹ�
		// �θ�Ŭ������ �ִ� �޼ҵ�� ���ð� �ǰ� �ڽ�Ŭ������ �������ִ� �޼ҵ尡 �����.
		// �θ�Ŭ������ �޼ҵ庸�� ���� �켱������ �����Ѵ�

	}

}
