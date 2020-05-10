package org.tutorials.javatutorials.exception;

class ExceptionExam{
	public int get50thItem(int[] array) throws ArrayIndexOutOfBoundsException{
		return  array[49];
	}
}

class ExceptionExam2{
	public int get50thItem(int[] array){
		if(array.length < 50){
			//return 0;
			throw new IllegalArgumentException("���̰� 50���� ���� �� �����ϴ�");
		}
		return  array[49];
	}

	// if(array.length < 50){throw new IllegalArgumentException("���̰� 50���� ���� �� �����ϴ�")}
}

public class ThrowQuiz {

	public static void main(String[] args) {
		/* 1)
		 * ExceptionExamŬ������ get50thItem�޼ҵ忡���� �Ű������� ���� array�� 50��° ����
		 *  return�մϴ�. 
		 *  ���� array�� ũ�Ⱑ 50���� ���� ��쿡�� 
		 *  ArrayIndexOutOfBoundsException�̶�� ���ܰ� �߻��ϴµ���. 
		 *  get50thItem�� ArrayIndexOutOfBoundsException�� throw�ϵ��� ������ ������.
		 * 
		 * 2)
		 * ExceptionExam2Ŭ������ get50thItem�޼ҵ忡���� �Ű������� ���� array�� 50��° ���� return�մϴ�. 
		 * ���� array�� ũ�Ⱑ 50���� ���� ��쿡�� 0�� return�ϰ� �ִµ���. 
		 * 0�� �����ϴ� ��ſ� IllegalArgumentException�� throw�ϵ��� ����� ������.
		 * */
		int[] arr = new int[3];
		ExceptionExam e = new ExceptionExam();
		//e.get50thItem(arr);
		
		ExceptionExam2 e2 = new ExceptionExam2();
		e2.get50thItem(arr);
	}

}
