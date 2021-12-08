package org.tutorials.javatutorials.interfaces;

// �̰��� ��¥ Ŭ���� 
// ���� Ŭ������ �ʿ��ϰ� �̰��� ����� Ŭ������ �ʿ��ѵ�, 
// ��������忡�� ���� Ŭ������ ������ �ȵǾ��ٰ������� 
// ����Ŭ���������� ��¥ Ŭ������ �������� 
// ������ �����س��� �ʰ� 
// ����ϴ� �޼ҵ� ���� ���� ����� �ƴ� �׳� ���ڸ� �ھƳ��� ��
// ���� ��ü���� ������ �� ��������� ���߿� ����� �� ���� ���̶�� �����ϰ�
// ������ ������ �����ϴ� �� 
class CalculatorDummy{
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
// �������̽� ���� �� 
// �׷��ٸ� �� ���̶�� Ŭ������ �Ŀ� �ϼ��Ǽ� ��ü�� ��
// �����̳� ������ �޶����� �ʴ´ٴ� ���� ������� �� ���� 
class CalculatorDummy implements Calculatable {
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
	
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
        
        // ���� calculator��� Ŭ������ ������ �Ϸ�Ǿ���! �ϸ�
        Calculator c = new Calculator();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());

	}

}
