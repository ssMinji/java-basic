package org.tutorials.javatutorials.day03;

class Calculator8 {
	int left, right;
	int third = 0; // sum �� avg �޼ҵ��� �ùٸ� ���� ���� �ʱ�ȭ
	 
	public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
	// �޼ҵ� �����ε� 
    public void setOprands(int left, int right, int third){
    	// ��������
        //this.setOprands(left, right);
    	// ������ ��Ȱ�뼺, �ߺ��� ����, ���������� ���Ǽ� ���ÿ� �޼� 
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
 
    public void sum() {
        System.out.println(this.left + this.right+this.third);
    }

	 public int avg() {
	    return (this.left + this.right+this.third) / 2;
	}
	
}


public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator8 c1 = new Calculator8();
//		c1.setOprands(10,  20);
//		c1.setOprands2(10,  20, 30);
		
		c1.setOprands(10,  20);
		c1.sum();
		c1.avg();
		c1.setOprands(10,  20, 30);
		c1.sum();
		c1.avg();
		
	}

}
