package com.itbank.javatutorials.day03;

class OverrideCalc2 extends Calculator7 {
	@Override
	public int avg() {
		int a = super.avg();
		int b = super.sum();
		return a + b;
	}
}

public class OverridingDemo4 {

	public static void main(String[] args) {
		/*
		 * OverridingDemo3���Ͽ� ���ǵ� Calculator7Ŭ���� ������ �� ��. 
		 * 
		 * Calculator7Ŭ���� ��ӹ޴� OverrideCalc2 Ŭ���� ����
		 * avg()�޼ҵ� �������̵�
		 * (�� ���� ��� + �� ���� ��) ���� 
		 * superŰ���� ��� 
		 * 
		 * */

	}

}
