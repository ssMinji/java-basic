package abstractEx;

public abstract class Computer {

	//public void display();  // {} �κ��� ������ ���� ���� �ʰ� ���� �ϰڴٴ� �ǹ� . {}�κ��� body �κ��̶� �� 
	// public void display() {}; : �̷��� {} �ٵ� ������ �� {}�� �ϴ��� �����ΰ� �ִ� ��. 
	// �޼��� �̸�, �Ű�����, ��ȯ�� 
	// �����޽��� �о�� . �߻�޼���� �ٲ�� ��� fix ���� 
	// ��, �����κ��� ������ �߻�޼��尡 �� 
	public abstract void display();
	public abstract void typing();
	// �̹��� Ŭ������ ������ ��. 
	// �߻�޼��带 ������ �ִ� ���� �߻�Ŭ���� ���� �� - class�� abstract �߰��ϱ� 
	
	// �߻�޼���
	// �����ؾ��ϴ� ���� ������ ���� Computer Ŭ���������� ��� �������� ���� �𸣴� �� 
	// ���� �̸� ��ӹ��� ����ũž�̳� ��Ʈ�Ͽ��� ��� �ؾ������� ��ü������ �����ؾ� �� �� ���  
	// �� ��, ����Ŭ������ '������ ���� å���� �ִ�'��� ���
	// ����Ŭ���������� '�޼������ ������ ����Ŭ������ ���ӽ��״�'��� �� 
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	// �߻�Ŭ������ ������ �޼��� ���� ���� �� ���� - ����Ŭ���������� �������� ���� �޼���. ���� �������̵� ���� 
	
	// �߻�Ŭ������ ����� �ϱ� ���� ����� Ŭ������ 
	// ȥ�� ���ư� ������. ��, new�� �̿��ؼ� �ν��Ͻ�ȭ �� �� ���� 
	// �߻�Ŭ������ �������� �� �߻�Ŭ������ ����� ����Ŭ������ �����ϰ� ��  
	
	//public abstract int add(int x, int y);// �޼��� �̸�, �Ű�����, ��ȯ��Ÿ�� �� ���� �� �޼��尡 ���ϴ� �޼������� ���� ���� 
	// �� ���� �ϴ��� ����� ������ �����ߴٰ� �� �� ���� 
	// ���� ��� ������ ����Ŭ�������� �ϰ� �� 
}