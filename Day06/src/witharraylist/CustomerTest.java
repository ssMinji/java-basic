package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		// ����޿� �°� ���� �����ϴ� ���α׷��� ������ 
		
		// ��� ����� ���� �������ִ°��� Customer Ÿ�� 
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
		Customer lee = new Customer(10010, "Lee");
		Customer kim = new Customer(10011, "Kim");
		GoldCustomer song = new GoldCustomer(10012, "Song");
		GoldCustomer park = new GoldCustomer(10013, "Park");
		VIPCustomer yoon = new VIPCustomer(10014, "Yoon", 100);
		
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(song);
		customerList.add(park);
		customerList.add(yoon);
		
		System.out.println("---------------------- ������ ��� ------------------");
		// ���� for��
		for(Customer customer: customerList) {
			System.out.println(customer.showInfo()); // �������̵� �Ǿ��ִ� �޼��� ȣ�� 
		}
		
		System.out.println("---------------------- �������� ���ʽ� ����Ʈ ��� ------------------");

		int price = 10000;
		for(Customer customer: customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����Ͽ����ϴ�.");
			System.out.println(customer.showInfo());
		}
		
		// �̷��� �������� Ȱ���� �غ� �� �ִ�. 
		
	}

}
