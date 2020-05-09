package com.itbank.javatutorials.game;

/*Dracula: ��ü ������ health�� �ʱ�ȭ �ʼ�
*           �ܺο��� health�� ���� �Ұ�
*           health�� ��ȸ�ϸ� "���ŧ���� ���� ����? ?????" ���
*           ��ȭ�ϸ� "���ŧ�� ������� ��ȭ�߽��ϴ�" �޽��� ���
*           ���� �¸��ϸ� health 2�� ����, �й��ϸ� 1/2 ����
*           hunt ��� ����(void) "���ŧ�� ����� �����մϴ�" �޽��� ���*/

class Dracula implements Monster {
	private int health;
	
	public Dracula(int health) {
		this.health = health;
	}

	public void getHealth() {
		System.out.println("���ŧ���� ���� ����? "+ health);
	}
	
	public void doEvolve() {
		System.out.println("���ŧ�� ������� ��ȭ�߽��ϴ�");
	}
	
	public int changeHealth(boolean isWin) {
		if(isWin) {
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
