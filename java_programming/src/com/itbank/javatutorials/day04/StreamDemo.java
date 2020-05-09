package com.itbank.javatutorials.day04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamDemo {

	public static void main(String[] args) throws IOException {
		// System.in�� InputStream ��ü��
		InputStream in = System.in;
		int a;
		a = in.read();
		// read �޼ҵ�� 1byte�� ������� �Է��� �޾Ƶ���
		
		// �� �޼ҵ�� ���� 1byte�� �����ʹ� byte�ڷ������� ����Ǵ� ���� �ƴ� int�ڷ������� �����
		// ����Ǵ� int���� 0-255 ������ ���������� �ƽ�Ű�ڵ尪
		// �ƽ�Ű�ڵ�? �̱�ǥ�رⱸ���� ���� ���ڸ� ǥ���ϴ� ����
		// ��ǻ���� ���� �ᱹ �����̱� ������ ��ǻ�Ϳ��� ���ڿ� ��ȣ�� �ش� ����ǥ������ ��ȯ�Ǿ�� �ϴ� �ʿ�
		// ��, ���ڸ� ���ڷ� ǥ���ϱ� ���� ��� 
		// 0-9, a-z, A-Z, Ư������ 
		// a -> 97
		
		//System.out.println(a);
		// ���� �� ���α׷� ������� �ʰ� ������� �Է� ��� 
		
		// a-> 97, abc -> 97
		// ����: read�޼ҵ尡 1byte�� �б� ����
		
		// ����ڰ� �����ϴ� �����͸� �Է� ��Ʈ���̶� ��
		// ��Ʈ��(Stream)�� �̾����ִ� ������(byte)�� ����
		// Stream - �������� ���� �帧ó�� �����͸� �޾ƿ� ����ִ°�
		// 1. ���ϵ����� (���Ͽ��� ���۰� ���� �ִ� �������� ��Ʈ��)
		// 2. HTTP ���� ������(�������� ��û�ϰ� ������ �����ϴ� HTTP���䵥���� ��Ʈ��)
		// 3. Ű���� �Է�(����ڰ� Ű����� �Է��ϴ� ���ڿ� ��Ʈ��)
		
		// 3byte�д� ��
		int x;
		int y;
		int z;
		
		x = in.read();
		y = in.read();
		z = in.read();
		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		// ���� 
		byte[] d = new byte[3];
		in.read(d);
		
//		System.out.println(d[0]);
//		System.out.println(d[1]);
//		System.out.println(d[2]);
		
		// ��¹� for������ �ۼ��غ��� 
		// for-each�� 
//		for(byte k: d) {
//			System.out.println(k);
//		}
		
		// �ƽ�Ű�ڵ�� �ؼ��ؾ� �ϴ� ��� -> ����
		// �Է°��� �״�� ����ϰ� �ʹٸ�
		// ����Ʈ ��ſ� ���ڷ� �Է� ��Ʈ���� �д´� -> InputStreamReader 
		
		// ��ü �����Ҷ��� �������� �Է��� �ʿ�
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] b = new char[3];
		reader.read(b);
		
		System.out.println(b);
		
		
		

	}

}
