package witharraylist;

public class GoldCustomer extends Customer{

	// �ܰ� ���� �� ��� �߰�
	// ����Ʈ ������ 2%
	// ������ 10% - 
	// ��� ������ ���� 
	
	double saleRatio; // VIPCustomer����  �ִ� ����. ���� VIPCustomer���� ��ӹ����� ���� �ʳ� �� ���� ������ 
	                  // agentId�� ���� ���������� ��� ���� ���� ������ �ƴ�. ���� �ϳ� �߰� 
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price = (int) (price * saleRatio);
	}
	
	
	
}
