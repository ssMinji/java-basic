package inheritance2;

public class VIPCustomer extends Customer{
	
	// ����Ŭ������ �ִ� ����� ���� �� �����پ��ڴٴ� �ǹ��̹Ƿ� 
    // �߰��Ǵ� �Ӽ� ���Ǹ� �ʿ� 
	private double saleRatio;
	private int agentId;
	
	
	public VIPCustomer(){
		
		// ��� Ŭ���� ���� ���� ������ �� �ڵ�!!!!!!!!!!!!!!
		// super();
		// this Ű����� ���. this�� �����ڳ����� �ٸ� �����ڸ� ȣ���� �� ���Ǿ��µ�
		// super�� �ڱ� �ٷ� �� ����Ŭ������ ����Ű�� ������ Ű���� . ����Ŭ������ �����ڰ� ȣ��� 
		// �̶� �Ű������� �ϳ��� ����. �׷��ٴ� �� default �����ڸ� ȣ�� 
		
		
		// Customer Ŭ������ ����Ʈ������ �ּ�ó�� �� ����!! 
		// �̷��� ��������� �ҷ���� �� 
		// super(0, null);
		// Ȥ�� �Ű������� int customerId, String customerName �޾ƿͼ�
		// super(customerId, customerName); ���ֱ� 
		
		customerGrade = "VIP"; // �������� �ߴ� ������ Customer���� customerGrade�� private���� �����߱� ���� 
		                       // ���� protected�� Ű���� ���� 
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		// ��� Ŭ���� ���� ���� ������ �� �ڵ�!!!!!!!!!!!!!!
		System.out.println("VIPCustomer() ȣ��");
	}
	
	// �ٲٴ°� �������� �ʰڴ�. ��� ���� �� 
	public int getAgentId(){
		return agentId;
	}
	
	

}
