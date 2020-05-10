package org.tutorials.javatutorials.datatype;

public class No04_String {

	public static void main(String[] args) {
		String a = "Hello Java";
		String b = "a";
		String c = "123";
		
		// new Ű����: ��ü ���� �� ��� 
		// ��ü: ���� ������ �ڷ��� ������ �ǹ̷� �˰��ֱ� 
		String a = new String("Happy Java");
		String b = new String("a");
		String c = new String("123");
		
		// ù��° ���(���ͷ� ǥ��)�� ����ϴ� ���� ����. 
		// ���ͷ��̶�, � ���� ���� �� ���Ǵ� ���� �ǹ� 
		// �������� ����, ������ �� ����ȭ�� ����
		
		
		//���ڿ� �� �񱳽� �ݵ�� equals ��� 
		// ������ ������ ��� �߻� �����ϱ� ���� 
		// ==�� �� �ڷ����� ������ ��ü������ �Ǻ��� �� ����ϴ� ������ 
		// .equals
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        // ���� a�� b�� ���� ���ڿ��� �����ؼ� �����ߴ�. 
        //���� b�� ���ڿ��� ����� ����� �����ڸ� �̿��ϰ� �ִµ� �� ����� �Ŀ� ��ü ���� �ð��� ���� �ȴ�. 
        //������ new String�� ��ȣ �ȿ� ���ڿ��� ������ ���ڿ��� ������ �� �ִٰ� �˾Ƶ���. 
        //����� false�� true�̴�. 
        //==�� �ΰ��� ������ Ÿ���� ������ ��ü������ �˾Ƴ��� ���ؼ� ����ϴ� �������̱� ������ b�� ��� ��ü�� ��ġ���� �ʴ� ���̴�. 
        //�̸� �����ϴ� �� ����� equals�̰� �̸� �̿��ؼ� ���� �ٸ� ��ü�鰣�� ���� �������� ���� �� �ִ�. 
        // �� �̾߱�� ���� �ܰ迡���� �����ϱ� �ټ� ������� �ִ�. 
        // ���ڿ��� ���ڿ��� ���� ���� '=='�� ������� �ʰ� .equals�� ����Ѵٰ� �ϴ��� �˾Ƶ���.
        
		/*���⼭ a == b �� false�� ������ ������ String ��ü�� ���ؼ� JVM�� �޸��Ҵ� ����� �ٸ��� �����Դϴ�.
		
		String a = "Hello world"�� �Ҵ��ϰ� �Ǵ� ��쿡�� Heap�ȿ� �ִ� String Constant Pool������ �Ҵ��� �ǰԵȴ�. 
		String b = new String("Hello world")�� �Ҵ��ϰ� �Ǵ� ��쿡�� Heap���� String Constant Pool������ �ƴ� Heap���� ��򰡿� �ϳ��� "Hello world"��� ��ü�� �Ҵ�
		
		���⼭ a�� b��ü�� ������ ������ ����Ű���ִ� ��ü�� ���� �ٸ� ��ü�̱⶧���� a == b�� false�� ������ ���Դϴ�.

		String�� ���� �߰����� ����...
		String a = "Hello World";
		String b = "Hello World";
		�̷��� ������ �ϰԵǸ� a,b��ü�� SCP(String Constant Pool)���� Hello World�� ������ �� ��ü�� �Ҵ�� �� ������ �׷��� �ʽ��ϴ�. 
		SCP������ ������ ���ڿ��� ���ؼ� �ϳ��� Hello World��ü�θ� �Ҵ�Ǹ� a�� b�� ������ ���۷����� ������ �Ǵ� ���Դϴ�.
		*/
		
        // indexOf : ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� �ε��� ���� 
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));
        
        // replaceAll : Ư�����ڸ� �ٸ� ���ڷ� �ٲ� �� 
        System.out.println(a.replaceAll("Java", "World"));

        // substring : Ư�� �κ� �̾Ƴ� �� 
        // ����ġ ���� �ȵ� 
        System.out.println(a.substring(0, 4)); // Hell
        
        // toUpperCase: �빮�ڷ� ���� , toLowerCase
        System.out.println(a.toUpperCase());
	}

}
