package org.tutorials.javatutorials.same;
import org.tutorials.javatutorials.other.*;
// ���������ڿ� ���� ��� �����ϴ��� Ȯ�� 

// 1) ���� Ŭ����
class SameClassChecker {
	//������ --> �ڱ� �ڽſ� ���ǵǾ��ִ� �޼ҵ�� ȣ���ϰ����� 
	// ���� Ŭ������ �����ϸ� ��� ���������ڿ� ���� ���� ���� 
	public SameClassChecker() {
		// ���� Ŭ������ �����ϴ� �޼ҵ�� 
		this._public();
		this._protected();
		this._default();
		this._private();
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

//2) ���� ��Ű�� 
class SamePackageChecker extends Same {
	// ������
	public SamePackageChecker() {
		// ���� ��Ű��
		// Same�� �ν��Ͻ�ȭ
		Same same = new Same();
		same._public(); // ���ٰ���
		same._protected(); // ���ٰ���
		same._default(); // ���ٰ��� 
		//same._private(); // ���� �Ұ���
		
		// ���� ��Ű�� ��Ӱ��� (Same�� ��ӹ޾���)
		// ���⼭ this
		// this�� Ŭ���� �ڱ��ڽ��� �ǹ������� 
		// Ŭ������ � Ŭ������ ��ӹ޾Ұ�, �ڱ��ڽ��� Ŭ�������� �������ִ�
		// �޼ҵ尡 �������� ������ �θ�Ŭ�������� �޼ҵ带 ã�Ե�.
		// ���� this�� �޼ҵ���� �θ�Ŭ������ �޼ҵ���μ�
		this._public(); //���ٰ���
		this._protected();//���ٰ���
		this._default();//���ٰ���
		//this._private(); // ���ٺҰ���
	}
}

// 3) �ٸ���Ű��
class OtherPackageChecker extends Other{
	public OtherPackageChecker() {
		// �ٸ� ��Ű��
		Other other = new Other();
		other._public(); // ���� ����
//		other._protected(); //���ٺҰ���
		//other._default(); //���ٺҰ���
		//other._private(); //���ٺҰ���
		
		// �ٸ� ��Ű��, �ڽ�Ŭ����
		this._public();
		this._protected(); // ��Ӱ����� protected�� ���� ����
		//this._default();
		//this._private();
		
		// ��⼭ protected�� default�� ���� �̹��� ���� 
		// ����̳� �ƴϳĿ� ���� ���� ���� ���ΰ� �޶���

	}
}

public class Checker {

	public static void main(String[] args) {
		// �ٸ� ��Ű��
		Other other = new Other();
		other._public();
		
	}

}
