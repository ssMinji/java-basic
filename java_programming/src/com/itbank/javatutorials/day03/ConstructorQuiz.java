package com.itbank.javatutorials.day03;

class Car{
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
		super(name, number);
		this.fee = fee;
	}
	
}

public class ConstructorQuiz {

	public static void main(String[] args) {
		/*
		 * �ǽ�
		 * BusŬ������ CarŬ������ �ڽ�Ŭ����
		 * CarŬ������ �����ڴ� name(�̸�), number(������ȣ)�� �Է¹ް�,
		 * BusŬ������ �����ڴ� name(�̸�), number(������ȣ), fee(���)�� �Է¹���
		 * �θ�Ŭ������ �����ڸ� �̿��� name�� number�� �ʱ�ȭ�� �� 
		 * fee�� ���� �ʱ�ȭ�ϴ� Bus�� ������ ������
		 * 
		 * POINT: Ŭ���� ���� �� ���, superŰ���� �̿�
		 * */
		Bus bus = new Bus("����", 3000, 1050);
		System.out.println(bus.name);
		System.out.println(bus.number);
		System.out.println(bus.fee);
		
		// Car ��ü �����غ��� ��ü�� car
		Car car = new Car("Ʈ��", 2020); // name, number�ʱ�ȭ
		System.out.println(car.name);
		System.out.println(car.number);
	}

}
