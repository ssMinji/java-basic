package com.itbank.javatutorials.eclipse;

public class Conversion {

	public static void main(Strings[] args) {
		double a = 3.0f;
		//float b = 3.0; 
		//  double���� ǥ�� ������ �� ���� float�� ���������ϱ� ����
		// �ڵ�����ȯ: ǥ�������� ���� ������ Ÿ�Կ��� ���� ������Ÿ������ �������� ���� 

		// ����� ����ȯ
		float c = (float) 4.0009;
		int d = (int) 100.0F;
		
		// �غ���
		long longVal = 10;
		// int�� ����  intVal�� �����ϰ� longVal�� ����ִ� �� �Ҵ�
		int intVal = (int) longVal;
		
		System.out.println(intVal);
		
		final int BASE = 10;
		
		
	}

}
