package org.tutorials.javatutorials.interfaces;

interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class B implements I1, I2{
    public void x(){}
    public void z(){}   
}

// �ϳ��� Ŭ������ �������� �������̽��� ������ �� �ִٴ� ��
// I1�� x�޼ҵ�� I2�� z�޼ҵ带 �ݵ�� �����ؾ� �� 
// Ŭ���� ��ӿ����� ��ӹ޴� Ŭ������ �ϳ��� �θ�Ŭ�������� ��ӹ��� �� �ִٴ� ������ ������