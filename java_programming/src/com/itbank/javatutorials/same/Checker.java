package com.itbank.javatutorials.same;

import com.itbank.javatutorials.other.*;

class SamePackageChecker extends Same{
	// ������
	public SamePackageChecker() {
		// ���� ��Ű�� ���� �ִ� Same�� �ν��Ͻ�ȭ
		Same same = new Same();
		same._public(); //���ٰ���
		same._protected(); // ���ٰ���
		same._default(); // ���ٰ��� 
		//same._private(); // ���ٺҰ���
		
		// Ŭ������ � Ŭ������ ��� �޾Ұ�, �ڱ��ڽ��� Ŭ���� ���� 
		// �������ִ� �޼ҵ尡 �������� ������, �θ�Ŭ�������� �޼ҵ带 ã�� ��
		// ���� ���⼭ this �޼ҵ�� �θ�Ŭ������ �޼ҵ�
		this._public(); // ���ٰ���
		this._protected(); // ���ٰ��� 
		this._default(); // ���ٰ���
		//this._private(); // ���ٺҰ���
	}
}
class OtherPackageChecker extends Other{
	public OtherPackageChecker() {
		// �ٸ� ��Ű���� Ŭ���� ���� ���ɿ���
		Other other = new Other();
		other._public(); // ���ٰ���
		// other._protected();// ���ٺҰ���
		// other._default(); // ���ٺҰ���
		// other._private(); //���ٺҰ���
		
		// �ٸ���Ű��, �ڽ�Ŭ���� 
		this._public(); // ���ٰ���
		this._protected(); // ���� ����
		//this._default(); // ���� �Ұ���
		//this._private(); // ���� �Ұ���
	}
	
}

class SameClassChecker {
	// ������
	public SameClassChecker() {
		// ���� Ŭ���� ���� �����ϴ� �޼ҵ� ȣ�� 
		this._public(); // ���ٰ���
		this._protected(); // ���ٰ���
		this._default(); // ���ٰ���
		this._private(); // ���ٰ��� 
		// ���: ���� Ŭ������ �����ϸ� ���  ���������ڿ� ���� ���� ���� 
	}
	
	public void _public() {
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	void _default() {
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}
}



public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
