package org.tutorials.javatutorials.oop;


class Monster {
	int health;
	String name;
	int level = 0;
	static String food = "human";
	
	public void setInfo(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public void levelChange(boolean isWin) {
		if (isWin) {
			health *= 2;
			level++;
		}else {
			health /= 2;
			level--;
		}
		System.out.println("���� ü��: " + health + " ����: " + level);
	}
	
	public int getPower() {
		return health + level;
	}
	
	public static void foodChange(String newfood) {
		food = newfood;
		System.out.println("������ �ֽ��� : " + food + "�Դϴ�.");
	}
	
	
}
public class No04_Quiz {

	public static void main(String[] args) {
		// Monster Ŭ���� ������
		// 1) ���ʹ� ü��(health), �̸�(name), ����(level), �ֽ�(food) �Ӽ��� ������ �ִ�
		// 2) ü�°� �̸��� ���͸��� �ٸ�����, �ʱⷹ���� 0���� ����, ��� ������ �ֽ��� �����ϴ�. 
		//    �ֽ��� �޶�����, ��� ������ ������ �ֽĵ� �޶�����. 
		// 3) ������ �̸��� health�� �������ִ� �޼ҵ� �����ϱ�
		// 4) ������ �Ŀ��� ����+ü������ ���ȴ�. �Ŀ����� ��� �޼ҵ� �����ϱ�
		// 5) ������ ü���� ��ȭ�����ִ� �޼ҵ� �����. ���� ���ӿ��� �̰�ٸ�, level 1 ���, ü�� 2�� ����
		// 										   ���ٸ�, level 1 �϶�, ü�� 2�� ����
		// 								 ���� �� ���� ���� �� ü�� ������־�� �� 
		// 6) ������ �ֽ��� �����ϴ� �޼ҵ� ����� 
		Monster zombie = new Monster();
		zombie.setInfo("����", 100);
		System.out.println(zombie.name); // ����
		System.out.println(zombie.health); // 100
		boolean zombieWin = true;
		zombie.levelChange(zombieWin); // ���� ü��: 200 ����: 1
		System.out.println(zombie.getPower()); // 201
		
		Monster dracula = new Monster();
		dracula.setInfo("���ŧ��", 150); 
		boolean draculaWin = false;
		dracula.levelChange(draculaWin); // ���� ü��: 75 ����: -1
		System.out.println(dracula.getPower()); // 74
		
		
		Monster.foodChange("Vegetable");
		System.out.println(zombie.food); // Vegetable
		System.out.println(dracula.food); // Vegetable
		
		// ������: ������ 0���� �۾��� ��쿡 ���� ó�� 

	}

}
