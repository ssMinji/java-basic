package org.tutorials.javatutorials.exception;

class MyCheckedException extends Exception{
	
    
}

public class CustomQuiz {
	public int get50thItem(int []array) throws MyCheckedException{
        if(array.length < 50){
            throw new MyCheckedException();
        }
        return  array[49];
    }

	public static void main(String[] args) {
		/*
		 * MyCheckedExceptionŬ������ Checked Exception�� �ǵ��� ����� ������
		 * 
		 * error: unreported exception MyCheckedException; must be caught or declared to be thrown
		 * �����޽����� ���ɴϴ�. get50thItem���� exception�� throw�ϴµ� try/catch������ ó���ǰ� ���� �ʱ� �����Դϴ�
		 * ���� �ذ��غ��� 
		 * */
		
		
		ExceptionExam exam = new ExceptionExam();
        int[] array = new int[10];
        
        exam.get50thItem(array);

	}

}
