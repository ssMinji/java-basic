package com.itbank.javatutorials.abstracts;

abstract class Machine{
	public abstract void turnOn();
	public abstract void turnOff();
}

class Car extends Machine{
	//�������̵�
	public void turnOn() {
		System.out.println("turnOn");
	}
	
	public void turnOff() {
		System.out.println("turnOff");
	}
}

public class AbtractQuiz {

	public static void main(String[] args) {
		/*
		 * �߻�Ŭ���� Machine -> �߻�޼ҵ� turnOn, turnOff 
		 * 
		 * Car Ŭ������ �����,
		 * Car Ŭ������ turnOn, turnOff �޼ҵ� �����غ��� 
		 * 
		 * */
		Car c = new Car();
		c.turnOn();
		c.turnOff();

	}

}
