package loop;

public class Practice {

	public static void main(String[] args) {

		// 1���� 10���� ����ϴµ� 3�� ���� ������� �ʰ�, 6������ ��� 
		for(int i=1; i<=10; i++) {
			if(i==3) {
				continue;
			} else if(i==7) {
				break;
			}
			System.out.println(i);
		}
		
		// 2�ܺ��� 9�ܱ��� ������ 
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "= " + dan*times);
			}
		}
		
		// while ������ �ۼ��غ��� 
		dan = 2;
		times = 1;
		
		while(dan<=9) {
			times = 1; // �ʱ�ȭ���� �ʼ�! 
			while(times<=9) {
				System.out.println(dan + "X" + times + "= " + dan*times);
				times++;
			}
			dan++;
		}
		
	}

}










