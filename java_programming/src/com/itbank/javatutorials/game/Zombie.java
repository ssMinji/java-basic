package com.itbank.javatutorials.game;

/*Zombie: ��ü ������ health�� �ʱ�ȭ �ʼ� 
*  		�ܺο��� health���� ���� �Ұ�
*          health�� ��ȸ�ϸ� "������ ü����? ????" ���
*          ��ȭ�ϸ� "���� ������� ��ȭ�߽��ϴ�" �޽��� ��� 
*          ���� �¸��ϸ� health 1����, �й��ϸ� 1 ����
*          chase ��� ����(void) "���� �Ѿư��ϴ�" �޽��� ���*/

class Zombie implements Monster{
	private int health;
	
	public Zombie(int health) {
		this.health = health;
	}
	
	public void getHealth() {
		System.out.println("������ ü����? "+ health);
	}
	
	public void doEvolve() {
		System.out.println("���� ������� ��ȭ�߽��ϴ�.");
	}
	
	public int changeHealth(boolean isWin) {
		if (isWin) {
			health++;
		} else {
			health--;
		}
		return health;
	}
	
	public void chase() {
		System.out.println("���� �Ѿư��ϴ�");
	}
	
}
