package org.tutorials.javatutorials.exception;

import java.io.IOException;

class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException(){
        throw new IOException();
    }
    
    // ����
    // unreported exception IOException; must be caught or declared to be thrown
    // �� IOException�� try...catch�ϰų� throw �ؾ� �Ѵٴ� ��.
    // rithmeticException, IOException ��� Exception�̴�. 
    //�׷����� �ұ��ϰ� ���� IOException�� try...catch Ȥ�� throw �� �ؾ� �Ѵٴ� ���̴�. 
    //�ڹٴ� �� �ΰ��� ���ܸ� �ٸ� ������� ���ϰ� �ִ� ��
    // �ٽ��� IOException�� ����ó���� �����ϰ� ������ ArithmeticException�� �׷��� �ʴ� ��
    
    // ArithmeticException ���� ���������� ��Ӱ��� ���鼭 �����ϱ� 
    // Throwable
    // Ŭ���ϸ� getMessage() ���� �޼ҵ� ������ ���� 
    // ppt - �߿� ���� Ŭ������ �� ��Ӱ���� ������ ���� 
    // Ŭ���� Throwable�� �� ���� Ŭ�������� ����� �����̴�. 
    // ��� ���� Ŭ�������� ������ �ִ� ����� �޼ҵ带 �����ϰ� �ִ�. 
    // �߿��� ������ �ϴ� Ŭ�����ӿ��� Ʋ�������� �� Ŭ������ ���� ��������� �ʱ� ������ �츮���Դ� �߿����� �ʴ�.
    // ������ ���ø����̼��� ������ �ƴ϶� �� ���ø����̼��� �����ϴ� ����ӽſ� ������ ������ �� �߻��ϴ� ���ܴ�.
    // ���ø����̼��� ������Ű�⿡�� �޸𸮰� ������ ��찡 �̿� ���Ѵ�. 
    //�̷� ���� ���ø����̼� �����ڰ� �� �� �ִ� ���� ����. 
    //���� ����ó���� ���� ���� �׳� ������ ���ؼ� ���ø����̼��� �ߴܵǵ��� �������д�. 
    // ��� �ڽ��� ���ø����̼��� �޸𸮸� �����ϰ� ����ϰ� �ִٸ� ������ �����ϰų� �ڹ� ����ӽſ��� ����ϴ� �޸��� ������ �����ϴ� ���� ������ �Ѵ�.
    
    // ���Ĺ��� Ȩ���������� ExceptionŬ���� �˻��ؼ� subclasses�� �Բ� ���� 
    // �� ������ Ŭ���� �߿� �ϳ��� RuntimeException�̴�. 
    // ppt - checked����, unchecked����
    
}
