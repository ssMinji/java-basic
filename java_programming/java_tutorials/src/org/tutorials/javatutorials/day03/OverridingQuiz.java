package org.tutorials.javatutorials.day03;

class Calculator7 {
	int left, right;
	 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }

	 public int avg() {
	    return (this.left + this.right) / 2;
	}
	
}

class SubstractionableCalculator7 extends Calculator7 {
	 public void sum() {
	        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
	 }
	 
	 @Override
	 public int avg() {
		 int a = super.avg();
		 int b = this.left + this.right;
		 return a+b;
		 
	 }
	 
	 public void substract() {
		 System.out.println(this.left - this.right);
	 }
	 
}

public class OverridingQuiz {

	public static void main(String[] args) {
		// �ǽ�
		/*
		 * Calculator Ŭ������ �ִ� avg �޼ҵ带 �������̵� �غ��ô�
		 * �̶�, �� ���� ����� ���ϴ� ������ ������
		 * �ڽ�Ŭ������ avg�޼ҵ忡���� �� ���� ����� ���ϰ�,�ű⿡ �� ���� ���� ������ ���� 
		 * ���ϰ��� �մϴ�. 
		 * */
		SubstractionableCalculator7 c1 = new SubstractionableCalculator7();
        c1.setOprands(10, 20);
        System.out.println(c1.avg()); //45
	}

}
