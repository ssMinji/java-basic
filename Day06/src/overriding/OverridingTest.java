package overriding;

public class OverridingTest {

	public static void main(String[] args) {

		Customer lee = new Customer(10010, "Lee");
		int price = lee.calcPrice(10000);
		System.out.println("���� �ݾ���: " + price + "�̰�, " + lee.showInfo());
		
		
		
		VIPCustomer kim = new VIPCustomer(10010, "Lee", 100);
		price = kim.calcPrice(10000);
		System.out.println("���� �ݾ���: " + price + "�̰�, " + kim.showInfo()); 
		// ���ʽ� 5% �ݿ��� �� Ȯ�� ���� 
		// ���ұݾ��� 10% ���ε� �ݾ��� �� �� Ȯ�� ���� 
		
		
		// Customer Ÿ���� VIPCustomer ��ü �����غ��� 
		// �� �� �Ҹ��� calcPrice�� �����ΰ�. �ϴ� �� 
		Customer customerWho = new VIPCustomer(10010, "Who", 100);
		int priceWho = customerWho.calcPrice(10000);
		System.out.println("���� �ݾ���: " + priceWho + "�̰�, " + customerWho.showInfo());
		
		// �غ���, VIPCustomer�� calcPrice�� �Ҹ�  
		// ���� �����ߵ���, customerWho. �� �ؼ� ���̴� ��ó�� ���������� ������ �� �ִ� ������ Customer�͸� ���� ���� 
		// ��Ͽ��� calcPrice �� �־ Customer�� calcPrice�� ������ �Ǿ��µ�, ������ �Ҹ��� �ν��Ͻ��� �޼����� 
		// �̰��� �ٷ� ����޼���(virtual method)
		// �� ������ �������� ������ �� �ִ� ����� �� 
		// �ϳ��� �ڵ尡 � ��쿡�� �̷��� �Ҹ���, �ٸ� ��쿡�� ������ �Ҹ���..�ϴ� �� ������ 
	}

}
