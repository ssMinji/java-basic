package com.itbank.javatutorials.interfaces;

class E{
	public String x() {
		return "E.x";
	}
}

class F extends E{
	public String x() {
		return "F.x";
	}
	
	public String y() {
		return "y";
	}
}


public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// Ŭ���� F�� �ν��Ͻ��� ���������, �̴� Ŭ���� E�� ������Ÿ���� �༼�� �ϰ� �ִ� �� 
		//F obj1 = new F();
		E obj = new F();
		System.out.println(obj.x());// F.x
		//obj.y(); // ���� 
		
		// obj�� Ŭ���� E�� �༼�� �ϰ� �ֱ� ������
		// x�� ȣ���ϴ� ���� ���������� ����������
		// E�� ������ ���� ���� y�޼ҵ�� ȣ�� �Ұ��� 
		
		// ���
		// Ŭ������ �ν��Ͻ�ȭ�� �� �ν��Ͻ��� ��� ������ ������Ÿ����
		// �ش� Ŭ������ �� ���� �ְ�, �� Ŭ������ �θ�Ŭ������ �� ���� ���� 
		
		// �������̵� �Լ� -> �ڽ�Ŭ������ �޼ҵ� ȣ�� 
		// �ᱹ���� EŬ���� �༼�� �ϰ� ������ �޼ҵ� x��� ����? F�� ����� 
		
		// ���
		// Ŭ���� F���� �߰������� ������ �޼ҵ�(y())�� ������� �ʴ´ٴ� ��
		// �������̵��� �޼ҵ尡 �ִٸ� �ν��Ͻ�ȭ ��Ų Ŭ������ �޼ҵ带 �����Ŵ

	}

}
