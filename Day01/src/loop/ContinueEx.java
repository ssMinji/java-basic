package loop;

public class ContinueEx {

	public static void main(String[] args) {

		// 1���� 10���� Ȧ������ ���ϱ� 
		int sum = 0;
		int num;
		
		for(num=1; num<=10; num++) {
			
			if(num % 2 == 0) {
				continue; // ������ ���๮�� �������� �ʰ� �������� ������ 
			}
			sum += num;
		}
		
		System.out.println(sum);
	}

}
