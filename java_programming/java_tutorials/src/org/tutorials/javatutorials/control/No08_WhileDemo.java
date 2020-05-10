package org.tutorials.javatutorials.control;

import java.util.Scanner;

public class No08_WhileDemo {

	public static void main(String[] args) {
		int treeHit = 0;
		while (treeHit < 10) {
		    treeHit++;
		    System.out.println("������  " + treeHit + "�� ������ϴ�.");
		    if (treeHit == 10) {
		        System.out.println("���� �Ѿ�ϴ�.");
		    }
		}
		
		// ���ѷ���
		while (true) {
		    System.out.println("Ctrl-C�� ������ while���� ���� ���� �� �ֽ��ϴ�.");
		}
		
		// break
		int coffee = 10;
		int money = 300;

		while (money > 0) {
		    System.out.println("���� �޾����� Ŀ�Ǹ� �ݴϴ�.");
		    coffee--;
		    System.out.println("���� Ŀ���� ���� " + coffee + "�Դϴ�.");
		    if (coffee == 0) {
		        System.out.println("Ŀ�ǰ� �� ���������ϴ�. �ǸŸ� �����մϴ�.");
		        break;
		    }
		}
		
		// while���� ���� ó������ ���ư���
		int a = 0;
		while (a < 10) {
		    a++;
		    if (a % 2 == 0) {
		        continue;
		    }
		    System.out.println(a); // ¦���ϰ�� ����ȵ� 
		}
		
		// do-while ������ �ѹ��� ���� 
		int value = 0;

        // Scanner�� java.util ��Ű���� �ִ� Ŭ�����ν� Ű����� ���� ���� �Է¹޴´ٴ��� �� �� �����ϰ� ����� �� �ִ� Ŭ�����Դϴ�.
        Scanner scan = new Scanner(System.in);
        //�� ó�� �ۼ��Ͻø� Ű����κ��� ���� �Է¹��� �� �ִ� Scanner��ü�� �����˴ϴ�. 

        do{
            value = scan.nextInt(); // ScannerŬ������ �̿��Ͽ� Ű����� ���� ���ڰ��� �Է¹޽��ϴ�.
            System.out.println("�Է¹��� �� : " + value);  
        }while(value != 10);  // �Է¹��� ���� 10�� �ƴ� ��쿡�� ��� �ݺ��մϴ�.

        System.out.println("�ݺ��� ����");
	}

}
