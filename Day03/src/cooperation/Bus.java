package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCnt;
	int money;
	
	// ������ ������ȣ�� �ְ� �غ���
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// �°��� �������� ����
	public void take(int money) {
		// �°��� ���� �þ ���̰�, ������ ���� ���
		passengerCnt++;
		this.money += money;  
	}
	
	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� : " + passengerCnt + " ���̰�, ������: " + money + "�Դϴ�.");
	}
}
