package org.tutorials.javatutorials.day03;


// �����ε��� ���
public class OverloadingDemo3 extends OverloadingDemo2{

	void A (String arg1, String arg2){
		System.out.println("sub class : void A (String arg1, String arg2)");
	} 
    void A (){
    	System.out.println("sub class : void A ()");
	}
    // �����ѵڿ� ���� �޼ҵ忡 @Override ������̼� �ٿ��ֱ� 
    
	public static void main(String[] args) {
		OverloadingDemo3 od = new OverloadingDemo3();
        od.A();
        od.A(1);
        od.A("hello java");
        od.A("hello java", "hello java");
        // �� �޼ҵ���� � �޼ҵ带 ȣ���ϰ��ִ��� �ϳ��� ��ġ�غ��� 

	}

}
