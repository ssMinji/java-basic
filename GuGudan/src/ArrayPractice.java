
public class ArrayPractice {

	public static void main(String[] args) {
		/*
		 * �迭�� Ȱ���� �������� �����Ѵ�. 
		 * ������ ����� �迭�� ������ �� �迭�� ����� ����Ѵ�. 
		 * */
		
		
		for(int k=2; k<=9; k++){
			int[] result = new int[9];
			for(int i=0; i<result.length; i++){
				//��� ����� �迭�� ����
				result[i] = k * (i+1);
			}
			for(int i=0; i<result.length; i++){
				//��� ����� ȭ�鿡 ��� 
				System.out.print(result[i] + " ");
			}
			System.out.println();
		}
		
		
	}

}
