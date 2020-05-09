package com.itbank.javatutorials.eclipse;

public class IfDemo {
	public static int conditionTest(int value) {
		// value���� ����Ǿ� �ִٰ� ���� 
		int ret = 0;
		if (value % 3 == 0) { 
			if (value % 6 == 0) {
				ret = 3;
			} else {
				ret = 5;
			}
		} else {
			ret = -1;
		}
		// ���ǹ��� �߰��� value�� 4�� ����̸� ret�� 4�� �����ϴ� �ڵ� �߰�
		// �̿ܿ��� ��� ret = -1;
		
		//��� ��ȯ
		return ret;
	}
	

	public static void main(String[] args) {
		System.out.println(conditionTest(6)); //3
		System.out.println(conditionTest(5)); // -1
		
		int score = 89;
		char grade = 'F'; // char: ����
		
		/*		if (score >= 90) {
					grade = 'A';
				} else if (score >= 80){
					grade = 'B';
				} else if (score >= 70 ) {
					grade = 'C';
				} else {
					grade = 'F';
				}
				System.out.println("grade: "+grade);*/
		
		if (score >= 70) {
			grade = 'C';
		} else if (score >= 80){
			grade = 'B';
		} else if (score >= 90 ) {
			grade = 'A';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
		
		boolean isSuccess = false;
		int x = 3;
		
		// x>1 : true --> !(x>1): false -- if(false){//todo}
		if(!(x > 1)) {
			System.out.println("true");
		} else {
			System.out.println("x>1");
		}
		
		// false && true -- false 
		if (isSuccess && (x>1)) {
			System.out.println("isSuccess && (x>1)");
		} else {
			System.out.println("true");
		}
		
		// false || true -- true
		if (isSuccess || (x>1)) {
			System.out.println("isSuccess || (x>1)");
		} else {
			System.out.println("true");
		}
		
		
		
		

	}

}
