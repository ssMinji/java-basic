package org.tutorials.javatutorials.control;

public class No07_ForDemo {

	public static void main(String[] args) {
		String[] numbers = {"one", "two", "three"};
		for(int i=0; i<numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		int[] marks = {90, 25, 67, 45, 80};
		// marks �־����� ��, ���� �˻��ؼ� �պҿ��� �Ǻ��ϱ�  
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] >= 60) {
		        System.out.println((i+1)+"�� �л��� �հ��Դϴ�.");
		    }else {
		        System.out.println((i+1)+"�� �л��� ���հ��Դϴ�.");
		    }
		}
		
		// 0���� 10���� 1�� �����ϸ� ���������, 3�϶��� ������� �ʰ�, 4������ ����ϱ� 
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            else if (i == 3)
            	continue;
            System.out.println("Coding Everybody " + i);
        }
		
		// ���� for��
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(i + " " + j);
            }
        }
		
		// ����: ������ ������
		for(int i=2; i<10; i++) {
		    for(int j=1; j<10; j++) {
		        System.out.print(i*j+" "); // ���๮�� ���� ���. ���� ���� ���� �����ٿ� ��� 
		    }
		    System.out.println("");
		}
		
		// ��ȭ: for each
		String[] numbers = {"one", "two", "three"};
		for(String number: numbers) {
		    System.out.println(number);
		}
		// �� iterate�� ������ ���� ��ü�̰� iterate ��ü���� �Ѱ��� ���������� var�� ���ԵǾ� for���� �����ϰ� �ȴ�. iterate�κп� ���� Ÿ���� ������ ������ �ִ� ������ �迭 �� ArrayList���� �����ϴ�.
		// foreach���� ���� �ݺ�ȸ���� ��������� �ִ� ���� �Ұ����ϰ�, 1���Ǿ� ���������� �ݺ��ɶ��� ��밡���ϴٴ� ������ �ִ�.
		
	}

}
