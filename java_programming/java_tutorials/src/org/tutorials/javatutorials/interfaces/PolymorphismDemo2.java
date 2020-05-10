package org.tutorials.javatutorials.interfaces;

class X {
	public String a() {return "X.a";}
}
	
class Y extends X{
    public String a(){return "Y.a";}
    public String b(){return "b";}
}
class Y2 extends X{
    public String a(){return "Y2.a";}
}
	
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		X obj = new Y();
        X obj2 = new Y2();
        System.out.println(obj.a()); // Y.a
        System.out.println(obj2.a()); // Y2.a
        
        // �ڽ� Ŭ���� Y, Y2�� �ν��Ͻ�ȭ ���Ѽ� obj, obj2����
        //���
        // �θ����༼�� �ϰ� �ֱ� ������ �θ�Ŭ������ �ִ� �޼ҵ常 ȣ���� ������
        // �׷��鼭�� �ڽ�Ŭ�������� �θ�Ŭ������ �����ϴ� �޼ҵ带 �������̵��ߴٸ�
        // ���� �ڽ�Ŭ�������� �������̵��� �޼ҵ��� ������ ����ȴٴ� �� 
        // �׸��� y�� ������� ���� 
        // ������ ������Ÿ������ �����ϸ鼭�� ������ Ŭ������ �ҼӵǾ��ִ� 
        // �޼ҵ��� ���۹�Ĵ�� �����Ѵٴ°� �������� ����. 

	}

}
