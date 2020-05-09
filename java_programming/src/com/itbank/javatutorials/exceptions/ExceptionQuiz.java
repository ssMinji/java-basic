package com.itbank.javatutorials.exceptions;

public class ExceptionQuiz {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		 /*
		  * try, catch�� �̿��ؼ� ����ó�� -> �ڹٿ��� �⺻�����Ǵ� ����ó�� �޼��� ���
		  * finally�� �̿��ؼ� �׻� "finally" ��°��� �ϵ��� 
		  * */
		
		try {
			array[20] = 5;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("finally");
		}

	}

}
