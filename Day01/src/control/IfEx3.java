package control;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {

		// Scanner: Ű����κ��� ���� �Է¹��� �� �����ϰ� ����� �� �ִ� Ŭ���� 
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		int pw = sc.nextInt();
		
		if(id.equals("Song")) {
			if(pw == 12345) {
				System.out.println("ȯ���մϴ�!!");
			} else {
				System.out.println("��й�ȣ�� �� �� �Է��ϼ̽��ϴ�.");
			}
		} else {
			System.out.println("���̵� �� �� �Է��ϼ̽��ϴ�.");
		}
		
	}

}
