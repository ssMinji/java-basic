package loop;

public class BreakEx {

	public static void main(String[] args) {

		// 1���� �� ���ϴٰ� 100�� �Ѵ� ������ n�� ��? 
		int sum = 0;
		int num = 1;
		
		while(sum < 100) {
			sum += num;
			num++;
		}
		System.out.println(sum); // 105
		System.out.println(num); // 15
		
		// ���� �ڵ� ����
		sum = 0;
		num = 1;
		
		while(true) {
			sum += num;
			
			if(sum > 100) {
				break;
			}
			
			num++;
		}
		System.out.println(num);
	}

}









