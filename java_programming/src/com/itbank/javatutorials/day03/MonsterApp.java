package com.itbank.javatutorials.day03;

//*******���, ������, �������̵�, �����ε� �ǽ�**********//
class Monster{
	// ��������
	String name, habitat;
	int health;
	int level = 0;
	// ������ ����
	public Monster(String name, String habitat, int health) {
		this.name = name;
		this.habitat = habitat;
		this.health = health;
	}
	// �޼ҵ屸��
	public void levelUp() {
		level++;
	}
	public void levelDown() {
		level--;
	}
	public int healthChange(boolean isWin) {
		if (isWin) {
			health *= 2;
			levelUp();
		} else {
			health /= 2;
			levelDown();
		}
		return health;
	}
}
class Batman extends Monster{
	
	// ��������
	String skill;
	boolean isLive = true;
	
	// ������ ����
	// name, habitat, health, skill
	public Batman(String name, String habitat, int health, String skill) {
		super(name, habitat, health);
		this.skill = skill;
	}
	
	// �޼ҵ屸��
	@Override
	public void levelDown() {
		if(level <= 0) {
			isLive = false;
			System.out.println("level�� 0���� �۾��� �� �����ϴ�. ���� �� ���ʹ� ����ִ°�? "+ isLive);
		} else {
			super.levelDown();
		}
	}
	
	// ����߰�) �Ŀ����� ����ϴ� �޼ҵ带 �����Ѵ�. 
	// 		   �Ű������� �ʿ����� �ʰ�, level�� health�� ���Ѱ����� power�� ���ǵǸ�, �̸� �������ش�.
	public int getPower() {
		int power = level + health;
		return power;
	}
	
	// ���� String �ڷ����� medicine�� �Ծ��ٰ� �������� �Ŀ����� ������� �� �ִ�. 
	// ����, medicine�� "Bat"�� ���, power�� level�� health�� ���Ѱ��� 2��� ���ǵȴ�. 
	// ����, medicine�� "Meat"�� ���, power�� level�� health�� ���Ѱ��� 3��� ���ǵȴ�.
	// medicine�� �� �ΰ�쿡 �ش����� ������, level�� health�� ���Ѱ����� ���ǵ�
	// �����ε�
	public int getPower(String medicine) {
		int power = 0;
		if (medicine.equals("Bat")) {
			power = (level + health) *2;
		} else if (medicine.equals("Meat")) {
			power = (level + health) * 3;
		} else {
			power = this.getPower(); // level+health ���ϴ� ������ �ڱ��ڽ��� �޼ҵ� ��Ȱ�밡��
		}
		return power;
	}
	
}

public class MonsterApp {

	public static void main(String[] args) {
		/*
		* MonsterŬ����, BatmanŬ����, ����Ŭ����(MonsterApp)Ŭ���� ������ ����� 
		* 1) Monster Ŭ���� 
		* Monster��  name(�̸�, String), habitat(������, String), health(ü��, int), level(����, int) ������ ������ �ִ�. level�� �ʱⰪ=0
		* Monster�� name, habitat, health�� ��ü ���� �� �ʱ�ȭ�� �ݵ�� ������� 
		* 
		* levelUp() �޼ҵ� ����: void����Ÿ��, ���� 1 ����
		* levelDown() �޼ҵ� ����: void����Ÿ��, ���� 1 ���� 
		* 
		* healthChange�޼ҵ� ���� : int����Ÿ��
		* ���������� �¸� ����(boolean)�� ���� health�� �ٲ�� �ٲ� health�� ���� 
		* �̰�ٸ�, health 2�� ������Ű�� levelUp() �޼ҵ� ȣ��, 
		* ���ٸ�, health 2�� ���ҽ�Ű�� levelDown() �޼ҵ� ȣ�� 
		
		* 2) MonsterŬ������ ��ӹ޴�  Batman Ŭ���� �����ϱ� 
		* Batman�� name, habitat, health, skill(�ɷ�, String), isLive(��������, boolean) ������ ������ ������, isLive�ʱⰪ = true�̴�. 
		* Batman�� name, habitat, health, skill�� ��ü ���� �� �ʱ�ȭ�� �ݵ�� ����� �� 
		* 
		* ���� 1���ҽ�Ű�� �޼ҵ带 �������Ѵ� 
		* ����, ���� ������ 0���� �۰ų� ���ٸ�, isLive ���¸� false�� �ٲް� ���ÿ�
		* 							������ �޼��� ��� "level�� 0���� �۾��� �� �����ϴ�. ���ʹ� ����ִ°�? ???????"  ����ִ��� ���θ� boolean���� �Բ� ���
		* 	      �׷��� �ʴٸ�, MonsterŬ������ �޼ҵ� ������ �״�� �����Ѵ�. 
		* 
		* ����߰�) �Ŀ����� ����ϴ� �޼ҵ带 �����Ѵ�. 
		* 		   �Ű������� �ʿ����� �ʰ�, level�� health�� ���Ѱ����� power�� ���ǵǸ�, �̸� �������ش�.
		* 
		* ���� String �ڷ����� medicine�� �Ծ��ٰ� �������� �Ŀ����� ������� �� �ִ�. 
		* ����, medicine�� "Bat"�� ���, power�� level�� health�� ���Ѱ��� 2��� ���ǵȴ�. 
		* ����, medicine�� "Meat"�� ���, power�� level�� health�� ���Ѱ��� 3��� ���ǵȴ�.
		* medicine�� �� �ΰ�쿡 �ش����� ������, level�� health�� ���Ѱ����� ���ǵ� 
		* 
		*/
		
		// ���� �����
		Monster zombie = new Monster("����", "Cemetery", 200);
		System.out.println(zombie.name + zombie.habitat + zombie.health);
		boolean isWin = true;
		zombie.healthChange(isWin);
		System.out.println(zombie.health + " " + zombie.level); //400 1
		
		Batman batman = new Batman("��Ʈ��", "Cave", 150, "Fly");
		System.out.println(batman.name + batman.habitat + batman.health+ batman.skill);
		boolean a = false;
		// batman.healthChange(a); // level�� 0���� �۾��� �� �����ϴ�. ���� �� ���ʹ� ����ִ°�? false
		batman.healthChange(isWin);
		System.out.println(batman.health + " " + batman.level);
		System.out.println(batman.getPower()); // 301
		System.out.println(batman.getPower("Bat"));
		System.out.println(batman.getPower("Human")); // 301
		
		

	}

}
