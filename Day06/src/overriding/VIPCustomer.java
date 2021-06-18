package overriding;

public class VIPCustomer extends Customer{

	double saleRatio;
	private int agentId;
	
	
	public VIPCustomer(){
		
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;

	}
	
	public VIPCustomer(int customerId, String customerName, int agentId){
		super(customerId, customerName);
		customerGrade = "VIP"; 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;

	}
	
	// Customer�� calcPrice �޼��� �־��µ� 
	// VIP�� ���ؼ��� ������ �������� �ʿ䰡 �ִ�. ���� calcPrice ������ 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	// �����ε� - ���� �̸��� �޼������� �Ű����� �ٸ��� �����ν� �ٸ� �޼��� �����ϴ� �� 
	// �������̵� - �޼��� ������ (������� ����) 
	
	public int getAgentId(){
		return agentId;
	}
	
	

}
