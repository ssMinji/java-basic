package com.itbank.javatutorials.day03;

class Calculator7{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public int sum() {
		return (this.left + this.right);
	}
	
	public int avg() {
		return (this.left + this.right)/2;
	}
	
}

class OverrideCalc extends Calculator7{
	public void devision() {
		System.out.println(this.left / this.right);
	}
	
	@Override
	public int avg() {
		// �θ�޼ҵ忡 ���ǵǾ��ִ� �޼ҵ带 ȣ��
		return super.avg();
		//���� �߰� 
	}
}
public class OverridingDemo3 {
	public static void main(String[] args) {
		/*
		 * Calculator7 Ŭ���� ����
		 * left, right ���� �ʿ�(int ������Ÿ��)
		 * left, right ���� �ʱ�ȭ���ִ� �޼ҵ��� setOprands �޼ҵ� �ʿ�
		 * �� ���� �� ���ϴ� �޼ҵ� �ۼ�(void ����Ÿ��)
		 * �� ���� ��� ���ϴ� �޼ҵ�(int ����Ÿ��)
		 * 
		 * Calculator7 Ŭ���� ��ӹ޴� OverrideCalc Ŭ���� ����
		 * ��ӹ��� �� ���� left, right ������ �������ִ� �޼ҵ�(void����Ÿ��) �ʿ�
		 * ��� ���ϴ� �޼ҵ� �������̵�(��, ��ձ��ϴ� ������ �ٲ�������)
		 * 
		 * */
		
		// superŰ���� Ȱ���� �������̵�
		// superŰ���� �ؿ� ���� �߰��ϸ� �߰� ��� ���� ����
		
		// �������̵��� ��Ģ
		// 1. �޼ҵ��� ����(Signature)�� �����ؾ��Ѵ�.
		// ---> 1) �޼ҵ��� �̸� 2) �޼ҵ��� �Ű������� ����, ������Ÿ��, ����
		//      3) �޼ҵ��� ����Ÿ�� 
		// ���: �������̵��� �θ�Ŭ������ �������ִ� ����� �ʿ信 ���� �����ϴ� �� 
		//      �ڽĸ޼ҵ尡 �θ�޼ҵ带 ȣ���ϱ� ���ؼ���  superŰ���� ����Ѵ�.
		
	}
}
