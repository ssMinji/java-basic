package com.itbank.javatutorials.interfaces;

public class Taxi implements Meter{
	/*start�޼ҵ�� "������ �����մϴ�" �޽��� ���
	 * stop�޼ҵ�� ����Ÿ�(distance)���� �Ű������� �޾� ���(fee)�� int������ ��ȯ
	 * 
	 * Meter�������̽��� �����ϴ� Taxi Ŭ���� �����
	 * �� ��, ����� ����Ÿ� *2 �� ���*/
	public void start() {
		System.out.println("������ �����մϴ�");
	}
	public int stop(int distance) {
		int fee = distance * 2;
		return fee;
	}
	
}
