package inheritance;

public class Circle {

	private int x;
	private int y;
	
	private int radius;
	
}


// �׷��ٰ� �ؼ� 

public class Circle  extends Point{
	
	private int radius;
	
}

// �̷� ������ �ۼ������� ���� 
// Circle��Point�� �Ϲ����̰� ��ü���� ���谡 �ƴϰ� Circle�� �ܼ��� Point�� Ȱ���ϰ� ���� �� -> �̷����� ����ϴ� ���� �ƴ� 

// �´� ��� 
public class Circle {
	
	Point point; // �ռ� : has - a ���� 
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
}

// ���
// �������� ���� 
// ����� �̹� �ִ� Ŭ������ ������ ���� ���� �ƴ϶� �������� Ŭ������ ���ǵǾ��ְ� �� ����� �״�� ������ ���鼭  
// �� �� addon��, ��ü���� Ŭ������ ���� �� ����ϴ� ��. is-a ����





