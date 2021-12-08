package org.tutorials.javatutorials.day03;

// �ڵ� �����ϱ� 
// ���� ������ �����ε��� �����ϱ� ���� ������ �� ���������� �ʴ�. 
// �� ���� ���� ������� ������ �ؾ� �Ѵٸ� ��� �ؾ��ұ�?
class Calculator9{
    int[] oprands;
     
    // �Ű������� �迭�� ����ϰ� �ִ�. 
    // �̷��� �ϸ� �ϳ��� ���ڷ� �������� ���� ���� �� �ִ�. 
    // ����� �������� ������: setOprands�� �Ű����� ���������� ������ �����ε����� �ʾƵ���
    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }
     
    public void sum(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }
      
    public void avg(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
}
public class OverloadingDemo4 {

	public static void main(String[] args) {
		Calculator9 c1 = new Calculator9();
        c1.setOprands(new int[]{10,20});
        c1.sum();       
        c1.avg();
        c1.setOprands(new int[]{10,20,30});
        c1.sum();       
        c1.avg();   

	}

}
