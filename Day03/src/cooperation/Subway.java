package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCnt;
	int money;
	
	// ������ ȣ����ȣ�� �ְ� �غ���
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	// �°��� �������� ����
	public void take(int money) {
		passengerCnt++;
		this.money += money;  
	}
	
	public void showInfo() {
		System.out.println("����ö " + lineNumber + "ȣ���� �°��� : " + passengerCnt + " ���̰�, ������: " + money + "�Դϴ�.");
	}

}
