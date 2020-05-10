package org.tutorials.javatutorials.day04;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
        System.out.println(a.y());
        // �Ʒ� �ڵ�� ������ �߻��Ѵ�.
        //System.out.println(a.z());
        System.out.println(a.x());

        // ����
        // y�� public, z�� private
        // ���� ���� or �޼ҵ尡 
        // public: �������� Ŭ������ �޼ҵ带 ȣ���ؼ� ��� ����
        // private: ���������δ� ����� �� ������ �ܺ�Ŭ������ ��� �Ұ�. 
        // a.x()�� z()�޼ҵ� ȣ���ϰ� ����. z�޼ҵ�� x�޼ҵ�� ���� Ŭ������ ����
        // ���� ���� �޼ҵ忡���� private�޼ҵ� ȣ�� ���� 
        // ��, Ŭ�������� ���������� �޼ҵ带 ȣ���ϴ� ���� �Ұ����ϴ� 
	}

}
