package org.tutorials.javatutorials.day03;

class Car {
    String name;
    int number;
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
class Bus extends Car {
    int fee;
    
    public Bus(String name, int number, int fee) {
        // super�� �̿��ؼ� CarŬ������ �����ڸ� �̿��ϼ���.
        super(name, number);
        this.fee = fee;
    }
}

public class ConstructorQuiz {

	public static void main(String[] args) {
		 /*
		  * �ǽ�: 
		  * Bus Ŭ������ Car Ŭ������ �ڽ� Ŭ����
		  * CarŬ������ �����ڴ� name(�̸�)�� �Է¹ް�, 
		  * Bus Ŭ������ �����ڴ� name(�̸�), number(������ȣ), fee(���)�� �Է¹��� 
		  * �θ� Ŭ������ �����ڸ� �̿��� name�� number�� �ʱ�ȭ �� �� fee�� ���� �ʱ�ȭ�ϴ� Bus�� ������ ������. 
		  * */
		 Bus bus = new Bus(new String("����"), 3000, 1050);
		 System.out.println(bus.name);
		 System.out.println(bus.number);
		 System.out.println(bus.fee);
	}

}
