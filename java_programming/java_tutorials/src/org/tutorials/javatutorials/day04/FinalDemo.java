package org.tutorials.javatutorials.day04;

class Calculator2 {
	// static�̶�� �ߴ� �ƶ���
	// ��� �ν��Ͻ����� ������ �� �ִ� ���̱� ������ �������
	// ������ �� ���� �ٲ��� �ʴ´ٴ� �ǹ̿��� final�� �ٿ��ִ� ��
    static final int base = 10;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // ����
        //Calculator2.base = 10;
    }
 
    public void sum() {
        System.out.println(this.left + this.right + this.base);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

// final �޼ҵ� 
class Ex1{
	final void b() {}
}

class Ex2 extends Ex1{
	// ����
	// �������̵� �Ұ� 
	// �ش� �޼ҵ� ��� �Ұ� 
	void b() {}
}

public class FinalDemo {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
        System.out.println(c1.base);
        // ���� 
        //Calculator.PI = 10;

        // ���
        // �ܼ��� ��� �뵵�δ� ������ ���� ���� ��
        // �޼ҵ� ������ ���� �� - final������ŭ ���󵵰� ������ ���� 
        // finalŬ������ �ش� Ŭ������ ������� ��ü�� ����� ���� 
	}

}
