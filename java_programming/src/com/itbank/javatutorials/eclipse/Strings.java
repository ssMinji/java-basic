package com.itbank.javatutorials.eclipse;

public class Strings {

	public static void main(java.lang.String[] args) {
		String str1 = "Hello Java";
		String str2 = "123";
		
		System.out.println(str1 + " "+ str2);
		
		//new : ���ο� ��ü ���鶧 ��� 
		// ��ü: ���� ������ �ڷ���... 
		String str3 = new String("Hello world");
		String str4 = new String("Hello world");
		
		System.out.println(str3 == str4); // false
		System.out.println(str3.equals(str4)); // true
		
		String a = "Hello Java";
		// indexOf: ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� �ε��� ���� 
		System.out.println(a.indexOf("Java")); // 6
		System.out.println(a.replaceAll("Java", "world"));
		// ù����<= <������
		System.out.println(a.substring(0, 4)); //Hell
		System.out.println(a.toUpperCase()); 
		System.out.println(a.toLowerCase());
		

	}

}
