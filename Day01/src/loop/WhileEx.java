package loop;

public class WhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		
//		while(true) {
//			// ���ѹݺ���
//		}
		
		// do-while
		num = 1;
		sum = 0;
		
		while(num < 1) {
			sum += num;
			num++;
		}
		
		// �ݺ��� ������ �ݵ�� �� ���� ���� 
		do {
			sum += num;
			num++;
		} while(num < 1);
		System.out.println(sum);

	}

}










