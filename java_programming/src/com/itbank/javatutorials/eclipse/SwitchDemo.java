package com.itbank.javatutorials.eclipse;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		switch (5) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3: 
			System.out.println("three");
			break;
		default:
			System.out.println("else");
		}
		
		// month�Է°� Scanner �̿� 
		// month ���� �������� �޾� �ش� ���� ���� ���̸�(monthName) ex)Jan, Feb,...
		// ��ȯ���ִ� switch/case�� �ۼ��غ���
		// �������� �ʴ� ���� ��� "wrong" ��� 
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String monthName = "";
		
		switch(month) {
		case 1: 
			monthName = "Jan";
			break;
		case 2:
			monthName = "Feb";
			break;
		case 12:
			monthName = "Dec";
			break;
		default: 
				monthName = "wrong";
			
		}
		

	}

}
