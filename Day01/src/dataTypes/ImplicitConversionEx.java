package dataTypes;

public class ImplicitConversionEx {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum; // byte -> int
		
		System.out.println(num);
		
		long lNum = 10; 
		float fNum = lNum; // long -> float
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // float + int => int�� float���� ����ȯ
		// float -> double ����ȯ 
		
		System.out.println(dNum);
	}

}
