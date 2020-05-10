package org.tutorials.javatutorials.exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    // step1
    // ����: Exception in thread "main" ������� java.lang.ArithmeticException: / by zero
    // System.out.print("������� "); ���� ����ǰ� ���� �߻��ߴ�.
    // ��, ���� ȣ���� �κ��� ������ ����
    public void divide(){
        System.out.print("������� ");
        System.out.print(this.left/this.right);
        System.out.print(" �Դϴ�.");
    }
    
    // step2
    // �ϸ鼭 ppt
    public void divide(){
        try {
            System.out.print("������� ");
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
        } catch(Exception e){
            System.out.println("������ �߻��߽��ϴ� : "+e.getMessage());
            
            // step3
            
            /*
             * ������ �� 
             * 1. e.getMessage(): / by zero
             * 2. e.toString(): java.lang.ArithmeticException: / by zero
             * 3. e.printStackTrace(): 
					             * java.lang.ArithmeticException: / by zero
						at org.tutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:24)
						at org.tutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:48)
             * 
             * 1. ������ ���� �⺻���� ������ ������ش�. ������ �ʴ�.
             * 2. ���ܻ�Ȳ�� ���� �� �� �ڼ��� ����. 
             *    ArithmeticException�� �������� ����� �������� �߻��ϴ� ���ܻ�Ȳ �ǹ� 
             * 3. getMessage, toString���� �ٸ��� printStackTrace�� ���ϰ��� ����.
             *     �� �޼ҵ带 ȣ���ϸ� �޼ҵ尡 ���������� ���� ����� ȭ�鿡 ����Ѵ�. 
             *     printStackTrace�� ���� �ڼ��� ���� ������ �����Ѵ�.
             * */
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
            
        }
    }
    
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
        
        // step2
        Calculator c2 = new Calculator();
        c2.setOprands(10, 5);
        c2.divide();
        
        // ������ �߻����� ����
        // ��, �������� ���ø����̼�ó�� �����ϰ� ����. 
        // System.out.print("������� ");���� ����Ǿ����� 
        // System.out.print(this.left/this.right);�� ������� �ʾҴ�. 
    }
}
