package org.tutorials.javatutorials.collections;

import java.util.*;

class Computer implements Comparable{
    int serial;
    String owner;
    Computer(int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }
    
    // Comparable�������̽�: compareTo �޼ҵ� �����ϵ��� ������ 
    public int compareTo(Object o) {
    	// ��ü�� �ø��󰪰� ���ڷ� ���޵� ��ü�� �ø��� �� ���� ���ϰ� �ִ� �� 
    	// �� ����� ����̸� a�� �ø����� ū�Ű�, ������ �����Ű�, 0�̸� �����Ű� 
        return this.serial - ((Computer)o).serial;
    }
    public String toString(){
        return serial+" "+owner;
    }
}
 
public class CollectionsDemo {
     
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "Jack"));
        computers.add(new Computer(200, "Rachel"));
        computers.add(new Computer(3233, "Jenny"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        // �����ϱ�
        // Collections Ŭ���� �̿� 
        // sort�� �����ϸ� ���������� compareTo�� �����ϰ� �� 
        Collections.sort(computers); // �ø��� �� �������� ����
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
 
}
