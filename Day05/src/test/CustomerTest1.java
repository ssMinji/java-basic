package test;

import inheritance2.Customer;
import inheritance2.VIPCustomer;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer lee = new Customer();
		// �ڵ��ϼ����� �غ��� ��������鿡 ���� �ڵ��ϼ� �Ⱥ���-> protected�̱� ����. protected�� �ٸ� ��Ű�������� �� ���� 
		// ������� �����ϰ� �ٽ� inheritance2 ��Ű���� �ű���. 
		// �Űܼ� �ڵ��ϼ��ϸ� ���� ������� �ڵ��ϼ��� ��. ���� ��Ű�������� ���� ������ Ȯ�� 
		lee.setCustomerId(10100);
		lee.setCustomerName("Lee");
		
		VIPCustomer kim = new VIPCustomer();
		kim.setCustomerId(10101);
		kim.setCustomerName("Kim");
		
		kim.bonusPoint = 1000;
		
		System.out.println(lee.showInfo());
		System.out.println(kim.showInfo());
		
		// Ŭ���� ���� ���� ���� 
		// ����Ŭ������ ������ ���� �׻� ����Ŭ������ ���� ������ 
		
		// ��ĳ���� ���� 
		Customer cust1 = new VIPCustomer();
		
		//cust1.agentId;
		// agentID �� ���� �ڵ��ϼ� �Ұ���
		// ���ü��� �ִµ���. 
		// ��ĳ������ �Ǹ� ���� Ŭ������ �޼��峪 ������ ���� �����ϱ� ����.
		
		// ���� 
		// ����Ŭ������ ������ ���� ���� Ŭ������ ���� ������ ��
		// ����Ŭ������ ����Ŭ������ Ÿ���� �����ϰ� �ֱ� ������ ��ĳ���� ���� 
		
	}

}
