package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		
		// �л� ���ӽ��� 100�� ������ ����
		james.takeBus(bus100); // ������ ���� ��ü�� �Ķ���ͷ� ������
		// �̷��� �Ǹ� �л� Ŭ������ �ן���� �޼��尡 ȣ��ǰ� �� �ȿ��� ���� Ŭ������ ȣ��Ǿ �°��� ���� �ð� ������ �����ϴ� �۾��� �Ͼ�� �� 
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		
		// �л� �丶���� 2ȣ���� ���� 
		tomas.takeSubway(subwayGreen);

		tomas.showInfo();
		subwayGreen.showInfo();

		// ����
		// �ν��Ͻ� 4���� ������� 
		
		// ��Ӱ��� ��� �Ұ� 
		// ��ۼ��� trans Ŭ������ ���� 
		// ����� take �޼��带 ������ �� �� ���� 
	}

}
