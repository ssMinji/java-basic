package org.tutorials.javatutorials.control;

import java.util.Scanner;

public class No05_LoginDemo {

	public static void main(String[] args) {
        // id�� �����ϴ� �ý��� ����� 
		/*String id = "Myname";
		if(id.equals("myname")){
		    System.out.println("right");
		} else {
		    System.out.println("wrong");
		}*/
        
        // id�� �ѹ� ������ �� password�� �� �� �� �����ؾ��ϴ� �ý��� ����� 
        // Scanner�� java.util ��Ű���� �ִ� Ŭ�����ν� Ű����� ���� ���� �Է¹޴´ٴ��� �� �� �����ϰ� ����� �� �ִ� Ŭ�����Դϴ�.
        Scanner scan = new Scanner(System.in);
        System.out.println("id, password �Է�");
        
        String id = scan.next();
        int password = scan.nextInt();
        
        if (id.equals("myname")) { // �������� ��� -> ���̸� or ��¦���̸��϶� pass 
            if (password == 111111) {
                System.out.println("welcome");
            } else {
                System.out.println("enter the right password");
            }
 
        } else {
            System.out.println("enter the right id");
        }
    }
}
