package org.tutorials.javatutorials.datatype;

public class No02_Conversion {

	public static void main(String[] args) {
		double a = 3.0F;
		float a = 3.0; // ���� : double���� ǥ�������� ���� float�� ���������ϱ� ���� 
		// ��Ģ: ǥ�������� ���� ������ Ÿ�Կ��� ���� ������ Ÿ�������� ��ȯ�� ��� 
		
		// ����� ����ȯ
		float b = (float) 100.0;
		int c = (int) 100.0F;
		
		// ���
		final double PI = 3.14;
		System.out.println(PI * 2);
		
		// Quiz
		long longValue = 20;
        //�� �Ʒ��ٿ� int�� ���� intValue�� �����ϰ� longValue�� ����ִ� ���� ��ƺ�����.
        // ����: int intValue = (int)longValue;
        
        System.out.println(intValue);

	}

}
