package day02;

public class MethodEx {

	/*
	 * �޼��� : �Լ��� ����
	 *        ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ� 
	 *        
	 * �Լ�: �ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�. �ߺ��Ǵ� ����� �Լ��� �����Ͽ� �Լ��� ȣ���Ͽ� ����� 
	 * 
	 * �Լ��̸�, �Ű�����, return �����, �Լ� ��ȯ�� (��ȯ���� ���� ��� void��� ��)
	 * */
	
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2){ //�Լ� ����� 
		int result = n1 + n2;
		return result;
	}
	
	/*
	 * �Լ� ȣ�� - �Լ��� ����ϴ� �޸�: ���� (�����۽�) 
	 * 
	 * */
}
