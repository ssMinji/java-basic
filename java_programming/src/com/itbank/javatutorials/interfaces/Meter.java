package com.itbank.javatutorials.interfaces;

public interface Meter {
	// Meter(�ý� ���ͱ�) �������̽��� start�� stop�̶�� �߻�޼ҵ带 ������ ����
	public abstract void start();
	public abstract int stop(int distance);
}
