package org.tutorials.javatutorials.day06;

import java.util.ArrayList;

public class ArrayListDemo {
 
    public static void main(String[] args) {
        String[] arrayObj = new String[2]; // �迭�� ������ 
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; ������ �߻��Ѵ�.
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
         
        // ���� ����ߴ� ���� ArrayList�̰� 
        // �̰��� �÷��������ӿ�ũ�� ��̸���ƮŸ���̴� 
        // ��� ���� ������ �̸� �������� �ʴ´� 
        ArrayList al = new ArrayList();
        al.add("one"); // add�޼ҵ� ��� 
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i)); // �����ö��� get�޼ҵ� ���
        }
        
        //step2
        for(int i=0; i<al.size(); i++){
            String val = al.get(i); // ������ ���� �߻� 
            System.out.println(val);
        }
        
        // ���� �߻�����:
        // add��� �޼ҵ�� � ������Ÿ�Ե� ���밡���� �޼ҵ� 
        // ��, Object ������Ÿ���� �޾ƿ��� �޼ҵ�
        // String�̶�� "one"�� ArrayList���� object������Ÿ������ ����Ǿ����� 
        // ���� get(0)�� �������� �Ǹ� "one"�� ������Ÿ���� ObjectŸ���ΰ�
        // �̸� ���� val�� �������� �ϴµ� �̰��� String���� ������ �� 
        // Object�� String�� �����Ϸ��� �ϰ� �����Ƿ� ���� �߻� 
        // �ذ�: ����ȯ 
        for(int i=0; i<al.size(); i++){
            String val = (String) al.get(i); 
            System.out.println(val);
        }
        
        // ������ ���� ����� ���� ����̰�, �÷��������ӿ�ũ�� ���׸��̶�� ������ ������ ä���߽��ϴ�
        // �̸� �ذ��ϱ� ���Ѱ��� �ٷ�
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            String val = al.get(i);
            System.out.println(val);
        }
        // String������Ÿ���̶�� ���� ���׸��� �̿��ؼ� ������� ��
        // ���� get���� ������ �����͸� ����ȯ���� �ʿ� ���� 
        // ����: ���׸��� ���ؼ� �ԷµǴ� ������Ÿ���� String�̶�� ��� ����߱� ����
    }
 
}
