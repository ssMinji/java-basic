package inheritance2;

public class Customer {

	//�̰ɷ� ���� ����!!!!!!!!!!!!!!!!!!
	//private int customerId;
	//private String customerName;
	//private String customerGrade;
	
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	
	// protected 
	// �ܺ�Ŭ������ ���ؼ� private������
	// ��Ӱ��迡���� public���� ���̰� ���ִ� ���������� 
	// package�� �޶� ��Ӱ��迡���� public
	// test ��Ű�� ���� Customer Ŭ���� �Űܺ��� customerGrade ���� ���� �ȳ��� �� Ȯ�� 
	// �׷��� bonusRatio������ ���� �� �� 
	// �ƹ��͵� ������ϸ� -> default ���������� 
	// default: ���� ��Ű�� �������� ���� 
	
	// ����
	// ���ü� ����: private ->  default -> protected -> public 
	
	
	int bonusPoint;
	double bonusRatio;
	
	
	
	//VIP ���� ���� �ܼ� ��� �߰� 
	private int saleRatio;
	private int agentId;
	// ���� �̷������� �Ӽ��� �߰��� �ȴٸ�--> calcPrice�� ���ǹ� �߰� �� �� �ۿ� ���� 
	// �ϳ��� Ŭ���� �ȿ� �Ϲ� ��, VIP ���� ���� ��� ����� �� ������ 
	// ������, 
	// 1)�� ����� �߰��� �ȴٸ� ���ǹ��� �߰��� �� ��. -> �����ϰ� �ݺ��Ǵ� if-else���� �ʹ� ������ -> ������ ����
	// 2) saleRatio�� agentId�� �Ϲݰ����Դ� ���ʿ��� �Ӽ� 
	// Ŭ������ Ŀ���� ���������� ������� 
	
	public Customer(){
		// ��� Ŭ���� ���� ���� ������ �� �ڵ�!!!!!!!!!!!!!!
		// super()  �ִ� �� 
		// Customer�� ����Ŭ������ ObjectŬ����
		// ��� �ڹ�Ŭ������ �ֻ��� Ŭ������ Object Ŭ������  ���߿� �ٽ� ������ �� 
		
		
		// �⺻ ���, ������ 
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		// ��� Ŭ���� ���� ���� ������ �� �ڵ�!!!!!!!!!!!!!!
		System.out.println("Customer() ȣ��");
	}
	
	// ����Ʈ ������ �ּ� ó�� �� �̰� ��������� 
	// VIPCustomer ���� ���� �� Ȯ�� !! 
	// super()Ű���� �����Ǿ� �ִµ� �̰��� �θ�Ŭ������ ����Ʈ ������ ȣ��
	// ���� VIPCustomer ������ ���� 
	/*public Customer(int customerId, String customerName){
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	*/
	public int calcPrice(int price){
		// ����Ʈ ������. ������ ���� ���ϰ� �׳� ���� 
		bonusPoint += price * bonusRatio;
		return price;
		
		// VIP�����ϸ鼭 
		/*if(customerGrade.equals("SILVER")) {
			bonusPoint += price * bonusRatio;
		} else if(customerGrade.equals("VIP")) {
			
		}*/
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
