package org.tutorials.javatutorials.interfaces;

interface I3{
    public void x();
}
 
interface I4 extends I3{
    public void z();
}
 
class C implements I4{
    public void x(){}
    public void z(){}   
}


// �ι�°��, �������̽��� ����� �ȴ�. 
// ���� I4�������̽��� I3�� ��ӹް�, 
// I4��� �޼ҵ带 ������ C��� Ŭ������ ����ٸ�
// C�� �ݵ�� x�� z�� �����ؾ� �Ѵ� 