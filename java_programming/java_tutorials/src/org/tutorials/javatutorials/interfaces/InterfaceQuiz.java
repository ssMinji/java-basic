package org.tutorials.javatutorials.interfaces;

class Taxi implements Meter {
	// Meter�������̽��� start�� stop�޼ҵ带 �����ؾ� �մϴ�.
	public void start() {
		System.out.println("������ �����մϴ�.");
	};
	public int stop(int distance) {
		int fee = distance * 2;
		return fee;
	};
}



public class InterfaceQuiz {
	public static void main(String[] args) {
		/**
		 * Meter(�ý� ���ͱ�)�������̽��� start�� stop�̶�� �߻� �޼ҵ带 ������ �ֽ��ϴ�. 
		 * start�޼ҵ�� "������ �����մϴ�"��� �޽����� ����մϴ�. 
		 * stop�޼ҵ�� �޸� �Ÿ��� �ش��ϴ� ��(distance)�� �Ű������� �޾� ����� int������ ��ȯ�ϴ� �޼ҵ��Դϴ�. 
		 * Meter�������̽��� �����ϴ� �ý� Ŭ������ �ϼ��� ������. 
		 * ����� distance x 2�� ����ϼ���.
		 * 
		 * */
	}

}
