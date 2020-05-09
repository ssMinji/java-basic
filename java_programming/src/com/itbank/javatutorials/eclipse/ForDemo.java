package com.itbank.javatutorials.eclipse;

public class ForDemo {

	public static void main(String[] args) {
		// �ʱⰪ; ���ǹ�; ������
		int sum = 0;
		for(int i=0; i<4; i++) {
			//sum += i; 
			sum = sum + i; 
			// 0 -> 0+1 = 1 --> 1+2 = 3 --> 3+3 = 6
		}
		System.out.println(sum);
		
		// 0���� 10���� 1�� �����ϸ� ���������, 3�� ����� ��¾��� 
		/*for (int i=0; i<=10; i++) {
			if (i % 3 == 0) {
				//��ŵ�ϴ°�
				continue;
			}else {
				System.out.println(i);
			}
		}*/
		
		/*for (int i=0; i<20; i++) {
			if (i*2 == 10) {
				break;
			}
			System.out.println(i);
		}
		*/
		
		/*for (int i=5; i>=0; i--) {
			System.out.println(i);
		}*/
		
		for (int i=0; i<=3; i++) {
			for (int j=3; j>=0; j--) {
				System.out.println(i + " " + j);
			}
		}
		
		// i=0 --> j=3 j=2 j=1 j=0
		// i=1 --> j=3 j=2 j=1 j=0
		// i=2 --> j=3 j=2 j=1 j=0
		// i=3 --> j=3 j=2 j=1 j=0
		
		String[] numbers = {"one", "two", "three"};
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// for-each��
		for (String num: numbers) {
			System.out.println(num);
		}
		// numbers: iterate��ü --> �迭 
		// 1���Ǿ� ���������θ� ���� 
		
		// ����: ������ �����) 2~9�ܱ��� ����� 
		// ���� ���� �� �ٿ� ����Ʈ 
		// 2 4 6 8 10 ...
		// 3 6 9 12 15 ...

		
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}
