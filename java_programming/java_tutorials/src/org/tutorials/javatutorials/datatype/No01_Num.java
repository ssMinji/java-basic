package org.tutorials.javatutorials.datatype;

public class No01_Num {

	public static void main(String[] args) {
		int age = 10;
		long countOfStar = 8764827384923849L; // int �ִ밪���� ū ��� L �ٿ�����
		
		float pi = 3.14F; // float�� �Ҵ��Ҷ��� F �ٿ����� 
		double morePi = 3.14159265358979323846;
		
		double d1 = 123.4;
		double d2 = 1.234e2; // ����ǥ���İ��� 
		
		// ��Ģ���� 
		int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // ������ ������ 
        
        System.out.println(7 % 3); // ������ 
        System.out.println(3 % 7);
        
        // ��������
        int i = 0;
        int j= 10;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);
		
        // Quiz 
        int z = 0;
        System.out.println(z++); // 0 -> �ش��ڵ� ����Ǵ� �������� i���� ������� ���� ����� ���Ŀ� ����. ���� ������ �Ŀ� ���� 
        System.out.println(z); // 1
        
        int i = 0;
        System.out.println(++i); // ���� �����Ǳ� ���� ���� 
        System.out.println(i);
        
	}

}
