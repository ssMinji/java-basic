package com.itbank.javatutorials.day02;

class Monster {
	// 1) ���ʹ� ü��(health), �̸�(name), ����(level), �ֽ�(food) �Ӽ��� �������ִ�
	// 2) ü�°� �̸��� ���͸��� �ٸ�����, �ʱⷹ���� 0���� ����, ��� ������ �ֽ��� �����ϴ�
	//		�ֽ��� �޶�����, ��� ������ ������ �ֽĵ� �޶�����.
	int health;
	String name;
	int level = 0;
	static String food = "human";
	// 3) ������ �̸��� health�� �������ִ� �޼ҵ� �����ϱ�
	/*public void setInfo(String name, int health) {
		this.name = name;
		this.health = health;
	}*/
	public Monster(String name, int health) {
		this.name = name;
		this.health = health;
	}
	// 4) ������ �Ŀ�(power)�� ����+ü������ ���ȴ�. �Ŀ����� ��� �޼ҵ带 �����ϱ�
	public int getPower() {
		int power = level + health;
		return power;
	}
	// 5) ������ ü���� ��ȭ�����ִ� �޼ҵ带 �����ϱ�.
	// 	  ���� ���ӿ��� �̰�ٸ� -> level 1���, ü�� 2�� ���
	// 			    ���ٸ�, -> level 1 ����, ü���� 2�� ����
	// 	���� ���� ���� ���� �� ü���� ����������
	public void changeLevel(boolean isWin) {
		if(isWin) {
			level++;
			health *= 2;
		} else {
			level--;
			health /= 2;
		}
		System.out.println("���� ü��: "+ health + " ����: " + level);
	}
	
	// 6) ������ �ֽ��� �����ϴ� �޼ҵ� ����� 
	public static void changeFood(String newfood) {
		food = newfood;
		System.out.println("����� ������ �ֽ���: " + food + "�Դϴ�.");
	}
}


public class Demo {
	public static void main(String[] args) {
		// Monster Ŭ���� ������
		Monster zombie = new Monster("����", 100);
		//zombie.setInfo("����", 100);
		System.out.println(zombie.name);
		System.out.println(zombie.health);
		boolean zombieWin = true;
		zombie.changeLevel(zombieWin); // ���� ü��: 200  ����: 1
		System.out.println(zombie.getPower()); //201
		
		Monster dracula = new Monster("���ŧ��", 150);
		//dracula.setInfo("���ŧ��", 150);
		System.out.println(dracula.name);
		System.out.println(dracula.health);
		boolean draculaWin = false;
		dracula.changeLevel(draculaWin); // ���� ü��: 75  ����: -1
		System.out.println(dracula.getPower()); //74
		
		System.out.println(Monster.food);
		Monster.changeFood("Vegetable"); 
		
		System.out.println(Monster.food); // Vegetable
		
		// �� ��ü�� �ֽ��� �� ���� ����� ���� �� �� �ִ�. 
		System.out.println(zombie.food);
		System.out.println(dracula.food);
		
		// ������: ������ 0���� �۾��� ��� or ü���� 0���� �۾��� ��쿡 ���� ó�� 
		//        ���Ͱ� ���� �Ӽ� or �ɷ�ġ �߰� or �޼ҵ� �߰� --> ����߰� 
	}

}
