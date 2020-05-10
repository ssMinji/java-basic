package org.tutorials.javatutorials.exception;

// ����� ���� ���� 
class DivideException extends RuntimeException {
    DivideException(){
        super();
    }
    // new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");�̷������� ���ֱ� ����
    // �θ������ �߿� ���ڸ� �޾ƿ��� ������ ����������� 
    DivideException(String message){
        super(message);
    }
}

// step2 
// extends Exception
class DivideException extends Exception {
    DivideException(){
        super();
    }
    // new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");�̷������� ���ֱ� ����
    // �θ������ �߿� ���ڸ� �޾ƿ��� ������ ����������� 
    DivideException(String message){
        super(message);
    }
}

class Calculator3{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
        }
        System.out.print(this.left/this.right);
    }
    
    // step2
    // �ذ�å 1 Ʈ���� ĳġ 
    public void divide(){
        if(this.right == 0){
            try {
                throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        }
        System.out.print(this.left/this.right);
    }
    
    //step3
    // �ذ�å 2 ����ڿ��� ���� ������ ���� ����ڰ� �ݵ�� ����ó�� 
    public void divide() throws DivideException{
        if(this.right == 0){
            throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
        }
        System.out.print(this.left/this.right);
    }
    
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
        
        // step3
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
        

	}

}
