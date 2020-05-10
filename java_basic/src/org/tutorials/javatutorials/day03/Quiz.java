package org.tutorials.javatutorials.day03;

class Monster {
	String name;
	String habitat;
	int health;
	int level = 0;
	
	public Monster(String name, String habitat, int health) {
		this.name = name;
		this.habitat = habitat;
		this.health = health;
	}
	
	public void levelUp() {
		level++;
	}
	
	public void levelDown() {
		level--;
	}
	
	public int healthChange(boolean isWin) {
		if(isWin) {
			health *= 2;
			levelUp();
		}else {
			health /= 2;
			levelDown();
		}
		return health;
	}
}

class Batman extends Monster{
	String skill;
	boolean isLive = true;
	
	public Batman(String name, String habitat, int health, String skill) {
		super(name, habitat, health);
		this.skill = skill;
	}
	
	@Override
	public void levelDown() {
		if (level <= 0) {
			isLive = false;
			System.out.println("level�� 0���� �۾��� �� �����ϴ�." + "���� �� ���ʹ� ����ִ°�?" + isLive);
		} else {
			super.levelDown();
		}
	}
	
	public int getPower() {
		int power = level + health;
		return power;
	}
	
	public int getPower(String medicine) {
		int power = 0;
		if (medicine.equals("Bat")) {
			power = 2 * (level + health);
		} else if(medicine.equals("Meat")) {
			power = 3 * (level + health);
		} else {
			power = this.getPower();
		}
		return power;
	}
	
}

public class Quiz {

	public static void main(String[] args) {
		/*
		* MonsterŬ����, BatmanŬ����, ����Ŭ����(MonsterApp)Ŭ���� ������ ����� --> ������ �� �ٸ� �ڹ� ���Ϸ� �����ϱ� 
		* 1) Monster Ŭ���� 
		* Monster��  name(�̸�), habitat(������), health(ü��), level(����) ������ ������ �ִ�. level�� �ʱⰪ=0
		* Monster�� name, habitat, health�� ��ü ���� �� �ʱ�ȭ�� �ݵ�� ������� 
		* 
		* ���������� �¸� ����(boolean)�� ���� health�� �ٲ�� �� �� �������ִ� �޼ҵ� ����. �̰�ٸ�, health 2�� ������Ű�� ���� 1������Ű�� �޼ҵ� ȣ��, 
		* 															���ٸ�, health 2�� ���ҽ�Ű�� ���� 1���ҽ�Ű�� �޼ҵ� ȣ�� 
		* ���� 1������Ű�� �޼ҵ�� ���� 1���ҽ�Ű�� �޼ҵ�� ���ϰ� �ʿ���� 
		
		* 2) MonsterŬ������ ��ӹ޴�  Batman Ŭ���� �����ϱ� 
		* Batman�� name, habitat, health, skill, isLive ������ ������ ������, isLive�ʱⰪ = true�̴�. 
		* Batman�� name, habitat, health, skill�� ��ü ���� �� �ʱ�ȭ�� �ݵ�� ����� �� 
		* 
		* ���� 1���ҽ�Ű�� �޼ҵ带 �������Ѵ� 
		* ����, ���� ������ 0���� �۰ų� ���ٸ�, isLive ���¸� false�� �ٲ�.
		* 							������ �޼��� ��� "level�� 0���� �۾��� �� �����ϴ�. ���ʹ� ����ִ°�?" ����ִ��� ���θ� boolean���� �Բ� ���
		* 	      �׷��� �ʴٸ�, MonsterŬ������ �޼ҵ� ������ �״�� �����Ѵ�. 
		* 
		* �Ŀ����� ����ϴ� �޼ҵ带 �����Ѵ�. 
		* �Ű������� �ʿ����� �ʰ�, level�� health�� ���Ѱ����� power�� ���ǵǸ�, �̸� �������ش�.
		* 
		* ���� String �ڷ����� medicine�� �Ծ��ٰ� �������� �Ŀ����� ������� �� �ִ�. 
		* ����, medicine�� "Bat"�� ���, power�� level�� health�� ���Ѱ��� 2��� ���ǵȴ�. 
		* ����, medicine�� "Meat"�� ���, power�� lev bhj bgty6uhnbgtyhnel�� health�� ���Ѱ��� 3��� ���ǵȴ�.
		* medicine�� �� �ΰ�쿡 �ش����� ������, level�� health�� ���Ѱ����� ���ǵ� 
		*/
		
		// ���� �����
		Monster zombie = new Monster("����", "Cemetery", 200);
		System.out.println(zombie.name + " " + zombie.habitat + " " + zombie.health); //���� Cemetery 200
		zombie.healthChange(true); // 400
		System.out.println(zombie.health + " " + zombie.level); // 400 1
		
		Batman bat = new Batman("��Ʈ��", "Cave", 150, "Fly");
		System.out.println(bat.name + " " + bat.habitat + " " + bat.health + " " + bat.skill); // ��Ʈ�� Cave 150 Fly
		bat.healthChange(false); // level�� 0���� �۾��� �� �����ϴ�.���� �� ���ʹ� ����ִ°�?false
		System.out.println(bat.health + " " + bat.level); // 75 0
		System.out.println(bat.healthChange(true) + " " + bat.level); //150 1
		System.out.println(bat.healthChange(true) + " " + bat.level); // 300 2
		System.out.println("power��" + bat.getPower()); // 302
		System.out.println("power��" + bat.getPower("Bat")); // 604
		System.out.println("power��" + bat.getPower("Meat")); // 906
		System.out.println("power��" + bat.getPower("Human")); // 302
		
		
		
		
	}

}
