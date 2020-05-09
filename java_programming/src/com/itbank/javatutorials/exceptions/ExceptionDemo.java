package com.itbank.javatutorials.exceptions;
// ������ ����

class A{
	private int[] arr = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	void z(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Err");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Err");
		}catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
		
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		A a = new A();
		// a.z(10, 1);// ����
		// ArrayIndexOutOfBoundsException
		// �迭�� 3���� ���� ���� �� �ִµ�,10��° �ε����� ȣ���ϰ� �ֱ� ������
		// �������� �ʴ� ���� ���������� �õ��ϰ� �ֱ� ������ ���� �߻�
		
		// a.z(1, 0); // ����
		// ArithmeticException
		// arr[1]/ arr[0]
		// 10�� 0���� ������ ���� ���������� �Ұ����ϱ� ������ ���� �߻� 
		
		// ���� ���������� ��Ȳ�� ���� �ٸ� ���ܰ� �߻��� �� ����
		
		a.z(10, 0); // Index Err
		a.z(1, 0); // Arithmetic Err
		a.z(2, 1);//2

	}

}
