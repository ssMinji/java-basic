package thisEx;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; // �ڱ� �ڽ��� �ν��Ͻ��� year ���� year�� �־�� ��� �ǹ�
		
		// ���� this Ű���� �����ٸ�?
		// ������ ������ ���� ���� 
		// ������ year = year�� �ǹ̴� �ڵ�� �׻� �ڱ�� ���� �����ָ� �����ϰ� �ǹǷ�
		// ��ǲ�Ķ���ͷ� ������ year�� �ٽ� year�� ���� �� (Birthday Ŭ������ ��������� year�� �־��ذ� �ƴ϶� ���������� assign �� ��)
		// �� ��, ���� ��ǲ�Ķ������ �̸��� y��� year = y�� ����� ��������� year�� �� ������ ��. �̶� year�� ��������� ��Ÿ���� �Ķ������� �ٲ�� �͸� ���� ����� �������� �� �� ���� 
		// ������ ��������� ��ǲ�Ķ���͸� ��������� �̸��� ������ ���������� ������. ���� this  ��� 
		
	}
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisEx {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		System.out.println(b2);
		
		// ��, this�� ���� �ν��Ͻ��� �ּҰ�. �ڱ��ڽ��� �ǹ��ϴ� �� 
		// �ڵ�� �Ȱ��� this������ �ǹ̴�  �� ���� �ν��Ͻ��� �ּҰ��̴�. 
	}

}
