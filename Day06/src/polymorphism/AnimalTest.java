package polymorphism;

class Animal {
	public void move(){
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	// �ٿ�ĳ���� �ð��� 
	// ����� �Ѵٰ��ؼ� ����Ŭ������ �޼ҵ常 ���ٰų� �������̵��� �ϴ� ���� �ƴ϶� 
	// Ŭ�������� �������� �޼��� �Ӥ��� �� ���� 
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̴� �׹߷� �ݴϴ�.");
	}
	
	// �ٿ�ĳ���� �ð��� 
	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	// �ٿ�ĳ���� �ð��� 
	public void flying() {
		System.out.println("������� �ϴ��� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

	}
	
	public void moveAnimal(Animal animal){ // Animal animal = new Human() �� ������ ���� 
		
		animal.move();
		
		//��� 
		// �ڵ�� animal.move() �����ε� �ش� �ڵ��� ����� �پ��� 
		// �̰��� ������ 
		
		// �ٿ�ĳ���� �ð��� 
		//animal. // ������� Tiger�� hunting�� ȣ���ϰ� �ʹٰ� �ص� Animal�� ��ĳ���õǾ� �Ķ���ͷ� ���Ա� ������ hunting �޼���� �ڵ��ϼ��� ������ ���� 
		
		Human human = (Human) animal; // animal�� Human���� ����ȯ
		human.readBook();
		// �� ����� ������ ������ ���� ������, Human �̿ܿ� Tiger, Eagle �� �Ķ���ͷ� ���� ��� ������ 
		
		// ���� �׷����� 
		if(animal instanceof Human) { // animal�� ���� �ν��Ͻ��� �������� üũ�� ���� ������t
			Human humann = (Human) animal; 
			humann.readBook();
		}else if (animal instanceof Tiger){
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		} else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		} else{ // ���ǿ� ���� �ʴ� Ÿ���� ������ ���� ó�� 
			System.out.println("�������� �ʴ� ����Դϴ�. ");
		}
		
		// instanceof : �ν��Ͻ��� Ÿ�� üũ . �ٿ�ĳ���� �� ���Ǵ� Ű���� 
	}

}
