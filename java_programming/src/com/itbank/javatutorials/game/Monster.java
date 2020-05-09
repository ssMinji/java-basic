package com.itbank.javatutorials.game;

/*Monster(�������̽�): health�� ��ȸ�� ����ϴ� �Լ�(void)
*  		 evolve(��ȭ)��Ű�� �Լ�(void)
*           ���� ���п���(boolean)�� ���� health�ٲ�� �Լ�(int)*/

interface Monster {
	public void getHealth();
	public void doEvolve();
	public int changeHealth(boolean isWin);
}
