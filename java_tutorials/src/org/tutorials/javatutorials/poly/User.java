package org.tutorials.javatutorials.poly;

interface Monster{
	public void doEvolve();
	public void getHealth();
	public int healthChange(boolean isWin);
}

class Zombie implements Monster{
	private int health;
	
	public void getHealth() {
		System.out.println("������ ü����" + health);
	}
	
	public Zombie(int health) {
		this.health = health;
	}
	
	public void doEvolve() {
		System.out.println("���� ������� ��ȭ�߽��ϴ�");
	}
	public int healthChange(boolean isWin) {
		if (isWin) {
			health++;
		}else {
			health--;
		}
		return health;
	}
	public void chase() {
		System.out.println("���� �Ѿư��ϴ�");
	}
}
class Dracula implements Monster{
	private int health;
	
	public void getHealth() {
		System.out.println("���ŧ��� ���� ���� �̸�ŭ" + health);
	}
	
	public Dracula(int health) {
		this.health = health;
	}
	
	public void doEvolve() {
		System.out.println("���ŧ�� ����� ��ȭ�߽��ϴ�");
	}
	public int healthChange(boolean isWin) {
		if (isWin) {
			health *= 2;
		}else {
			health /= 2;
		}
		return health;
	}
	public void hunt() {
		System.out.println("���ŧ�� ����� �����մϴ�");
	}
}

public class User {
	public static void play(Monster mon) {
		mon.doEvolve();
	}
	public static void fight(Monster mon, boolean isWin) {
		mon.healthChange(isWin);
		mon.getHealth();
	}

	public static void main(String[] args) {
		/*
		 * �������̽� Monster, �װ��� ������ Zombie, Dracula Ŭ����. 
		 * ������ ���� User Ŭ����
		 * Monster : health�� ��ȸ�� ����ϴ� �Լ�(void), evolve(��ȭ)��Ű�� �Լ�(void), ���� ���� ���ο� ���� health�ٲ�� �Լ� �ʿ�(int)
		 * Zombie : ��ü ������ health�� �ʱ�ȭ �ʼ�. 
		 * 			�ܺο��� health�� ���� �Ұ�
		 *          health ��ȸ�ϸ� "������ ü���� ???" ���. 
		 *          ��ȭ�ϸ� "���� ������� ��ȭ�߽��ϴ�" �޽��� ���
		 *          ���� �¸��ϸ� health 1����, �й��ϸ� 1 ���� 
		 *          chase ��� ����. �̸� �����ϸ� "���� �Ѿư��ϴ�" �޽��� ���
		 * Dracula: ��ü ������ health�� �ʱ�ȭ �ʼ�. 
		 *          �ܺο��� health�� ���� �Ұ�
		 *          health ��ȸ�ϸ� "���ŧ��� �������� �̸�ŭ ???" ���. 
		 *          ��ȭ�ϸ� "���ŧ�� ������� ��ȭ�߽��ϴ�" �޽��� ���
		 *          ���� �¸��ϸ� health 2�� ����, �й��ϸ� 1/2 ����
		 *          hunt ��� ����. �̸� �����ϸ� "���ŧ�� ����� �����մϴ�" �޽��� ���
		 * User: ������ �����ϴ� User Ŭ����
		 *       ������ ������ ��ɸ� ����
		 *       play �޼ҵ� ���� �� ��ȭ�޼ҵ� ����
		 *       fight �޼ҵ� ���� �� ������ health�ٲ�� �޼ҵ� ����, health��ȸ�ϴ� �޼ҵ� ����
		 *          
		 * */
	
		Monster zombie = new Zombie(150);
		Monster dracula = new Dracula(200);
		
		fight(zombie, true); // ������ ü����151
		play(zombie); // ���� ������� ��ȭ�߽��ϴ�
		
		fight(dracula, false); // ���ŧ��� ���� ���� �̸�ŭ100
		play(dracula); // ���ŧ�� ����� ��ȭ�߽��ϴ�
		
		Zombie zombie2 = new Zombie(150);
		zombie2.chase(); // ���� �Ѿư��ϴ�
		
		Dracula dracula2 = new Dracula(100);
		dracula2.hunt(); // ���ŧ�� ����� �����մϴ�
		

	}

}
