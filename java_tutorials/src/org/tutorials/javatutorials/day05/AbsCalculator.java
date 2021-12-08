package org.tutorials.javatutorials.day05;

abstract class Calculator1{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
    
    
    // �ڵ� �����ϱ�
    // ���������ڰ� �������� �ʴ� ���� default ���������� 
    // ���� ��Ű���ȿ����� ����� �� �ִ� ����������
    // ���� �ٸ� ��Ű�������� ���� �Ұ��� 
    int _sum() {
    	return this.left+this.right;
    }
    int _avg() {
    	return (this.left+this.right)/2;
    }
}

// ��ӹ��� �� ����ڰ� ���� ����
class CalculatorKor extends Calculator1 {
    public void sum(){
        System.out.println("�� ���� ���� sum :"+(this.left+this.right));
        
        // ���� ��
        // System.out.println("�� ���� ���� sum :"+ _sum());
    }
    public void avg(){
        System.out.println("�� ���� ����� avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorEng extends Calculator1 {
    public void sum(){
        System.out.println("Sum of two numbers:"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("Average of two numbers:"+(this.left+this.right)/2);
    }
} 

public class AbsCalculator {

	public static void main(String[] args) {
		CalculatorKor c1 = new CalculatorKor();
        c1.setOprands(10, 20); // �θ�Ŭ������ �ִ� �޼ҵ� 
        c1.run();
         
        CalculatorEng c2 = new CalculatorEng();
        c2.setOprands(10, 20);
        c2.run();
        
        // ����Ŭ������ �⺻������ ������ �ִ� setOprands��� �޼ҵ��
        // �� �޼ҵ忡 ���� �����̳� ������ ����Ŭ������ ������ �� �ְ� �Ǵ°�
        // �� �׳� ���� �ᵵ �ȴ�
        // sum()�� �ڽ�Ŭ�������� ������ ���� ȣ��Ǵ� ���̴�. 
        // run()�� � ������ �޼ҵ带 ȣ���ϴ����� ���� �޼ҵ��̰�,
        // �̴� ��� ��쿡 �����̴�. 
        

	}

}
