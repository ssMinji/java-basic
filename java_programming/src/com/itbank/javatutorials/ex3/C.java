package com.itbank.javatutorials.ex3;

//import com.itbank.javatutorials.ex1.*;
//import com.itbank.javatutorials.ex2.B;

import java.lang.*; // �ڹٰ� �ڵ����� �� ��Ű�� ����Ʈ 
// java.lang�� �ִ� Ŭ�������� �ڹٸ� �̿��ϴµ� �ʼ����̰� ���� �̿��ϴ� Ŭ���� 

public class C {

	public static void main(String[] args) {
		// ��������� �������ָ� Ư�� Ŭ���� �ν��Ͻ�ȭ ����
		com.itbank.javatutorials.ex1.B b  = new com.itbank.javatutorials.ex1.B();
		// ����: The type B is ambiguous
		
		System.out.println(1);
		// println(1) --> �޼ҵ�
		// System --> Ŭ����
		// out --> �ý����̶�� Ŭ������ ��� �� �ϳ��� ���� 
		// Ŭ������ ����ϱ� ���ؼ��� �ν��Ͻ�ȭ�� �����ִ� ���� �ʼ�. 
		// out -> static (���ʿ��� �ν��Ͻ��� ������ �����ϱ� ����)
		
	}

}
