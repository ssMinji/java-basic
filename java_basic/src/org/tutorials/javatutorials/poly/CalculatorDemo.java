package org.tutorials.javatutorials.poly;

// �𷡽��� ������ 
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    
    int _sum() {
    	return this.left+this.right;
    }
    
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }

}

class CalculatorKor extends Calculator {
    public void sum(){
        System.out.println("�� ���� ���� sum :"+_sum());
        
    }
    public void avg(){
        System.out.println("�� ���� ����� avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorEng extends Calculator {
    public void sum(){
        System.out.println("Sum of two numbers:"+_sum());
    }
    public void avg(){
        System.out.println("Average of two numbers:"+(this.left+this.right)/2);
    }
}  
public class CalculatorDemo {
	// execute��� �޼ҵ� �߰�
	// �� �޼ҵ�� cal�̶�� ������ run�� ȣ���ϰ� �ִµ�, cal�̶�� ���� �޼ҵ��� �Ű������̰�
	// �̰��� ������ Ÿ���� Calculator�Դϴ�. 
	public static void execute(Calculator cal) {
		System.out.println("������" );
		cal.run();
	}
	
	// �Ʒ����� �����ε����� �ذ��ϴ� ��� -- ���� ����� �ƴ�
	// ������ �ڵ��� �ߺ��̹Ƿ� 
	public static void execute(CalculatorKor cal) {
		System.out.println("������" );
		cal.run();
	}
	
	public static void execute(CalculatorEng cal) {
		System.out.println("������" );
		cal.run();
	}
	
	
	
    public static void main(String[] args) { 
    	// ����
//    	CalculatorKor c1 = new CalculatorKor();
//        c1.setOprands(10, 20); // �θ�Ŭ������ �ִ� �޼ҵ� 
//        c1.run();
//         
//        CalculatorEng c2 = new CalculatorEng();
//        c2.setOprands(10, 20);
//        c2.run();
        
    	// ���� �� 
        Calculator c1 = new CalculatorKor();
        c1.setOprands(10, 20);
        c1.run();
         
        Calculator c2 = new CalculatorEng();
        c2.setOprands(10, 20);
        c2.run();
        
        // ���� ������Ÿ���� ������ ������ 
        // c1.run();�� �������� ����  c2.run();�� �������� �� �����ϴ� ����� �ٸ���. 
        
        // ���� �� 2
        Calculator c3 = new CalculatorKor();
        c1.setOprands(10, 20);
         
        Calculator c4 = new CalculatorEng();
        c2.setOprands(10, 20);
        
        execute(c1);
        execute(c2);
        // ���⼭ execute�޼ҵ�� CalculatorKor�� CalculatorEng Ŭ������ �޼ҵ� run�� ȣ��
        // �� �޼ҵ� execute���ο����� �Ű������� ���޵� ��ü�� �޼ҵ� run�� ȣ���ϰ� �ִ�
        // ���� �޼ҵ� execute�� �Ű����� ������ Ÿ���� Calculator�� �ƴ϶�� ��� �ؾ��ұ�?
        // ���� ���� ������ ó���� �� ���� ���̴�. 
        // �� �޼ҵ� execute���忡���� �Ű������� ���޵� ���� caculator�̰ų� Ȥ�� �� �ڽ��̶��, 
        // �޼ҵ� run�� ������ �ִٴ� ���� ������� ���ְ� �Ǵ� ���̴�
        // �� �ƶ����� �������̶� �ϳ��� Ŭ����(Calculator)�� �پ��� ���۹�� (CalculatorKor, CalculatorEng)
        //�� ������ �մµ� �̰��� �������̶�� �� �� �ִ� ��
    }
   
}