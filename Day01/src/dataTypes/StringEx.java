package dataTypes;

public class StringEx {

	public static void main(String[] args) {

		String str1 = "TEST"; // ���ͷ� ǥ��� 
		String str2 = new String("TEST");
		
		System.out.println(str1 == str2); // false -> ==�����ڴ� ������ ��ü���� �Ǻ�
		System.out.println(str1.equals(str2));
		
		String str3 = "Hello World";
		System.out.println(str3.indexOf("World")); // index�� 0���� ���� 
		
		System.out.println(str3.replaceAll("World", "Java"));
		System.out.println(str3);
		
		System.out.println(str3.substring(0, 4));// ������ġ <= <����ġ
		
	}

}
