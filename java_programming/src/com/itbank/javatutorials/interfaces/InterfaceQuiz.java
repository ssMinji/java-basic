package com.itbank.javatutorials.interfaces;

public class InterfaceQuiz {

	public static void main(String[] args) {
		/*
		 * Meter(�ý� ���ͱ�) �������̽��� start�� stop�̶�� �߻�޼ҵ带 ������ ����
		 * start�޼ҵ�� "������ �����մϴ�" �޽��� ���
		 * stop�޼ҵ�� ����Ÿ�(distance)���� �Ű������� �޾� ���(fee)�� int������ ��ȯ
		 * 
		 * Meter�������̽��� �����ϴ� Taxi Ŭ���� �����
		 * �� ��, ����� ����Ÿ� *2 �� ���
		 * 
		 * */
		
		Taxi tx = new Taxi();
		tx.start();
		System.out.println(tx.stop(30));

	}

}
