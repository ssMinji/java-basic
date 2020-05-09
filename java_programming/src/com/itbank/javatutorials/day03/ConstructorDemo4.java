package com.itbank.javatutorials.day03;

class Calculator4 {
	int left, right;
	
	public Calculator4(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("���� ����?"+(this.left + this.right));
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class AddSubstractCalculator4 extends Calculator4{
	public AddSubstractCalculator4(int left, int right) {
		// super: �θ�Ŭ���� �ǹ� 
		// super(left, right): �θ�Ŭ������ �����ڿ��� left, right���� ����
		// �θ�Ŭ������ �����ڸ� �ڽ�Ŭ������ �����ڿ��� ȣ���ؼ� �����Ű�� �ִ�
		super(left, right);
		// �ڽ�Ŭ���� �ʱ�ȭ�ڵ�...
		
		// ���ǻ���
		// �ڽ�Ŭ������ �ʱ�ȭ�ڵ尡 super�������� ���� �����ؼ��� �ȵȴ�. 
		// ����: �ڽ�Ŭ������ �ν��Ͻ�ȭ�ȴٶ�� ���� ��, �θ�Ŭ������ �̸� �ν��Ͻ�ȭ�� ���Ŀ�
		//      �ڽ�Ŭ������ �ν��Ͻ�ȭ�ȴٴ� �ǹ��̱� ������ �θ�Ŭ������ ���� �ʱ�ȭ���������
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
