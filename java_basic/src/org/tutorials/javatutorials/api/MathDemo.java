package org.tutorials.javatutorials.api;

//MathŬ����
public class MathDemo {

	public static void main(String[] args) {
		// 1) abs: ���� ��ȯ
		System.out.println(Math.abs(-1));
		
		// 2) max: �ִ� ��ȯ
		System.out.println(Math.max(10, 20));
		
		int[] a = {2, 1, 7, 5, 3};
		// a�� ���� �� �ִ��� �˾Ƴ����� 
		// max�޼ҵ� ����ϱ�
		int num = -1000;
		for(int i: a) {
			num = Math.max(num, i);
		}
		System.out.println(num);

	}

}
