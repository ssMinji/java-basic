package cooperation;

public class Student {

	String studentName;
	int grade; //�г�
	int money;
	
	//�л� �ν��Ͻ� ������ �� �̸��� ���� �ʼ��� �޾ƿͼ� �����ϱ� 
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// ������ Ÿ�� ������ ���� �޼��带 ������� �Ҷ�, � ������ Ÿ���� �� ������ ���� ������ �Ű������� �޾ƿ;� �� 
	public void takeBus(Bus bus){
		// �ش� ������ ���� ������ �����ٵ� �̰� �ϴ� ���߿��ϱ�� ����.
		//bus.
	
		
		//���� Ŭ���� ����� ���ƿͼ�!
		bus.take(1000); // ��ü�� ������ �Ͼ�� �κ� 
		// Student��� Ŭ�������� Bus�� �޼��带 ȣ���ؼ� �ش� �޼��尡 ȣ��Ǹ� ���� �þ�� �°��� ���� �����ϴ� ������ �Ͼ�� �� 
		money -= 1000;
	}
	
	public void takeSubway(Subway subway){ // ������ �ν��Ͻ��� �Ű������� ���;���
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����: " + money + "�Դϴ�. ");
	}
}
