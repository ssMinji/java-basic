package org.tutorials.javatutorials.day06;

class Person<T>{
    public T info;
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
        
        // ���
        // ������Ÿ��
        // p1.info: String
        // p2.info: StringBuilder
        // ��, Ŭ������ �����Ҷ��� ������Ÿ���� Ȯ������ �ʰ� �ν��Ͻ��� ������ �� 
        // ������Ÿ�� �����ϴ� ��� 
    }
 
}
