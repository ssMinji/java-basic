package overriding;

// Source -> Override �����ϸ� �ڵ� ���� ���� 
public class GoldCustomer extends Customer {

	public GoldCustomer(){
		bonusRatio = 0.05;
	}
	
	@Override // annotation : �����Ϸ����� ����� �Ѵٴ°� �˷��ִ� ���� 
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public String showInfo() {
		return super.showInfo();
	}
	
	// �̷������� ������ �����ϴ� 
}
