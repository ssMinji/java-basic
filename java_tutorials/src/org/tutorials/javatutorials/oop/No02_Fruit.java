package org.tutorials.javatutorials.oop;

public class No02_Fruit {
	int price = 0;
	String name;
	
	// ���⼭�� this�� �ش� ��ü, �ڱ� �ڽ��� ��Ÿ��. 
	// Ŭ���� �������� name�� ����Ŵ. 
	// �Ķ���ͷ� ���� name�� ��ü name �� �̸��� �����ϱ� ������ ��Ȯ�� ���ִ� ��. 
	// ���� �Ķ���� �������� �޶��ٸ� this�� �ʿ���� 
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// new Ű���� ����� ��ü ���� 
		No02_Fruit apple = new No02_Fruit();
		System.out.println(apple.price); // .��Ʈ������ �̿��� ��ü�� ������ �Ӽ��� ���ٰ���
		apple.price = 990;
		System.out.println(apple.price);
		
		System.out.println(apple.name); 
		// null ���� �ش� ���� ���� ������ ���ִ� �޼ҵ� ���� 
		
		
		// ��ü ������ ����
		No02_Fruit kiwi = new No02_Fruit();  // Object 1
	    No02_Fruit banana = new No02_Fruit();  // Object 2
	    System.out.println(kiwi.price);
	    System.out.println(banana.price);
	    
	    kiwi.setName("Ű��"); 
	    System.out.println(kiwi.name); // Ű��
	    
	    banana.setName("�ٳ���");
	    System.out.println(banana.name);
	    
	    // name�̶�� ��ü������ �������� �ʴ´�. 
	    // ��ü������ ���� ���������� �����ȴٴ� ���� Ŭ������ ���� ����. �ſ� �߿��� ����Ʈ !!!!!!!!!!2
	    
	    // Quiz
	    // ���� �̸��� �������� �޼��带 �ۼ��غ���. 

	}

}
