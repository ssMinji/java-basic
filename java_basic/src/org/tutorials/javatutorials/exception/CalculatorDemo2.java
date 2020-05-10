package org.tutorials.javatutorials.exception;

class Calculator2{
    int left, right;
    public void setOprands(int left, int right){
    	// step1
    	if(right == 0){
            throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� �����ϴ�.");
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){
    	
    	//step2
    	if(this.right == 0){
            throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�.");
        }
        try {
            System.out.print("������� ");
            System.out.print(this.left/this.right);
            System.out.print(" �Դϴ�.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 0);
		c1.divide();
		
		// step2
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
        
        // ����
        // throw�� ���ܸ� �߻���Ű�� ����̴�. 
        //throw �ڿ��� ���� ������ ������ �ִ� ���� Ŭ������ ��ġ�Ѵ�. 
        //�ڹ� ���� �ӽ��� �� Ŭ������ �������� � catch ������ ������ �������� �����Ѵ�. 
        //�� ����Ǵ� catch ���������� ���� Ŭ������ ���ؼ� ���� ��Ȳ�� ���ο� ���� �پ��� ������ ���� �� �ִ�. 
        //�� ������ �������� ������ �ذ��ϰ� �ȴ�.

	}

}
