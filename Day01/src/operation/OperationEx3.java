package operation;

public class OperationEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value); // false
		System.out.println(num1); // 20 
		System.out.println(i); // 2
		// &&: ���� ���� false��� �� ���� ����� ������ �ʴ��� false���� �� �� ����
		// ���� ���� ���� false�̱� ������ �� ���� �������� ����
		
		int num2 = 10;
		int j = 2;
		
		boolean value2 = ((num2 = num2 + 10) > 10) || ((j = j + 2) < 10);
		System.out.println(value2); // true 
		System.out.println(num2);//20
		System.out.println(j); // 2
		// ||: �� ���� ��� false���� false�� ��ȯ. ��, �� �� �ϳ��� true�̸� true��ȯ 
	}

}
