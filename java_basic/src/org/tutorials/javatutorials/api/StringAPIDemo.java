package org.tutorials.javatutorials.api;

// String �ֿ� �޼ҵ� �ǽ�
public class StringAPIDemo {

	public static void main(String[] args) {
		
		// 1) charAt : �ش� �ε����� ���� ��ȯ
		char c = "hello".charAt(1);
		System.out.println(c); // e

		// 2) endsWith: �ش� suffix�� �������� ���� �˻�
		boolean e = "hello".endsWith("lo");
		System.out.println(e); // true
		
		// 3) equals: ������ ���ڿ����� ��
		boolean isEqual = "hello".equals("Hello");
		System.out.println(isEqual); // false
		
		// 4) format: ���� ���� ����
		// %s: ���ڿ� �ǹ� 
		String s = String.format("%s says hello to %s", "Jack", "Rachel");
		System.out.println(s);
		
		// 5) indexOf: �ش� ���ڿ��� ���ԵǾ������� �ش���ġ ��ȯ, ������ -1��ȯ
		int i = "hello".indexOf("e");
		System.out.println(i); // 1
		System.out.println("hello".indexOf("k")); // -1
		
		// ���Խ�
		// 6) matches: ����ǥ������ �ش��ϴ� ���ڿ��̸� true��ȯ
		String reg = "^[0-9]*A$"; // A�� ������ ���ڸ� ����Ű�� ���Խ�
		boolean matches = "0123A".matches(reg);
		System.out.println(matches);// true
		
		// 7) replace: �ش� ���ڿ� ã�Ƽ� ��ü
		String r = "hello".replace("ello", "i");
		System.out.println(r); //hi
		
		// 8) split: ���ڿ��� �и�. ������ �Ű������� �־���
		// ���ڿ� �迭�� ���ϵ� 
		String[] sp = "he:ll:0".split(":");
		for(String item: sp) {
			System.out.println(item);
		}
		
		// 9) subString: ���������� ������������ ���ڿ� ��ȯ
		// ������ ���� �ȵ�
		String sub = "hello".substring(0, 4);
		System.out.println(sub);
		
		// 10) trim: ���ڿ� �糡�� ���ԵǾ��ִ� ���� ����
		String tr = " hello   ".trim();
		System.out.println(tr);
		
		
		
		
	}

}
