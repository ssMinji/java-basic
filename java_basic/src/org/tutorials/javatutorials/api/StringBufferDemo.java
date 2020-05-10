package org.tutorials.javatutorials.api;

// String�� StringBuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "world";
		System.out.println(temp);
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello"); // append: ���ڿ��� ���� �����Ϳ� �߰� 
		sb.append(" ");
		sb.append("world");
		System.out.println(sb);
		
		// String�� ����� ���ڿ� �߰������ StringBuffer�� ����� ���ڿ� �߰� ���� ��
		// ���: �ý����ڿ��� ȿ���� ���鿡�� StringBuffer�� ���� 
		
		// String ��ü�� ������ �Ұ�����(Immutable)�� ��ü��. ��, ���ڿ��� �� ���� �Ұ����ϰ�
		// �����ؾ� �� ��� ���Ӱ� String��ü ������ 
		// ��, += �� ���� String��ü�� ���ο� ���ڿ��� �ٴ� ���� �ƴ϶� ���ο� String ��ü�� �����Ǵ� ��
		
		// �ݸ� StringBuffer�� ���氡���� ��ü(Mutable)�� ��ü. 
		// ��, ���� ������ �ʿ��� ��� ���ο� ��ü ���� �ʿ� ���� ������ ���ڿ� ������ �� �ִ�. 
		// ���� append����� �� ���ο� StringBuffer ��ü ����� ���� �ƴϰ� 
		// ���� StringBuffer��ü�� append�� ���ڿ��� ����Ű���� ����� 
		// ����� Ŭ������ StringBuilder�� �ִµ�, StringBuilder�� StringBuffer�� ���̴�
		// StringBuffer�� append�Լ��� ����ȭ�� �����Ѵٴ� ��. 
		// �� �κ��� ����ȭ��� ���� ������ �˾ƾ��ϹǷ� ��ŵ
		// ����Ʈ�� String������ + ������ ������ StringBuffer�� StringBuilder�� ����ϴ� ���� ���ٴ� ��.
		// �� ���ȵǴ� + ������ ��������� ���� ��� �ݺ��� ���� +������ ���� ���� 
		

	}

}
