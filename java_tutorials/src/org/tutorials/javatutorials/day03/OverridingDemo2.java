package org.tutorials.javatutorials.day03;

// �������̵��� ��������
class Calculator6 {
	int left, right;
	 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
//    public void avg() {
//        System.out.println((this.left + this.right) / 2);
//    }
	 public int avg() {
	    return (this.left + this.right) / 2;
	}
	
}

class SubstractionableCalculator6 extends Calculator6 {
	 public void sum() {
	        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
	 }
	 
	 @Override
//	 public int avg() {
//	        return (this.left + this.right) / 2;
//	 }
	 // ���� ������ �ذ��ϱ� ���ؼ��� �θ�Ŭ������ avg ����Ÿ���� int�� �ٲٰ� ���� 
	 public int avg() {
		 
		 return super.avg();
		 
	 }
	 
	 public void substract() {
		 System.out.println(this.left - this.right);
	 }
	 
}

public class OverridingDemo2 {

	public static void main(String[] args) {
		SubstractionableCalculator6 c1 = new SubstractionableCalculator6();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();

	}

}
