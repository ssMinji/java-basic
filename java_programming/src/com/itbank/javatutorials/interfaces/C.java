package com.itbank.javatutorials.interfaces;

// �������̽��� ����� �ɱ�? 
// yes
// Ŭ������ �����ϰ� �ִ� �������̽��� 
// ��ӹް� �ִ� �������̽��� �޼ҵ�鵵 �ش� Ŭ�������� ������ ����� ��
interface I3{
	public void x();
}

interface I4 extends I3{
	public void y();
}

public class C implements I4 {
	public void x() {}
	public void y() {}
}
