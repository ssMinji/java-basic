package com.itbank.javatutorials.interfaces;

// �ϳ��� Ŭ������ �������� �������̽��� ������ �� ������?
// yes
// ������ �������̽��� ���ǵǾ��ִ� �޼ҵ���� �ش� Ŭ�������� ��� �����������

interface I1{
	public void x();
}

interface I2 {
	public void y();
}


public class B implements I1, I2{
	public void x() {}
	public void y() {}
	// Ŭ���� ��ӿ����� ��ӹ޴� Ŭ������ �ϳ��� �θ�Ŭ�������� ��ӹ��� �� ����
	// �ϳ��� Ŭ������ �������� �������̽��� ������ �� ����
}
