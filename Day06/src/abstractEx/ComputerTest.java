package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {

		//Computer c1 = new Computer(); // ���� �� 
		// �߻�Ŭ������ �ν��Ͻ� ȭ �� �� ���� 
		
		Computer c2 = new Desktop(); // ��ĳ���ð���� ���� 
		//Computer c3 = new Notebook(); // Notebook�� �߻�Ŭ�����̹Ƿ� �ν��Ͻ�ȭ �ȵ� 
		
		//Computer c4 = new MyNotebook(); // MyNotebook�� ����Ŭ������ Computer�̱� ������ �翬�� �̷������� ���� 
		Notebook c4 = new MyNotebook();
		
		c2.display(); 
		c4.display();
		// Desktop class�� MyNotebook Ŭ�������� display �����ϰ� �ֱ� ������ �� �޼������ ȣ��Ǵ� �� 
		
	}

}
