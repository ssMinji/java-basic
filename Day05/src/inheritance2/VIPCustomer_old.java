package inheritance2;


// VIPCustomer��� Ŭ������ ���� �����ϰ� ���� Customer Ŭ������ ������ ���� 
// ���� Customer�� ����� �״�� ������ ���ڴ� -> ��� 
public class VIPCustomer_old {

	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	private int saleRatio;
	private int agentId;
	
	public VIPCustomer_old(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
	}

	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;

	}
	
	public String showInfo(){
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�."; 
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}